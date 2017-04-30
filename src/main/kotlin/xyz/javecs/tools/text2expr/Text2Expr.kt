package xyz.javecs.tools.text2expr

import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.parsers.RuleBuilder
import xyz.javecs.tools.text2expr.utils.normalize
import xyz.javecs.tools.text2expr.utils.read
import xyz.javecs.tools.text2expr.utils.resources

class Text2Expr(rulePath: String = "rules") {
    private val rules = ArrayList<RuleBuilder>()
    private val calc = Calculator()

    init {
        resources(rulePath).forEach{ rules.add(RuleBuilder(read(it))) }
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
        return calc.eval(normalize(text)).value.toString()
    }
}