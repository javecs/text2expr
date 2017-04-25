package xyz.javecs.tools.text2expr.test.kotlin

import org.junit.Test
import xyz.javecs.tools.text2expr.parsers.parser
import xyz.javecs.tools.text2expr.parsers.textToOperator
import xyz.javecs.tools.text2expr.utils.read
import kotlin.test.assertEquals

class ConverterTest {
    @Test fun mapper1() {
        assertEquals("3*3", textToOperator("3곱하기3"))
        assertEquals("3/3", textToOperator("3나누기3"))
        assertEquals("3+3", textToOperator("3더하기3"))
        assertEquals("3-3", textToOperator("3빼기3"))
    }

    @Test fun mapper2() {
        assertEquals("3*3", textToOperator("3掛ける3"))
        assertEquals("3*3", textToOperator("3かける3"))
        assertEquals("3/3", textToOperator("3割る3"))
        assertEquals("3/3", textToOperator("3わる3"))
        assertEquals("3+3", textToOperator("3足す3"))
        assertEquals("3+3", textToOperator("3たす3"))
        assertEquals("3-3", textToOperator("3引く3"))
        assertEquals("3-3", textToOperator("3ひく3"))
    }

    @Test fun parser1() {
        val source = read("parsers/parser1.txt")
        val parser = parser(source)
        assertEquals("Text2Expr.g4", parser.grammarFileName)
    }

}