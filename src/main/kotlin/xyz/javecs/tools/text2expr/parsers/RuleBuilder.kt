package xyz.javecs.tools.text2expr.parsers

import xyz.javecs.tools.expr.Calculator

data class Evaluation(val value:Number = Double.NaN)
class RuleBuilder(source: String) {
    private val parser = RuleParser()

    init {
        parser.visit(parser(source).text2expr())
    }

    fun rule(): Array<Word> = parser.rule.toTypedArray()
    fun expr(): Array<String> = parser.expr
            .split(System.lineSeparator())
            .filter { it.isNotEmpty() }
            .toTypedArray()
    fun eval(text: String): Evaluation {
        val calc = Calculator()
        expr().forEach { calc.eval(it) }
        return Evaluation(calc.value)
    }
}