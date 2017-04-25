package xyz.javecs.tools.text2expr.parsers

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import xyz.javecs.tools.text2expr.parser.Text2ExprLexer
import xyz.javecs.tools.text2expr.parser.Text2ExprParser

private val operators = HashMap<String, String>().apply {
    put("掛ける", "*")
    put("かける", "*")
    put("足す", "+")
    put("たす", "+")
    put("割る", "/")
    put("わる", "/")
    put("引く", "-")
    put("ひく", "-")
    put("곱하기", "*")
    put("더하기", "+")
    put("나누기", "/")
    put("빼기", "-")
}

internal fun textToOperator(text: String): String {
    var replaced = text.toLowerCase()
    for ((key, value) in operators) {
        replaced = replaced.replace(key, value)
    }
    return replaced
}

internal fun parser(source: String): Text2ExprParser {
    val charStream = CharStreams.fromString(source)
    val lexer = Text2ExprLexer(charStream)
    val tokens = CommonTokenStream(lexer)
    return Text2ExprParser(tokens)
}