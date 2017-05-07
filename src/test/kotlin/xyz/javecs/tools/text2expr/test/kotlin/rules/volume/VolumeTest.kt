package xyz.javecs.tools.text2expr.test.kotlin.rules.volume

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class VolumeTest {

    val text2Expr = Text2Expr()

    @Test fun gallonsToLiters() {
        assertEquals("3.78541", text2Expr.eval("1ガロンは、何リットル？"))
        assertEquals("11.35624L", text2Expr.eval("3gal?", rendered = true))
    }

}