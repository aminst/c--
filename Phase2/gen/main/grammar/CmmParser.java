// Generated from /home/aminst/Documents/University/Term_7/Compiler/c--/Phase2/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;

     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		MAIN=1, RETURN=2, VOID=3, SIZE=4, DISPLAY=5, APPEND=6, IF=7, ELSE=8, PLUS=9, 
		MINUS=10, MULT=11, DIVIDE=12, EQUAL=13, ARROW=14, GREATER_THAN=15, LESS_THAN=16, 
		AND=17, OR=18, NOT=19, TRUE=20, FALSE=21, BEGIN=22, END=23, INT=24, BOOL=25, 
		LIST=26, STRUCT=27, FPTR=28, GET=29, SET=30, WHILE=31, DO=32, ASSIGN=33, 
		SHARP=34, LPAR=35, RPAR=36, LBRACK=37, RBRACK=38, COMMA=39, DOT=40, SEMICOLON=41, 
		NEWLINE=42, INT_VALUE=43, IDENTIFIER=44, COMMENT=45, WS=46;
	public static final int
		RULE_cmm = 0, RULE_program = 1, RULE_main = 2, RULE_structDeclaration = 3, 
		RULE_singleVarWithGetAndSet = 4, RULE_singleStatementStructBody = 5, RULE_structBody = 6, 
		RULE_getBody = 7, RULE_setBody = 8, RULE_functionDeclaration = 9, RULE_functionArgsDec = 10, 
		RULE_functionArguments = 11, RULE_body = 12, RULE_loopCondBody = 13, RULE_blockStatement = 14, 
		RULE_varDecStatement = 15, RULE_functionCallStmt = 16, RULE_returnStatement = 17, 
		RULE_ifStatement = 18, RULE_elseStatement = 19, RULE_loopStatement = 20, 
		RULE_whileLoopStatement = 21, RULE_doWhileLoopStatement = 22, RULE_displayStatement = 23, 
		RULE_assignmentStatement = 24, RULE_singleStatement = 25, RULE_expression = 26, 
		RULE_orExpression = 27, RULE_andExpression = 28, RULE_equalityExpression = 29, 
		RULE_relationalExpression = 30, RULE_additiveExpression = 31, RULE_multiplicativeExpression = 32, 
		RULE_preUnaryExpression = 33, RULE_accessExpression = 34, RULE_otherExpression = 35, 
		RULE_size = 36, RULE_append = 37, RULE_value = 38, RULE_boolValue = 39, 
		RULE_identifier = 40, RULE_type = 41, RULE_fptrType = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "program", "main", "structDeclaration", "singleVarWithGetAndSet", 
			"singleStatementStructBody", "structBody", "getBody", "setBody", "functionDeclaration", 
			"functionArgsDec", "functionArguments", "body", "loopCondBody", "blockStatement", 
			"varDecStatement", "functionCallStmt", "returnStatement", "ifStatement", 
			"elseStatement", "loopStatement", "whileLoopStatement", "doWhileLoopStatement", 
			"displayStatement", "assignmentStatement", "singleStatement", "expression", 
			"orExpression", "andExpression", "equalityExpression", "relationalExpression", 
			"additiveExpression", "multiplicativeExpression", "preUnaryExpression", 
			"accessExpression", "otherExpression", "size", "append", "value", "boolValue", 
			"identifier", "type", "fptrType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'main'", "'return'", "'void'", "'size'", "'display'", "'append'", 
			"'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'=='", "'->'", "'>'", 
			"'<'", "'&'", "'|'", "'~'", "'true'", "'false'", "'begin'", "'end'", 
			"'int'", "'bool'", "'list'", "'struct'", "'fptr'", "'get'", "'set'", 
			"'while'", "'do'", "'='", "'#'", "'('", "')'", "'['", "']'", "','", "'.'", 
			"';'", "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "MAIN", "RETURN", "VOID", "SIZE", "DISPLAY", "APPEND", "IF", "ELSE", 
			"PLUS", "MINUS", "MULT", "DIVIDE", "EQUAL", "ARROW", "GREATER_THAN", 
			"LESS_THAN", "AND", "OR", "NOT", "TRUE", "FALSE", "BEGIN", "END", "INT", 
			"BOOL", "LIST", "STRUCT", "FPTR", "GET", "SET", "WHILE", "DO", "ASSIGN", 
			"SHARP", "LPAR", "RPAR", "LBRACK", "RBRACK", "COMMA", "DOT", "SEMICOLON", 
			"NEWLINE", "INT_VALUE", "IDENTIFIER", "COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CmmContext extends ParserRuleContext {
		public Program cmmProgram;
		public ProgramContext p;
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public CmmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCmm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCmm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCmm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmmContext cmm() throws RecognitionException {
		CmmContext _localctx = new CmmContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_cmm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(86);
				match(NEWLINE);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			((CmmContext)_localctx).p = program();
			((CmmContext)_localctx).cmmProgram =  ((CmmContext)_localctx).p.programRet;
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			match(EOF);
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

	public static class ProgramContext extends ParserRuleContext {
		public Program programRet;
		public StructDeclarationContext s;
		public FunctionDeclarationContext f;
		public MainContext m;
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).programRet =  new Program();
			     int line = 1;
			     _localctx.programRet.setLine(line);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(103);
					((ProgramContext)_localctx).s = structDeclaration();
					_localctx.programRet.addStruct(((ProgramContext)_localctx).s.structDeclarationRet);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				{
				setState(111);
				((ProgramContext)_localctx).f = functionDeclaration();
				_localctx.programRet.addFunction(((ProgramContext)_localctx).f.functionDeclarationRet);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			((ProgramContext)_localctx).m = main();
			_localctx.programRet.setMain(((ProgramContext)_localctx).m.mainRet);
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

	public static class MainContext extends ParserRuleContext {
		public MainDeclaration mainRet;
		public Token MAIN;
		public BodyContext body;
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MainContext)_localctx).mainRet =  new MainDeclaration();
			setState(123);
			((MainContext)_localctx).MAIN = match(MAIN);
			_localctx.mainRet.setLine(((MainContext)_localctx).MAIN.getLine());
			setState(125);
			match(LPAR);
			setState(126);
			match(RPAR);
			setState(127);
			((MainContext)_localctx).body = body();
			_localctx.mainRet.setBody(((MainContext)_localctx).body.bodyRet);
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

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructDeclaration structDeclarationRet;
		public Token STRUCT;
		public IdentifierContext identifier;
		public StructBodyContext structBody;
		public SingleStatementStructBodyContext singleStatementStructBody;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public SingleStatementStructBodyContext singleStatementStructBody() {
			return getRuleContext(SingleStatementStructBodyContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StructDeclarationContext)_localctx).structDeclarationRet =  new StructDeclaration();
			setState(131);
			((StructDeclarationContext)_localctx).STRUCT = match(STRUCT);
			_localctx.structDeclarationRet.setLine(((StructDeclarationContext)_localctx).STRUCT.getLine());
			setState(133);
			((StructDeclarationContext)_localctx).identifier = identifier();
			_localctx.structDeclarationRet.setStructName(((StructDeclarationContext)_localctx).identifier.identifierRet);
			setState(157);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				{
				setState(135);
				match(BEGIN);
				setState(136);
				((StructDeclarationContext)_localctx).structBody = structBody();
				setState(138); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(137);
					match(NEWLINE);
					}
					}
					setState(140); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(142);
				match(END);
				}
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).structBody.structBodyRet);
				}
				break;
			case NEWLINE:
				{
				{
				setState(147); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					match(NEWLINE);
					}
					}
					setState(149); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(151);
				((StructDeclarationContext)_localctx).singleStatementStructBody = singleStatementStructBody();
				setState(153);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(152);
					match(SEMICOLON);
					}
				}

				}
				_localctx.structDeclarationRet.setBody(((StructDeclarationContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				match(NEWLINE);
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SingleVarWithGetAndSetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetBodyContext setBody() {
			return getRuleContext(SetBodyContext.class,0);
		}
		public GetBodyContext getBody() {
			return getRuleContext(GetBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SingleVarWithGetAndSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleVarWithGetAndSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleVarWithGetAndSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleVarWithGetAndSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleVarWithGetAndSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleVarWithGetAndSetContext singleVarWithGetAndSet() throws RecognitionException {
		SingleVarWithGetAndSetContext _localctx = new SingleVarWithGetAndSetContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleVarWithGetAndSet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			type();
			setState(165);
			identifier();
			setState(166);
			functionArgsDec();
			setState(167);
			match(BEGIN);
			setState(169); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(168);
				match(NEWLINE);
				}
				}
				setState(171); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(173);
			setBody();
			setState(174);
			getBody();
			setState(175);
			match(END);
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

	public static class SingleStatementStructBodyContext extends ParserRuleContext {
		public Statement singleStatementStructBodyRet;
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet() {
			return getRuleContext(SingleVarWithGetAndSetContext.class,0);
		}
		public SingleStatementStructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatementStructBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatementStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatementStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatementStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementStructBodyContext singleStatementStructBody() throws RecognitionException {
		SingleStatementStructBodyContext _localctx = new SingleStatementStructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleStatementStructBody);
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				varDecStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				singleVarWithGetAndSet();
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

	public static class StructBodyContext extends ParserRuleContext {
		public Statement structBodyRet;
		public List<SingleStatementStructBodyContext> singleStatementStructBody() {
			return getRuleContexts(SingleStatementStructBodyContext.class);
		}
		public SingleStatementStructBodyContext singleStatementStructBody(int i) {
			return getRuleContext(SingleStatementStructBodyContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(182); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(181);
						match(NEWLINE);
						}
						}
						setState(184); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(191);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(186);
							singleStatementStructBody();
							setState(187);
							match(SEMICOLON);
							}
							} 
						}
						setState(193);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(194);
					singleStatementStructBody();
					setState(196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(195);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(200); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class GetBodyContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public GetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterGetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitGetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitGetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetBodyContext getBody() throws RecognitionException {
		GetBodyContext _localctx = new GetBodyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_getBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(GET);
			setState(203);
			body();
			setState(205); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(204);
				match(NEWLINE);
				}
				}
				setState(207); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class SetBodyContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetBodyContext setBody() throws RecognitionException {
		SetBodyContext _localctx = new SetBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(SET);
			setState(210);
			body();
			setState(212); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(211);
				match(NEWLINE);
				}
				}
				setState(214); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration functionDeclarationRet;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FunctionArgsDecContext functionArgsDec() {
			return getRuleContext(FunctionArgsDecContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(216);
				type();
				}
				break;
			case VOID:
				{
				setState(217);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(220);
			identifier();
			setState(221);
			functionArgsDec();
			setState(222);
			body();
			setState(224); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(223);
				match(NEWLINE);
				}
				}
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class FunctionArgsDecContext extends ParserRuleContext {
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgsDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgsDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArgsDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArgsDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArgsDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgsDecContext functionArgsDec() throws RecognitionException {
		FunctionArgsDecContext _localctx = new FunctionArgsDecContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_functionArgsDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(LPAR);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(229);
				type();
				setState(230);
				identifier();
				setState(237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					type();
					setState(233);
					identifier();
					}
					}
					setState(239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(242);
			match(RPAR);
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

	public static class FunctionArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FunctionArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionArgumentsContext functionArguments() throws RecognitionException {
		FunctionArgumentsContext _localctx = new FunctionArgumentsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_functionArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(244);
				expression();
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(245);
					match(COMMA);
					setState(246);
					expression();
					}
					}
					setState(251);
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

	public static class BodyContext extends ParserRuleContext {
		public Statement bodyRet;
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(254);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(255);
					match(NEWLINE);
					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(260);
				singleStatement();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(261);
					match(SEMICOLON);
					}
				}

				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LoopCondBodyContext extends ParserRuleContext {
		public BlockStatementContext blockStatement() {
			return getRuleContext(BlockStatementContext.class,0);
		}
		public SingleStatementContext singleStatement() {
			return getRuleContext(SingleStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public LoopCondBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopCondBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopCondBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopCondBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopCondBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopCondBodyContext loopCondBody() throws RecognitionException {
		LoopCondBodyContext _localctx = new LoopCondBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_loopCondBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(266);
				blockStatement();
				}
				break;
			case NEWLINE:
				{
				{
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(267);
					match(NEWLINE);
					}
					}
					setState(270); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(272);
				singleStatement();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class BlockStatementContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<SingleStatementContext> singleStatement() {
			return getRuleContexts(SingleStatementContext.class);
		}
		public SingleStatementContext singleStatement(int i) {
			return getRuleContext(SingleStatementContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_blockStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(BEGIN);
			setState(293); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(277); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(276);
						match(NEWLINE);
						}
						}
						setState(279); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(286);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(281);
							singleStatement();
							setState(282);
							match(SEMICOLON);
							}
							} 
						}
						setState(288);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(289);
					singleStatement();
					setState(291);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(290);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(295); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(298); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(297);
				match(NEWLINE);
				}
				}
				setState(300); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(302);
			match(END);
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

	public static class VarDecStatementContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<OrExpressionContext> orExpression() {
			return getRuleContexts(OrExpressionContext.class);
		}
		public OrExpressionContext orExpression(int i) {
			return getRuleContext(OrExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public VarDecStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecStatementContext varDecStatement() throws RecognitionException {
		VarDecStatementContext _localctx = new VarDecStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varDecStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			type();
			setState(305);
			identifier();
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(306);
				match(ASSIGN);
				setState(307);
				orExpression();
				}
			}

			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(310);
				match(COMMA);
				setState(311);
				identifier();
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(312);
					match(ASSIGN);
					setState(313);
					orExpression();
					}
				}

				}
				}
				setState(320);
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

	public static class FunctionCallStmtContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public FunctionCallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStmtContext functionCallStmt() throws RecognitionException {
		FunctionCallStmtContext _localctx = new FunctionCallStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_functionCallStmt);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			otherExpression();
			setState(330);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(328);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(322);
						match(LPAR);
						setState(323);
						functionArguments();
						setState(324);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(326);
						match(DOT);
						setState(327);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(332);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(333);
			match(LPAR);
			setState(334);
			functionArguments();
			setState(335);
			match(RPAR);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(RETURN);
			setState(339);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(338);
				expression();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			match(IF);
			setState(342);
			expression();
			setState(347);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(343);
				loopCondBody();
				}
				break;
			case 2:
				{
				setState(344);
				body();
				setState(345);
				elseStatement();
				}
				break;
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(349);
				match(NEWLINE);
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
			match(ELSE);
			setState(356);
			loopCondBody();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileLoopStatementContext whileLoopStatement() {
			return getRuleContext(WhileLoopStatementContext.class,0);
		}
		public DoWhileLoopStatementContext doWhileLoopStatement() {
			return getRuleContext(DoWhileLoopStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_loopStatement);
		try {
			setState(360);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				whileLoopStatement();
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(359);
				doWhileLoopStatement();
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

	public static class WhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LoopCondBodyContext loopCondBody() {
			return getRuleContext(LoopCondBodyContext.class,0);
		}
		public WhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopStatementContext whileLoopStatement() throws RecognitionException {
		WhileLoopStatementContext _localctx = new WhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_whileLoopStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(WHILE);
			setState(363);
			expression();
			setState(364);
			loopCondBody();
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

	public static class DoWhileLoopStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public DoWhileLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileLoopStatementContext doWhileLoopStatement() throws RecognitionException {
		DoWhileLoopStatementContext _localctx = new DoWhileLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_doWhileLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(DO);
			setState(367);
			body();
			setState(371);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(368);
				match(NEWLINE);
				}
				}
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(374);
			match(WHILE);
			setState(375);
			expression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public DisplayStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_displayStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDisplayStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDisplayStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDisplayStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisplayStatementContext displayStatement() throws RecognitionException {
		DisplayStatementContext _localctx = new DisplayStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			match(DISPLAY);
			setState(378);
			match(LPAR);
			setState(379);
			expression();
			setState(380);
			match(RPAR);
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			orExpression();
			setState(383);
			match(ASSIGN);
			setState(384);
			expression();
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

	public static class SingleStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public FunctionCallStmtContext functionCallStmt() {
			return getRuleContext(FunctionCallStmtContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public VarDecStatementContext varDecStatement() {
			return getRuleContext(VarDecStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_singleStatement);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(386);
				ifStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(387);
				displayStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(388);
				functionCallStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(389);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(390);
				assignmentStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(391);
				varDecStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(392);
				loopStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(393);
				append();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(394);
				size();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			orExpression();
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(398);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(399);
				expression();
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

	public static class OrExpressionContext extends ParserRuleContext {
		public Token op;
		public List<AndExpressionContext> andExpression() {
			return getRuleContexts(AndExpressionContext.class);
		}
		public AndExpressionContext andExpression(int i) {
			return getRuleContext(AndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public OrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrExpressionContext orExpression() throws RecognitionException {
		OrExpressionContext _localctx = new OrExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_orExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			andExpression();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(403);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(404);
				andExpression();
				}
				}
				setState(409);
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

	public static class AndExpressionContext extends ParserRuleContext {
		public Token op;
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_andExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(410);
			equalityExpression();
			setState(415);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(411);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(412);
				equalityExpression();
				}
				}
				setState(417);
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

	public static class EqualityExpressionContext extends ParserRuleContext {
		public Token op;
		public List<RelationalExpressionContext> relationalExpression() {
			return getRuleContexts(RelationalExpressionContext.class);
		}
		public RelationalExpressionContext relationalExpression(int i) {
			return getRuleContext(RelationalExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_equalityExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			relationalExpression();
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(419);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(420);
				relationalExpression();
				}
				}
				setState(425);
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

	public static class RelationalExpressionContext extends ParserRuleContext {
		public Token op;
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public List<TerminalNode> GREATER_THAN() { return getTokens(CmmParser.GREATER_THAN); }
		public TerminalNode GREATER_THAN(int i) {
			return getToken(CmmParser.GREATER_THAN, i);
		}
		public List<TerminalNode> LESS_THAN() { return getTokens(CmmParser.LESS_THAN); }
		public TerminalNode LESS_THAN(int i) {
			return getToken(CmmParser.LESS_THAN, i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			additiveExpression();
			setState(434);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(429);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(427);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					}
					break;
				case LESS_THAN:
					{
					setState(428);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(431);
				additiveExpression();
				}
				}
				setState(436);
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

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public Token op;
		public List<MultiplicativeExpressionContext> multiplicativeExpression() {
			return getRuleContexts(MultiplicativeExpressionContext.class);
		}
		public MultiplicativeExpressionContext multiplicativeExpression(int i) {
			return getRuleContext(MultiplicativeExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_additiveExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			multiplicativeExpression();
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(440);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(438);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					}
					break;
				case MINUS:
					{
					setState(439);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(442);
				multiplicativeExpression();
				}
				}
				setState(447);
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

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public Token op;
		public List<PreUnaryExpressionContext> preUnaryExpression() {
			return getRuleContexts(PreUnaryExpressionContext.class);
		}
		public PreUnaryExpressionContext preUnaryExpression(int i) {
			return getRuleContext(PreUnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MULT() { return getTokens(CmmParser.MULT); }
		public TerminalNode MULT(int i) {
			return getToken(CmmParser.MULT, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_multiplicativeExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			preUnaryExpression();
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(451);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(449);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					}
					break;
				case DIVIDE:
					{
					setState(450);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(453);
				preUnaryExpression();
				}
				}
				setState(458);
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

	public static class PreUnaryExpressionContext extends ParserRuleContext {
		public Token op;
		public PreUnaryExpressionContext preUnaryExpression() {
			return getRuleContext(PreUnaryExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public AccessExpressionContext accessExpression() {
			return getRuleContext(AccessExpressionContext.class,0);
		}
		public PreUnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preUnaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPreUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPreUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPreUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreUnaryExpressionContext preUnaryExpression() throws RecognitionException {
		PreUnaryExpressionContext _localctx = new PreUnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_preUnaryExpression);
		try {
			setState(465);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(461);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(459);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					}
					break;
				case MINUS:
					{
					setState(460);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(463);
				preUnaryExpression();
				}
				}
				break;
			case SIZE:
			case APPEND:
			case TRUE:
			case FALSE:
			case LPAR:
			case INT_VALUE:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				accessExpression();
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

	public static class AccessExpressionContext extends ParserRuleContext {
		public OtherExpressionContext otherExpression() {
			return getRuleContext(OtherExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<FunctionArgumentsContext> functionArguments() {
			return getRuleContexts(FunctionArgumentsContext.class);
		}
		public FunctionArgumentsContext functionArguments(int i) {
			return getRuleContext(FunctionArgumentsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> LBRACK() { return getTokens(CmmParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(CmmParser.LBRACK, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(CmmParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(CmmParser.RBRACK, i);
		}
		public AccessExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessExpressionContext accessExpression() throws RecognitionException {
		AccessExpressionContext _localctx = new AccessExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			otherExpression();
			setState(476);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(474);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(468);
						match(LPAR);
						setState(469);
						functionArguments();
						setState(470);
						match(RPAR);
						}
						}
						break;
					case DOT:
						{
						{
						setState(472);
						match(DOT);
						setState(473);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(478);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(485);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(479);
					match(LBRACK);
					setState(480);
					expression();
					setState(481);
					match(RBRACK);
					}
					}
					break;
				case DOT:
					{
					{
					setState(483);
					match(DOT);
					setState(484);
					identifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(489);
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

	public static class OtherExpressionContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public FunctionArgumentsContext functionArguments() {
			return getRuleContext(FunctionArgumentsContext.class,0);
		}
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public AppendContext append() {
			return getRuleContext(AppendContext.class,0);
		}
		public OtherExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOtherExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOtherExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOtherExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtherExpressionContext otherExpression() throws RecognitionException {
		OtherExpressionContext _localctx = new OtherExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_otherExpression);
		try {
			setState(498);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				value();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				identifier();
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				match(LPAR);
				{
				setState(493);
				functionArguments();
				}
				setState(494);
				match(RPAR);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(496);
				size();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(497);
				append();
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(500);
			match(SIZE);
			setState(501);
			match(LPAR);
			setState(502);
			expression();
			setState(503);
			match(RPAR);
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

	public static class AppendContext extends ParserRuleContext {
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public AppendContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_append; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppend(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppend(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppend(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendContext append() throws RecognitionException {
		AppendContext _localctx = new AppendContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_append);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(APPEND);
			setState(506);
			match(LPAR);
			setState(507);
			expression();
			setState(508);
			match(COMMA);
			setState(509);
			expression();
			setState(510);
			match(RPAR);
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

	public static class ValueContext extends ParserRuleContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode INT_VALUE() { return getToken(CmmParser.INT_VALUE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_value);
		try {
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				boolValue();
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				match(INT_VALUE);
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

	public static class BoolValueContext extends ParserRuleContext {
		public BoolValue boolValueRet;
		public Token TRUE;
		public Token FALSE;
		public TerminalNode TRUE() { return getToken(CmmParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CmmParser.FALSE, 0); }
		public BoolValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBoolValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBoolValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBoolValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolValueContext boolValue() throws RecognitionException {
		BoolValueContext _localctx = new BoolValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_boolValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(516);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				{
				setState(518);
				((BoolValueContext)_localctx).FALSE = match(FALSE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(false); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).FALSE.getLine());
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token IDENTIFIER;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			((IdentifierContext)_localctx).IDENTIFIER = match(IDENTIFIER);
			((IdentifierContext)_localctx).identifierRet =  new Identifier(((IdentifierContext)_localctx).IDENTIFIER.getText());
			        _localctx.identifierRet.setLine(((IdentifierContext)_localctx).IDENTIFIER.getLine());
			    
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

	public static class TypeContext extends ParserRuleContext {
		public Type typeRet;
		public TypeContext t;
		public IdentifierContext i;
		public FptrTypeContext fptrType;
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(525);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case BOOL:
				{
				setState(527);
				match(BOOL);
				((TypeContext)_localctx).typeRet =  new BoolType();
				}
				break;
			case LIST:
				{
				setState(529);
				match(LIST);
				setState(530);
				match(SHARP);
				setState(531);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).typeRet =  new ListType(((TypeContext)_localctx).t.typeRet);
				}
				break;
			case STRUCT:
				{
				setState(534);
				match(STRUCT);
				setState(535);
				((TypeContext)_localctx).i = identifier();
				((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).i.identifierRet);
				}
				break;
			case FPTR:
				{
				setState(538);
				((TypeContext)_localctx).fptrType = fptrType();
				((TypeContext)_localctx).typeRet =  ((TypeContext)_localctx).fptrType.fptrTypeRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FptrTypeContext extends ParserRuleContext {
		public FptrType fptrTypeRet;
		public ArrayList<Type> argsType;
		public Type returnType;
		public TypeContext fType;
		public TypeContext adType;
		public TypeContext rtType;
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LESS_THAN() { return getToken(CmmParser.LESS_THAN, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GREATER_THAN() { return getToken(CmmParser.GREATER_THAN, 0); }
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public FptrTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fptrType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFptrType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFptrType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFptrType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FptrTypeContext fptrType() throws RecognitionException {
		FptrTypeContext _localctx = new FptrTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FptrTypeContext)_localctx).fptrTypeRet =  new FptrType(_localctx.argsType, _localctx.returnType);
			setState(544);
			match(FPTR);
			setState(545);
			match(LESS_THAN);
			setState(559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(546);
				match(VOID);
				_localctx.argsType.add(new VoidType());
				}
				break;
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				{
				setState(548);
				((FptrTypeContext)_localctx).fType = type();
				_localctx.argsType.add(((FptrTypeContext)_localctx).fType.typeRet);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(550);
					match(COMMA);
					setState(551);
					((FptrTypeContext)_localctx).adType = type();
					_localctx.argsType.add(((FptrTypeContext)_localctx).adType.typeRet);
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.fptrTypeRet.setArgsType(_localctx.argsType);
			setState(562);
			match(ARROW);
			setState(568);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(563);
				((FptrTypeContext)_localctx).rtType = type();
				((FptrTypeContext)_localctx).returnType =  ((FptrTypeContext)_localctx).rtType.typeRet;
				}
				break;
			case VOID:
				{
				setState(566);
				match(VOID);
				((FptrTypeContext)_localctx).returnType =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.fptrTypeRet.setReturnType(_localctx.returnType);
			setState(571);
			match(GREATER_THAN);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u0240\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\2\7\2b\n\2\f\2\16\2e\13\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\7\3m\n\3\f\3\16\3p\13\3\3\3\3\3\3\3\7\3u\n\3\f"+
		"\3\16\3x\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\6\5\u008d\n\5\r\5\16\5\u008e\3\5\3\5\3\5\3\5\3\5"+
		"\6\5\u0096\n\5\r\5\16\5\u0097\3\5\3\5\5\5\u009c\n\5\3\5\3\5\5\5\u00a0"+
		"\n\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4\3\6\3\6\3\6\3\6\3\6\6\6\u00ac\n"+
		"\6\r\6\16\6\u00ad\3\6\3\6\3\6\3\6\3\7\3\7\5\7\u00b6\n\7\3\b\6\b\u00b9"+
		"\n\b\r\b\16\b\u00ba\3\b\3\b\3\b\7\b\u00c0\n\b\f\b\16\b\u00c3\13\b\3\b"+
		"\3\b\5\b\u00c7\n\b\6\b\u00c9\n\b\r\b\16\b\u00ca\3\t\3\t\3\t\6\t\u00d0"+
		"\n\t\r\t\16\t\u00d1\3\n\3\n\3\n\6\n\u00d7\n\n\r\n\16\n\u00d8\3\13\3\13"+
		"\5\13\u00dd\n\13\3\13\3\13\3\13\3\13\6\13\u00e3\n\13\r\13\16\13\u00e4"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00ee\n\f\f\f\16\f\u00f1\13\f\5\f\u00f3"+
		"\n\f\3\f\3\f\3\r\3\r\3\r\7\r\u00fa\n\r\f\r\16\r\u00fd\13\r\5\r\u00ff\n"+
		"\r\3\16\3\16\6\16\u0103\n\16\r\16\16\16\u0104\3\16\3\16\5\16\u0109\n\16"+
		"\5\16\u010b\n\16\3\17\3\17\6\17\u010f\n\17\r\17\16\17\u0110\3\17\5\17"+
		"\u0114\n\17\3\20\3\20\6\20\u0118\n\20\r\20\16\20\u0119\3\20\3\20\3\20"+
		"\7\20\u011f\n\20\f\20\16\20\u0122\13\20\3\20\3\20\5\20\u0126\n\20\6\20"+
		"\u0128\n\20\r\20\16\20\u0129\3\20\6\20\u012d\n\20\r\20\16\20\u012e\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\5\21\u0137\n\21\3\21\3\21\3\21\3\21\5\21\u013d"+
		"\n\21\7\21\u013f\n\21\f\21\16\21\u0142\13\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u014b\n\22\f\22\16\22\u014e\13\22\3\22\3\22\3\22\3\22"+
		"\3\23\3\23\5\23\u0156\n\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u015e\n"+
		"\24\3\25\7\25\u0161\n\25\f\25\16\25\u0164\13\25\3\25\3\25\3\25\3\26\3"+
		"\26\5\26\u016b\n\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7\30\u0174\n\30"+
		"\f\30\16\30\u0177\13\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u018e"+
		"\n\33\3\34\3\34\3\34\5\34\u0193\n\34\3\35\3\35\3\35\7\35\u0198\n\35\f"+
		"\35\16\35\u019b\13\35\3\36\3\36\3\36\7\36\u01a0\n\36\f\36\16\36\u01a3"+
		"\13\36\3\37\3\37\3\37\7\37\u01a8\n\37\f\37\16\37\u01ab\13\37\3 \3 \3 "+
		"\5 \u01b0\n \3 \7 \u01b3\n \f \16 \u01b6\13 \3!\3!\3!\5!\u01bb\n!\3!\7"+
		"!\u01be\n!\f!\16!\u01c1\13!\3\"\3\"\3\"\5\"\u01c6\n\"\3\"\7\"\u01c9\n"+
		"\"\f\"\16\"\u01cc\13\"\3#\3#\5#\u01d0\n#\3#\3#\5#\u01d4\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\7$\u01dd\n$\f$\16$\u01e0\13$\3$\3$\3$\3$\3$\3$\7$\u01e8\n$"+
		"\f$\16$\u01eb\13$\3%\3%\3%\3%\3%\3%\3%\3%\5%\u01f5\n%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\5(\u0205\n(\3)\3)\3)\3)\5)\u020b\n)\3"+
		"*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u0220\n+\3"+
		",\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u022d\n,\f,\16,\u0230\13,\5,\u0232"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\5,\u023b\n,\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u0264"+
		"\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2\2\n\u00a6\3\2\2\2\f\u00b5"+
		"\3\2\2\2\16\u00c8\3\2\2\2\20\u00cc\3\2\2\2\22\u00d3\3\2\2\2\24\u00dc\3"+
		"\2\2\2\26\u00e6\3\2\2\2\30\u00fe\3\2\2\2\32\u010a\3\2\2\2\34\u0113\3\2"+
		"\2\2\36\u0115\3\2\2\2 \u0132\3\2\2\2\"\u0143\3\2\2\2$\u0153\3\2\2\2&\u0157"+
		"\3\2\2\2(\u0162\3\2\2\2*\u016a\3\2\2\2,\u016c\3\2\2\2.\u0170\3\2\2\2\60"+
		"\u017b\3\2\2\2\62\u0180\3\2\2\2\64\u018d\3\2\2\2\66\u018f\3\2\2\28\u0194"+
		"\3\2\2\2:\u019c\3\2\2\2<\u01a4\3\2\2\2>\u01ac\3\2\2\2@\u01b7\3\2\2\2B"+
		"\u01c2\3\2\2\2D\u01d3\3\2\2\2F\u01d5\3\2\2\2H\u01f4\3\2\2\2J\u01f6\3\2"+
		"\2\2L\u01fb\3\2\2\2N\u0204\3\2\2\2P\u020a\3\2\2\2R\u020c\3\2\2\2T\u021f"+
		"\3\2\2\2V\u0221\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
		"\2\2\\^\3\2\2\2][\3\2\2\2^_\5\4\3\2_c\b\2\1\2`b\7,\2\2a`\3\2\2\2be\3\2"+
		"\2\2ca\3\2\2\2cd\3\2\2\2df\3\2\2\2ec\3\2\2\2fg\7\2\2\3g\3\3\2\2\2hn\b"+
		"\3\1\2ij\5\b\5\2jk\b\3\1\2km\3\2\2\2li\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3"+
		"\2\2\2ov\3\2\2\2pn\3\2\2\2qr\5\24\13\2rs\b\3\1\2su\3\2\2\2tq\3\2\2\2u"+
		"x\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2yz\5\6\4\2z{\b\3\1\2"+
		"{\5\3\2\2\2|}\b\4\1\2}~\7\3\2\2~\177\b\4\1\2\177\u0080\7%\2\2\u0080\u0081"+
		"\7&\2\2\u0081\u0082\5\32\16\2\u0082\u0083\b\4\1\2\u0083\7\3\2\2\2\u0084"+
		"\u0085\b\5\1\2\u0085\u0086\7\35\2\2\u0086\u0087\b\5\1\2\u0087\u0088\5"+
		"R*\2\u0088\u009f\b\5\1\2\u0089\u008a\7\30\2\2\u008a\u008c\5\16\b\2\u008b"+
		"\u008d\7,\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\7\31\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0093\b\5\1\2\u0093\u00a0\3\2\2\2\u0094\u0096\7,"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009b\5\f\7\2\u009a\u009c\7+"+
		"\2\2\u009b\u009a\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009e\b\5\1\2\u009e\u00a0\3\2\2\2\u009f\u0089\3\2\2\2\u009f\u0095\3\2"+
		"\2\2\u00a0\u00a2\3\2\2\2\u00a1\u00a3\7,\2\2\u00a2\u00a1\3\2\2\2\u00a3"+
		"\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\t\3\2\2\2"+
		"\u00a6\u00a7\5T+\2\u00a7\u00a8\5R*\2\u00a8\u00a9\5\26\f\2\u00a9\u00ab"+
		"\7\30\2\2\u00aa\u00ac\7,\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\5\22"+
		"\n\2\u00b0\u00b1\5\20\t\2\u00b1\u00b2\7\31\2\2\u00b2\13\3\2\2\2\u00b3"+
		"\u00b6\5 \21\2\u00b4\u00b6\5\n\6\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2"+
		"\2\2\u00b6\r\3\2\2\2\u00b7\u00b9\7,\2\2\u00b8\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00c1\3\2\2\2\u00bc"+
		"\u00bd\5\f\7\2\u00bd\u00be\7+\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c6\5\f\7\2\u00c5\u00c7\7+"+
		"\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00b8\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\17\3\2\2\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5\32\16\2\u00ce"+
		"\u00d0\7,\2\2\u00cf\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00cf\3\2"+
		"\2\2\u00d1\u00d2\3\2\2\2\u00d2\21\3\2\2\2\u00d3\u00d4\7 \2\2\u00d4\u00d6"+
		"\5\32\16\2\u00d5\u00d7\7,\2\2\u00d6\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2"+
		"\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\23\3\2\2\2\u00da\u00dd"+
		"\5T+\2\u00db\u00dd\7\5\2\2\u00dc\u00da\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00de\3\2\2\2\u00de\u00df\5R*\2\u00df\u00e0\5\26\f\2\u00e0\u00e2\5\32"+
		"\16\2\u00e1\u00e3\7,\2\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\25\3\2\2\2\u00e6\u00f2\7%\2\2"+
		"\u00e7\u00e8\5T+\2\u00e8\u00ef\5R*\2\u00e9\u00ea\7)\2\2\u00ea\u00eb\5"+
		"T+\2\u00eb\u00ec\5R*\2\u00ec\u00ee\3\2\2\2\u00ed\u00e9\3\2\2\2\u00ee\u00f1"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1"+
		"\u00ef\3\2\2\2\u00f2\u00e7\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f5\7&\2\2\u00f5\27\3\2\2\2\u00f6\u00fb\5\66\34\2\u00f7\u00f8"+
		"\7)\2\2\u00f8\u00fa\5\66\34\2\u00f9\u00f7\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00f6\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\31\3\2\2\2\u0100"+
		"\u010b\5\36\20\2\u0101\u0103\7,\2\2\u0102\u0101\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\5\64\33\2\u0107\u0109\7+\2\2\u0108\u0107\3\2\2\2\u0108\u0109\3"+
		"\2\2\2\u0109\u010b\3\2\2\2\u010a\u0100\3\2\2\2\u010a\u0102\3\2\2\2\u010b"+
		"\33\3\2\2\2\u010c\u0114\5\36\20\2\u010d\u010f\7,\2\2\u010e\u010d\3\2\2"+
		"\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112"+
		"\3\2\2\2\u0112\u0114\5\64\33\2\u0113\u010c\3\2\2\2\u0113\u010e\3\2\2\2"+
		"\u0114\35\3\2\2\2\u0115\u0127\7\30\2\2\u0116\u0118\7,\2\2\u0117\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u0120\3\2\2\2\u011b\u011c\5\64\33\2\u011c\u011d\7+\2\2\u011d\u011f\3"+
		"\2\2\2\u011e\u011b\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\5\64"+
		"\33\2\u0124\u0126\7+\2\2\u0125\u0124\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0128\3\2\2\2\u0127\u0117\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u012d\7,\2\2\u012c"+
		"\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2"+
		"\2\2\u012f\u0130\3\2\2\2\u0130\u0131\7\31\2\2\u0131\37\3\2\2\2\u0132\u0133"+
		"\5T+\2\u0133\u0136\5R*\2\u0134\u0135\7#\2\2\u0135\u0137\58\35\2\u0136"+
		"\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0140\3\2\2\2\u0138\u0139\7)"+
		"\2\2\u0139\u013c\5R*\2\u013a\u013b\7#\2\2\u013b\u013d\58\35\2\u013c\u013a"+
		"\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0138\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141!\3\2\2\2"+
		"\u0142\u0140\3\2\2\2\u0143\u014c\5H%\2\u0144\u0145\7%\2\2\u0145\u0146"+
		"\5\30\r\2\u0146\u0147\7&\2\2\u0147\u014b\3\2\2\2\u0148\u0149\7*\2\2\u0149"+
		"\u014b\5R*\2\u014a\u0144\3\2\2\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2"+
		"\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u014c"+
		"\3\2\2\2\u014f\u0150\7%\2\2\u0150\u0151\5\30\r\2\u0151\u0152\7&\2\2\u0152"+
		"#\3\2\2\2\u0153\u0155\7\4\2\2\u0154\u0156\5\66\34\2\u0155\u0154\3\2\2"+
		"\2\u0155\u0156\3\2\2\2\u0156%\3\2\2\2\u0157\u0158\7\t\2\2\u0158\u015d"+
		"\5\66\34\2\u0159\u015e\5\34\17\2\u015a\u015b\5\32\16\2\u015b\u015c\5("+
		"\25\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015a\3\2\2\2\u015e"+
		"\'\3\2\2\2\u015f\u0161\7,\2\2\u0160\u015f\3\2\2\2\u0161\u0164\3\2\2\2"+
		"\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0165\3\2\2\2\u0164\u0162"+
		"\3\2\2\2\u0165\u0166\7\n\2\2\u0166\u0167\5\34\17\2\u0167)\3\2\2\2\u0168"+
		"\u016b\5,\27\2\u0169\u016b\5.\30\2\u016a\u0168\3\2\2\2\u016a\u0169\3\2"+
		"\2\2\u016b+\3\2\2\2\u016c\u016d\7!\2\2\u016d\u016e\5\66\34\2\u016e\u016f"+
		"\5\34\17\2\u016f-\3\2\2\2\u0170\u0171\7\"\2\2\u0171\u0175\5\32\16\2\u0172"+
		"\u0174\7,\2\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173\3\2"+
		"\2\2\u0175\u0176\3\2\2\2\u0176\u0178\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0179\7!\2\2\u0179\u017a\5\66\34\2\u017a/\3\2\2\2\u017b\u017c\7\7\2\2"+
		"\u017c\u017d\7%\2\2\u017d\u017e\5\66\34\2\u017e\u017f\7&\2\2\u017f\61"+
		"\3\2\2\2\u0180\u0181\58\35\2\u0181\u0182\7#\2\2\u0182\u0183\5\66\34\2"+
		"\u0183\63\3\2\2\2\u0184\u018e\5&\24\2\u0185\u018e\5\60\31\2\u0186\u018e"+
		"\5\"\22\2\u0187\u018e\5$\23\2\u0188\u018e\5\62\32\2\u0189\u018e\5 \21"+
		"\2\u018a\u018e\5*\26\2\u018b\u018e\5L\'\2\u018c\u018e\5J&\2\u018d\u0184"+
		"\3\2\2\2\u018d\u0185\3\2\2\2\u018d\u0186\3\2\2\2\u018d\u0187\3\2\2\2\u018d"+
		"\u0188\3\2\2\2\u018d\u0189\3\2\2\2\u018d\u018a\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018d\u018c\3\2\2\2\u018e\65\3\2\2\2\u018f\u0192\58\35\2\u0190\u0191"+
		"\7#\2\2\u0191\u0193\5\66\34\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2"+
		"\u0193\67\3\2\2\2\u0194\u0199\5:\36\2\u0195\u0196\7\24\2\2\u0196\u0198"+
		"\5:\36\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a9\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a1\5<\37\2"+
		"\u019d\u019e\7\23\2\2\u019e\u01a0\5<\37\2\u019f\u019d\3\2\2\2\u01a0\u01a3"+
		"\3\2\2\2\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2;\3\2\2\2\u01a3"+
		"\u01a1\3\2\2\2\u01a4\u01a9\5> \2\u01a5\u01a6\7\17\2\2\u01a6\u01a8\5> "+
		"\2\u01a7\u01a5\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01aa"+
		"\3\2\2\2\u01aa=\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b4\5@!\2\u01ad\u01b0"+
		"\7\21\2\2\u01ae\u01b0\7\22\2\2\u01af\u01ad\3\2\2\2\u01af\u01ae\3\2\2\2"+
		"\u01b0\u01b1\3\2\2\2\u01b1\u01b3\5@!\2\u01b2\u01af\3\2\2\2\u01b3\u01b6"+
		"\3\2\2\2\u01b4\u01b2\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5?\3\2\2\2\u01b6"+
		"\u01b4\3\2\2\2\u01b7\u01bf\5B\"\2\u01b8\u01bb\7\13\2\2\u01b9\u01bb\7\f"+
		"\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\5B\"\2\u01bd\u01ba\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0A\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01ca"+
		"\5D#\2\u01c3\u01c6\7\r\2\2\u01c4\u01c6\7\16\2\2\u01c5\u01c3\3\2\2\2\u01c5"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c9\5D#\2\u01c8\u01c5\3\2\2"+
		"\2\u01c9\u01cc\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cbC"+
		"\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cd\u01d0\7\25\2\2\u01ce\u01d0\7\f\2\2"+
		"\u01cf\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d4"+
		"\5D#\2\u01d2\u01d4\5F$\2\u01d3\u01cf\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"E\3\2\2\2\u01d5\u01de\5H%\2\u01d6\u01d7\7%\2\2\u01d7\u01d8\5\30\r\2\u01d8"+
		"\u01d9\7&\2\2\u01d9\u01dd\3\2\2\2\u01da\u01db\7*\2\2\u01db\u01dd\5R*\2"+
		"\u01dc\u01d6\3\2\2\2\u01dc\u01da\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de\u01dc"+
		"\3\2\2\2\u01de\u01df\3\2\2\2\u01df\u01e9\3\2\2\2\u01e0\u01de\3\2\2\2\u01e1"+
		"\u01e2\7\'\2\2\u01e2\u01e3\5\66\34\2\u01e3\u01e4\7(\2\2\u01e4\u01e8\3"+
		"\2\2\2\u01e5\u01e6\7*\2\2\u01e6\u01e8\5R*\2\u01e7\u01e1\3\2\2\2\u01e7"+
		"\u01e5\3\2\2\2\u01e8\u01eb\3\2\2\2\u01e9\u01e7\3\2\2\2\u01e9\u01ea\3\2"+
		"\2\2\u01eaG\3\2\2\2\u01eb\u01e9\3\2\2\2\u01ec\u01f5\5N(\2\u01ed\u01f5"+
		"\5R*\2\u01ee\u01ef\7%\2\2\u01ef\u01f0\5\30\r\2\u01f0\u01f1\7&\2\2\u01f1"+
		"\u01f5\3\2\2\2\u01f2\u01f5\5J&\2\u01f3\u01f5\5L\'\2\u01f4\u01ec\3\2\2"+
		"\2\u01f4\u01ed\3\2\2\2\u01f4\u01ee\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f4\u01f3"+
		"\3\2\2\2\u01f5I\3\2\2\2\u01f6\u01f7\7\6\2\2\u01f7\u01f8\7%\2\2\u01f8\u01f9"+
		"\5\66\34\2\u01f9\u01fa\7&\2\2\u01faK\3\2\2\2\u01fb\u01fc\7\b\2\2\u01fc"+
		"\u01fd\7%\2\2\u01fd\u01fe\5\66\34\2\u01fe\u01ff\7)\2\2\u01ff\u0200\5\66"+
		"\34\2\u0200\u0201\7&\2\2\u0201M\3\2\2\2\u0202\u0205\5P)\2\u0203\u0205"+
		"\7-\2\2\u0204\u0202\3\2\2\2\u0204\u0203\3\2\2\2\u0205O\3\2\2\2\u0206\u0207"+
		"\7\26\2\2\u0207\u020b\b)\1\2\u0208\u0209\7\27\2\2\u0209\u020b\b)\1\2\u020a"+
		"\u0206\3\2\2\2\u020a\u0208\3\2\2\2\u020bQ\3\2\2\2\u020c\u020d\7.\2\2\u020d"+
		"\u020e\b*\1\2\u020eS\3\2\2\2\u020f\u0210\7\32\2\2\u0210\u0220\b+\1\2\u0211"+
		"\u0212\7\33\2\2\u0212\u0220\b+\1\2\u0213\u0214\7\34\2\2\u0214\u0215\7"+
		"$\2\2\u0215\u0216\5T+\2\u0216\u0217\b+\1\2\u0217\u0220\3\2\2\2\u0218\u0219"+
		"\7\35\2\2\u0219\u021a\5R*\2\u021a\u021b\b+\1\2\u021b\u0220\3\2\2\2\u021c"+
		"\u021d\5V,\2\u021d\u021e\b+\1\2\u021e\u0220\3\2\2\2\u021f\u020f\3\2\2"+
		"\2\u021f\u0211\3\2\2\2\u021f\u0213\3\2\2\2\u021f\u0218\3\2\2\2\u021f\u021c"+
		"\3\2\2\2\u0220U\3\2\2\2\u0221\u0222\b,\1\2\u0222\u0223\7\36\2\2\u0223"+
		"\u0231\7\22\2\2\u0224\u0225\7\5\2\2\u0225\u0232\b,\1\2\u0226\u0227\5T"+
		"+\2\u0227\u022e\b,\1\2\u0228\u0229\7)\2\2\u0229\u022a\5T+\2\u022a\u022b"+
		"\b,\1\2\u022b\u022d\3\2\2\2\u022c\u0228\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2"+
		"\2\2\u0231\u0224\3\2\2\2\u0231\u0226\3\2\2\2\u0232\u0233\3\2\2\2\u0233"+
		"\u0234\b,\1\2\u0234\u023a\7\20\2\2\u0235\u0236\5T+\2\u0236\u0237\b,\1"+
		"\2\u0237\u023b\3\2\2\2\u0238\u0239\7\5\2\2\u0239\u023b\b,\1\2\u023a\u0235"+
		"\3\2\2\2\u023a\u0238\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023d\b,\1\2\u023d"+
		"\u023e\7\21\2\2\u023eW\3\2\2\2E[cnv\u008e\u0097\u009b\u009f\u00a4\u00ad"+
		"\u00b5\u00ba\u00c1\u00c6\u00ca\u00d1\u00d8\u00dc\u00e4\u00ef\u00f2\u00fb"+
		"\u00fe\u0104\u0108\u010a\u0110\u0113\u0119\u0120\u0125\u0129\u012e\u0136"+
		"\u013c\u0140\u014a\u014c\u0155\u015d\u0162\u016a\u0175\u018d\u0192\u0199"+
		"\u01a1\u01a9\u01af\u01b4\u01ba\u01bf\u01c5\u01ca\u01cf\u01d3\u01dc\u01de"+
		"\u01e7\u01e9\u01f4\u0204\u020a\u021f\u022e\u0231\u023a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}