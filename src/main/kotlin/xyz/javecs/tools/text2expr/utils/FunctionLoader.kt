package xyz.javecs.tools.text2expr.utils

import xyz.javecs.tools.expr.Function

internal class FunctionLoader {
    fun load(name: String): Function {
        val lines = read("functions/$name.txt").split(System.lineSeparator())
        return Function(lines.first(), lines.subList(1, lines.size).toTypedArray())
    }
}