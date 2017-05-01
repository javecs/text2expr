package xyz.javecs.tools.text2expr.test.kotlin.unit

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class LengthTest {

    val text2Expr = Text2Expr()

    @Test fun mileToKilometer() {
        assertEquals("151.27796", text2Expr.eval("９４マイルは何キロメートルですか？"))
    }
}