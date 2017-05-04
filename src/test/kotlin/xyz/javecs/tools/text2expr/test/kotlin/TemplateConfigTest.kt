package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.utils.TemplateConfig
import kotlin.test.assertEquals

class TemplateConfigTest {
    @Test fun template1() {
        val config = TemplateConfig("config/rule-template-test1.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("", config.templateOf("world"))

    }

    @Test fun template2() {
        val config = TemplateConfig("config/rule-template-test2.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("WORLD", config.templateOf("world"))
    }

    @Test fun template3() {
        val config = TemplateConfig("config/rule-template-test2.yml")
        assertEquals("HELLO", config.templateOf("hello"))
        assertEquals("WORLD", config.templateOf("world"))
    }

    @Test fun template4() {
        val config = TemplateConfig("config/rule-template-test1.yml", defaultTemplate = "Ok")
        assertEquals("Ok", config.templateOf("xyz"))
    }

    @Test fun template5() {
        val expected = """
            |<if(variables)>
            |<variables:{v|<v.key> = <v.value>
            |}>
            |<endif>
            |<if(expr)>
            |こうだから、
            |<expr:{e|<e>
            |}>
            |<endif>
            |答えは、
            |<value>
            |
            """.trimMargin("|")
        val config = TemplateConfig()
        assertEquals(expected, config.templateOf("default"))
    }

}
