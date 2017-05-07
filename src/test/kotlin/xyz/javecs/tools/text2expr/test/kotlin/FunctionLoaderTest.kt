package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.utils.FunctionLoader
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class FunctionLoaderTest {

    @Test fun read1() {
        val functionLoader = FunctionLoader()
        val f = functionLoader.load("hello")
        assertEquals("f", f.name)
        assertEquals("x", f.params.first())
        assertEquals("x+1", f.codes.first())
    }

    @Test fun read2() {
        val s = read("utils/hello.txt")
        assertTrue(s.startsWith("Hello"))
        assertEquals(4, s.split(System.lineSeparator()).size)
    }

}