package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import xyz.javecs.tools.text2expr.parsers.parser
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class Text2ExprTest {
    @Test fun parser1() {
        val source = read("parsers/parser1.txt")
        val parser = parser(source)
        assertEquals("Text2Expr.g4", parser.grammarFileName)
    }

    @Test fun eval1() {
        assertEquals("1", Text2Expr().eval("1"))
    }

}