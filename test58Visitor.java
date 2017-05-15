// Generated from test58.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link test58Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface test58Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link test58Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(test58Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(test58Parser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#banking}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBanking(test58Parser.BankingContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#createAccount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateAccount(test58Parser.CreateAccountContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#transferOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransferOp(test58Parser.TransferOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#withExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithExpr(test58Parser.WithExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#depoExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDepoExpr(test58Parser.DepoExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#balExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBalExpr(test58Parser.BalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#addPerson}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddPerson(test58Parser.AddPersonContext ctx);
	/**
	 * Visit a parse tree produced by {@link test58Parser#houseSell}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHouseSell(test58Parser.HouseSellContext ctx);
}