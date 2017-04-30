package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import xyz.javecs.tools.text2expr.parsers.parser
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class Text2ExprTest {

    val text2Expr = Text2Expr()

    @Test fun parser1() {
        val source = read("parsers/parser1.txt")
        val parser = parser(source)
        assertEquals("Text2Expr.g4", parser.grammarFileName)
    }

    @Test fun eval1() {
        assertEquals("1", text2Expr.eval("1"))
    }

    @Test fun eval2() {
        assertEquals("15", text2Expr.eval("3 掛ける 5"))
        assertEquals("16", text2Expr.eval("4 かける 4"))
        assertEquals("60", text2Expr.eval("30 × 2"))
    }

    @Test fun eval3() {
        assertEquals("2.5", text2Expr.eval("5 割る 2"))
        assertEquals("15", text2Expr.eval("30 わる 2"))
        assertEquals("7.5", text2Expr.eval("１５ ÷ 2"))
    }

    @Test fun eval4() {
        assertEquals("3", text2Expr.eval("1 足す 2"))
        assertEquals("6", text2Expr.eval("3＋3"))
    }

    @Test fun eval5() {
        assertEquals("-3", text2Expr.eval("2 引く 5"))
        assertEquals("0", text2Expr.eval("3−3"))
    }

    @Test fun eval6() {
        assertEquals("151.27796", text2Expr.eval("９４マイルは何キロメートルですか？"))
    }

}