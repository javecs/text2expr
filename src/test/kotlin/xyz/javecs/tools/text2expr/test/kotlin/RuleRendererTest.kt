package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.rules.RuleRenderer
import xyz.javecs.tools.text2expr.rules.Variable
import xyz.javecs.tools.text2expr.templates.TemplateLoader
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class RuleRendererTest {
    @Test fun renderer1() {
        val expected = """
            |x = 1.0
            |y = 1.0
            |
            |こうだから、
            |x+y
            |
            |答えは、
            |2
            |
            """.trimMargin("|")
        val template = read("test-templates/template1.st")
        val renderer = RuleRenderer(template)
        renderer.add("variables", listOf(Variable("x", 1.0), Variable("y", 1.0)))
        renderer.add("expr", listOf("x+y"))
        renderer.add("value", 2)
        assertEquals(expected, renderer.render())
        assertEquals(3, renderer.attributes().size)

        renderer.clear()
        assertEquals(3, renderer.attributes().size)
        renderer.add("variables", listOf(Variable("x", 1.0), Variable("y", 1.0)))
        renderer.add("expr", listOf("x+y"))
        renderer.add("value", 2)
        assertEquals(expected, renderer.render())

        renderer.add("variables", listOf(Variable("x", 1.0), Variable("y", 1.0)), overwrite = true)
        renderer.add("expr", listOf("x+y"), overwrite = true)
        renderer.add("value", 2, overwrite = true)
        assertEquals(expected, renderer.render())
        assertEquals(3, renderer.attributes().size)
    }

    @Test fun renderer2() {
        val template = TemplateLoader().defaultTemplate
        val renderer = RuleRenderer(template)
        renderer.add("value1", "Hello")
        assertEquals("", renderer.render())

        renderer.add("value", "Hello")
        assertEquals("Hello", renderer.render())

        renderer.add("value", 5, overwrite = true)
        assertEquals("5", renderer.render())
    }

    @Test fun render3() {
        val template = TemplateLoader().defaultTemplate
        val rendered = RuleRenderer(template).apply {
            add("value", "1")
            add("value", "2")
            add("value", "3")
            add("value", "4")
            add("value", "5")
        }.render()
        assertEquals("12345", rendered)
    }
}