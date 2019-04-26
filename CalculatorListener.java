// Generated from Calculator.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CalculatorParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CalculatorParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printExpr}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitPrintExpr(CalculatorParser.PrintExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CalculatorParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CalculatorParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitIfStat(CalculatorParser.IfStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStat}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitWhileStat(CalculatorParser.WhileStatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatFor(CalculatorParser.StatForContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statFor}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatFor(CalculatorParser.StatForContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(CalculatorParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(CalculatorParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStatReturn(CalculatorParser.StatReturnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statReturn}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStatReturn(CalculatorParser.StatReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blank}
	 * labeled alternative in {@link CalculatorParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitBlank(CalculatorParser.BlankContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(CalculatorParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CalculatorParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CalculatorParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionBlock(CalculatorParser.ConditionBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#conditionBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionBlock(CalculatorParser.ConditionBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CalculatorParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CalculatorParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CalculatorParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CalculatorParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(CalculatorParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(CalculatorParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFuncDeclaration(CalculatorParser.FuncDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(CalculatorParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(CalculatorParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(CalculatorParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(CalculatorParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(CalculatorParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(CalculatorParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(CalculatorParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(CalculatorParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAtom(CalculatorParser.ExprAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprAtom}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAtom(CalculatorParser.ExprAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinus(CalculatorParser.PlusMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusMinus}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinus(CalculatorParser.PlusMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPostFixExpr(CalculatorParser.PostFixExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postFixExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPostFixExpr(CalculatorParser.PostFixExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnary(CalculatorParser.UnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcC}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncC(CalculatorParser.FuncCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcC}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncC(CalculatorParser.FuncCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preFixVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPreFixVar(CalculatorParser.PreFixVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preFixVar}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPreFixVar(CalculatorParser.PreFixVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDiv}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprExpo}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprExpo(CalculatorParser.ExprExpoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprExpo}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprExpo(CalculatorParser.ExprExpoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(CalculatorParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(CalculatorParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprMath}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMath(CalculatorParser.ExprMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprMath}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMath(CalculatorParser.ExprMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(CalculatorParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(CalculatorParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprPrint}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprPrint(CalculatorParser.ExprPrintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprPrint}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprPrint(CalculatorParser.ExprPrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprSpecial}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSpecial(CalculatorParser.ExprSpecialContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprSpecial}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSpecial(CalculatorParser.ExprSpecialContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterRelExpr(CalculatorParser.RelExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitRelExpr(CalculatorParser.RelExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code boolExpr}
	 * labeled alternative in {@link CalculatorParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(CalculatorParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#postFixUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPostFixUnaryExpr(CalculatorParser.PostFixUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#postFixUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPostFixUnaryExpr(CalculatorParser.PostFixUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#preFixUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void enterPreFixUnaryExpr(CalculatorParser.PreFixUnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#preFixUnaryExpr}.
	 * @param ctx the parse tree
	 */
	void exitPreFixUnaryExpr(CalculatorParser.PreFixUnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialSqrt}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void enterSpecialSqrt(CalculatorParser.SpecialSqrtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialSqrt}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void exitSpecialSqrt(CalculatorParser.SpecialSqrtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialRead}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void enterSpecialRead(CalculatorParser.SpecialReadContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialRead}
	 * labeled alternative in {@link CalculatorParser#specialExpr}.
	 * @param ctx the parse tree
	 */
	void exitSpecialRead(CalculatorParser.SpecialReadContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathSine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathSine(CalculatorParser.MathSineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathSine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathSine(CalculatorParser.MathSineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathCosine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathCosine(CalculatorParser.MathCosineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathCosine}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathCosine(CalculatorParser.MathCosineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathLog}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathLog(CalculatorParser.MathLogContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathLog}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathLog(CalculatorParser.MathLogContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExp}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void enterMathExp(CalculatorParser.MathExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExp}
	 * labeled alternative in {@link CalculatorParser#mathExpr}.
	 * @param ctx the parse tree
	 */
	void exitMathExp(CalculatorParser.MathExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(CalculatorParser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#listExpr}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(CalculatorParser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomNum}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomNum(CalculatorParser.AtomNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomNum}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomNum(CalculatorParser.AtomNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomId}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtomId(CalculatorParser.AtomIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomId}
	 * labeled alternative in {@link CalculatorParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtomId(CalculatorParser.AtomIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(CalculatorParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(CalculatorParser.NumberContext ctx);
}