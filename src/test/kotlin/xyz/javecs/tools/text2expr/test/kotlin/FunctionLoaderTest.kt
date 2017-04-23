package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.expr.Calculator
import xyz.javecs.tools.text2expr.utils.FunctionLoader
import kotlin.test.assertEquals

class FunctionLoaderTest {
    val functionLoader = FunctionLoader()

    @Test fun read1() {
        val f = functionLoader.read("hello")
        assertEquals("f", f.name)
        assertEquals("x", f.params.first())
        assertEquals("x+1", f.codes.first())
    }

}