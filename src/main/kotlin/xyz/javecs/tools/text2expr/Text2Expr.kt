package xyz.javecs.tools.text2expr

import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.rules.RuleBuilder
import xyz.javecs.tools.text2expr.rules.RuleRenderer
import xyz.javecs.tools.text2expr.rules.Variable
import xyz.javecs.tools.text2expr.templates.TemplateLoader
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
        val evaluated = rules.map { it.eval(text) }
                .filterNot { it.value == Double.NaN }
                .sortedByDescending { it.coverage }
                .toList()
        return if (evaluated.isEmpty()) {
            Calculator().eval(normalize(text)).value.toString()
        } else {
            val bestMatch = evaluated.first()
            if (rendered) {
                val renderer = RuleRenderer(templates.templateOf(bestMatch.rule))
                renderer.add("variables", bestMatch.variables.map { Variable(it.key, it.value) }.toList())
                renderer.add("expr", bestMatch.expr)
                renderer.add("text", text)
                renderer.add("value", bestMatch.value)
                renderer.render()
            } else {
                bestMatch.value.toString()
            }
        }
    }
}