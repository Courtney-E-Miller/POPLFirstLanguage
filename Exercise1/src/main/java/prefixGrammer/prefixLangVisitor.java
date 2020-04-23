// Generated from /Users/courtneymiller/Desktop/P.O.P.L./Exercise1/src/main/antlr/prefixLang.g4 by ANTLR 4.8
package prefixGrammer;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link prefixLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface prefixLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(prefixLangParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#r}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR(prefixLangParser.RContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#orExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExp(prefixLangParser.OrExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#notExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExp(prefixLangParser.NotExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#andExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExp(prefixLangParser.AndExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#ifExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExp(prefixLangParser.IfExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#letExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExp(prefixLangParser.LetExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(prefixLangParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#lambdaExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambdaExp(prefixLangParser.LambdaExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link prefixLangParser#callExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExp(prefixLangParser.CallExpContext ctx);
}