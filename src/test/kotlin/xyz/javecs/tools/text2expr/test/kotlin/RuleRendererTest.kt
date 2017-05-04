package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.rules.RuleRenderer
import xyz.javecs.tools.text2expr.rules.Variable
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
    }
}