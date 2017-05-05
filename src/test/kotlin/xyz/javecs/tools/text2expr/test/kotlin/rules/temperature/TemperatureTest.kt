package xyz.javecs.tools.text2expr.test.kotlin.rules.temperature

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class TemperatureTest {

    val text2Expr = Text2Expr()

    @Test fun celsiusToFahrenheitTest1() {
        assertEquals("80.6", text2Expr.eval("摂氏２７度を華氏にすると？"))
        assertEquals("80.6°F", text2Expr.eval("摂氏２７度を華氏にすると？", rendered = true))
    }

    @Test fun fahrenheitToCelsiusTest1() {
        assertEquals("30", text2Expr.eval("華氏86度を摂氏にすると？"))
        assertEquals("30°C", text2Expr.eval("華氏86度を摂氏にすると？", rendered = true))
    }

}