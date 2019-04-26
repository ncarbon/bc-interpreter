// Generated from /Users/natalycarbonell/Documents/cop4020/Project2/Calculator.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculatorParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, NOT=2, AND=3, OR=4, GT=5, GE=6, LT=7, LE=8, EQ=9, IF=10, ELSE=11, 
		WHILE=12, FOR=13, DEFINE=14, RETURN=15, SQRT=16, READ=17, PRINT=18, SINE=19, 
		COSINE=20, LOG=21, EXP=22, COMMA=23, ID=24, LPAREN=25, RPAREN=26, LCUR=27, 
		RCUR=28, SEMI=29, PLUS=30, MINUS=31, MUL=32, DIV=33, MOD=34, PP=35, MM=36, 
		ASS=37, ASSADD=38, ASSMIN=39, ASSPROD=40, ASSDIV=41, ASSMOD=42, INTEGER_NUM=43, 
		DOUBLE_NUM=44, NEWLINE=45, WS=46, BlockComment=47, LineComment=48;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_assign = 2, RULE_ifStatement = 3, RULE_block = 4, 
		RULE_conditionBlock = 5, RULE_returnStatement = 6, RULE_whileStatement = 7, 
		RULE_forStatement = 8, RULE_funcDeclaration = 9, RULE_params = 10, RULE_param = 11, 
		RULE_funcCall = 12, RULE_arguments = 13, RULE_expr = 14, RULE_postFixUnaryExpr = 15, 
		RULE_preFixUnaryExpr = 16, RULE_specialExpr = 17, RULE_mathExpr = 18, 
		RULE_listExpr = 19, RULE_atom = 20, RULE_number = 21;
	public static final String[] ruleNames = {
		"prog", "stat", "assign", "ifStatement", "block", "conditionBlock", "returnStatement", 
		"whileStatement", "forStatement", "funcDeclaration", "params", "param", 
		"funcCall", "arguments", "expr", "postFixUnaryExpr", "preFixUnaryExpr", 
		"specialExpr", "mathExpr", "listExpr", "atom", "number"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'^'", "'!'", "'&&'", "'||'", "'>'", "'>='", "'<'", "'<='", "'=='", 
		"'if'", "'else'", "'while'", "'for'", "'define'", "'return'", "'sqrt'", 
		"'read'", "'print'", "'s'", "'c'", "'l'", "'e'", "','", null, "'('", "')'", 
		"'{'", "'}'", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'++'", "'--'", 
		"'='", "'+='", "'-='", "'*='", "'/='", "'%='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "NOT", "AND", "OR", "GT", "GE", "LT", "LE", "EQ", "IF", "ELSE", 
		"WHILE", "FOR", "DEFINE", "RETURN", "SQRT", "READ", "PRINT", "SINE", "COSINE", 
		"LOG", "EXP", "COMMA", "ID", "LPAREN", "RPAREN", "LCUR", "RCUR", "SEMI", 
		"PLUS", "MINUS", "MUL", "DIV", "MOD", "PP", "MM", "ASS", "ASSADD", "ASSMIN", 
		"ASSPROD", "ASSDIV", "ASSMOD", "INTEGER_NUM", "DOUBLE_NUM", "NEWLINE", 
		"WS", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calculator.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalculatorParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << DEFINE) | (1L << RETURN) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(44);
				stat();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IfStatContext extends StatContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public IfStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class FuncDecContext extends StatContext {
		public FuncDeclarationContext funcDeclaration() {
			return getRuleContext(FuncDeclarationContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public FuncDecContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class BlankContext extends StatContext {
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public BlankContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class AssignStatContext extends StatContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public AssignStatContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatReturnContext extends StatContext {
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public StatReturnContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class StatForContext extends StatContext {
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public StatForContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class PrintExprContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public PrintExprContext(StatContext ctx) { copyFrom(ctx); }
	}
	public static class WhileStatContext extends StatContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public WhileStatContext(StatContext ctx) { copyFrom(ctx); }
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new PrintExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				expr(0);
				setState(51);
				match(NEWLINE);
				}
				break;
			case 2:
				_localctx = new AssignStatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				assign();
				setState(54);
				match(NEWLINE);
				}
				break;
			case 3:
				_localctx = new IfStatContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				ifStatement();
				setState(57);
				match(NEWLINE);
				}
				break;
			case 4:
				_localctx = new WhileStatContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				whileStatement();
				setState(60);
				match(NEWLINE);
				}
				break;
			case 5:
				_localctx = new StatForContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				forStatement();
				setState(63);
				match(NEWLINE);
				}
				break;
			case 6:
				_localctx = new FuncDecContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				funcDeclaration();
				setState(66);
				match(NEWLINE);
				}
				break;
			case 7:
				_localctx = new StatReturnContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				returnStatement();
				setState(69);
				match(NEWLINE);
				}
				break;
			case 8:
				_localctx = new BlankContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Token op;
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASS() { return getToken(CalculatorParser.ASS, 0); }
		public TerminalNode ASSADD() { return getToken(CalculatorParser.ASSADD, 0); }
		public TerminalNode ASSMIN() { return getToken(CalculatorParser.ASSMIN, 0); }
		public TerminalNode ASSPROD() { return getToken(CalculatorParser.ASSPROD, 0); }
		public TerminalNode ASSDIV() { return getToken(CalculatorParser.ASSDIV, 0); }
		public TerminalNode ASSMOD() { return getToken(CalculatorParser.ASSMOD, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CalculatorParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculatorParser.NEWLINE, i);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assign);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(ID);
			setState(75);
			((AssignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASS) | (1L << ASSADD) | (1L << ASSMIN) | (1L << ASSPROD) | (1L << ASSDIV) | (1L << ASSMOD))) != 0)) ) {
				((AssignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(76);
			expr(0);
			setState(80);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(77);
					match(NEWLINE);
					}
					} 
				}
				setState(82);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(CalculatorParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(CalculatorParser.IF, i);
		}
		public List<ConditionBlockContext> conditionBlock() {
			return getRuleContexts(ConditionBlockContext.class);
		}
		public ConditionBlockContext conditionBlock(int i) {
			return getRuleContext(ConditionBlockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(CalculatorParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(CalculatorParser.ELSE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(IF);
			setState(84);
			conditionBlock();
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(85);
					match(ELSE);
					setState(86);
					match(IF);
					setState(87);
					conditionBlock();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(93);
				match(ELSE);
				setState(94);
				block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LCUR() { return getToken(CalculatorParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(CalculatorParser.RCUR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(LCUR);
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << DEFINE) | (1L << RETURN) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(98);
				stat();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(RCUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionBlockContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConditionBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionBlock; }
	}

	public final ConditionBlockContext conditionBlock() throws RecognitionException {
		ConditionBlockContext _localctx = new ConditionBlockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_conditionBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(LPAREN);
			setState(107);
			expr(0);
			setState(108);
			match(RPAREN);
			setState(109);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CalculatorParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(RETURN);
			setState(112);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CalculatorParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LCUR() { return getToken(CalculatorParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(CalculatorParser.RCUR, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(WHILE);
			setState(115);
			expr(0);
			setState(116);
			match(LCUR);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << DEFINE) | (1L << RETURN) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(117);
				stat();
				}
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(123);
			match(RCUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(CalculatorParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public List<AssignContext> assign() {
			return getRuleContexts(AssignContext.class);
		}
		public AssignContext assign(int i) {
			return getRuleContext(AssignContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CalculatorParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CalculatorParser.SEMI, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode LCUR() { return getToken(CalculatorParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(CalculatorParser.RCUR, 0); }
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(FOR);
			setState(126);
			match(LPAREN);
			setState(127);
			assign();
			setState(128);
			match(SEMI);
			setState(129);
			expr(0);
			setState(130);
			match(SEMI);
			setState(131);
			assign();
			setState(132);
			match(RPAREN);
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(133);
				match(NEWLINE);
				}
			}

			setState(136);
			match(LCUR);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << DEFINE) | (1L << RETURN) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(137);
				stat();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(RCUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncDeclarationContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(CalculatorParser.DEFINE, 0); }
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode LCUR() { return getToken(CalculatorParser.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(CalculatorParser.RCUR, 0); }
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FuncDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDeclaration; }
	}

	public final FuncDeclarationContext funcDeclaration() throws RecognitionException {
		FuncDeclarationContext _localctx = new FuncDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(DEFINE);
			setState(146);
			match(ID);
			setState(147);
			match(LPAREN);
			setState(148);
			params();
			setState(149);
			match(RPAREN);
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(150);
				match(NEWLINE);
				}
			}

			setState(153);
			match(LCUR);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << DEFINE) | (1L << RETURN) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM) | (1L << NEWLINE))) != 0)) {
				{
				{
				setState(154);
				stat();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160);
			match(RCUR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(162);
				param();
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(163);
					match(COMMA);
					setState(164);
					param();
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public FuncCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcCall; }
	}

	public final FuncCallContext funcCall() throws RecognitionException {
		FuncCallContext _localctx = new FuncCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(ID);
			setState(175);
			match(LPAREN);
			setState(176);
			arguments();
			setState(177);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << SQRT) | (1L << READ) | (1L << PRINT) | (1L << SINE) | (1L << COSINE) | (1L << LOG) | (1L << EXP) | (1L << ID) | (1L << LPAREN) | (1L << PLUS) | (1L << MINUS) | (1L << PP) | (1L << MM) | (1L << INTEGER_NUM) | (1L << DOUBLE_NUM))) != 0)) {
				{
				setState(179);
				expr(0);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(180);
					match(COMMA);
					setState(181);
					expr(0);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExprAtomContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public ExprAtomContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PlusMinusContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public PlusMinusContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PostFixExprContext extends ExprContext {
		public PostFixUnaryExprContext postFixUnaryExpr() {
			return getRuleContext(PostFixUnaryExprContext.class,0);
		}
		public PostFixExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CalculatorParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(CalculatorParser.PLUS, 0); }
		public UnaryContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class FuncCContext extends ExprContext {
		public FuncCallContext funcCall() {
			return getRuleContext(FuncCallContext.class,0);
		}
		public FuncCContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class PreFixVarContext extends ExprContext {
		public PreFixUnaryExprContext preFixUnaryExpr() {
			return getRuleContext(PreFixUnaryExprContext.class,0);
		}
		public PreFixVarContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class MulDivContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL() { return getToken(CalculatorParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CalculatorParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CalculatorParser.MOD, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprExpoContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprExpoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenContext extends ExprContext {
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMathContext extends ExprContext {
		public MathExprContext mathExpr() {
			return getRuleContext(MathExprContext.class,0);
		}
		public ExprMathContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(CalculatorParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrintContext extends ExprContext {
		public TerminalNode PRINT() { return getToken(CalculatorParser.PRINT, 0); }
		public ListExprContext listExpr() {
			return getRuleContext(ListExprContext.class,0);
		}
		public ExprPrintContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class ExprSpecialContext extends ExprContext {
		public SpecialExprContext specialExpr() {
			return getRuleContext(SpecialExprContext.class,0);
		}
		public ExprSpecialContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class RelExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(CalculatorParser.GT, 0); }
		public TerminalNode GE() { return getToken(CalculatorParser.GE, 0); }
		public TerminalNode LT() { return getToken(CalculatorParser.LT, 0); }
		public TerminalNode LE() { return getToken(CalculatorParser.LE, 0); }
		public TerminalNode EQ() { return getToken(CalculatorParser.EQ, 0); }
		public RelExprContext(ExprContext ctx) { copyFrom(ctx); }
	}
	public static class BoolExprContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CalculatorParser.AND, 0); }
		public TerminalNode OR() { return getToken(CalculatorParser.OR, 0); }
		public BoolExprContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new UnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(190);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(191);
				expr(15);
				}
				break;
			case 2:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(LPAREN);
				setState(193);
				expr(0);
				setState(194);
				match(RPAREN);
				}
				break;
			case 3:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				match(NOT);
				setState(197);
				expr(8);
				}
				break;
			case 4:
				{
				_localctx = new ExprSpecialContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198);
				specialExpr();
				}
				break;
			case 5:
				{
				_localctx = new ExprMathContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				mathExpr();
				}
				break;
			case 6:
				{
				_localctx = new ExprPrintContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(200);
				match(PRINT);
				setState(201);
				listExpr();
				}
				break;
			case 7:
				{
				_localctx = new FuncCContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(202);
				funcCall();
				}
				break;
			case 8:
				{
				_localctx = new PostFixExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(203);
				postFixUnaryExpr();
				}
				break;
			case 9:
				{
				_localctx = new PreFixVarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				preFixUnaryExpr();
				}
				break;
			case 10:
				{
				_localctx = new ExprAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(205);
				atom();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprExpoContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(208);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(209);
						match(T__0);
						setState(210);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(211);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(212);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(213);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new PlusMinusContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(214);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(215);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(216);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new RelExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(217);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(218);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << GE) | (1L << LT) | (1L << LE) | (1L << EQ))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(219);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new BoolExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(220);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(221);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(222);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PostFixUnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode PP() { return getToken(CalculatorParser.PP, 0); }
		public TerminalNode MM() { return getToken(CalculatorParser.MM, 0); }
		public PostFixUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postFixUnaryExpr; }
	}

	public final PostFixUnaryExprContext postFixUnaryExpr() throws RecognitionException {
		PostFixUnaryExprContext _localctx = new PostFixUnaryExprContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_postFixUnaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ID);
			setState(229);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreFixUnaryExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public TerminalNode PP() { return getToken(CalculatorParser.PP, 0); }
		public TerminalNode MM() { return getToken(CalculatorParser.MM, 0); }
		public PreFixUnaryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preFixUnaryExpr; }
	}

	public final PreFixUnaryExprContext preFixUnaryExpr() throws RecognitionException {
		PreFixUnaryExprContext _localctx = new PreFixUnaryExprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_preFixUnaryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_la = _input.LA(1);
			if ( !(_la==PP || _la==MM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(232);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialExprContext extends ParserRuleContext {
		public SpecialExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialExpr; }
	 
		public SpecialExprContext() { }
		public void copyFrom(SpecialExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SpecialReadContext extends SpecialExprContext {
		public TerminalNode READ() { return getToken(CalculatorParser.READ, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public TerminalNode NEWLINE() { return getToken(CalculatorParser.NEWLINE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public SpecialReadContext(SpecialExprContext ctx) { copyFrom(ctx); }
	}
	public static class SpecialSqrtContext extends SpecialExprContext {
		public TerminalNode SQRT() { return getToken(CalculatorParser.SQRT, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public SpecialSqrtContext(SpecialExprContext ctx) { copyFrom(ctx); }
	}

	public final SpecialExprContext specialExpr() throws RecognitionException {
		SpecialExprContext _localctx = new SpecialExprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_specialExpr);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SQRT:
				_localctx = new SpecialSqrtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(SQRT);
				setState(235);
				match(LPAREN);
				setState(236);
				expr(0);
				setState(237);
				match(RPAREN);
				}
				break;
			case READ:
				_localctx = new SpecialReadContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				match(READ);
				setState(240);
				match(LPAREN);
				setState(241);
				match(RPAREN);
				setState(242);
				match(NEWLINE);
				setState(243);
				number();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MathExprContext extends ParserRuleContext {
		public MathExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpr; }
	 
		public MathExprContext() { }
		public void copyFrom(MathExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MathExpContext extends MathExprContext {
		public TerminalNode EXP() { return getToken(CalculatorParser.EXP, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public MathExpContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class MathSineContext extends MathExprContext {
		public TerminalNode SINE() { return getToken(CalculatorParser.SINE, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public MathSineContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class MathCosineContext extends MathExprContext {
		public TerminalNode COSINE() { return getToken(CalculatorParser.COSINE, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public MathCosineContext(MathExprContext ctx) { copyFrom(ctx); }
	}
	public static class MathLogContext extends MathExprContext {
		public TerminalNode LOG() { return getToken(CalculatorParser.LOG, 0); }
		public TerminalNode LPAREN() { return getToken(CalculatorParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CalculatorParser.RPAREN, 0); }
		public MathLogContext(MathExprContext ctx) { copyFrom(ctx); }
	}

	public final MathExprContext mathExpr() throws RecognitionException {
		MathExprContext _localctx = new MathExprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_mathExpr);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINE:
				_localctx = new MathSineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				match(SINE);
				setState(247);
				match(LPAREN);
				setState(248);
				expr(0);
				setState(249);
				match(RPAREN);
				}
				break;
			case COSINE:
				_localctx = new MathCosineContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(COSINE);
				setState(252);
				match(LPAREN);
				setState(253);
				expr(0);
				setState(254);
				match(RPAREN);
				}
				break;
			case LOG:
				_localctx = new MathLogContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(256);
				match(LOG);
				setState(257);
				match(LPAREN);
				setState(258);
				expr(0);
				setState(259);
				match(RPAREN);
				}
				break;
			case EXP:
				_localctx = new MathExpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(261);
				match(EXP);
				setState(262);
				match(LPAREN);
				setState(263);
				expr(0);
				setState(264);
				match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListExprContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalculatorParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalculatorParser.COMMA, i);
		}
		public ListExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpr; }
	}

	public final ListExprContext listExpr() throws RecognitionException {
		ListExprContext _localctx = new ListExprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_listExpr);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			expr(0);
			setState(273);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(269);
					match(COMMA);
					setState(270);
					expr(0);
					}
					} 
				}
				setState(275);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtomIdContext extends AtomContext {
		public TerminalNode ID() { return getToken(CalculatorParser.ID, 0); }
		public AtomIdContext(AtomContext ctx) { copyFrom(ctx); }
	}
	public static class AtomNumContext extends AtomContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public AtomNumContext(AtomContext ctx) { copyFrom(ctx); }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_atom);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_NUM:
			case DOUBLE_NUM:
				_localctx = new AtomNumContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				number();
				}
				break;
			case ID:
				_localctx = new AtomIdContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DOUBLE_NUM() { return getToken(CalculatorParser.DOUBLE_NUM, 0); }
		public TerminalNode INTEGER_NUM() { return getToken(CalculatorParser.INTEGER_NUM, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_NUM || _la==DOUBLE_NUM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\62\u011d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\7\2\60\n\2\f\2"+
		"\16\2\63\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3K\n\3\3\4\3\4\3\4\3\4\7\4Q\n\4\f\4"+
		"\16\4T\13\4\3\5\3\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\5\3\5\5\5b\n"+
		"\5\3\6\3\6\7\6f\n\6\f\6\16\6i\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\7\ty\n\t\f\t\16\t|\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\n\3\n\7\n\u008d\n\n\f\n\16\n\u0090"+
		"\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009a\n\13\3\13\3\13"+
		"\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00a8"+
		"\n\f\f\f\16\f\u00ab\13\f\5\f\u00ad\n\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\7\17\u00b9\n\17\f\17\16\17\u00bc\13\17\5\17\u00be\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d1\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00e2\n\20\f\20\16\20\u00e5\13"+
		"\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010d"+
		"\n\24\3\25\3\25\3\25\7\25\u0112\n\25\f\25\16\25\u0115\13\25\3\26\3\26"+
		"\5\26\u0119\n\26\3\27\3\27\3\27\2\3\36\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\t\3\2\',\3\2 !\3\2\"$\3\2\7\13\3\2\5\6\3\2%&\3\2-"+
		".\2\u012f\2\61\3\2\2\2\4J\3\2\2\2\6L\3\2\2\2\bU\3\2\2\2\nc\3\2\2\2\fl"+
		"\3\2\2\2\16q\3\2\2\2\20t\3\2\2\2\22\177\3\2\2\2\24\u0093\3\2\2\2\26\u00ac"+
		"\3\2\2\2\30\u00ae\3\2\2\2\32\u00b0\3\2\2\2\34\u00bd\3\2\2\2\36\u00d0\3"+
		"\2\2\2 \u00e6\3\2\2\2\"\u00e9\3\2\2\2$\u00f6\3\2\2\2&\u010c\3\2\2\2(\u010e"+
		"\3\2\2\2*\u0118\3\2\2\2,\u011a\3\2\2\2.\60\5\4\3\2/.\3\2\2\2\60\63\3\2"+
		"\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\3\3\2\2\2\63\61\3\2\2\2\64\65\5\36\20"+
		"\2\65\66\7/\2\2\66K\3\2\2\2\678\5\6\4\289\7/\2\29K\3\2\2\2:;\5\b\5\2;"+
		"<\7/\2\2<K\3\2\2\2=>\5\20\t\2>?\7/\2\2?K\3\2\2\2@A\5\22\n\2AB\7/\2\2B"+
		"K\3\2\2\2CD\5\24\13\2DE\7/\2\2EK\3\2\2\2FG\5\16\b\2GH\7/\2\2HK\3\2\2\2"+
		"IK\7/\2\2J\64\3\2\2\2J\67\3\2\2\2J:\3\2\2\2J=\3\2\2\2J@\3\2\2\2JC\3\2"+
		"\2\2JF\3\2\2\2JI\3\2\2\2K\5\3\2\2\2LM\7\32\2\2MN\t\2\2\2NR\5\36\20\2O"+
		"Q\7/\2\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\7\3\2\2\2TR\3\2\2\2"+
		"UV\7\f\2\2V\\\5\f\7\2WX\7\r\2\2XY\7\f\2\2Y[\5\f\7\2ZW\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]a\3\2\2\2^\\\3\2\2\2_`\7\r\2\2`b\5\n\6\2a_\3"+
		"\2\2\2ab\3\2\2\2b\t\3\2\2\2cg\7\35\2\2df\5\4\3\2ed\3\2\2\2fi\3\2\2\2g"+
		"e\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\36\2\2k\13\3\2\2\2lm\7\33"+
		"\2\2mn\5\36\20\2no\7\34\2\2op\5\n\6\2p\r\3\2\2\2qr\7\21\2\2rs\5\36\20"+
		"\2s\17\3\2\2\2tu\7\16\2\2uv\5\36\20\2vz\7\35\2\2wy\5\4\3\2xw\3\2\2\2y"+
		"|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{}\3\2\2\2|z\3\2\2\2}~\7\36\2\2~\21\3\2\2"+
		"\2\177\u0080\7\17\2\2\u0080\u0081\7\33\2\2\u0081\u0082\5\6\4\2\u0082\u0083"+
		"\7\37\2\2\u0083\u0084\5\36\20\2\u0084\u0085\7\37\2\2\u0085\u0086\5\6\4"+
		"\2\u0086\u0088\7\34\2\2\u0087\u0089\7/\2\2\u0088\u0087\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008e\7\35\2\2\u008b\u008d\5\4\3\2"+
		"\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f"+
		"\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\36\2\2"+
		"\u0092\23\3\2\2\2\u0093\u0094\7\20\2\2\u0094\u0095\7\32\2\2\u0095\u0096"+
		"\7\33\2\2\u0096\u0097\5\26\f\2\u0097\u0099\7\34\2\2\u0098\u009a\7/\2\2"+
		"\u0099\u0098\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009f"+
		"\7\35\2\2\u009c\u009e\5\4\3\2\u009d\u009c\3\2\2\2\u009e\u00a1\3\2\2\2"+
		"\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a3\7\36\2\2\u00a3\25\3\2\2\2\u00a4\u00a9\5\30\r\2\u00a5"+
		"\u00a6\7\31\2\2\u00a6\u00a8\5\30\r\2\u00a7\u00a5\3\2\2\2\u00a8\u00ab\3"+
		"\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ad\3\2\2\2\u00ab"+
		"\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\27\3\2\2"+
		"\2\u00ae\u00af\7\32\2\2\u00af\31\3\2\2\2\u00b0\u00b1\7\32\2\2\u00b1\u00b2"+
		"\7\33\2\2\u00b2\u00b3\5\34\17\2\u00b3\u00b4\7\34\2\2\u00b4\33\3\2\2\2"+
		"\u00b5\u00ba\5\36\20\2\u00b6\u00b7\7\31\2\2\u00b7\u00b9\5\36\20\2\u00b8"+
		"\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2"+
		"\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00b5\3\2\2\2\u00bd"+
		"\u00be\3\2\2\2\u00be\35\3\2\2\2\u00bf\u00c0\b\20\1\2\u00c0\u00c1\t\3\2"+
		"\2\u00c1\u00d1\5\36\20\21\u00c2\u00c3\7\33\2\2\u00c3\u00c4\5\36\20\2\u00c4"+
		"\u00c5\7\34\2\2\u00c5\u00d1\3\2\2\2\u00c6\u00c7\7\4\2\2\u00c7\u00d1\5"+
		"\36\20\n\u00c8\u00d1\5$\23\2\u00c9\u00d1\5&\24\2\u00ca\u00cb\7\24\2\2"+
		"\u00cb\u00d1\5(\25\2\u00cc\u00d1\5\32\16\2\u00cd\u00d1\5 \21\2\u00ce\u00d1"+
		"\5\"\22\2\u00cf\u00d1\5*\26\2\u00d0\u00bf\3\2\2\2\u00d0\u00c2\3\2\2\2"+
		"\u00d0\u00c6\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00ca"+
		"\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00e3\3\2\2\2\u00d2\u00d3\f\17\2\2\u00d3\u00d4\7"+
		"\3\2\2\u00d4\u00e2\5\36\20\17\u00d5\u00d6\f\16\2\2\u00d6\u00d7\t\4\2\2"+
		"\u00d7\u00e2\5\36\20\17\u00d8\u00d9\f\r\2\2\u00d9\u00da\t\3\2\2\u00da"+
		"\u00e2\5\36\20\16\u00db\u00dc\f\f\2\2\u00dc\u00dd\t\5\2\2\u00dd\u00e2"+
		"\5\36\20\r\u00de\u00df\f\13\2\2\u00df\u00e0\t\6\2\2\u00e0\u00e2\5\36\20"+
		"\f\u00e1\u00d2\3\2\2\2\u00e1\u00d5\3\2\2\2\u00e1\u00d8\3\2\2\2\u00e1\u00db"+
		"\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4\37\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e7\7\32\2"+
		"\2\u00e7\u00e8\t\7\2\2\u00e8!\3\2\2\2\u00e9\u00ea\t\7\2\2\u00ea\u00eb"+
		"\7\32\2\2\u00eb#\3\2\2\2\u00ec\u00ed\7\22\2\2\u00ed\u00ee\7\33\2\2\u00ee"+
		"\u00ef\5\36\20\2\u00ef\u00f0\7\34\2\2\u00f0\u00f7\3\2\2\2\u00f1\u00f2"+
		"\7\23\2\2\u00f2\u00f3\7\33\2\2\u00f3\u00f4\7\34\2\2\u00f4\u00f5\7/\2\2"+
		"\u00f5\u00f7\5,\27\2\u00f6\u00ec\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f7%\3"+
		"\2\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fa\7\33\2\2\u00fa\u00fb\5\36\20\2"+
		"\u00fb\u00fc\7\34\2\2\u00fc\u010d\3\2\2\2\u00fd\u00fe\7\26\2\2\u00fe\u00ff"+
		"\7\33\2\2\u00ff\u0100\5\36\20\2\u0100\u0101\7\34\2\2\u0101\u010d\3\2\2"+
		"\2\u0102\u0103\7\27\2\2\u0103\u0104\7\33\2\2\u0104\u0105\5\36\20\2\u0105"+
		"\u0106\7\34\2\2\u0106\u010d\3\2\2\2\u0107\u0108\7\30\2\2\u0108\u0109\7"+
		"\33\2\2\u0109\u010a\5\36\20\2\u010a\u010b\7\34\2\2\u010b\u010d\3\2\2\2"+
		"\u010c\u00f8\3\2\2\2\u010c\u00fd\3\2\2\2\u010c\u0102\3\2\2\2\u010c\u0107"+
		"\3\2\2\2\u010d\'\3\2\2\2\u010e\u0113\5\36\20\2\u010f\u0110\7\31\2\2\u0110"+
		"\u0112\5\36\20\2\u0111\u010f\3\2\2\2\u0112\u0115\3\2\2\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114)\3\2\2\2\u0115\u0113\3\2\2\2\u0116\u0119"+
		"\5,\27\2\u0117\u0119\7\32\2\2\u0118\u0116\3\2\2\2\u0118\u0117\3\2\2\2"+
		"\u0119+\3\2\2\2\u011a\u011b\t\b\2\2\u011b-\3\2\2\2\30\61JR\\agz\u0088"+
		"\u008e\u0099\u009f\u00a9\u00ac\u00ba\u00bd\u00d0\u00e1\u00e3\u00f6\u010c"+
		"\u0113\u0118";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}