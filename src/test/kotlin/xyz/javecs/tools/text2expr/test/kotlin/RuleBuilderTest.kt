package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Rule
import org.junit.Test
import xyz.javecs.tools.text2expr.parsers.RuleBuilder
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class RuleBuilderTest {
    @Test fun rule1() {
        val source = read("rules/rule1.txt")
        val builder = RuleBuilder(source)
        val expr = builder.expr()
        val rule = builder.rule()
        assertEquals("x*1.60934", expr[0])
        assertEquals(1, expr.size)
        assertEquals(3, rule.size)
    }

    @Test fun rule2() {
        val source = read("rules/rule2.txt")
        val builder = RuleBuilder(source)
        val expr = builder.expr()
        val rule = builder.rule()

        assertEquals(3, expr.size)
        assertEquals("x*2", expr.last())

        val word3field1 = rule[2].fields.first()
        assertEquals("BF", word3field1.key)
        assertEquals("キロメートル", word3field1.value[0])
        assertEquals("キロ", word3field1.value[1])
        assertEquals("きろ", word3field1.value[2])

        val word4field1 = rule[3].fields[0]
        assertEquals("SF", word4field1.key)
        assertEquals("です", word4field1.value[0])

        val word4field2 = rule[3].fields[1]
        assertEquals("P1", word4field2.key)
        assertEquals("助動詞", word4field2.value[0])

        val word4field3 = rule[3].fields[2]
        assertEquals("RD", word4field3.key)
        assertEquals("デス", word4field3.value[0])
        assertEquals("です", word4field3.value[1])
    }

    @Test fun rule3() {
        val source = read("rules/rule3.txt")
        val builder = RuleBuilder(source)
        assertEquals(256, builder.eval("なんでも").value)
    }

    @Test fun rule4() {
        val source = read("rules/rule4.txt")
        val builder = RuleBuilder(source)
        assertEquals("x", builder.rule()[0].id)
        assertEquals("y", builder.rule()[1].id)
    }
}