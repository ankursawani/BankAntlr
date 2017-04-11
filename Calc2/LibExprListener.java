// Generated from LibExpr.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LibExprParser}.
 */
public interface LibExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(LibExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link LibExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(LibExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(LibExprParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code declaration}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(LibExprParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(LibExprParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(LibExprParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssign(LibExprParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssign(LibExprParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(LibExprParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link LibExprParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(LibExprParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intDeclation}
	 * labeled alternative in {@link LibExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterIntDeclation(LibExprParser.IntDeclationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intDeclation}
	 * labeled alternative in {@link LibExprParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitIntDeclation(LibExprParser.IntDeclationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParens(LibExprParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parens}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParens(LibExprParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(LibExprParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(LibExprParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(LibExprParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(LibExprParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(LibExprParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(LibExprParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInt(LibExprParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link LibExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInt(LibExprParser.IntContext ctx);
}