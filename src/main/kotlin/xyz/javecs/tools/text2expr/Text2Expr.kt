package xyz.javecs.tools.text2expr

import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.utils.FunctionLoader
import xyz.javecs.tools.text2expr.utils.textToOperator

class Text2Expr {
    private val calc = Calculator()
    private val loader = FunctionLoader()

    init {
        calc.plugin(loader.read("miles2km"))
    }

    fun eval(text: String): String = calc.eval(textToOperator(text)).value.toString()
}