// Generated from Text2Expr.g4 by ANTLR 4.7
package xyz.javecs.tools.text2expr.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Text2ExprParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Text2ExprVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#text2expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText2expr(Text2ExprParser.Text2exprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordDefine}
	 * labeled alternative in {@link Text2ExprParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordDefine(Text2ExprParser.WordDefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WordAssign}
	 * labeled alternative in {@link Text2ExprParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWordAssign(Text2ExprParser.WordAssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(Text2ExprParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(Text2ExprParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(Text2ExprParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Text2ExprParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#optionalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionalValue(Text2ExprParser.OptionalValueContext ctx);
}