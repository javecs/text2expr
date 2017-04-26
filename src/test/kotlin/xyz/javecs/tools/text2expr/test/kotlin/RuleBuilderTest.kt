package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.parsers.RuleBuilder
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class RuleBuilderTest {
    @Test fun rule1() {
        val source = read("rules/rule1.txt")
        val ruleBuilder = RuleBuilder(source)
        val expr = ruleBuilder.expr()
        val rule = ruleBuilder.rule()
        assertEquals("x*1.60934", expr[0])
        assertEquals(1, expr.size)
        assertEquals(3, rule.size)
    }
}