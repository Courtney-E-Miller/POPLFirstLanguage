// Generated from /Users/courtneymiller/Desktop/P.O.P.L./Exercise1/src/main/antlr/prefixLang.g4 by ANTLR 4.8
package prefixGrammer;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link prefixLangParser}.
 */
public interface prefixLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(prefixLangParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(prefixLangParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(prefixLangParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(prefixLangParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#orExp}.
	 * @param ctx the parse tree
	 */
	void enterOrExp(prefixLangParser.OrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#orExp}.
	 * @param ctx the parse tree
	 */
	void exitOrExp(prefixLangParser.OrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#notExp}.
	 * @param ctx the parse tree
	 */
	void enterNotExp(prefixLangParser.NotExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#notExp}.
	 * @param ctx the parse tree
	 */
	void exitNotExp(prefixLangParser.NotExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#andExp}.
	 * @param ctx the parse tree
	 */
	void enterAndExp(prefixLangParser.AndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#andExp}.
	 * @param ctx the parse tree
	 */
	void exitAndExp(prefixLangParser.AndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void enterIfExp(prefixLangParser.IfExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#ifExp}.
	 * @param ctx the parse tree
	 */
	void exitIfExp(prefixLangParser.IfExpContext ctx);
}