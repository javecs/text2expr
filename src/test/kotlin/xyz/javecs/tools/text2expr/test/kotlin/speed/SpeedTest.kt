package xyz.javecs.tools.text2expr.test.kotlin.unit

import org.junit.Test
import xyz.javecs.tools.text2expr.Text2Expr
import kotlin.test.assertEquals

class SpeedTest {

    val text2Expr = Text2Expr()

    @Test fun kilometerPerHourToMeterPerSecond() {
        assertEquals("30.555555555555557", text2Expr.eval("時速110キロの車は1秒間に何メートル進みますか？"))
    }

}