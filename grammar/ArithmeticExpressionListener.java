// Generated from ArithmeticExpression.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ArithmeticExpressionParser}.
 */
public interface ArithmeticExpressionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(ArithmeticExpressionParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(ArithmeticExpressionParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(ArithmeticExpressionParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(ArithmeticExpressionParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(ArithmeticExpressionParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(ArithmeticExpressionParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ArithmeticExpressionParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ArithmeticExpressionParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ArithmeticExpressionParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#exprStmt}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ArithmeticExpressionParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(ArithmeticExpressionParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(ArithmeticExpressionParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(ArithmeticExpressionParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(ArithmeticExpressionParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ArithmeticExpressionParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ArithmeticExpressionParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ArithmeticExpressionParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ArithmeticExpressionParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ArithmeticExpressionParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ArithmeticExpressionParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ArithmeticExpressionParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ArithmeticExpressionParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void enterLogic_or(ArithmeticExpressionParser.Logic_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#logic_or}.
	 * @param ctx the parse tree
	 */
	void exitLogic_or(ArithmeticExpressionParser.Logic_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void enterLogic_and(ArithmeticExpressionParser.Logic_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#logic_and}.
	 * @param ctx the parse tree
	 */
	void exitLogic_and(ArithmeticExpressionParser.Logic_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#equality}.
	 * @param ctx the parse tree
	 */
	void enterEquality(ArithmeticExpressionParser.EqualityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#equality}.
	 * @param ctx the parse tree
	 */
	void exitEquality(ArithmeticExpressionParser.EqualityContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ArithmeticExpressionParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ArithmeticExpressionParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(ArithmeticExpressionParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(ArithmeticExpressionParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(ArithmeticExpressionParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(ArithmeticExpressionParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#unary}.
	 * @param ctx the parse tree
	 */
	void enterUnary(ArithmeticExpressionParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#unary}.
	 * @param ctx the parse tree
	 */
	void exitUnary(ArithmeticExpressionParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ArithmeticExpressionParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ArithmeticExpressionParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ArithmeticExpressionParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ArithmeticExpressionParser.PrimaryContext ctx);
}