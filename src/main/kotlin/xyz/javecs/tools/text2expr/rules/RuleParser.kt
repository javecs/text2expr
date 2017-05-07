package xyz.javecs.tools.text2expr.rules

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import xyz.javecs.tools.text2expr.parser.Text2ExprBaseVisitor
import xyz.javecs.tools.text2expr.parser.Text2ExprLexer
import xyz.javecs.tools.text2expr.parser.Text2ExprParser

internal data class Field(var key: String = "",
                 var value: MutableList<String> = ArrayList(),
                 var isOptional: Boolean = false,
                 var optionalValue: Double = Double.NaN)

internal class Word(var fields: MutableList<Field> = ArrayList(), val id: String = "") {
    fun isOptional() = fields.find { it.isOptional } != null
    fun optionalValue(): Double? = fields.find { it.isOptional }?.optionalValue
}

internal fun parser(source: String): Text2ExprParser {
    val charStream = CharStreams.fromString(source)
    val lexer = Text2ExprLexer(charStream)
    val tokens = CommonTokenStream(lexer)
    return Text2ExprParser(tokens)
}

internal class RuleParser : Text2ExprBaseVisitor<Unit>() {
    var expr = StringBuffer()
    var rule = ArrayList<Word>()

    override fun visitWordDefine(ctx: Text2ExprParser.WordDefineContext) {
        rule.add(Word())
        super.visitWordDefine(ctx)
    }

    override fun visitWordAssign(ctx: Text2ExprParser.WordAssignContext) {
        rule.add(Word(id = ctx.ID().text))
        super.visitWordAssign(ctx)
    }

    override fun visitField(ctx: Text2ExprParser.FieldContext) {
        val field = Field()
        if (ctx.op.text == "?") field.isOptional = true
        field.key = ctx.PREFIX().text
        field.value = ArrayList()
        rule.last().fields.add(field)
        visit(ctx.value())
    }

    override fun visitValue(ctx: Text2ExprParser.ValueContext) {
        val field = rule.last().fields.last()
        if (ctx.JAPANESE() != null) field.value.add(ctx.JAPANESE().text)
        if (ctx.SYMBOL() != null) field.value.add(ctx.SYMBOL().text.replace("\"", ""))
        if (ctx.optionalValue() != null) field.optionalValue = ctx.optionalValue().NUMBER().text.toDouble()
        ctx.value().forEach { visit(it) }
    }

    override fun visitExpr(ctx: Text2ExprParser.ExprContext) {
        expr.append(ctx.text)
    }
}