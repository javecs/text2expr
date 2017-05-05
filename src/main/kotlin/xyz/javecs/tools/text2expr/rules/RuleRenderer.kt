package xyz.javecs.tools.text2expr.rules

import org.stringtemplate.v4.ST

data class Variable(val key:String, val value:Double)
class RuleRenderer(template: String) {
    private val renderer = ST(template)

    fun attributes(): Map<String, Any> = if (renderer.attributes == null) {
        HashMap()
    } else {
        renderer.attributes
    }

    fun clear() {
        attributes().keys.forEach { renderer.remove(it) }
    }

    fun add(name: String, value: Any, overwrite: Boolean = false) {
        if (overwrite && attributes().containsKey(name)) renderer.remove(name)
        renderer.add(name, value)
    }

    fun render(): String = renderer.render()
}