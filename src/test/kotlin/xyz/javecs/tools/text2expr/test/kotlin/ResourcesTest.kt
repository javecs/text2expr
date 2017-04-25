package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ResourcesTest {
    @Test fun read1() {
        val s = read("utils/hello.txt")
        assertTrue(s.startsWith("Hello"))
        assertEquals(4, s.split(System.lineSeparator()).size)
    }
}
