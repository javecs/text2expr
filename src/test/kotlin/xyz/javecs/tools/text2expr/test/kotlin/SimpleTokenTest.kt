package xyz.javecs.tools.text2expr.test.kotlin

import com.atilika.kuromoji.ipadic.Tokenizer
import org.junit.Test
import xyz.javecs.tools.text2expr.rules.toSimpleTokens
import kotlin.test.assertEquals

class SimpleTokenTest {
    val tokenizer = Tokenizer()

    @Test fun toSimpleTokens1() {
        val tokens = tokenizer.tokenize("3.5").toSimpleTokens()
        assertEquals(1, tokens.size)
        assertEquals("3.5", tokens[0].surface)
    }

    @Test fun toSimpleTokens2() {
        val tokens = tokenizer.tokenize("3.5マイルは？").toSimpleTokens()
        assertEquals(4, tokens.size)
        assertEquals("3.5", tokens[0].surface)
        assertEquals("マイル", tokens[1].surface)
        assertEquals("は", tokens[2].surface)
        assertEquals("？", tokens[3].surface)
    }

    @Test fun toSimpleTokens3() {
        val tokens = tokenizer.tokenize("1 2 3.1 4 5").toSimpleTokens()
        assertEquals(9, tokens.size)
        assertEquals("3.1", tokens[4].surface)
    }

}
