// Generated from prefixLang.g4 by ANTLR 4.7.2
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
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#letExp}.
	 * @param ctx the parse tree
	 */
	void enterLetExp(prefixLangParser.LetExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#letExp}.
	 * @param ctx the parse tree
	 */
	void exitLetExp(prefixLangParser.LetExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(prefixLangParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(prefixLangParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#lambdaExp}.
	 * @param ctx the parse tree
	 */
	void enterLambdaExp(prefixLangParser.LambdaExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#lambdaExp}.
	 * @param ctx the parse tree
	 */
	void exitLambdaExp(prefixLangParser.LambdaExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link prefixLangParser#callExp}.
	 * @param ctx the parse tree
	 */
	void enterCallExp(prefixLangParser.CallExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link prefixLangParser#callExp}.
	 * @param ctx the parse tree
	 */
	void exitCallExp(prefixLangParser.CallExpContext ctx);
}