package xyz.javecs.tools.text2expr.rules

import org.stringtemplate.v4.ST

data class Variable(val key:String, val value:Double)
class RuleRenderer(template: String) {
    private val renderer = ST(template)
    fun add(name: String, value: Any) {
        renderer.add(name, value)
    }
    fun render(): String = renderer.render()
}