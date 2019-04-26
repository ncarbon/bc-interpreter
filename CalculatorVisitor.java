// Generated from Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalculatorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalculatorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStat(CalculatorParser.AssignStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatFor(CalculatorParser.StatForContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(CalculatorParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatReturn(CalculatorParser.StatReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#conditionBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionBlock(CalculatorParser.ConditionBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CalculatorParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CalculatorParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(CalculatorParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#funcDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(CalculatorParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(CalculatorParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(CalculatorParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(CalculatorParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAtom(CalculatorParser.ExprAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinus(CalculatorParser.PlusMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixExpr(CalculatorParser.PostFixExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcC}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncC(CalculatorParser.FuncCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preFixVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFixVar(CalculatorParser.PreFixVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprExpo}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprExpo(CalculatorParser.ExprExpoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(CalculatorParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprMath}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMath(CalculatorParser.ExprMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(CalculatorParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprPrint}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprPrint(CalculatorParser.ExprPrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprSpecial}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSpecial(CalculatorParser.ExprSpecialContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelExpr(CalculatorParser.RelExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#postFixUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostFixUnaryExpr(CalculatorParser.PostFixUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#preFixUnaryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreFixUnaryExpr(CalculatorParser.PreFixUnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialSqrt}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialSqrt(CalculatorParser.SpecialSqrtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialRead}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialRead(CalculatorParser.SpecialReadContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathSine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathSine(CalculatorParser.MathSineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathCosine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathCosine(CalculatorParser.MathCosineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathLog}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathLog(CalculatorParser.MathLogContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExp}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExp(CalculatorParser.MathExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#listExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExpr(CalculatorParser.ListExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomNum}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomNum(CalculatorParser.AtomNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomId}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomId(CalculatorParser.AtomIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(CalculatorParser.NumberContext ctx);
}