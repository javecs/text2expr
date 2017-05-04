package xyz.javecs.tools.text2expr.test.kotlin.rules.arithmetic

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import xyz.javecs.tools.text2expr.parsers.parser
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class ArithmeticTest {

    val text2Expr = Text2Expr()

    @Test fun arithmetic1() {
        assertEquals("15", text2Expr.eval("3 掛ける 5"))
        assertEquals("16", text2Expr.eval("4 かける 4"))
        assertEquals("60", text2Expr.eval("30 × 2"))
        assertEquals("120", text2Expr.eval("24 x 5"))
    }

    @Test fun arithmetic2() {
        assertEquals("2.5", text2Expr.eval("5 割る 2"))
        assertEquals("15", text2Expr.eval("30 わる 2"))
        assertEquals("7.5", text2Expr.eval("１５ ÷ 2"))
    }

    @Test fun arithmetic3() {
        assertEquals("3", text2Expr.eval("1 足す 2"))
        assertEquals("6", text2Expr.eval("3＋3"))
    }

    @Test fun arithmetic4() {
        assertEquals("-3", text2Expr.eval("2 引く 5"))
        assertEquals("0", text2Expr.eval("3−3"))
    }

}