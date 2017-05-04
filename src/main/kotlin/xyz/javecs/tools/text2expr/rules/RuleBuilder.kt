package xyz.javecs.tools.text2expr.rules

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.utils.normalize

private val tokenizer = Tokenizer()
data class Evaluation(val value: Number = Double.NaN, val expr: List<String> = ArrayList(), val variables: Map<String, Double> = HashMap())
class RuleBuilder(source: String, val name: String = "") {
    private val parser = RuleParser()
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
            Evaluation(calc.value, expr().toList(), calc.variables())
        } else {
            Evaluation()
        }
    }

}