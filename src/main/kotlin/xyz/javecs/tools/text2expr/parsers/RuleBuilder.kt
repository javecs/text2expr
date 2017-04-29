package xyz.javecs.tools.text2expr.parsers

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import xyz.javecs.tools.expr.Calculator
import java.text.Normalizer

private val tokenizer = Tokenizer()
private fun normalize(text: String) = Normalizer.normalize(text, Normalizer.Form.NFKC)

data class Evaluation(val value:Number = Double.NaN)
class RuleBuilder(source: String) {
    private val parser = RuleParser()

    init {
        parser.visit(parser(source).text2expr())
    }

    private fun indexOf(word: Word, tokens: List<Token>, start: Int): Int {
        for (i in start..tokens.lastIndex) {
            val token = tokens[i]
            var count = 0
            for ((key, value) in word.fields) {
                when (key) {
                    "SF" -> if (value.contains(token.surface)) count++
                    "P1" -> if (value.contains(token.partOfSpeechLevel1)) count++
                    "P2" -> if (value.contains(token.partOfSpeechLevel2)) count++
                    "P3" -> if (value.contains(token.partOfSpeechLevel3)) count++
                    "P4" -> if (value.contains(token.partOfSpeechLevel4)) count++
                    "BF" -> if (value.contains(token.baseForm)) count++
                    "RD" -> if (value.contains(token.reading)) count++
                    "PR" -> if (value.contains(token.pronunciation)) count++
                }
            }
            if (word.fields.size == count) {
                return i
            }
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
        for (word in rule()) {
            start = indexOf(word, tokens, start + 1)
            if (start < 0) {
                return false
            }
            if (word.id.isNotEmpty()) {
                recognizedId(Pair(word.id, tokens[start].surface))
            }
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
            Evaluation(calc.value)
        } else {
            Evaluation()
        }
    }
}