package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.templates.TemplateLoader
import kotlin.test.assertEquals

class TemplateLoaderTest {
    @Test fun template1() {
        val config = TemplateLoader("config/rule-template-test1.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("", config.templateOf("world"))

    }

    @Test fun template2() {
        val config = TemplateLoader("config/rule-template-test2.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("WORLD", config.templateOf("world"))
    }

    @Test fun template3() {
        val config = TemplateLoader("config/rule-template-test2.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("WORLD", config.templateOf("world"))
    }

    @Test fun template4() {
        val config = TemplateLoader("config/rule-template-test1.yml", defaultTemplate = "Ok")
        assertEquals("Ok", config.templateOf("xyz"))
    }

    @Test fun template5() {
        val expected = """
            |答えは、
            |<value>
            """.trimMargin("|")
        val config = TemplateLoader()
        assertEquals(expected, config.templateOf("rules/length/mileToKilometer.txt"))
    }

}
