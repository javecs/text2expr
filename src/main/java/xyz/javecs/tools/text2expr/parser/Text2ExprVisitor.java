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
	 * Visit a parse tree produced by {@link Text2ExprParser#text}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitText(Text2ExprParser.TextContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(Text2ExprParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link Text2ExprParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(Text2ExprParser.ExprContext ctx);
}