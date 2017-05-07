package xyz.javecs.tools.text2expr.test.kotlin.rules.length

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class LengthTest {

    val text2Expr = Text2Expr()

    @Test fun milesToKilometers1() {
        assertEquals("151.27796", text2Expr.eval("９４マイルは何キロメートルですか？"))
        assertEquals("151.27796", text2Expr.eval("９４マイルは何キロですか？"))
        assertEquals("151.27796", text2Expr.eval("94mileは何kmですか？"))
        assertEquals("1.60934", text2Expr.eval("マイルは、なんキロメートル？"))
        assertEquals("2.41401", text2Expr.eval("1.5マイルは、何キロ？"))
    }

    @Test fun kilometersToMiles1() {
        assertEquals("1.864113576", text2Expr.eval("３キロメートルは、何マイルですか？"))
        assertEquals("1.864113576", text2Expr.eval("３キロは、何マイルですか？"))
        assertEquals("1.864113576", text2Expr.eval("3kmは、何mileですか？"))
    }
}