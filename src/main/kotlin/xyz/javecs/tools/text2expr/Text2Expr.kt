package xyz.javecs.tools.text2expr

import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.parsers.RuleBuilder
import xyz.javecs.tools.text2expr.parsers.RuleRenderer
import xyz.javecs.tools.text2expr.parsers.Variable
import xyz.javecs.tools.text2expr.utils.TemplateLoader
import xyz.javecs.tools.text2expr.utils.normalize
import xyz.javecs.tools.text2expr.utils.read
import xyz.javecs.tools.text2expr.utils.resources

class Text2Expr(rulePath: String = "rules") {
    private val rules = ArrayList<RuleBuilder>()
    private val templates = TemplateLoader(defaultTemplate = read("templates/reply.st"))

    init {
        resources(rulePath).forEach { rules.add(RuleBuilder(source = read(it), name = it)) }
    }

    fun eval(text: String, rendered: Boolean = false): String {
        rules.forEach {
            try {
                val evaluation = it.eval(text)
                if (evaluation.value != Double.NaN) return if (rendered) {
                    val renderer = RuleRenderer(templates.templateOf(it.name))
                    renderer.add("variables", evaluation.variables.map { Variable(it.key, it.value) }.toList())
                    renderer.add("expr", evaluation.expr)
                    renderer.add("text", text)
                    renderer.add("value", evaluation.value)
                    renderer.render()
                } else {
                    evaluation.value.toString()
                }
            } catch (e: Exception) {
            }
        }
        return Calculator().eval(normalize(text)).value.toString()
    }
}