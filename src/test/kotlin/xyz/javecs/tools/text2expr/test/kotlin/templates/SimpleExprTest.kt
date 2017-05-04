package xyz.javecs.tools.text2expr.test.kotlin.templates

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class SimpleExprTest {
    @Test fun simpleExpr1() {
        val expected = """
        |答えは、
        |151.27796
        |
        """.trimMargin("|")
        val text2Expr = Text2Expr()
        assertEquals(expected, text2Expr.eval("９４マイルは何キロメートルですか？", rendered = true))
    }

    @Test fun simpleExpr2() {
        val expected = """
        |151.27796
        """.trimMargin("|")
        val text2Expr = Text2Expr()
        assertEquals(expected, text2Expr.eval("９４マイルは何キロメートルですか？", rendered = false))
    }
}