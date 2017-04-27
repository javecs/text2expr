package xyz.javecs.tools.text2expr.parsers

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import xyz.javecs.tools.text2expr.parser.Text2ExprBaseVisitor
import xyz.javecs.tools.text2expr.parser.Text2ExprLexer
import xyz.javecs.tools.text2expr.parser.Text2ExprParser

data class Field(var key: String = "", var value: List<String> = ArrayList())
class Word(var fields: ArrayList<Field> = ArrayList(), val id: String = "")

internal fun parser(source: String): Text2ExprParser {
    val charStream = CharStreams.fromString(source)
    val lexer = Text2ExprLexer(charStream)
    val tokens = CommonTokenStream(lexer)
    return Text2ExprParser(tokens)
}

internal class RuleParser : Text2ExprBaseVisitor<Unit>() {
    var expr = StringBuffer()
    var rule = ArrayList<Word>()

    override fun visitWordDefine(ctx: Text2ExprParser.WordDefineContext): Unit {
        rule.add(Word())
        super.visitWordDefine(ctx)
    }

    override fun visitWordAssign(ctx: Text2ExprParser.WordAssignContext): Unit {
        rule.add(Word(id = ctx.ID().text))
        super.visitWordAssign(ctx)
    }

    override fun visitField(ctx: Text2ExprParser.FieldContext): Unit {
        val field = Field()
        field.key = ctx.PREFIX().text
        field.value = ctx.value().text.split("|").toList()
        rule.last().fields.add(field)
    }

    override fun visitExpr(ctx: Text2ExprParser.ExprContext): Unit {
        expr.append(ctx.text)
    }
}