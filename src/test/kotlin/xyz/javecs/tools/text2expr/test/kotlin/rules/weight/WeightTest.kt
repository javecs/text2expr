package xyz.javecs.tools.text2expr.test.kotlin.rules.weight

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class WeightTest {

    val text2Expr = Text2Expr()

    @Test fun poundToKilogram1() {
        assertEquals("0.45359", text2Expr.eval("1ポンドは、なんキログラム？"))
        assertEquals("0.45359", text2Expr.eval("ポンドは、なんキログラム？"))
        assertEquals("0.45359", text2Expr.eval("1lbは、なんｋｇ？"))
        assertEquals("0.45359", text2Expr.eval("1lbをkgにしたら"))
        assertEquals("0.45359", text2Expr.eval("1ポンド？"))
    }

}