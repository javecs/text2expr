package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import xyz.javecs.tools.text2expr.rules.parser
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class Text2ExprTest {
    @Test fun eval1() {
        assertEquals("1", Text2Expr().eval("1"))
    }

    @Test fun eval2() {
        val reply = """
            |x = 1.0
            |y = 1.0
            |
            |こうだから、
            |x+y
            |
            |答えは、
            |2
            """.trimMargin("|")
        assertEquals("2", Text2Expr().eval("1足す1"))
        assertEquals(reply, Text2Expr().eval("1足す1", rendered = true))
    }

    @Test fun eval3() {
        val text = "1マイルは、ざっくりなんキロメートル？"
        assertEquals("1.60934", Text2Expr("test-best-match/rule1/rule2/rule3").eval(text))
        assertEquals("1.6093", Text2Expr("test-best-match/rule1/rule2").eval(text))
        assertEquals("1.609", Text2Expr("test-best-match/rule1").eval(text))
        assertEquals("1.6", Text2Expr("test-best-match").eval(text))
    }

}