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
        assertEquals("1.36078kg", text2Expr.eval("3ポンド?", rendered = true))
    }

    @Test fun ounceToGram1() {
        assertEquals("28.3495", text2Expr.eval("1オンスは、なんグラム？"))
        assertEquals("28.3495", text2Expr.eval("オンスは、なんグラム？"))
        assertEquals("28.3495", text2Expr.eval("1ozは、なんｇ？"))
        assertEquals("28.3495", text2Expr.eval("1ozをgにしたら"))
        assertEquals("28.3495", text2Expr.eval("1オンス？"))
        assertEquals("113.3981g", text2Expr.eval("4オンス?", rendered = true))
    }

    @Test fun poundOunceToKilogram1() {
        assertEquals("3.40194", text2Expr.eval("7ポンド8オンスは、なんキログラム？"))
        assertEquals("3.40194kg", text2Expr.eval("7ポンド8オンスは?", rendered = true))
        assertEquals("1.02058", text2Expr.eval("2lb4ozは？"))
    }
}