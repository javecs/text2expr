package xyz.javecs.tools.text2expr.utils

import xyz.javecs.tools.expr.Function
import com.google.common.io.Resources

class FunctionLoader {
    fun read(name: String): Function {
        val resource = Resources.getResource("functions/$name.txt")
        val lines = Resources.toString(resource, Charsets.UTF_8).split(System.lineSeparator())
        return Function(lines.first(), lines.subList(1, lines.size).toTypedArray())
    }
}