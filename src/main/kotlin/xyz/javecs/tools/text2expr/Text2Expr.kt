package xyz.javecs.tools.text2expr

import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.parsers.RuleBuilder
import xyz.javecs.tools.text2expr.utils.readRule

class Text2Expr {
    private val rules = ArrayList<RuleBuilder>()
    private val calc = Calculator()

    init {
        arrayOf("divide", "divide2",
                "multiply",
                "mileToKilometer",
                "minus",
                "plus")
                .forEach { rules.add(RuleBuilder(readRule(it))) }
    }

    fun eval(text: String): String {
        for (rule in rules) {
            try {
                val evaluation = rule.eval(text)
                if (evaluation.value != Double.NaN) {
                    return evaluation.value.toString()
                }
            } catch (e: Exception) {
            }
        }
        return calc.eval(text).value.toString()
    }
}