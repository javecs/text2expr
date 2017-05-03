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
        val reply = read("templates/reply.st")
        resources(rulePath).forEach { rules.add(RuleBuilder(read(it), reply)) }
    }

    fun eval(text: String, rendered: Boolean = false): String {
        rules.forEach {
            try {
                val evaluation = it.eval(text)
                if (evaluation.value != Double.NaN) return if (rendered) {
                    evaluation.rendered
                } else {
                    evaluation.value.toString()
                }
            } catch (e: Exception) {
            }
        }
        return calc.eval(normalize(text)).value.toString()
    }
}