// Generated from C:/Users/Leo/IdeaProjects/cobau-projekt/grammar\ArithmeticExpression.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ArithmeticExpressionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ArithmeticExpressionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ArithmeticExpressionParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(ArithmeticExpressionParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#varDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecl(ArithmeticExpressionParser.VarDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ArithmeticExpressionParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#exprStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ArithmeticExpressionParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(ArithmeticExpressionParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#printStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStmt(ArithmeticExpressionParser.PrintStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ArithmeticExpressionParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ArithmeticExpressionParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ArithmeticExpressionParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ArithmeticExpressionParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#logic_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_or(ArithmeticExpressionParser.Logic_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#logic_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogic_and(ArithmeticExpressionParser.Logic_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#equality}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality(ArithmeticExpressionParser.EqualityContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ArithmeticExpressionParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(ArithmeticExpressionParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(ArithmeticExpressionParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(ArithmeticExpressionParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ArithmeticExpressionParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ArithmeticExpressionParser.PrimaryContext ctx);
}