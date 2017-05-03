package xyz.javecs.tools.text2expr.parsers

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import org.stringtemplate.v4.ST
import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.utils.normalize

private val tokenizer = Tokenizer()
private val printValue = "これかな？\n<value>"

data class Evaluation(val value: Number = Double.NaN, val rendered: String = "")
class RuleBuilder(source: String, template: String = printValue) {
    private val parser = RuleParser()
    private val renderer = ST(template)
    init {
        parser.visit(parser(source).text2expr())
    }

    private fun indexOf(word: Word, tokens: List<Token>, start: Int): Int {
        for (i in start..tokens.lastIndex) {
            val token = tokens[i]
            var matched = 0
            for ((key, value) in word.fields) {
                when (key) {
                    "SF" -> if (value.contains(token.surface)) matched++
                    "P1" -> if (value.contains(token.partOfSpeechLevel1)) matched++
                    "P2" -> if (value.contains(token.partOfSpeechLevel2)) matched++
                    "P3" -> if (value.contains(token.partOfSpeechLevel3)) matched++
                    "P4" -> if (value.contains(token.partOfSpeechLevel4)) matched++
                    "BF" -> if (value.contains(token.baseForm)) matched++
                    "RD" -> if (value.contains(token.reading)) matched++
                    "PR" -> if (value.contains(token.pronunciation)) matched++
                }
            }
            if (word.fields.size == matched) return i
        }
        return -1
    }

    fun rule(): Array<Word> = parser.rule.toTypedArray()

    fun expr(): Array<String> = parser.expr
            .split(System.lineSeparator())
            .filter { it.isNotEmpty() }
            .toTypedArray()

    fun matches(text: String, recognizedId: (id: Pair<String, String>) -> Unit = {}): Boolean {
        val tokens = tokenizer.tokenize(text)
        var start = -1
        rule().forEach {
            start = indexOf(it, tokens, start + 1)
            if (start < 0) return false
            if (it.id.isNotEmpty()) recognizedId(Pair(it.id, tokens[start].surface))
        }
        return true
    }

    fun eval(text: String): Evaluation {
        val norm = normalize(text)
        val calc = Calculator()
        val args = ArrayList<String>()
        return if (matches(norm, { (key, value) -> args.add("$key = $value") })) {
            args.forEach { calc.eval(it) }
            expr().forEach { calc.eval(it) }
            calc.variables().forEach { renderer.add(it.key, it.value) }
            renderer.add("expr", expr())
            renderer.add("text", text)
            renderer.add("value", calc.value)
            Evaluation(calc.value, renderer.render())
        } else {
            Evaluation()
        }
    }

}