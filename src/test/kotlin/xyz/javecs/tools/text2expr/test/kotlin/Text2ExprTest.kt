package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class Text2ExprTest {

    val text2Expr = Text2Expr()

    @Test fun eval1() {
        assertEquals("1", text2Expr.eval("1"))
    }

    @Test fun eval2() {
        assertEquals("151.27796", text2Expr.eval("miles2km(94)"))
    }

    @Test fun eval3() {
        assertEquals("15", text2Expr.eval("3 掛ける 5"))
    }
}