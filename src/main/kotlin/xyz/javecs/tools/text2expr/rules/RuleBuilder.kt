package xyz.javecs.tools.text2expr.rules

import com.atilika.kuromoji.ipadic.Token
import com.atilika.kuromoji.ipadic.Tokenizer
import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.utils.mergeNumber
import xyz.javecs.tools.text2expr.utils.normalize

private val BaseOffset = -1
private val NotFound = -2
private val Optional = -3
private val tokenizer = Tokenizer()

private fun coverage(matched: Int, total: Int) = matched.toDouble() / total.toDouble()

data class Evaluation(val value: Number = Double.NaN,
                      val expr: List<String> = ArrayList(),
                      val variables: Map<String, Double> = HashMap(),
                      val coverage: Double = 0.0,
                      val rule: String = "")

class RuleBuilder(source: String, val name: String = "") {
    private val parser = RuleParser()

    init {
        parser.visit(parser(source).text2expr())
    }

    private fun indexOf(word: Word, tokens: List<Token>, start: Int, end: Int): Pair<Int, Boolean> {
        for (i in start..end) {
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
            if (word.fields.size == matched) return Pair(i, false)
        }
        return if (word.isOptional()) Pair(Optional, true) else Pair(NotFound, false)
    }

    fun rule(): Array<Word> = parser.rule.toTypedArray()

    fun expr(): Array<String> = parser.expr
            .split(System.lineSeparator())
            .filter { it.isNotEmpty() }
            .toTypedArray()

    fun matches(text: String, recognizedId: (id: Pair<String, String>) -> Unit = {}): Pair<Boolean, Double> {
        val tokens = tokenizer.tokenize(text).mergeNumber()
        var offset = BaseOffset
        var remained = rule().size
        rule().forEach {
            val (index, optional) = indexOf(it, tokens, start = offset + 1, end = Math.min(tokens.size - remained, tokens.lastIndex))
            if (index == NotFound) return Pair(false, 0.0)
            if (it.id.isNotEmpty()) recognizedId(Pair(it.id, if (optional) it.optionalValue().toString() else tokens[index].surface))
            if (!optional) offset = index
            remained--
        }
        return Pair(true, coverage(rule().size, tokens.size))
    }

    fun eval(text: String): Evaluation {
        val calc = Calculator()
        val args = ArrayList<String>()
        val (matched, coverage) = matches(normalize(text), { (key, value) -> args.add("$key = $value") })
        return if (matched) {
            args.forEach { calc.eval(it) }
            expr().forEach { calc.eval(it) }
            Evaluation(calc.value, expr().toList(), calc.variables(), coverage, name)
        } else Evaluation(rule = name)
    }
}