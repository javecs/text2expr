package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.rules.RuleBuilder
import xyz.javecs.tools.text2expr.rules.parser
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class RuleParserTest {
    @Test fun parser1() {
        val source = read("parsers/parser1.txt")
        val parser = parser(source)
        assertEquals("Text2Expr.g4", parser.grammarFileName)
    }

    @Test fun parser2() {
        val source = read("parsers/parser2.txt")
        val builder = RuleBuilder(source)
        val expr = builder.expr()
        val rule = builder.rule()
        assertEquals(1, expr.size)
        assertEquals(3, rule.size)

        val word = rule[0]
        val field = word.fields[0]
        assertEquals("x", word.id)
        assertTrue(field.isOptional)
        assertEquals(3.5, field.optionalValue)
    }
}