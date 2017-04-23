package xyz.javecs.tools.text2expr.test.kotlin

import kotlin.test.assertEquals
import org.junit.Test
import xyz.javecs.tools.text2expr.greetings

class ConverterTest {
    @Test fun test1() {
        assertEquals("Hello, world", greetings("world"))
    }
}