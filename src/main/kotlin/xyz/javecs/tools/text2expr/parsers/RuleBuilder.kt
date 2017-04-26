package xyz.javecs.tools.text2expr.parsers

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import xyz.javecs.tools.text2expr.parser.Text2ExprBaseVisitor
import xyz.javecs.tools.text2expr.parser.Text2ExprLexer
import xyz.javecs.tools.text2expr.parser.Text2ExprParser
import kotlin.collections.ArrayList

fun parser(source: String): Text2ExprParser {
    val charStream = CharStreams.fromString(source)
    val lexer = Text2ExprLexer(charStream)
    val tokens = CommonTokenStream(lexer)
    return Text2ExprParser(tokens)
}

data class Field(val key: String, val value: String)
class Word {
    var anyOf = ArrayList<Field>()
    var allOf = ArrayList<Field>()
}

internal fun Text2ExprParser.FieldContext.create(): Field = Field(this!!.PREFIX().text, this.JAPANESE().text)

internal class RuleInterpreter : Text2ExprBaseVisitor<Unit>() {
    var expr = StringBuffer()
    var rule = ArrayList<Word>()

    override fun visitFieldAnd(ctx: Text2ExprParser.FieldAndContext?) {
        val left = ctx!!.field(0).create()
        val right = ctx.field(1).create()

        val word = Word()
        word.allOf.addAll(arrayOf(left, right))
        rule.add(word)
    }

    override fun visitFieldOr(ctx: Text2ExprParser.FieldOrContext?) {
        val left = ctx!!.field(0).create()
        val right = ctx.field(1).create()

        val word = Word()
        word.anyOf.addAll(arrayOf(left, right))
        rule.add(word)
    }

    override fun visitFieldSingular(ctx: Text2ExprParser.FieldSingularContext?) {
        val word = Word()
        word.anyOf.add(ctx!!.field().create())
        rule.add(word)
    }

    override fun visitExpr(ctx: Text2ExprParser.ExprContext?): Unit {
        expr.append(ctx!!.text)
    }

}

class RuleBuilder(source: String) {
    private val interpreter = RuleInterpreter()

    init {
        interpreter.visit(parser(source).text2expr())
    }

    fun rule(): Array<Word> = interpreter.rule.toTypedArray()
    fun expr(): Array<String> = interpreter.expr
            .split(System.lineSeparator())
            .filter { it.isNotEmpty() }
            .toTypedArray()
}