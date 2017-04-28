package xyz.javecs.tools.text2expr.parsers

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import xyz.javecs.tools.expr.Calculator

private val tokenizer = Tokenizer()

data class Evaluation(val value:Number = Double.NaN)
class RuleBuilder(source: String) {
    private val parser = RuleParser()

    init {
        parser.visit(parser(source).text2expr())
    }

    private fun indexOf(word: Word, tokens: List<Token>, start: Int): Int {
        for ((key, value) in word.fields) {
            for (i in start..tokens.lastIndex) {
                val token = tokens[i]
                when (key) {
                    "SF" -> if (value.contains(token.surface)) return i
                    "P1" -> if (value.contains(token.partOfSpeechLevel1)) return i
                    "P2" -> if (value.contains(token.partOfSpeechLevel2)) return i
                    "P3" -> if (value.contains(token.partOfSpeechLevel3)) return i
                    "P4" -> if (value.contains(token.partOfSpeechLevel4)) return i
                    "BF" -> if (value.contains(token.baseForm)) return i
                    "RD" -> if (value.contains(token.reading)) return i
                    "PR" -> if (value.contains(token.pronunciation)) return i
                }
            }
        }
        return -1
    }

    fun rule(): Array<Word> = parser.rule.toTypedArray()

    fun expr(): Array<String> = parser.expr
            .split(System.lineSeparator())
            .filter { it.isNotEmpty() }
            .toTypedArray()

    fun matches(text: String): Boolean {
        val tokens = tokenizer.tokenize(text)
        var start = -1
        for (word in rule()) {
            start = indexOf(word, tokens, start + 1)
            if (start < 0) {
                return false
            }
        }
        return true
    }

    fun eval(text: String): Evaluation {
        val calc = Calculator()
        return if (matches(text)) {
            expr().forEach { calc.eval(it) }
            Evaluation(calc.value)
        } else {
            Evaluation(calc.eval(text).value)
        }
    }
}