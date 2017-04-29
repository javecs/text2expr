package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.utils.read
import xyz.javecs.tools.text2expr.utils.readRule
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class ResourcesTest {
    @Test fun read1() {
        val s = read("utils/hello.txt")
        assertTrue(s.startsWith("Hello"))
        assertEquals(4, s.split(System.lineSeparator()).size)
    }

    @Test fun read2() {
        val s = readRule("rule1")
        assertTrue(s.startsWith("x = P2:数"))
        assertEquals(9, s.split(System.lineSeparator()).size)
    }
}
