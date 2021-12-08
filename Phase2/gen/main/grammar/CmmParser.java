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
		public SetGetVarDeclaration singleVarWithGetAndSetRet;
		public TypeContext type;
		public IdentifierContext identifier;
		public FunctionArgsDecContext functionArgsDec;
		public SetBodyContext setBody;
		public GetBodyContext getBody;
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
			((SingleVarWithGetAndSetContext)_localctx).singleVarWithGetAndSetRet =  new SetGetVarDeclaration();
			setState(165);
			((SingleVarWithGetAndSetContext)_localctx).type = type();
			_localctx.singleVarWithGetAndSetRet.setVarType(((SingleVarWithGetAndSetContext)_localctx).type.typeRet);
			setState(167);
			((SingleVarWithGetAndSetContext)_localctx).identifier = identifier();
			_localctx.singleVarWithGetAndSetRet.setVarName(((SingleVarWithGetAndSetContext)_localctx).identifier.identifierRet);
			setState(169);
			((SingleVarWithGetAndSetContext)_localctx).functionArgsDec = functionArgsDec();
			_localctx.singleVarWithGetAndSetRet.setArgs(((SingleVarWithGetAndSetContext)_localctx).functionArgsDec.functionArgsDecRet);
			setState(171);
			match(BEGIN);
			setState(173); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(172);
				match(NEWLINE);
				}
				}
				setState(175); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(177);
			((SingleVarWithGetAndSetContext)_localctx).setBody = setBody();
			_localctx.singleVarWithGetAndSetRet.setSetterBody(((SingleVarWithGetAndSetContext)_localctx).setBody.setBodyRet);
			setState(179);
			((SingleVarWithGetAndSetContext)_localctx).getBody = getBody();
			_localctx.singleVarWithGetAndSetRet.setGetterBody(((SingleVarWithGetAndSetContext)_localctx).getBody.getBodyRet);
			setState(181);
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
		public VarDecStatementContext varDecStatement;
		public SingleVarWithGetAndSetContext singleVarWithGetAndSet;
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				((SingleStatementStructBodyContext)_localctx).varDecStatement = varDecStatement();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).varDecStatement.varDecStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186);
				((SingleStatementStructBodyContext)_localctx).singleVarWithGetAndSet = singleVarWithGetAndSet();
				((SingleStatementStructBodyContext)_localctx).singleStatementStructBodyRet =  ((SingleStatementStructBodyContext)_localctx).singleVarWithGetAndSet.singleVarWithGetAndSetRet;
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
		public BlockStmt structBodyRet;
		public SingleStatementStructBodyContext singleStatementStructBody;
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
			setState(210); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(192); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(191);
						match(NEWLINE);
						}
						}
						setState(194); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(202);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(196);
							((StructBodyContext)_localctx).singleStatementStructBody = singleStatementStructBody();
							setState(197);
							match(SEMICOLON);
							_localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
							}
							} 
						}
						setState(204);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
					}
					setState(205);
					((StructBodyContext)_localctx).singleStatementStructBody = singleStatementStructBody();
					_localctx.structBodyRet.addStatement(((StructBodyContext)_localctx).singleStatementStructBody.singleStatementStructBodyRet);
					setState(208);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(207);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(212); 
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
		public Statement getBodyRet;
		public BodyContext body;
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
			setState(214);
			match(GET);
			setState(215);
			((GetBodyContext)_localctx).body = body();
			((GetBodyContext)_localctx).getBodyRet =  ((GetBodyContext)_localctx).body.bodyRet;
			setState(218); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(217);
				match(NEWLINE);
				}
				}
				setState(220); 
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
		public Statement setBodyRet;
		public BodyContext body;
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
			setState(222);
			match(SET);
			setState(223);
			((SetBodyContext)_localctx).body = body();
			((SetBodyContext)_localctx).setBodyRet =  ((SetBodyContext)_localctx).body.bodyRet;
			setState(226); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(225);
				match(NEWLINE);
				}
				}
				setState(228); 
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
		public TypeContext type;
		public IdentifierContext identifier;
		public FunctionArgsDecContext functionArgsDec;
		public BodyContext body;
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
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(230);
				((FunctionDeclarationContext)_localctx).type = type();
				_localctx.functionDeclarationRet.setReturnType(((FunctionDeclarationContext)_localctx).type.typeRet);
				}
				break;
			case VOID:
				{
				setState(233);
				match(VOID);
				_localctx.functionDeclarationRet.setReturnType(new VoidType());
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(237);
			((FunctionDeclarationContext)_localctx).identifier = identifier();
			_localctx.functionDeclarationRet.setFunctionName(((FunctionDeclarationContext)_localctx).identifier.identifierRet);
			    _localctx.functionDeclarationRet.setLine(((FunctionDeclarationContext)_localctx).identifier.identifierRet.getLine());
			setState(239);
			((FunctionDeclarationContext)_localctx).functionArgsDec = functionArgsDec();
			_localctx.functionDeclarationRet.setArgs(((FunctionDeclarationContext)_localctx).functionArgsDec.functionArgsDecRet);
			setState(241);
			((FunctionDeclarationContext)_localctx).body = body();
			_localctx.functionDeclarationRet.setBody(((FunctionDeclarationContext)_localctx).body.bodyRet);
			setState(244); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(243);
				match(NEWLINE);
				}
				}
				setState(246); 
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
		public ArrayList<VariableDeclaration> functionArgsDecRet;
		public VariableDeclaration var;
		public TypeContext fType;
		public IdentifierContext fIdentifier;
		public TypeContext adType;
		public IdentifierContext adIdentifier;
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
			setState(248);
			match(LPAR);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << STRUCT) | (1L << FPTR))) != 0)) {
				{
				setState(249);
				((FunctionArgsDecContext)_localctx).fType = type();
				setState(250);
				((FunctionArgsDecContext)_localctx).fIdentifier = identifier();
				((FunctionArgsDecContext)_localctx).var =  new VariableDeclaration(((FunctionArgsDecContext)_localctx).fIdentifier.identifierRet, ((FunctionArgsDecContext)_localctx).fType.typeRet);
				        _localctx.var.setLine(((FunctionArgsDecContext)_localctx).fIdentifier.identifierRet.getLine());
				        _localctx.functionArgsDecRet.add(_localctx.var);
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					((FunctionArgsDecContext)_localctx).adType = type();
					setState(254);
					((FunctionArgsDecContext)_localctx).adIdentifier = identifier();

					                ((FunctionArgsDecContext)_localctx).var =  new VariableDeclaration(((FunctionArgsDecContext)_localctx).adIdentifier.identifierRet, ((FunctionArgsDecContext)_localctx).adType.typeRet);
					                _localctx.var.setLine(((FunctionArgsDecContext)_localctx).adIdentifier.identifierRet.getLine());
					                _localctx.functionArgsDecRet.add(_localctx.var);
					            
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(264);
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
		public ArrayList<Expression> functionArgumentsRet;
		public ExpressionContext expression;
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
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(266);
				((FunctionArgumentsContext)_localctx).expression = expression();
				_localctx.functionArgumentsRet.add(((FunctionArgumentsContext)_localctx).expression.expressionRet);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(268);
					match(COMMA);
					setState(269);
					((FunctionArgumentsContext)_localctx).expression = expression();
					_localctx.functionArgumentsRet.add(((FunctionArgumentsContext)_localctx).expression.expressionRet);
					}
					}
					setState(276);
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
		public BlockStatementContext blockStatement;
		public SingleStatementContext singleStatement;
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
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(279);
				((BodyContext)_localctx).blockStatement = blockStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).blockStatement.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					match(NEWLINE);
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(287);
				((BodyContext)_localctx).singleStatement = singleStatement();
				((BodyContext)_localctx).bodyRet =  ((BodyContext)_localctx).singleStatement.singleStatementRet;
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMICOLON) {
					{
					setState(289);
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
		public Statement loopCondBodyRet;
		public BlockStatementContext blockStatement;
		public SingleStatementContext singleStatement;
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
			setState(305);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(294);
				((LoopCondBodyContext)_localctx).blockStatement = blockStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).blockStatement.blockStatementRet;
				}
				break;
			case NEWLINE:
				{
				{
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
				((LoopCondBodyContext)_localctx).singleStatement = singleStatement();
				((LoopCondBodyContext)_localctx).loopCondBodyRet =  ((LoopCondBodyContext)_localctx).singleStatement.singleStatementRet;
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
		public BlockStmt blockStatementRet;
		public Token BEGIN;
		public SingleStatementContext singleStatement;
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
			setState(307);
			((BlockStatementContext)_localctx).BEGIN = match(BEGIN);
			_localctx.blockStatementRet.setLine(((BlockStatementContext)_localctx).BEGIN.getLine());
			setState(328); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(310); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(309);
						match(NEWLINE);
						}
						}
						setState(312); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NEWLINE );
					setState(320);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(314);
							((BlockStatementContext)_localctx).singleStatement = singleStatement();
							setState(315);
							match(SEMICOLON);
							_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).singleStatement.singleStatementRet);
							}
							} 
						}
						setState(322);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					}
					setState(323);
					((BlockStatementContext)_localctx).singleStatement = singleStatement();
					_localctx.blockStatementRet.addStatement(((BlockStatementContext)_localctx).singleStatement.singleStatementRet);
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMICOLON) {
						{
						setState(325);
						match(SEMICOLON);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(330); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(333); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(332);
				match(NEWLINE);
				}
				}
				setState(335); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(337);
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
		public VarDecStmt varDecStatementRet;
		public VariableDeclaration var;
		public TypeContext type;
		public IdentifierContext identifier;
		public OrExpressionContext orExpression;
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
			((VarDecStatementContext)_localctx).varDecStatementRet =  new VarDecStmt();
			setState(340);
			((VarDecStatementContext)_localctx).type = type();
			setState(341);
			((VarDecStatementContext)_localctx).identifier = identifier();
			((VarDecStatementContext)_localctx).var =  new VariableDeclaration(((VarDecStatementContext)_localctx).identifier.identifierRet, ((VarDecStatementContext)_localctx).type.typeRet);
			     _localctx.var.setLine(((VarDecStatementContext)_localctx).identifier.identifierRet.getLine());
			    
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(343);
				match(ASSIGN);
				setState(344);
				((VarDecStatementContext)_localctx).orExpression = orExpression();
				_localctx.var.setDefaultValue(((VarDecStatementContext)_localctx).orExpression.orExpressionRet);
				}
			}

			_localctx.varDecStatementRet.addVar(_localctx.var);
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(350);
				match(COMMA);
				setState(351);
				((VarDecStatementContext)_localctx).identifier = identifier();
				((VarDecStatementContext)_localctx).var =  new VariableDeclaration(((VarDecStatementContext)_localctx).identifier.identifierRet, ((VarDecStatementContext)_localctx).type.typeRet);
				        _localctx.var.setLine(((VarDecStatementContext)_localctx).identifier.identifierRet.getLine());
				        
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(353);
					match(ASSIGN);
					setState(354);
					((VarDecStatementContext)_localctx).orExpression = orExpression();
					_localctx.var.setDefaultValue(((VarDecStatementContext)_localctx).orExpression.orExpressionRet);
					}
				}

				_localctx.varDecStatementRet.addVar(_localctx.var);
				}
				}
				setState(365);
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
		public FunctionCallStmt functionCallStmtRet;
		public FunctionCall fc;
		public Expression e;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public FunctionArgumentsContext functionArguments;
		public Token DOT;
		public IdentifierContext identifier;
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
			setState(366);
			((FunctionCallStmtContext)_localctx).otherExpression = otherExpression();
			((FunctionCallStmtContext)_localctx).e =  ((FunctionCallStmtContext)_localctx).otherExpression.otherExpressionRet;
			setState(381);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(379);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(368);
						((FunctionCallStmtContext)_localctx).LPAR = match(LPAR);
						setState(369);
						((FunctionCallStmtContext)_localctx).functionArguments = functionArguments();
						setState(370);
						match(RPAR);
						}

						            ((FunctionCallStmtContext)_localctx).e =  new FunctionCall(_localctx.e, ((FunctionCallStmtContext)_localctx).functionArguments.functionArgumentsRet);
						            _localctx.e.setLine(((FunctionCallStmtContext)_localctx).LPAR.getLine());
						        
						}
						break;
					case DOT:
						{
						{
						setState(374);
						((FunctionCallStmtContext)_localctx).DOT = match(DOT);
						setState(375);
						((FunctionCallStmtContext)_localctx).identifier = identifier();
						}

						            ((FunctionCallStmtContext)_localctx).e =  new StructAccess(_localctx.e, ((FunctionCallStmtContext)_localctx).identifier.identifierRet);
						            _localctx.e.setLine(((FunctionCallStmtContext)_localctx).DOT.getLine());
						        
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(383);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			{
			setState(384);
			((FunctionCallStmtContext)_localctx).LPAR = match(LPAR);
			setState(385);
			((FunctionCallStmtContext)_localctx).functionArguments = functionArguments();
			setState(386);
			match(RPAR);
			}

			        ((FunctionCallStmtContext)_localctx).fc =  new FunctionCall(_localctx.e, ((FunctionCallStmtContext)_localctx).functionArguments.functionArgumentsRet);
			        _localctx.fc.setLine(((FunctionCallStmtContext)_localctx).LPAR.getLine());
			        ((FunctionCallStmtContext)_localctx).functionCallStmtRet =  new FunctionCallStmt(_localctx.fc);
			        _localctx.functionCallStmtRet.setLine(_localctx.fc.getLine());
			     
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
		public ReturnStmt returnStatementRet;
		public Expression returnedExpr;
		public Token RETURN;
		public ExpressionContext expression;
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
			setState(390);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(394);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SIZE) | (1L << APPEND) | (1L << MINUS) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << INT_VALUE) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(391);
				((ReturnStatementContext)_localctx).expression = expression();
				((ReturnStatementContext)_localctx).returnedExpr =  ((ReturnStatementContext)_localctx).expression.expressionRet;
				}
			}

			((ReturnStatementContext)_localctx).returnStatementRet =  new ReturnStmt(); _localctx.returnStatementRet.setLine(((ReturnStatementContext)_localctx).RETURN.getLine());
			     _localctx.returnStatementRet.setReturnedExpr(_localctx.returnedExpr);
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
		public ConditionalStmt ifStatementRet;
		public Statement thenBody;
		public Statement elseBody;
		public Token IF;
		public ExpressionContext expression;
		public LoopCondBodyContext loopCondBody;
		public BodyContext body;
		public ElseStatementContext elseStatement;
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
			setState(398);
			((IfStatementContext)_localctx).IF = match(IF);
			setState(399);
			((IfStatementContext)_localctx).expression = expression();
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(400);
				((IfStatementContext)_localctx).loopCondBody = loopCondBody();
				((IfStatementContext)_localctx).thenBody =  ((IfStatementContext)_localctx).loopCondBody.loopCondBodyRet;
				}
				break;
			case 2:
				{
				setState(403);
				((IfStatementContext)_localctx).body = body();
				setState(404);
				((IfStatementContext)_localctx).elseStatement = elseStatement();
				((IfStatementContext)_localctx).thenBody =  ((IfStatementContext)_localctx).body.bodyRet; ((IfStatementContext)_localctx).elseBody =  ((IfStatementContext)_localctx).elseStatement.elseStatementRet;
				}
				break;
			}
			((IfStatementContext)_localctx).ifStatementRet =  new ConditionalStmt(((IfStatementContext)_localctx).expression.expressionRet);
			     _localctx.ifStatementRet.setLine(((IfStatementContext)_localctx).IF.getLine());
			     _localctx.ifStatementRet.setThenBody(_localctx.thenBody);
			     _localctx.ifStatementRet.setElseBody(_localctx.elseBody);
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
		public Statement elseStatementRet;
		public LoopCondBodyContext loopCondBody;
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
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(411);
				match(NEWLINE);
				}
				}
				setState(416);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(417);
			match(ELSE);
			setState(418);
			((ElseStatementContext)_localctx).loopCondBody = loopCondBody();
			((ElseStatementContext)_localctx).elseStatementRet =  ((ElseStatementContext)_localctx).loopCondBody.loopCondBodyRet;
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
		public Statement loopStatementRet;
		public WhileLoopStatementContext whileLoopStatement;
		public DoWhileLoopStatementContext doWhileLoopStatement;
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
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(421);
				((LoopStatementContext)_localctx).whileLoopStatement = whileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).whileLoopStatement.whileLoopStatementRet;
				}
				break;
			case DO:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
				((LoopStatementContext)_localctx).doWhileLoopStatement = doWhileLoopStatement();
				((LoopStatementContext)_localctx).loopStatementRet =  ((LoopStatementContext)_localctx).doWhileLoopStatement.doWhileLoopStatementRet;
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
		public LoopStmt whileLoopStatementRet;
		public Token WHILE;
		public ExpressionContext expression;
		public LoopCondBodyContext loopCondBody;
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
			setState(429);
			((WhileLoopStatementContext)_localctx).WHILE = match(WHILE);
			setState(430);
			((WhileLoopStatementContext)_localctx).expression = expression();
			setState(431);
			((WhileLoopStatementContext)_localctx).loopCondBody = loopCondBody();
			((WhileLoopStatementContext)_localctx).whileLoopStatementRet =  new LoopStmt();
			     _localctx.whileLoopStatementRet.setLine(((WhileLoopStatementContext)_localctx).WHILE.getLine());
			     _localctx.whileLoopStatementRet.setCondition(((WhileLoopStatementContext)_localctx).expression.expressionRet);
			     _localctx.whileLoopStatementRet.setBody(((WhileLoopStatementContext)_localctx).loopCondBody.loopCondBodyRet);
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
		public LoopStmt doWhileLoopStatementRet;
		public Token DO;
		public BodyContext body;
		public ExpressionContext expression;
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
			setState(434);
			((DoWhileLoopStatementContext)_localctx).DO = match(DO);
			setState(435);
			((DoWhileLoopStatementContext)_localctx).body = body();
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(436);
				match(NEWLINE);
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			match(WHILE);
			setState(443);
			((DoWhileLoopStatementContext)_localctx).expression = expression();
			((DoWhileLoopStatementContext)_localctx).doWhileLoopStatementRet =  new LoopStmt();
			     _localctx.doWhileLoopStatementRet.setBody(((DoWhileLoopStatementContext)_localctx).body.bodyRet);
			     _localctx.doWhileLoopStatementRet.setCondition(((DoWhileLoopStatementContext)_localctx).expression.expressionRet);
			     _localctx.doWhileLoopStatementRet.setLine(((DoWhileLoopStatementContext)_localctx).DO.getLine());
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
		public DisplayStmt displayStatementRet;
		public Token DISPLAY;
		public ExpressionContext expression;
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
			setState(446);
			((DisplayStatementContext)_localctx).DISPLAY = match(DISPLAY);
			setState(447);
			match(LPAR);
			setState(448);
			((DisplayStatementContext)_localctx).expression = expression();
			setState(449);
			match(RPAR);
			((DisplayStatementContext)_localctx).displayStatementRet =  new DisplayStmt(((DisplayStatementContext)_localctx).expression.expressionRet);
			                                _localctx.displayStatementRet.setLine(((DisplayStatementContext)_localctx).DISPLAY.getLine());
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
		public AssignmentStmt assignStatementRet;
		public OrExpressionContext lvalue;
		public Token ASSIGN;
		public ExpressionContext rvalue;
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public OrExpressionContext orExpression() {
			return getRuleContext(OrExpressionContext.class,0);
		}
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
			setState(452);
			((AssignmentStatementContext)_localctx).lvalue = orExpression();
			setState(453);
			((AssignmentStatementContext)_localctx).ASSIGN = match(ASSIGN);
			setState(454);
			((AssignmentStatementContext)_localctx).rvalue = expression();
			((AssignmentStatementContext)_localctx).assignStatementRet =  new AssignmentStmt(((AssignmentStatementContext)_localctx).lvalue.orExpressionRet, ((AssignmentStatementContext)_localctx).rvalue.expressionRet);
			     _localctx.assignStatementRet.setLine(((AssignmentStatementContext)_localctx).ASSIGN.getLine());
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
		public Statement singleStatementRet;
		public IfStatementContext ifStatement;
		public DisplayStatementContext displayStatement;
		public FunctionCallStmtContext functionCallStmt;
		public ReturnStatementContext returnStatement;
		public AssignmentStatementContext assignmentStatement;
		public VarDecStatementContext varDecStatement;
		public LoopStatementContext loopStatement;
		public AppendContext append;
		public SizeContext size;
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
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				((SingleStatementContext)_localctx).ifStatement = ifStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).ifStatement.ifStatementRet;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				((SingleStatementContext)_localctx).displayStatement = displayStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).displayStatement.displayStatementRet;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(463);
				((SingleStatementContext)_localctx).functionCallStmt = functionCallStmt();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).functionCallStmt.functionCallStmtRet;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(466);
				((SingleStatementContext)_localctx).returnStatement = returnStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).returnStatement.returnStatementRet;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				((SingleStatementContext)_localctx).assignmentStatement = assignmentStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).assignmentStatement.assignStatementRet;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(472);
				((SingleStatementContext)_localctx).varDecStatement = varDecStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).varDecStatement.varDecStatementRet;
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(475);
				((SingleStatementContext)_localctx).loopStatement = loopStatement();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).loopStatement.loopStatementRet;
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(478);
				((SingleStatementContext)_localctx).append = append();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).append.appendRet;
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(481);
				((SingleStatementContext)_localctx).size = size();
				((SingleStatementContext)_localctx).singleStatementRet =  ((SingleStatementContext)_localctx).size.sizeRet;
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
		public Expression expressionRet;
		public OrExpressionContext orExpression;
		public Token op;
		public ExpressionContext expression;
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
			setState(486);
			((ExpressionContext)_localctx).orExpression = orExpression();
			((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).orExpression.orExpressionRet;
			setState(492);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(488);
				((ExpressionContext)_localctx).op = match(ASSIGN);
				setState(489);
				((ExpressionContext)_localctx).expression = expression();

				            ((ExpressionContext)_localctx).expressionRet =  new BinaryExpression(_localctx.expressionRet, ((ExpressionContext)_localctx).expression.expressionRet, BinaryOperator.assign);
				            _localctx.expressionRet.setLine(((ExpressionContext)_localctx).op.getLine());
				        
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
		public Expression orExpressionRet;
		public AndExpressionContext andExpression;
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
			setState(494);
			((OrExpressionContext)_localctx).andExpression = andExpression();
			((OrExpressionContext)_localctx).orExpressionRet =  ((OrExpressionContext)_localctx).andExpression.andExpressionRet;
			setState(502);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(496);
				((OrExpressionContext)_localctx).op = match(OR);
				setState(497);
				((OrExpressionContext)_localctx).andExpression = andExpression();

				            ((OrExpressionContext)_localctx).orExpressionRet =  new BinaryExpression(_localctx.orExpressionRet, ((OrExpressionContext)_localctx).andExpression.andExpressionRet, BinaryOperator.or);
				            _localctx.orExpressionRet.setLine(((OrExpressionContext)_localctx).op.getLine());
				        
				}
				}
				setState(504);
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
		public Expression andExpressionRet;
		public EqualityExpressionContext equalityExpression;
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
			setState(505);
			((AndExpressionContext)_localctx).equalityExpression = equalityExpression();
			((AndExpressionContext)_localctx).andExpressionRet =  ((AndExpressionContext)_localctx).equalityExpression.equalityExpressionRet;
			setState(513);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(507);
				((AndExpressionContext)_localctx).op = match(AND);
				setState(508);
				((AndExpressionContext)_localctx).equalityExpression = equalityExpression();

				            ((AndExpressionContext)_localctx).andExpressionRet =  new BinaryExpression(_localctx.andExpressionRet, ((AndExpressionContext)_localctx).equalityExpression.equalityExpressionRet, BinaryOperator.and);
				            _localctx.andExpressionRet.setLine(((AndExpressionContext)_localctx).op.getLine());
				        
				}
				}
				setState(515);
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
		public Expression equalityExpressionRet;
		public RelationalExpressionContext relationalExpression;
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
			setState(516);
			((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();
			((EqualityExpressionContext)_localctx).equalityExpressionRet =  ((EqualityExpressionContext)_localctx).relationalExpression.relationalExpressionRet;
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(518);
				((EqualityExpressionContext)_localctx).op = match(EQUAL);
				setState(519);
				((EqualityExpressionContext)_localctx).relationalExpression = relationalExpression();

				            ((EqualityExpressionContext)_localctx).equalityExpressionRet =  new BinaryExpression(_localctx.equalityExpressionRet, ((EqualityExpressionContext)_localctx).relationalExpression.relationalExpressionRet, BinaryOperator.eq);
				            _localctx.equalityExpressionRet.setLine(((EqualityExpressionContext)_localctx).op.getLine());
				        
				}
				}
				setState(526);
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
		public Expression relationalExpressionRet;
		public BinaryOperator o;
		public int line;
		public AdditiveExpressionContext additiveExpression;
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
			setState(527);
			((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();
			((RelationalExpressionContext)_localctx).relationalExpressionRet =  ((RelationalExpressionContext)_localctx).additiveExpression.additiveExpressionRet;
			setState(540);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GREATER_THAN || _la==LESS_THAN) {
				{
				{
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GREATER_THAN:
					{
					setState(529);
					((RelationalExpressionContext)_localctx).op = match(GREATER_THAN);
					((RelationalExpressionContext)_localctx).o =  BinaryOperator.gt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).op.getLine();
					}
					break;
				case LESS_THAN:
					{
					setState(531);
					((RelationalExpressionContext)_localctx).op = match(LESS_THAN);
					((RelationalExpressionContext)_localctx).o =  BinaryOperator.lt; ((RelationalExpressionContext)_localctx).line =  ((RelationalExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(535);
				((RelationalExpressionContext)_localctx).additiveExpression = additiveExpression();

				            ((RelationalExpressionContext)_localctx).relationalExpressionRet =  new BinaryExpression(_localctx.relationalExpressionRet, ((RelationalExpressionContext)_localctx).additiveExpression.additiveExpressionRet, _localctx.o);
				            _localctx.relationalExpressionRet.setLine(_localctx.line);
				        
				}
				}
				setState(542);
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
		public Expression additiveExpressionRet;
		public BinaryOperator o;
		public int line;
		public MultiplicativeExpressionContext multiplicativeExpression;
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
			setState(543);
			((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();
			((AdditiveExpressionContext)_localctx).additiveExpressionRet =  ((AdditiveExpressionContext)_localctx).multiplicativeExpression.multiplicativeExpressionRet;
			setState(556);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(549);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(545);
					((AdditiveExpressionContext)_localctx).op = match(PLUS);
					((AdditiveExpressionContext)_localctx).o =  BinaryOperator.add; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).op.getLine();
					}
					break;
				case MINUS:
					{
					setState(547);
					((AdditiveExpressionContext)_localctx).op = match(MINUS);
					((AdditiveExpressionContext)_localctx).o =  BinaryOperator.sub; ((AdditiveExpressionContext)_localctx).line =  ((AdditiveExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(551);
				((AdditiveExpressionContext)_localctx).multiplicativeExpression = multiplicativeExpression();

				            ((AdditiveExpressionContext)_localctx).additiveExpressionRet =  new BinaryExpression(_localctx.additiveExpressionRet, ((AdditiveExpressionContext)_localctx).multiplicativeExpression.multiplicativeExpressionRet, _localctx.o);
				            _localctx.additiveExpressionRet.setLine(_localctx.line);
				        
				}
				}
				setState(558);
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
		public Expression multiplicativeExpressionRet;
		public BinaryOperator o;
		public int line;
		public PreUnaryExpressionContext preUnaryExpression;
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
			setState(559);
			((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();
			((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  ((MultiplicativeExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet;
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULT || _la==DIVIDE) {
				{
				{
				setState(565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MULT:
					{
					setState(561);
					((MultiplicativeExpressionContext)_localctx).op = match(MULT);
					((MultiplicativeExpressionContext)_localctx).o =  BinaryOperator.mult; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).op.getLine();
					}
					break;
				case DIVIDE:
					{
					setState(563);
					((MultiplicativeExpressionContext)_localctx).op = match(DIVIDE);
					((MultiplicativeExpressionContext)_localctx).o =  BinaryOperator.div; ((MultiplicativeExpressionContext)_localctx).line =  ((MultiplicativeExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(567);
				((MultiplicativeExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();

				            ((MultiplicativeExpressionContext)_localctx).multiplicativeExpressionRet =  new BinaryExpression(_localctx.multiplicativeExpressionRet, ((MultiplicativeExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet, _localctx.o);
				            _localctx.multiplicativeExpressionRet.setLine(_localctx.line);
				        
				}
				}
				setState(574);
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
		public Expression preUnaryExpressionRet;
		public UnaryOperator o;
		public int line;
		public Token op;
		public PreUnaryExpressionContext preUnaryExpression;
		public AccessExpressionContext accessExpression;
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
			setState(587);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(579);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(575);
					((PreUnaryExpressionContext)_localctx).op = match(NOT);
					((PreUnaryExpressionContext)_localctx).o =  UnaryOperator.not; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				case MINUS:
					{
					setState(577);
					((PreUnaryExpressionContext)_localctx).op = match(MINUS);
					((PreUnaryExpressionContext)_localctx).o =  UnaryOperator.minus; ((PreUnaryExpressionContext)_localctx).line =  ((PreUnaryExpressionContext)_localctx).op.getLine();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(581);
				((PreUnaryExpressionContext)_localctx).preUnaryExpression = preUnaryExpression();

				            ((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  new UnaryExpression(((PreUnaryExpressionContext)_localctx).preUnaryExpression.preUnaryExpressionRet, _localctx.o);
				            _localctx.preUnaryExpressionRet.setLine(_localctx.line);
				        
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
				setState(584);
				((PreUnaryExpressionContext)_localctx).accessExpression = accessExpression();
				((PreUnaryExpressionContext)_localctx).preUnaryExpressionRet =  ((PreUnaryExpressionContext)_localctx).accessExpression.accessExpressionRet;
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
		public Expression accessExpressionRet;
		public OtherExpressionContext otherExpression;
		public Token LPAR;
		public FunctionArgumentsContext functionArguments;
		public Token DOT;
		public IdentifierContext identifier;
		public Token LBRACK;
		public ExpressionContext expression;
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
			setState(589);
			((AccessExpressionContext)_localctx).otherExpression = otherExpression();
			((AccessExpressionContext)_localctx).accessExpressionRet =  ((AccessExpressionContext)_localctx).otherExpression.otherExpressionRet;
			setState(604);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(602);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAR:
						{
						{
						setState(591);
						((AccessExpressionContext)_localctx).LPAR = match(LPAR);
						setState(592);
						((AccessExpressionContext)_localctx).functionArguments = functionArguments();
						setState(593);
						match(RPAR);
						}

						            ((AccessExpressionContext)_localctx).accessExpressionRet =  new FunctionCall(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).functionArguments.functionArgumentsRet);
						            _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).LPAR.getLine());
						        
						}
						break;
					case DOT:
						{
						{
						setState(597);
						((AccessExpressionContext)_localctx).DOT = match(DOT);
						setState(598);
						((AccessExpressionContext)_localctx).identifier = identifier();
						}

						            ((AccessExpressionContext)_localctx).accessExpressionRet =  new StructAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).identifier.identifierRet);
						            _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).DOT.getLine());
						        
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(606);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK || _la==DOT) {
				{
				setState(618);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					{
					setState(607);
					((AccessExpressionContext)_localctx).LBRACK = match(LBRACK);
					setState(608);
					((AccessExpressionContext)_localctx).expression = expression();
					setState(609);
					match(RBRACK);
					}

					            ((AccessExpressionContext)_localctx).accessExpressionRet =  new ListAccessByIndex(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).expression.expressionRet);
					            _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).LBRACK.getLine());
					        
					}
					break;
				case DOT:
					{
					{
					setState(613);
					((AccessExpressionContext)_localctx).DOT = match(DOT);
					setState(614);
					((AccessExpressionContext)_localctx).identifier = identifier();
					}

					            ((AccessExpressionContext)_localctx).accessExpressionRet =  new StructAccess(_localctx.accessExpressionRet, ((AccessExpressionContext)_localctx).identifier.identifierRet);
					            _localctx.accessExpressionRet.setLine(((AccessExpressionContext)_localctx).DOT.getLine());
					        
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(622);
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
		public Expression otherExpressionRet;
		public ExprInPar exprInPar;
		public ValueContext value;
		public IdentifierContext identifier;
		public Token LPAR;
		public FunctionArgumentsContext functionArguments;
		public SizeContext size;
		public AppendContext append;
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
			setState(640);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case INT_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(623);
				((OtherExpressionContext)_localctx).value = value();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).value.valueRet;
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(626);
				((OtherExpressionContext)_localctx).identifier = identifier();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).identifier.identifierRet;
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(629);
				((OtherExpressionContext)_localctx).LPAR = match(LPAR);
				{
				setState(630);
				((OtherExpressionContext)_localctx).functionArguments = functionArguments();
				}
				setState(631);
				match(RPAR);
				((OtherExpressionContext)_localctx).exprInPar =  new ExprInPar(((OtherExpressionContext)_localctx).functionArguments.functionArgumentsRet);
				        _localctx.exprInPar.setLine(((OtherExpressionContext)_localctx).LPAR.getLine());
				        ((OtherExpressionContext)_localctx).otherExpressionRet =  _localctx.exprInPar;
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(634);
				((OtherExpressionContext)_localctx).size = size();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).size.sizeRet.getListSizeExpr();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(637);
				((OtherExpressionContext)_localctx).append = append();
				((OtherExpressionContext)_localctx).otherExpressionRet =  ((OtherExpressionContext)_localctx).append.appendRet.getListAppendExpr();
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
		public ListSizeStmt sizeRet;
		public ListSize ls;
		public Token SIZE;
		public ExpressionContext expression;
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
			setState(642);
			((SizeContext)_localctx).SIZE = match(SIZE);
			setState(643);
			match(LPAR);
			setState(644);
			((SizeContext)_localctx).expression = expression();
			setState(645);
			match(RPAR);

			    ((SizeContext)_localctx).ls =  new ListSize(((SizeContext)_localctx).expression.expressionRet);
			    _localctx.ls.setLine(((SizeContext)_localctx).SIZE.getLine());
			    ((SizeContext)_localctx).sizeRet =  new ListSizeStmt(_localctx.ls);
			    _localctx.sizeRet.setLine(_localctx.ls.getLine());
			    
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
		public ListAppendStmt appendRet;
		public ListAppend la;
		public Token APPEND;
		public ExpressionContext listArg;
		public ExpressionContext elementArg;
		public TerminalNode APPEND() { return getToken(CmmParser.APPEND, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode COMMA() { return getToken(CmmParser.COMMA, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
			setState(648);
			((AppendContext)_localctx).APPEND = match(APPEND);
			setState(649);
			match(LPAR);
			setState(650);
			((AppendContext)_localctx).listArg = expression();
			setState(651);
			match(COMMA);
			setState(652);
			((AppendContext)_localctx).elementArg = expression();
			setState(653);
			match(RPAR);

			    ((AppendContext)_localctx).la =  new ListAppend(((AppendContext)_localctx).listArg.expressionRet, ((AppendContext)_localctx).elementArg.expressionRet);
			    _localctx.la.setLine(((AppendContext)_localctx).APPEND.getLine());
			    ((AppendContext)_localctx).appendRet =  new ListAppendStmt(_localctx.la);
			    _localctx.appendRet.setLine(_localctx.la.getLine());
			    
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
		public Value valueRet;
		public BoolValueContext boolValue;
		public Token INT_VALUE;
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
			setState(661);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				((ValueContext)_localctx).boolValue = boolValue();
				((ValueContext)_localctx).valueRet =  ((ValueContext)_localctx).boolValue.boolValueRet;
				}
				break;
			case INT_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(659);
				((ValueContext)_localctx).INT_VALUE = match(INT_VALUE);
				((ValueContext)_localctx).valueRet =  new IntValue((((ValueContext)_localctx).INT_VALUE!=null?Integer.valueOf(((ValueContext)_localctx).INT_VALUE.getText()):0)); _localctx.valueRet.setLine(((ValueContext)_localctx).INT_VALUE.getLine());
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
			setState(667);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
				{
				setState(663);
				((BoolValueContext)_localctx).TRUE = match(TRUE);
				((BoolValueContext)_localctx).boolValueRet =  new BoolValue(true); _localctx.boolValueRet.setLine(((BoolValueContext)_localctx).TRUE.getLine());
				}
				break;
			case FALSE:
				{
				setState(665);
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
			setState(669);
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
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(672);
				match(INT);
				((TypeContext)_localctx).typeRet =  new IntType();
				}
				break;
			case BOOL:
				{
				setState(674);
				match(BOOL);
				((TypeContext)_localctx).typeRet =  new BoolType();
				}
				break;
			case LIST:
				{
				setState(676);
				match(LIST);
				setState(677);
				match(SHARP);
				setState(678);
				((TypeContext)_localctx).t = type();
				((TypeContext)_localctx).typeRet =  new ListType(((TypeContext)_localctx).t.typeRet);
				}
				break;
			case STRUCT:
				{
				setState(681);
				match(STRUCT);
				setState(682);
				((TypeContext)_localctx).i = identifier();
				((TypeContext)_localctx).typeRet =  new StructType(((TypeContext)_localctx).i.identifierRet);
				}
				break;
			case FPTR:
				{
				setState(685);
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
			setState(691);
			match(FPTR);
			setState(692);
			match(LESS_THAN);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
				{
				setState(693);
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
				setState(695);
				((FptrTypeContext)_localctx).fType = type();
				_localctx.argsType.add(((FptrTypeContext)_localctx).fType.typeRet);
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(697);
					match(COMMA);
					setState(698);
					((FptrTypeContext)_localctx).adType = type();
					_localctx.argsType.add(((FptrTypeContext)_localctx).adType.typeRet);
					}
					}
					setState(705);
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
			setState(709);
			match(ARROW);
			setState(715);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
			case LIST:
			case STRUCT:
			case FPTR:
				{
				setState(710);
				((FptrTypeContext)_localctx).rtType = type();
				((FptrTypeContext)_localctx).returnType =  ((FptrTypeContext)_localctx).rtType.typeRet;
				}
				break;
			case VOID:
				{
				setState(713);
				match(VOID);
				((FptrTypeContext)_localctx).returnType =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.fptrTypeRet.setReturnType(_localctx.returnType);
			setState(718);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\60\u02d3\4\2\t\2"+
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
		"\n\5\3\5\6\5\u00a3\n\5\r\5\16\5\u00a4\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\6\6\u00b0\n\6\r\6\16\6\u00b1\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7\u00c0\n\7\3\b\6\b\u00c3\n\b\r\b\16\b\u00c4\3\b\3\b\3"+
		"\b\3\b\7\b\u00cb\n\b\f\b\16\b\u00ce\13\b\3\b\3\b\3\b\5\b\u00d3\n\b\6\b"+
		"\u00d5\n\b\r\b\16\b\u00d6\3\t\3\t\3\t\3\t\6\t\u00dd\n\t\r\t\16\t\u00de"+
		"\3\n\3\n\3\n\3\n\6\n\u00e5\n\n\r\n\16\n\u00e6\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00ee\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\6\13\u00f7\n\13\r"+
		"\13\16\13\u00f8\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0104\n\f\f\f"+
		"\16\f\u0107\13\f\5\f\u0109\n\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u0113"+
		"\n\r\f\r\16\r\u0116\13\r\5\r\u0118\n\r\3\16\3\16\3\16\3\16\6\16\u011e"+
		"\n\16\r\16\16\16\u011f\3\16\3\16\3\16\5\16\u0125\n\16\5\16\u0127\n\16"+
		"\3\17\3\17\3\17\3\17\6\17\u012d\n\17\r\17\16\17\u012e\3\17\3\17\3\17\5"+
		"\17\u0134\n\17\3\20\3\20\3\20\6\20\u0139\n\20\r\20\16\20\u013a\3\20\3"+
		"\20\3\20\3\20\7\20\u0141\n\20\f\20\16\20\u0144\13\20\3\20\3\20\3\20\5"+
		"\20\u0149\n\20\6\20\u014b\n\20\r\20\16\20\u014c\3\20\6\20\u0150\n\20\r"+
		"\20\16\20\u0151\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u015e\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u0168\n\21\3"+
		"\21\3\21\7\21\u016c\n\21\f\21\16\21\u016f\13\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u017e\n\22\f\22\16\22"+
		"\u0181\13\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\5\23\u018d"+
		"\n\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u019a"+
		"\n\24\3\24\3\24\3\25\7\25\u019f\n\25\f\25\16\25\u01a2\13\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u01ae\n\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\7\30\u01b8\n\30\f\30\16\30\u01bb\13\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33"+
		"\u01e7\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u01ef\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\7\35\u01f7\n\35\f\35\16\35\u01fa\13\35\3\36\3\36\3"+
		"\36\3\36\3\36\3\36\7\36\u0202\n\36\f\36\16\36\u0205\13\36\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\7\37\u020d\n\37\f\37\16\37\u0210\13\37\3 \3 \3 \3 "+
		"\3 \3 \5 \u0218\n \3 \3 \3 \7 \u021d\n \f \16 \u0220\13 \3!\3!\3!\3!\3"+
		"!\3!\5!\u0228\n!\3!\3!\3!\7!\u022d\n!\f!\16!\u0230\13!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\5\"\u0238\n\"\3\"\3\"\3\"\7\"\u023d\n\"\f\"\16\"\u0240\13\"\3"+
		"#\3#\3#\3#\5#\u0246\n#\3#\3#\3#\3#\3#\3#\5#\u024e\n#\3$\3$\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\7$\u025d\n$\f$\16$\u0260\13$\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3$\3$\7$\u026d\n$\f$\16$\u0270\13$\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0283\n%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u0298\n(\3)\3)\3)\3)\5)\u029e\n)"+
		"\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u02b3\n+"+
		"\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\7,\u02c0\n,\f,\16,\u02c3\13,\5,\u02c5"+
		"\n,\3,\3,\3,\3,\3,\3,\3,\5,\u02ce\n,\3,\3,\3,\3,\2\2-\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\2\2\u02f7"+
		"\2[\3\2\2\2\4h\3\2\2\2\6|\3\2\2\2\b\u0084\3\2\2\2\n\u00a6\3\2\2\2\f\u00bf"+
		"\3\2\2\2\16\u00d4\3\2\2\2\20\u00d8\3\2\2\2\22\u00e0\3\2\2\2\24\u00ed\3"+
		"\2\2\2\26\u00fa\3\2\2\2\30\u0117\3\2\2\2\32\u0126\3\2\2\2\34\u0133\3\2"+
		"\2\2\36\u0135\3\2\2\2 \u0155\3\2\2\2\"\u0170\3\2\2\2$\u0188\3\2\2\2&\u0190"+
		"\3\2\2\2(\u01a0\3\2\2\2*\u01ad\3\2\2\2,\u01af\3\2\2\2.\u01b4\3\2\2\2\60"+
		"\u01c0\3\2\2\2\62\u01c6\3\2\2\2\64\u01e6\3\2\2\2\66\u01e8\3\2\2\28\u01f0"+
		"\3\2\2\2:\u01fb\3\2\2\2<\u0206\3\2\2\2>\u0211\3\2\2\2@\u0221\3\2\2\2B"+
		"\u0231\3\2\2\2D\u024d\3\2\2\2F\u024f\3\2\2\2H\u0282\3\2\2\2J\u0284\3\2"+
		"\2\2L\u028a\3\2\2\2N\u0297\3\2\2\2P\u029d\3\2\2\2R\u029f\3\2\2\2T\u02b2"+
		"\3\2\2\2V\u02b4\3\2\2\2XZ\7,\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2"+
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
		"\u00a6\u00a7\b\6\1\2\u00a7\u00a8\5T+\2\u00a8\u00a9\b\6\1\2\u00a9\u00aa"+
		"\5R*\2\u00aa\u00ab\b\6\1\2\u00ab\u00ac\5\26\f\2\u00ac\u00ad\b\6\1\2\u00ad"+
		"\u00af\7\30\2\2\u00ae\u00b0\7,\2\2\u00af\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u00b4\5\22\n\2\u00b4\u00b5\b\6\1\2\u00b5\u00b6\5\20\t\2\u00b6\u00b7\b"+
		"\6\1\2\u00b7\u00b8\7\31\2\2\u00b8\13\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba"+
		"\u00bb\b\7\1\2\u00bb\u00c0\3\2\2\2\u00bc\u00bd\5\n\6\2\u00bd\u00be\b\7"+
		"\1\2\u00be\u00c0\3\2\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00bc\3\2\2\2\u00c0"+
		"\r\3\2\2\2\u00c1\u00c3\7,\2\2\u00c2\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2"+
		"\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00cc\3\2\2\2\u00c6\u00c7"+
		"\5\f\7\2\u00c7\u00c8\7+\2\2\u00c8\u00c9\b\b\1\2\u00c9\u00cb\3\2\2\2\u00ca"+
		"\u00c6\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2"+
		"\2\2\u00cd\u00cf\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d0\5\f\7\2\u00d0"+
		"\u00d2\b\b\1\2\u00d1\u00d3\7+\2\2\u00d2\u00d1\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00c2\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\17\3\2\2\2\u00d8\u00d9\7\37\2"+
		"\2\u00d9\u00da\5\32\16\2\u00da\u00dc\b\t\1\2\u00db\u00dd\7,\2\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\21\3\2\2\2\u00e0\u00e1\7 \2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e4"+
		"\b\n\1\2\u00e3\u00e5\7,\2\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\23\3\2\2\2\u00e8\u00e9\5T+\2"+
		"\u00e9\u00ea\b\13\1\2\u00ea\u00ee\3\2\2\2\u00eb\u00ec\7\5\2\2\u00ec\u00ee"+
		"\b\13\1\2\u00ed\u00e8\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\3\2\2\2"+
		"\u00ef\u00f0\5R*\2\u00f0\u00f1\b\13\1\2\u00f1\u00f2\5\26\f\2\u00f2\u00f3"+
		"\b\13\1\2\u00f3\u00f4\5\32\16\2\u00f4\u00f6\b\13\1\2\u00f5\u00f7\7,\2"+
		"\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\25\3\2\2\2\u00fa\u0108\7%\2\2\u00fb\u00fc\5T+\2\u00fc\u00fd"+
		"\5R*\2\u00fd\u0105\b\f\1\2\u00fe\u00ff\7)\2\2\u00ff\u0100\5T+\2\u0100"+
		"\u0101\5R*\2\u0101\u0102\b\f\1\2\u0102\u0104\3\2\2\2\u0103\u00fe\3\2\2"+
		"\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0109"+
		"\3\2\2\2\u0107\u0105\3\2\2\2\u0108\u00fb\3\2\2\2\u0108\u0109\3\2\2\2\u0109"+
		"\u010a\3\2\2\2\u010a\u010b\7&\2\2\u010b\27\3\2\2\2\u010c\u010d\5\66\34"+
		"\2\u010d\u0114\b\r\1\2\u010e\u010f\7)\2\2\u010f\u0110\5\66\34\2\u0110"+
		"\u0111\b\r\1\2\u0111\u0113\3\2\2\2\u0112\u010e\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0118\3\2\2\2\u0116"+
		"\u0114\3\2\2\2\u0117\u010c\3\2\2\2\u0117\u0118\3\2\2\2\u0118\31\3\2\2"+
		"\2\u0119\u011a\5\36\20\2\u011a\u011b\b\16\1\2\u011b\u0127\3\2\2\2\u011c"+
		"\u011e\7,\2\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2"+
		"\2\2\u011f\u0120\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\5\64\33\2\u0122"+
		"\u0124\b\16\1\2\u0123\u0125\7+\2\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0127\3\2\2\2\u0126\u0119\3\2\2\2\u0126\u011d\3\2\2\2\u0127"+
		"\33\3\2\2\2\u0128\u0129\5\36\20\2\u0129\u012a\b\17\1\2\u012a\u0134\3\2"+
		"\2\2\u012b\u012d\7,\2\2\u012c\u012b\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0131\5\64"+
		"\33\2\u0131\u0132\b\17\1\2\u0132\u0134\3\2\2\2\u0133\u0128\3\2\2\2\u0133"+
		"\u012c\3\2\2\2\u0134\35\3\2\2\2\u0135\u0136\7\30\2\2\u0136\u014a\b\20"+
		"\1\2\u0137\u0139\7,\2\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u0142\3\2\2\2\u013c\u013d\5\64"+
		"\33\2\u013d\u013e\7+\2\2\u013e\u013f\b\20\1\2\u013f\u0141\3\2\2\2\u0140"+
		"\u013c\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142\u0143\3\2"+
		"\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0146\5\64\33\2\u0146"+
		"\u0148\b\20\1\2\u0147\u0149\7+\2\2\u0148\u0147\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014b\3\2\2\2\u014a\u0138\3\2\2\2\u014b\u014c\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u014f\3\2\2\2\u014e\u0150\7,"+
		"\2\2\u014f\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u014f\3\2\2\2\u0151"+
		"\u0152\3\2\2\2\u0152\u0153\3\2\2\2\u0153\u0154\7\31\2\2\u0154\37\3\2\2"+
		"\2\u0155\u0156\b\21\1\2\u0156\u0157\5T+\2\u0157\u0158\5R*\2\u0158\u015d"+
		"\b\21\1\2\u0159\u015a\7#\2\2\u015a\u015b\58\35\2\u015b\u015c\b\21\1\2"+
		"\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f"+
		"\3\2\2\2\u015f\u016d\b\21\1\2\u0160\u0161\7)\2\2\u0161\u0162\5R*\2\u0162"+
		"\u0167\b\21\1\2\u0163\u0164\7#\2\2\u0164\u0165\58\35\2\u0165\u0166\b\21"+
		"\1\2\u0166\u0168\3\2\2\2\u0167\u0163\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u0169\3\2\2\2\u0169\u016a\b\21\1\2\u016a\u016c\3\2\2\2\u016b\u0160\3"+
		"\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"!\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\5H%\2\u0171\u017f\b\22\1\2\u0172"+
		"\u0173\7%\2\2\u0173\u0174\5\30\r\2\u0174\u0175\7&\2\2\u0175\u0176\3\2"+
		"\2\2\u0176\u0177\b\22\1\2\u0177\u017e\3\2\2\2\u0178\u0179\7*\2\2\u0179"+
		"\u017a\5R*\2\u017a\u017b\3\2\2\2\u017b\u017c\b\22\1\2\u017c\u017e\3\2"+
		"\2\2\u017d\u0172\3\2\2\2\u017d\u0178\3\2\2\2\u017e\u0181\3\2\2\2\u017f"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181\u017f\3\2"+
		"\2\2\u0182\u0183\7%\2\2\u0183\u0184\5\30\r\2\u0184\u0185\7&\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\b\22\1\2\u0187#\3\2\2\2\u0188\u018c\7\4\2\2"+
		"\u0189\u018a\5\66\34\2\u018a\u018b\b\23\1\2\u018b\u018d\3\2\2\2\u018c"+
		"\u0189\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u018f\b\23"+
		"\1\2\u018f%\3\2\2\2\u0190\u0191\7\t\2\2\u0191\u0199\5\66\34\2\u0192\u0193"+
		"\5\34\17\2\u0193\u0194\b\24\1\2\u0194\u019a\3\2\2\2\u0195\u0196\5\32\16"+
		"\2\u0196\u0197\5(\25\2\u0197\u0198\b\24\1\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0192\3\2\2\2\u0199\u0195\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u019c\b\24"+
		"\1\2\u019c\'\3\2\2\2\u019d\u019f\7,\2\2\u019e\u019d\3\2\2\2\u019f\u01a2"+
		"\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a3\u01a4\7\n\2\2\u01a4\u01a5\5\34\17\2\u01a5\u01a6\b"+
		"\25\1\2\u01a6)\3\2\2\2\u01a7\u01a8\5,\27\2\u01a8\u01a9\b\26\1\2\u01a9"+
		"\u01ae\3\2\2\2\u01aa\u01ab\5.\30\2\u01ab\u01ac\b\26\1\2\u01ac\u01ae\3"+
		"\2\2\2\u01ad\u01a7\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae+\3\2\2\2\u01af\u01b0"+
		"\7!\2\2\u01b0\u01b1\5\66\34\2\u01b1\u01b2\5\34\17\2\u01b2\u01b3\b\27\1"+
		"\2\u01b3-\3\2\2\2\u01b4\u01b5\7\"\2\2\u01b5\u01b9\5\32\16\2\u01b6\u01b8"+
		"\7,\2\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\7!"+
		"\2\2\u01bd\u01be\5\66\34\2\u01be\u01bf\b\30\1\2\u01bf/\3\2\2\2\u01c0\u01c1"+
		"\7\7\2\2\u01c1\u01c2\7%\2\2\u01c2\u01c3\5\66\34\2\u01c3\u01c4\7&\2\2\u01c4"+
		"\u01c5\b\31\1\2\u01c5\61\3\2\2\2\u01c6\u01c7\58\35\2\u01c7\u01c8\7#\2"+
		"\2\u01c8\u01c9\5\66\34\2\u01c9\u01ca\b\32\1\2\u01ca\63\3\2\2\2\u01cb\u01cc"+
		"\5&\24\2\u01cc\u01cd\b\33\1\2\u01cd\u01e7\3\2\2\2\u01ce\u01cf\5\60\31"+
		"\2\u01cf\u01d0\b\33\1\2\u01d0\u01e7\3\2\2\2\u01d1\u01d2\5\"\22\2\u01d2"+
		"\u01d3\b\33\1\2\u01d3\u01e7\3\2\2\2\u01d4\u01d5\5$\23\2\u01d5\u01d6\b"+
		"\33\1\2\u01d6\u01e7\3\2\2\2\u01d7\u01d8\5\62\32\2\u01d8\u01d9\b\33\1\2"+
		"\u01d9\u01e7\3\2\2\2\u01da\u01db\5 \21\2\u01db\u01dc\b\33\1\2\u01dc\u01e7"+
		"\3\2\2\2\u01dd\u01de\5*\26\2\u01de\u01df\b\33\1\2\u01df\u01e7\3\2\2\2"+
		"\u01e0\u01e1\5L\'\2\u01e1\u01e2\b\33\1\2\u01e2\u01e7\3\2\2\2\u01e3\u01e4"+
		"\5J&\2\u01e4\u01e5\b\33\1\2\u01e5\u01e7\3\2\2\2\u01e6\u01cb\3\2\2\2\u01e6"+
		"\u01ce\3\2\2\2\u01e6\u01d1\3\2\2\2\u01e6\u01d4\3\2\2\2\u01e6\u01d7\3\2"+
		"\2\2\u01e6\u01da\3\2\2\2\u01e6\u01dd\3\2\2\2\u01e6\u01e0\3\2\2\2\u01e6"+
		"\u01e3\3\2\2\2\u01e7\65\3\2\2\2\u01e8\u01e9\58\35\2\u01e9\u01ee\b\34\1"+
		"\2\u01ea\u01eb\7#\2\2\u01eb\u01ec\5\66\34\2\u01ec\u01ed\b\34\1\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ea\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\67\3\2\2"+
		"\2\u01f0\u01f1\5:\36\2\u01f1\u01f8\b\35\1\2\u01f2\u01f3\7\24\2\2\u01f3"+
		"\u01f4\5:\36\2\u01f4\u01f5\b\35\1\2\u01f5\u01f7\3\2\2\2\u01f6\u01f2\3"+
		"\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"9\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\5<\37\2\u01fc\u0203\b\36\1\2"+
		"\u01fd\u01fe\7\23\2\2\u01fe\u01ff\5<\37\2\u01ff\u0200\b\36\1\2\u0200\u0202"+
		"\3\2\2\2\u0201\u01fd\3\2\2\2\u0202\u0205\3\2\2\2\u0203\u0201\3\2\2\2\u0203"+
		"\u0204\3\2\2\2\u0204;\3\2\2\2\u0205\u0203\3\2\2\2\u0206\u0207\5> \2\u0207"+
		"\u020e\b\37\1\2\u0208\u0209\7\17\2\2\u0209\u020a\5> \2\u020a\u020b\b\37"+
		"\1\2\u020b\u020d\3\2\2\2\u020c\u0208\3\2\2\2\u020d\u0210\3\2\2\2\u020e"+
		"\u020c\3\2\2\2\u020e\u020f\3\2\2\2\u020f=\3\2\2\2\u0210\u020e\3\2\2\2"+
		"\u0211\u0212\5@!\2\u0212\u021e\b \1\2\u0213\u0214\7\21\2\2\u0214\u0218"+
		"\b \1\2\u0215\u0216\7\22\2\2\u0216\u0218\b \1\2\u0217\u0213\3\2\2\2\u0217"+
		"\u0215\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\5@!\2\u021a\u021b\b \1"+
		"\2\u021b\u021d\3\2\2\2\u021c\u0217\3\2\2\2\u021d\u0220\3\2\2\2\u021e\u021c"+
		"\3\2\2\2\u021e\u021f\3\2\2\2\u021f?\3\2\2\2\u0220\u021e\3\2\2\2\u0221"+
		"\u0222\5B\"\2\u0222\u022e\b!\1\2\u0223\u0224\7\13\2\2\u0224\u0228\b!\1"+
		"\2\u0225\u0226\7\f\2\2\u0226\u0228\b!\1\2\u0227\u0223\3\2\2\2\u0227\u0225"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\5B\"\2\u022a\u022b\b!\1\2\u022b"+
		"\u022d\3\2\2\2\u022c\u0227\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2"+
		"\2\2\u022e\u022f\3\2\2\2\u022fA\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0232"+
		"\5D#\2\u0232\u023e\b\"\1\2\u0233\u0234\7\r\2\2\u0234\u0238\b\"\1\2\u0235"+
		"\u0236\7\16\2\2\u0236\u0238\b\"\1\2\u0237\u0233\3\2\2\2\u0237\u0235\3"+
		"\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\5D#\2\u023a\u023b\b\"\1\2\u023b"+
		"\u023d\3\2\2\2\u023c\u0237\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023fC\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242"+
		"\7\25\2\2\u0242\u0246\b#\1\2\u0243\u0244\7\f\2\2\u0244\u0246\b#\1\2\u0245"+
		"\u0241\3\2\2\2\u0245\u0243\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0248\5D"+
		"#\2\u0248\u0249\b#\1\2\u0249\u024e\3\2\2\2\u024a\u024b\5F$\2\u024b\u024c"+
		"\b#\1\2\u024c\u024e\3\2\2\2\u024d\u0245\3\2\2\2\u024d\u024a\3\2\2\2\u024e"+
		"E\3\2\2\2\u024f\u0250\5H%\2\u0250\u025e\b$\1\2\u0251\u0252\7%\2\2\u0252"+
		"\u0253\5\30\r\2\u0253\u0254\7&\2\2\u0254\u0255\3\2\2\2\u0255\u0256\b$"+
		"\1\2\u0256\u025d\3\2\2\2\u0257\u0258\7*\2\2\u0258\u0259\5R*\2\u0259\u025a"+
		"\3\2\2\2\u025a\u025b\b$\1\2\u025b\u025d\3\2\2\2\u025c\u0251\3\2\2\2\u025c"+
		"\u0257\3\2\2\2\u025d\u0260\3\2\2\2\u025e\u025c\3\2\2\2\u025e\u025f\3\2"+
		"\2\2\u025f\u026e\3\2\2\2\u0260\u025e\3\2\2\2\u0261\u0262\7\'\2\2\u0262"+
		"\u0263\5\66\34\2\u0263\u0264\7(\2\2\u0264\u0265\3\2\2\2\u0265\u0266\b"+
		"$\1\2\u0266\u026d\3\2\2\2\u0267\u0268\7*\2\2\u0268\u0269\5R*\2\u0269\u026a"+
		"\3\2\2\2\u026a\u026b\b$\1\2\u026b\u026d\3\2\2\2\u026c\u0261\3\2\2\2\u026c"+
		"\u0267\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2"+
		"\2\2\u026fG\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5N(\2\u0272\u0273"+
		"\b%\1\2\u0273\u0283\3\2\2\2\u0274\u0275\5R*\2\u0275\u0276\b%\1\2\u0276"+
		"\u0283\3\2\2\2\u0277\u0278\7%\2\2\u0278\u0279\5\30\r\2\u0279\u027a\7&"+
		"\2\2\u027a\u027b\b%\1\2\u027b\u0283\3\2\2\2\u027c\u027d\5J&\2\u027d\u027e"+
		"\b%\1\2\u027e\u0283\3\2\2\2\u027f\u0280\5L\'\2\u0280\u0281\b%\1\2\u0281"+
		"\u0283\3\2\2\2\u0282\u0271\3\2\2\2\u0282\u0274\3\2\2\2\u0282\u0277\3\2"+
		"\2\2\u0282\u027c\3\2\2\2\u0282\u027f\3\2\2\2\u0283I\3\2\2\2\u0284\u0285"+
		"\7\6\2\2\u0285\u0286\7%\2\2\u0286\u0287\5\66\34\2\u0287\u0288\7&\2\2\u0288"+
		"\u0289\b&\1\2\u0289K\3\2\2\2\u028a\u028b\7\b\2\2\u028b\u028c\7%\2\2\u028c"+
		"\u028d\5\66\34\2\u028d\u028e\7)\2\2\u028e\u028f\5\66\34\2\u028f\u0290"+
		"\7&\2\2\u0290\u0291\b\'\1\2\u0291M\3\2\2\2\u0292\u0293\5P)\2\u0293\u0294"+
		"\b(\1\2\u0294\u0298\3\2\2\2\u0295\u0296\7-\2\2\u0296\u0298\b(\1\2\u0297"+
		"\u0292\3\2\2\2\u0297\u0295\3\2\2\2\u0298O\3\2\2\2\u0299\u029a\7\26\2\2"+
		"\u029a\u029e\b)\1\2\u029b\u029c\7\27\2\2\u029c\u029e\b)\1\2\u029d\u0299"+
		"\3\2\2\2\u029d\u029b\3\2\2\2\u029eQ\3\2\2\2\u029f\u02a0\7.\2\2\u02a0\u02a1"+
		"\b*\1\2\u02a1S\3\2\2\2\u02a2\u02a3\7\32\2\2\u02a3\u02b3\b+\1\2\u02a4\u02a5"+
		"\7\33\2\2\u02a5\u02b3\b+\1\2\u02a6\u02a7\7\34\2\2\u02a7\u02a8\7$\2\2\u02a8"+
		"\u02a9\5T+\2\u02a9\u02aa\b+\1\2\u02aa\u02b3\3\2\2\2\u02ab\u02ac\7\35\2"+
		"\2\u02ac\u02ad\5R*\2\u02ad\u02ae\b+\1\2\u02ae\u02b3\3\2\2\2\u02af\u02b0"+
		"\5V,\2\u02b0\u02b1\b+\1\2\u02b1\u02b3\3\2\2\2\u02b2\u02a2\3\2\2\2\u02b2"+
		"\u02a4\3\2\2\2\u02b2\u02a6\3\2\2\2\u02b2\u02ab\3\2\2\2\u02b2\u02af\3\2"+
		"\2\2\u02b3U\3\2\2\2\u02b4\u02b5\b,\1\2\u02b5\u02b6\7\36\2\2\u02b6\u02c4"+
		"\7\22\2\2\u02b7\u02b8\7\5\2\2\u02b8\u02c5\b,\1\2\u02b9\u02ba\5T+\2\u02ba"+
		"\u02c1\b,\1\2\u02bb\u02bc\7)\2\2\u02bc\u02bd\5T+\2\u02bd\u02be\b,\1\2"+
		"\u02be\u02c0\3\2\2\2\u02bf\u02bb\3\2\2\2\u02c0\u02c3\3\2\2\2\u02c1\u02bf"+
		"\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c5\3\2\2\2\u02c3\u02c1\3\2\2\2\u02c4"+
		"\u02b7\3\2\2\2\u02c4\u02b9\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c7\b,"+
		"\1\2\u02c7\u02cd\7\20\2\2\u02c8\u02c9\5T+\2\u02c9\u02ca\b,\1\2\u02ca\u02ce"+
		"\3\2\2\2\u02cb\u02cc\7\5\2\2\u02cc\u02ce\b,\1\2\u02cd\u02c8\3\2\2\2\u02cd"+
		"\u02cb\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\b,\1\2\u02d0\u02d1\7\21"+
		"\2\2\u02d1W\3\2\2\2E[cnv\u008e\u0097\u009b\u009f\u00a4\u00b1\u00bf\u00c4"+
		"\u00cc\u00d2\u00d6\u00de\u00e6\u00ed\u00f8\u0105\u0108\u0114\u0117\u011f"+
		"\u0124\u0126\u012e\u0133\u013a\u0142\u0148\u014c\u0151\u015d\u0167\u016d"+
		"\u017d\u017f\u018c\u0199\u01a0\u01ad\u01b9\u01e6\u01ee\u01f8\u0203\u020e"+
		"\u0217\u021e\u0227\u022e\u0237\u023e\u0245\u024d\u025c\u025e\u026c\u026e"+
		"\u0282\u0297\u029d\u02b2\u02c1\u02c4\u02cd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}