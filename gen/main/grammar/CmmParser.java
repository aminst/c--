// Generated from /home/fateme/fatemes/1400/compiler/ca/c--/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
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
		STRUCT=1, MAIN=2, INT=3, BOOL=4, LIST=5, VOID=6, WHILE=7, DO=8, IF=9, 
		ELSE=10, RETURN=11, GET=12, SET=13, BEGIN=14, END=15, DISPLAY=16, APPEND=17, 
		SIZE=18, TRUE=19, FALSE=20, FPTR=21, NULL=22, LPAR=23, RPAR=24, LBRACKET=25, 
		RBRACKET=26, SEMICOLON=27, DOT=28, COMMA=29, SHARP=30, GT=31, LT=32, ASSIGN=33, 
		EQUAL=34, AESTRIK=35, DIVIDE=36, PLUS=37, MINUS=38, AND=39, OR=40, TILDE=41, 
		ARROW=42, IDENTIFIER=43, NUM=44, COMMENT=45, NEWLINE=46, WS=47;
	public static final int
		RULE_cmm = 0, RULE_main = 1, RULE_mainStatementScope = 2, RULE_function = 3, 
		RULE_struct = 4, RULE_structScope = 5, RULE_structFunc = 6, RULE_setGetStatementScope = 7, 
		RULE_setGetFuncs = 8, RULE_callArgsDef = 9, RULE_funcArgs = 10, RULE_statement = 11, 
		RULE_returnStatement = 12, RULE_assignStatement = 13, RULE_ifStatement = 14, 
		RULE_callStatement = 15, RULE_whileStatement = 16, RULE_doWhileStatement = 17, 
		RULE_doWhileStatementScope = 18, RULE_displayStatement = 19, RULE_sizeStatement = 20, 
		RULE_appendStatement = 21, RULE_statementScope = 22, RULE_oneLineStatement = 23, 
		RULE_expression = 24, RULE_assignExpression = 25, RULE_logicalOrExpression = 26, 
		RULE_logicalAndExpression = 27, RULE_equalExpression = 28, RULE_comparisonExpression = 29, 
		RULE_plusMinusExpression = 30, RULE_multiplyDivideExpression = 31, RULE_unaryExpression = 32, 
		RULE_retrieveListExpression = 33, RULE_accessMemberExpression = 34, RULE_parantheseExpression = 35, 
		RULE_callArgs = 36, RULE_valueExpression = 37, RULE_varDeclaration = 38, 
		RULE_oneLineVarDeclaration = 39, RULE_varDecName = 40, RULE_value = 41, 
		RULE_boolValue = 42, RULE_type = 43, RULE_listType = 44, RULE_primitiveType = 45, 
		RULE_fptrType = 46, RULE_structType = 47;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "main", "mainStatementScope", "function", "struct", "structScope", 
			"structFunc", "setGetStatementScope", "setGetFuncs", "callArgsDef", "funcArgs", 
			"statement", "returnStatement", "assignStatement", "ifStatement", "callStatement", 
			"whileStatement", "doWhileStatement", "doWhileStatementScope", "displayStatement", 
			"sizeStatement", "appendStatement", "statementScope", "oneLineStatement", 
			"expression", "assignExpression", "logicalOrExpression", "logicalAndExpression", 
			"equalExpression", "comparisonExpression", "plusMinusExpression", "multiplyDivideExpression", 
			"unaryExpression", "retrieveListExpression", "accessMemberExpression", 
			"parantheseExpression", "callArgs", "valueExpression", "varDeclaration", 
			"oneLineVarDeclaration", "varDecName", "value", "boolValue", "type", 
			"listType", "primitiveType", "fptrType", "structType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'struct'", "'main'", "'int'", "'bool'", "'list'", "'void'", "'while'", 
			"'do'", "'if'", "'else'", "'return'", "'get'", "'set'", "'begin'", "'end'", 
			"'display'", "'append'", "'size'", "'true'", "'false'", "'fptr'", "'null'", 
			"'('", "')'", "'['", "']'", "';'", "'.'", "','", "'#'", "'>'", "'<'", 
			"'='", "'=='", "'*'", "'/'", "'+'", "'-'", "'&'", "'|'", "'~'", "'->'", 
			null, null, null, "'\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRUCT", "MAIN", "INT", "BOOL", "LIST", "VOID", "WHILE", "DO", 
			"IF", "ELSE", "RETURN", "GET", "SET", "BEGIN", "END", "DISPLAY", "APPEND", 
			"SIZE", "TRUE", "FALSE", "FPTR", "NULL", "LPAR", "RPAR", "LBRACKET", 
			"RBRACKET", "SEMICOLON", "DOT", "COMMA", "SHARP", "GT", "LT", "ASSIGN", 
			"EQUAL", "AESTRIK", "DIVIDE", "PLUS", "MINUS", "AND", "OR", "TILDE", 
			"ARROW", "IDENTIFIER", "NUM", "COMMENT", "NEWLINE", "WS"
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
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<StructContext> struct() {
			return getRuleContexts(StructContext.class);
		}
		public StructContext struct(int i) {
			return getRuleContext(StructContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<FunctionContext> function() {
			return getRuleContexts(FunctionContext.class);
		}
		public FunctionContext function(int i) {
			return getRuleContext(FunctionContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(98);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRUCT:
						{
						setState(96);
						struct();
						}
						break;
					case NEWLINE:
						{
						setState(97);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(102);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << FPTR) | (1L << NEWLINE))) != 0)) {
				{
				setState(105);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCT:
				case INT:
				case BOOL:
				case LIST:
				case VOID:
				case FPTR:
					{
					setState(103);
					function();
					}
					break;
				case NEWLINE:
					{
					setState(104);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			main();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(111);
				match(NEWLINE);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public MainStatementScopeContext mainStatementScope() {
			return getRuleContext(MainStatementScopeContext.class,0);
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
		enterRule(_localctx, 2, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(MAIN);
			 System.out.print("Main\n");
			setState(121);
			match(LPAR);
			setState(122);
			match(RPAR);
			setState(123);
			mainStatementScope();
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

	public static class MainStatementScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<OneLineStatementContext> oneLineStatement() {
			return getRuleContexts(OneLineStatementContext.class);
		}
		public OneLineStatementContext oneLineStatement(int i) {
			return getRuleContext(OneLineStatementContext.class,i);
		}
		public MainStatementScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatementScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMainStatementScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMainStatementScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMainStatementScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementScopeContext mainStatementScope() throws RecognitionException {
		MainStatementScopeContext _localctx = new MainStatementScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mainStatementScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(BEGIN);
			setState(127); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(126);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(129); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(133); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(133);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(131);
						statement();
						}
						break;
					case 2:
						{
						setState(132);
						oneLineStatement();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionContext extends ParserRuleContext {
		public Token func_dec;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public CallArgsDefContext callArgsDef() {
			return getRuleContext(CallArgsDefContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public StatementScopeContext statementScope() {
			return getRuleContext(StatementScopeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(144);
				type();
				}
				break;
			case VOID:
				{
				setState(145);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(148);
			((FunctionContext)_localctx).func_dec = match(IDENTIFIER);
			 System.out.print("FunctionDec : "+(((FunctionContext)_localctx).func_dec!=null?((FunctionContext)_localctx).func_dec.getText():null)+"\n");
			setState(150);
			match(LPAR);
			setState(151);
			callArgsDef();
			setState(152);
			match(RPAR);
			setState(153);
			statementScope();
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

	public static class StructContext extends ParserRuleContext {
		public Token struct_dec;
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public StructScopeContext structScope() {
			return getRuleContext(StructScopeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public StructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_struct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructContext struct() throws RecognitionException {
		StructContext _localctx = new StructContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(STRUCT);
			setState(156);
			((StructContext)_localctx).struct_dec = match(IDENTIFIER);
			 System.out.print("StructDec : "+(((StructContext)_localctx).struct_dec!=null?((StructContext)_localctx).struct_dec.getText():null) +"\n");
			setState(158);
			structScope();
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

	public static class StructScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StructFuncContext> structFunc() {
			return getRuleContexts(StructFuncContext.class);
		}
		public StructFuncContext structFunc(int i) {
			return getRuleContext(StructFuncContext.class,i);
		}
		public List<OneLineVarDeclarationContext> oneLineVarDeclaration() {
			return getRuleContexts(OneLineVarDeclarationContext.class);
		}
		public OneLineVarDeclarationContext oneLineVarDeclaration(int i) {
			return getRuleContext(OneLineVarDeclarationContext.class,i);
		}
		public StructScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructScopeContext structScope() throws RecognitionException {
		StructScopeContext _localctx = new StructScopeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(BEGIN);
			setState(162); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(161);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(164); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(169); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						setState(166);
						varDeclaration();
						}
						break;
					case 2:
						{
						setState(167);
						structFunc();
						}
						break;
					case 3:
						{
						setState(168);
						oneLineVarDeclaration();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(171); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(174); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(NEWLINE);
				}
				}
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(178);
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

	public static class StructFuncContext extends ParserRuleContext {
		public Token var_dec;
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public CallArgsDefContext callArgsDef() {
			return getRuleContext(CallArgsDefContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public SetGetFuncsContext setGetFuncs() {
			return getRuleContext(SetGetFuncsContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public StructFuncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structFunc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructFunc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructFunc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructFunc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructFuncContext structFunc() throws RecognitionException {
		StructFuncContext _localctx = new StructFuncContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structFunc);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(180);
				match(NEWLINE);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(186);
				type();
				}
				break;
			case VOID:
				{
				setState(187);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(190);
			((StructFuncContext)_localctx).var_dec = match(IDENTIFIER);
			 System.out.print("VarDec : "+(((StructFuncContext)_localctx).var_dec!=null?((StructFuncContext)_localctx).var_dec.getText():null)+"\n");
			setState(192);
			match(LPAR);
			setState(193);
			callArgsDef();
			setState(194);
			match(RPAR);
			setState(195);
			match(BEGIN);
			setState(197); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(199); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(201);
			setGetFuncs();
			setState(203); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(202);
				match(NEWLINE);
				}
				}
				setState(205); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(207);
			match(END);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(208);
					match(NEWLINE);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
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

	public static class SetGetStatementScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<OneLineStatementContext> oneLineStatement() {
			return getRuleContexts(OneLineStatementContext.class);
		}
		public OneLineStatementContext oneLineStatement(int i) {
			return getRuleContext(OneLineStatementContext.class,i);
		}
		public SetGetStatementScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setGetStatementScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetGetStatementScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetGetStatementScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetGetStatementScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetGetStatementScopeContext setGetStatementScope() throws RecognitionException {
		SetGetStatementScopeContext _localctx = new SetGetStatementScopeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_setGetStatementScope);
		int _la;
		try {
			int _alt;
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(BEGIN);
				setState(216); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(215);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(218); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(222);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
						case 1:
							{
							setState(220);
							statement();
							}
							break;
						case 2:
							{
							setState(221);
							oneLineStatement();
							}
							break;
						}
						} 
					}
					setState(226);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(228); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(227);
					match(NEWLINE);
					}
					}
					setState(230); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(232);
				match(END);
				}
				break;
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case WHILE:
			case DO:
			case IF:
			case RETURN:
			case DISPLAY:
			case APPEND:
			case SIZE:
			case TRUE:
			case FALSE:
			case FPTR:
			case LPAR:
			case GT:
			case LT:
			case ASSIGN:
			case EQUAL:
			case AESTRIK:
			case DIVIDE:
			case PLUS:
			case MINUS:
			case AND:
			case OR:
			case TILDE:
			case IDENTIFIER:
			case NUM:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(233);
					statement();
					}
					break;
				case 2:
					{
					setState(234);
					oneLineStatement();
					}
					break;
				}
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

	public static class SetGetFuncsContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(CmmParser.SET, 0); }
		public List<SetGetStatementScopeContext> setGetStatementScope() {
			return getRuleContexts(SetGetStatementScopeContext.class);
		}
		public SetGetStatementScopeContext setGetStatementScope(int i) {
			return getRuleContext(SetGetStatementScopeContext.class,i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetGetFuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setGetFuncs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSetGetFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSetGetFuncs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSetGetFuncs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetGetFuncsContext setGetFuncs() throws RecognitionException {
		SetGetFuncsContext _localctx = new SetGetFuncsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_setGetFuncs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(SET);
			 System.out.print("Setter\n");
			setState(241);
			setGetStatementScope();
			setState(243); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(NEWLINE);
				}
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(247);
			match(GET);
			 System.out.print("Getter\n");
			setState(249);
			setGetStatementScope();
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

	public static class CallArgsDefContext extends ParserRuleContext {
		public List<FuncArgsContext> funcArgs() {
			return getRuleContexts(FuncArgsContext.class);
		}
		public FuncArgsContext funcArgs(int i) {
			return getRuleContext(FuncArgsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public CallArgsDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgsDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCallArgsDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCallArgsDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCallArgsDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsDefContext callArgsDef() throws RecognitionException {
		CallArgsDefContext _localctx = new CallArgsDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callArgsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << FPTR))) != 0)) {
				{
				setState(251);
				funcArgs();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(252);
					match(COMMA);
					setState(253);
					funcArgs();
					}
					}
					setState(258);
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

	public static class FuncArgsContext extends ParserRuleContext {
		public Token arg_dec;
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			type();
			setState(262);
			((FuncArgsContext)_localctx).arg_dec = match(IDENTIFIER);
			 System.out.print("ArgumentDec : "+(((FuncArgsContext)_localctx).arg_dec!=null?((FuncArgsContext)_localctx).arg_dec.getText():null)+"\n");
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

	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public CallStatementContext callStatement() {
			return getRuleContext(CallStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public SizeStatementContext sizeStatement() {
			return getRuleContext(SizeStatementContext.class,0);
		}
		public AppendStatementContext appendStatement() {
			return getRuleContext(AppendStatementContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(265);
					match(NEWLINE);
					}
					} 
				}
				setState(270);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(271);
				varDeclaration();
				}
				break;
			case 2:
				{
				setState(272);
				ifStatement();
				}
				break;
			case 3:
				{
				setState(273);
				assignStatement();
				}
				break;
			case 4:
				{
				setState(274);
				whileStatement();
				}
				break;
			case 5:
				{
				setState(275);
				doWhileStatement();
				}
				break;
			case 6:
				{
				setState(276);
				returnStatement();
				}
				break;
			case 7:
				{
				setState(277);
				callStatement();
				}
				break;
			case 8:
				{
				setState(278);
				displayStatement();
				}
				break;
			case 9:
				{
				setState(279);
				sizeStatement();
				}
				break;
			case 10:
				{
				setState(280);
				appendStatement();
				}
				break;
			}
			setState(286);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(283);
					match(NEWLINE);
					}
					} 
				}
				setState(288);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 24, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(RETURN);
			 System.out.print("Return\n");
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(291);
				expression();
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

	public static class AssignStatementContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			logicalOrExpression();
			setState(295);
			match(ASSIGN);
			setState(296);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public List<StatementScopeContext> statementScope() {
			return getRuleContexts(StatementScopeContext.class);
		}
		public StatementScopeContext statementScope(int i) {
			return getRuleContext(StatementScopeContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 28, RULE_ifStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(IF);
			 System.out.print("Conditional : if\n");
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				{
				setState(300);
				match(LPAR);
				setState(301);
				expression();
				setState(302);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(304);
				expression();
				}
				break;
			}
			setState(307);
			statementScope();
			setState(311);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(NEWLINE);
					}
					} 
				}
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(317);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(314);
				match(ELSE);
				 System.out.print("Conditional : else\n");
				setState(316);
				statementScope();
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

	public static class CallStatementContext extends ParserRuleContext {
		public ParantheseExpressionContext parantheseExpression() {
			return getRuleContext(ParantheseExpressionContext.class,0);
		}
		public CallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallStatementContext callStatement() throws RecognitionException {
		CallStatementContext _localctx = new CallStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_callStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			parantheseExpression();
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
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public StatementScopeContext statementScope() {
			return getRuleContext(StatementScopeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(WHILE);
			 System.out.print("Loop : while\n");
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				{
				setState(323);
				match(LPAR);
				setState(324);
				expression();
				setState(325);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(327);
				expression();
				}
				break;
			}
			setState(330);
			statementScope();
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode DO() { return getToken(CmmParser.DO, 0); }
		public DoWhileStatementScopeContext doWhileStatementScope() {
			return getRuleContext(DoWhileStatementScopeContext.class,0);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(DO);
			 System.out.print("Loop : do...while\n");
			setState(334);
			doWhileStatementScope();
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

	public static class DoWhileStatementScopeContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<OneLineStatementContext> oneLineStatement() {
			return getRuleContexts(OneLineStatementContext.class);
		}
		public OneLineStatementContext oneLineStatement(int i) {
			return getRuleContext(OneLineStatementContext.class,i);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public DoWhileStatementScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatementScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterDoWhileStatementScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitDoWhileStatementScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitDoWhileStatementScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementScopeContext doWhileStatementScope() throws RecognitionException {
		DoWhileStatementScopeContext _localctx = new DoWhileStatementScopeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_doWhileStatementScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(336);
				match(BEGIN);
				setState(337);
				match(NEWLINE);
				setState(343);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(341);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
						case 1:
							{
							setState(338);
							statement();
							}
							break;
						case 2:
							{
							setState(339);
							oneLineStatement();
							}
							break;
						case 3:
							{
							setState(340);
							match(NEWLINE);
							}
							break;
						}
						} 
					}
					setState(345);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				}
				setState(346);
				match(NEWLINE);
				setState(347);
				match(END);
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(348);
					match(NEWLINE);
					}
					}
					setState(353);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NEWLINE:
				{
				setState(355); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(354);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(357); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(359);
					statement();
					}
					break;
				case 2:
					{
					setState(360);
					oneLineStatement();
					}
					break;
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(363);
					match(NEWLINE);
					}
					}
					setState(368);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(371);
			match(WHILE);
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				{
				setState(372);
				match(LPAR);
				setState(373);
				expression();
				setState(374);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(376);
				expression();
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

	public static class DisplayStatementContext extends ParserRuleContext {
		public TerminalNode DISPLAY() { return getToken(CmmParser.DISPLAY, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
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
		enterRule(_localctx, 38, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(DISPLAY);
			 System.out.print("Build-in : display\n");
			setState(381);
			match(LPAR);
			setState(382);
			logicalOrExpression();
			setState(383);
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

	public static class SizeStatementContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(CmmParser.SIZE, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public SizeStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterSizeStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitSizeStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitSizeStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeStatementContext sizeStatement() throws RecognitionException {
		SizeStatementContext _localctx = new SizeStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sizeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(SIZE);
			 System.out.print("Size\n");
			setState(387);
			match(LPAR);
			setState(388);
			match(IDENTIFIER);
			setState(389);
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

	public static class AppendStatementContext extends ParserRuleContext {
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
		public AppendStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAppendStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAppendStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAppendStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AppendStatementContext appendStatement() throws RecognitionException {
		AppendStatementContext _localctx = new AppendStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_appendStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(391);
			match(APPEND);
			 System.out.print("Append\n");
			setState(393);
			match(LPAR);
			setState(394);
			expression();
			setState(395);
			match(COMMA);
			setState(396);
			expression();
			setState(397);
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

	public static class StatementScopeContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<OneLineStatementContext> oneLineStatement() {
			return getRuleContexts(OneLineStatementContext.class);
		}
		public OneLineStatementContext oneLineStatement(int i) {
			return getRuleContext(OneLineStatementContext.class,i);
		}
		public StatementScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementScope; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatementScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatementScope(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatementScope(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementScopeContext statementScope() throws RecognitionException {
		StatementScopeContext _localctx = new StatementScopeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_statementScope);
		int _la;
		try {
			int _alt;
			setState(427);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(BEGIN);
				setState(401); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(400);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(403); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(409);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(407);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
						case 1:
							{
							setState(405);
							statement();
							}
							break;
						case 2:
							{
							setState(406);
							oneLineStatement();
							}
							break;
						}
						} 
					}
					setState(411);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
				}
				setState(413); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(412);
					match(NEWLINE);
					}
					}
					setState(415); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(417);
				match(END);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(419); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(418);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(421); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(425);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(423);
					statement();
					}
					break;
				case 2:
					{
					setState(424);
					oneLineStatement();
					}
					break;
				}
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

	public static class OneLineStatementContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public OneLineStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLineStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOneLineStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOneLineStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOneLineStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneLineStatementContext oneLineStatement() throws RecognitionException {
		OneLineStatementContext _localctx = new OneLineStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_oneLineStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(429);
					match(NEWLINE);
					}
					} 
				}
				setState(434);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			setState(438); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(435);
					statement();
					setState(436);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(440); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					match(NEWLINE);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
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

	public static class ExpressionContext extends ParserRuleContext {
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			assignExpression();
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

	public static class AssignExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public AssignExpressionContext assignExpression() {
			return getRuleContext(AssignExpressionContext.class,0);
		}
		public AssignExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignExpressionContext assignExpression() throws RecognitionException {
		AssignExpressionContext _localctx = new AssignExpressionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_assignExpression);
		try {
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				logicalOrExpression();
				setState(451);
				match(ASSIGN);
				setState(452);
				assignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(454);
				logicalOrExpression();
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

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public List<LogicalAndExpressionContext> logicalAndExpression() {
			return getRuleContexts(LogicalAndExpressionContext.class);
		}
		public LogicalAndExpressionContext logicalAndExpression(int i) {
			return getRuleContext(LogicalAndExpressionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CmmParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CmmParser.OR, i);
		}
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_logicalOrExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			logicalAndExpression();
			setState(464);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(458);
					match(OR);
					setState(459);
					logicalAndExpression();
					 System.out.print("Operator : |\n");
					}
					} 
				}
				setState(466);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
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

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public List<EqualExpressionContext> equalExpression() {
			return getRuleContexts(EqualExpressionContext.class);
		}
		public EqualExpressionContext equalExpression(int i) {
			return getRuleContext(EqualExpressionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CmmParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CmmParser.AND, i);
		}
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_logicalAndExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			equalExpression();
			setState(474);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(468);
					match(AND);
					setState(469);
					equalExpression();
					 System.out.print("Operator : &\n");
					}
					} 
				}
				setState(476);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
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

	public static class EqualExpressionContext extends ParserRuleContext {
		public List<ComparisonExpressionContext> comparisonExpression() {
			return getRuleContexts(ComparisonExpressionContext.class);
		}
		public ComparisonExpressionContext comparisonExpression(int i) {
			return getRuleContext(ComparisonExpressionContext.class,i);
		}
		public List<TerminalNode> EQUAL() { return getTokens(CmmParser.EQUAL); }
		public TerminalNode EQUAL(int i) {
			return getToken(CmmParser.EQUAL, i);
		}
		public EqualExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterEqualExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitEqualExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitEqualExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualExpressionContext equalExpression() throws RecognitionException {
		EqualExpressionContext _localctx = new EqualExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_equalExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			comparisonExpression();
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(478);
					match(EQUAL);
					setState(479);
					comparisonExpression();
					 System.out.print("Operator : ==\n");
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
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

	public static class ComparisonExpressionContext extends ParserRuleContext {
		public List<PlusMinusExpressionContext> plusMinusExpression() {
			return getRuleContexts(PlusMinusExpressionContext.class);
		}
		public PlusMinusExpressionContext plusMinusExpression(int i) {
			return getRuleContext(PlusMinusExpressionContext.class,i);
		}
		public List<TerminalNode> GT() { return getTokens(CmmParser.GT); }
		public TerminalNode GT(int i) {
			return getToken(CmmParser.GT, i);
		}
		public List<TerminalNode> LT() { return getTokens(CmmParser.LT); }
		public TerminalNode LT(int i) {
			return getToken(CmmParser.LT, i);
		}
		public ComparisonExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterComparisonExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitComparisonExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitComparisonExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonExpressionContext comparisonExpression() throws RecognitionException {
		ComparisonExpressionContext _localctx = new ComparisonExpressionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_comparisonExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(487);
			plusMinusExpression();
			setState(498);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(496);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case GT:
						{
						{
						setState(488);
						match(GT);
						}
						setState(489);
						plusMinusExpression();
						 System.out.print("Operator : >\n");
						}
						break;
					case LT:
						{
						{
						setState(492);
						match(LT);
						}
						setState(493);
						plusMinusExpression();
						 System.out.print("Operator : <\n");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(500);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
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

	public static class PlusMinusExpressionContext extends ParserRuleContext {
		public List<MultiplyDivideExpressionContext> multiplyDivideExpression() {
			return getRuleContexts(MultiplyDivideExpressionContext.class);
		}
		public MultiplyDivideExpressionContext multiplyDivideExpression(int i) {
			return getRuleContext(MultiplyDivideExpressionContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CmmParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CmmParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public PlusMinusExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plusMinusExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPlusMinusExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPlusMinusExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPlusMinusExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PlusMinusExpressionContext plusMinusExpression() throws RecognitionException {
		PlusMinusExpressionContext _localctx = new PlusMinusExpressionContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_plusMinusExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			multiplyDivideExpression();
			setState(512);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(510);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						{
						setState(502);
						match(PLUS);
						}
						setState(503);
						multiplyDivideExpression();
						 System.out.print("Operator : +\n");
						}
						break;
					case MINUS:
						{
						{
						setState(506);
						match(MINUS);
						}
						setState(507);
						multiplyDivideExpression();
						 System.out.print("Operator : -\n");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(514);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
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

	public static class MultiplyDivideExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> AESTRIK() { return getTokens(CmmParser.AESTRIK); }
		public TerminalNode AESTRIK(int i) {
			return getToken(CmmParser.AESTRIK, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CmmParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CmmParser.DIVIDE, i);
		}
		public MultiplyDivideExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyDivideExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMultiplyDivideExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMultiplyDivideExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMultiplyDivideExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplyDivideExpressionContext multiplyDivideExpression() throws RecognitionException {
		MultiplyDivideExpressionContext _localctx = new MultiplyDivideExpressionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_multiplyDivideExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			unaryExpression();
			setState(526);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(524);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AESTRIK:
						{
						{
						setState(516);
						match(AESTRIK);
						}
						setState(517);
						unaryExpression();
						 System.out.print("Operator : *\n");
						}
						break;
					case DIVIDE:
						{
						{
						setState(520);
						match(DIVIDE);
						}
						setState(521);
						unaryExpression();
						 System.out.print("Operator : /\n");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(528);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
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

	public static class UnaryExpressionContext extends ParserRuleContext {
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CmmParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CmmParser.MINUS, i);
		}
		public List<TerminalNode> TILDE() { return getTokens(CmmParser.TILDE); }
		public TerminalNode TILDE(int i) {
			return getToken(CmmParser.TILDE, i);
		}
		public RetrieveListExpressionContext retrieveListExpression() {
			return getRuleContext(RetrieveListExpressionContext.class,0);
		}
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_unaryExpression);
		try {
			int _alt;
			setState(543);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(539);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(537);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							{
							setState(529);
							match(MINUS);
							}
							setState(530);
							unaryExpression();
							 System.out.print("Operator : -\n");
							}
							break;
						case TILDE:
							{
							{
							setState(533);
							match(TILDE);
							}
							setState(534);
							unaryExpression();
							 System.out.print("Operator : ~\n");
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						} 
					}
					setState(541);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				retrieveListExpression();
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

	public static class RetrieveListExpressionContext extends ParserRuleContext {
		public AccessMemberExpressionContext accessMemberExpression() {
			return getRuleContext(AccessMemberExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<RetrieveListExpressionContext> retrieveListExpression() {
			return getRuleContexts(RetrieveListExpressionContext.class);
		}
		public RetrieveListExpressionContext retrieveListExpression(int i) {
			return getRuleContext(RetrieveListExpressionContext.class,i);
		}
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public RetrieveListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retrieveListExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterRetrieveListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitRetrieveListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitRetrieveListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RetrieveListExpressionContext retrieveListExpression() throws RecognitionException {
		RetrieveListExpressionContext _localctx = new RetrieveListExpressionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_retrieveListExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(545);
			accessMemberExpression();
			setState(552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(546);
				match(LBRACKET);
				setState(547);
				expression();
				setState(548);
				match(RBRACKET);
				}
				}
				setState(554);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(559);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(555);
					match(DOT);
					setState(556);
					retrieveListExpression();
					}
					} 
				}
				setState(561);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class AccessMemberExpressionContext extends ParserRuleContext {
		public ParantheseExpressionContext parantheseExpression() {
			return getRuleContext(ParantheseExpressionContext.class,0);
		}
		public List<TerminalNode> DOT() { return getTokens(CmmParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(CmmParser.DOT, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(CmmParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(CmmParser.IDENTIFIER, i);
		}
		public AccessMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAccessMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAccessMemberExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAccessMemberExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AccessMemberExpressionContext accessMemberExpression() throws RecognitionException {
		AccessMemberExpressionContext _localctx = new AccessMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_accessMemberExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			parantheseExpression();
			setState(567);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(563);
					match(DOT);
					setState(564);
					match(IDENTIFIER);
					}
					} 
				}
				setState(569);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,69,_ctx);
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

	public static class ParantheseExpressionContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public List<TerminalNode> LPAR() { return getTokens(CmmParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(CmmParser.LPAR, i);
		}
		public List<CallArgsContext> callArgs() {
			return getRuleContexts(CallArgsContext.class);
		}
		public CallArgsContext callArgs(int i) {
			return getRuleContext(CallArgsContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(CmmParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(CmmParser.RPAR, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParantheseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parantheseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterParantheseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitParantheseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitParantheseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParantheseExpressionContext parantheseExpression() throws RecognitionException {
		ParantheseExpressionContext _localctx = new ParantheseExpressionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_parantheseExpression);
		try {
			int _alt;
			setState(585);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case APPEND:
			case SIZE:
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(570);
				valueExpression();
				setState(578);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(571);
						match(LPAR);
						setState(572);
						callArgs();
						setState(573);
						match(RPAR);
						 System.out.print("FunctionCall\n");
						}
						} 
					}
					setState(580);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
				}
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(LPAR);
				setState(582);
				expression();
				setState(583);
				match(RPAR);
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

	public static class CallArgsContext extends ParserRuleContext {
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
		public CallArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterCallArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitCallArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitCallArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgsContext callArgs() throws RecognitionException {
		CallArgsContext _localctx = new CallArgsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_callArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(595);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(587);
				expression();
				setState(592);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(588);
					match(COMMA);
					setState(589);
					expression();
					}
					}
					setState(594);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class ValueExpressionContext extends ParserRuleContext {
		public BoolValueContext boolValue() {
			return getRuleContext(BoolValueContext.class,0);
		}
		public TerminalNode NUM() { return getToken(CmmParser.NUM, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public SizeStatementContext sizeStatement() {
			return getRuleContext(SizeStatementContext.class,0);
		}
		public AppendStatementContext appendStatement() {
			return getRuleContext(AppendStatementContext.class,0);
		}
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_valueExpression);
		try {
			setState(602);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(597);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(598);
				match(NUM);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				match(IDENTIFIER);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(600);
				sizeStatement();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(601);
				appendStatement();
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<VarDecNameContext> varDecName() {
			return getRuleContexts(VarDecNameContext.class);
		}
		public VarDecNameContext varDecName(int i) {
			return getRuleContext(VarDecNameContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_varDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(604);
				match(NEWLINE);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			type();
			{
			setState(611);
			varDecName();
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(612);
				match(ASSIGN);
				setState(613);
				expression();
				}
				break;
			}
			}
			setState(624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(616);
				match(COMMA);
				{
				setState(617);
				varDecName();
				setState(620);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(618);
					match(ASSIGN);
					setState(619);
					expression();
					}
					break;
				}
				}
				}
				}
				setState(626);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(627);
				match(SEMICOLON);
				}
				break;
			}
			setState(633);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(630);
					match(NEWLINE);
					}
					} 
				}
				setState(635);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
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

	public static class OneLineVarDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CmmParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CmmParser.SEMICOLON, i);
		}
		public List<VarDecNameContext> varDecName() {
			return getRuleContexts(VarDecNameContext.class);
		}
		public VarDecNameContext varDecName(int i) {
			return getRuleContext(VarDecNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OneLineVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneLineVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterOneLineVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitOneLineVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitOneLineVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneLineVarDeclarationContext oneLineVarDeclaration() throws RecognitionException {
		OneLineVarDeclarationContext _localctx = new OneLineVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_oneLineVarDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(636);
				match(NEWLINE);
				}
				}
				setState(641);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(661); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(642);
					type();
					{
					setState(643);
					varDecName();
					setState(646);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(644);
						match(ASSIGN);
						setState(645);
						expression();
						}
					}

					}
					setState(656);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(648);
						match(COMMA);
						{
						setState(649);
						varDecName();
						setState(652);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(650);
							match(ASSIGN);
							setState(651);
							expression();
							}
						}

						}
						}
						}
						setState(658);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(659);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(663); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,85,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(668);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(665);
					match(NEWLINE);
					}
					} 
				}
				setState(670);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,86,_ctx);
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

	public static class VarDecNameContext extends ParserRuleContext {
		public Token var_dec;
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public VarDecNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDecName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDecName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDecName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDecNameContext varDecName() throws RecognitionException {
		VarDecNameContext _localctx = new VarDecNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_varDecName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			((VarDecNameContext)_localctx).var_dec = match(IDENTIFIER);
			 System.out.print("VarDec : "+(((VarDecNameContext)_localctx).var_dec!=null?((VarDecNameContext)_localctx).var_dec.getText():null)+"\n");
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
		public TerminalNode NUM() { return getToken(CmmParser.NUM, 0); }
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
		enterRule(_localctx, 82, RULE_value);
		try {
			setState(676);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(674);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(675);
				match(NUM);
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
		enterRule(_localctx, 84, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(678);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	public static class TypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public FptrTypeContext fptrType() {
			return getRuleContext(FptrTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
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
		enterRule(_localctx, 86, RULE_type);
		try {
			setState(684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				primitiveType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(681);
				listType();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				fptrType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				structType();
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

	public static class ListTypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(CmmParser.LIST, 0); }
		public TerminalNode SHARP() { return getToken(CmmParser.SHARP, 0); }
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public ListTypeContext listType() {
			return getRuleContext(ListTypeContext.class,0);
		}
		public ListTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterListType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitListType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitListType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListTypeContext listType() throws RecognitionException {
		ListTypeContext _localctx = new ListTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(686);
			match(LIST);
			setState(687);
			match(SHARP);
			setState(691);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				{
				setState(688);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(689);
				structType();
				}
				break;
			case LIST:
				{
				setState(690);
				listType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(CmmParser.BOOL, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			_la = _input.LA(1);
			if ( !(_la==INT || _la==BOOL) ) {
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

	public static class FptrTypeContext extends ParserRuleContext {
		public TerminalNode FPTR() { return getToken(CmmParser.FPTR, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode ARROW() { return getToken(CmmParser.ARROW, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> VOID() { return getTokens(CmmParser.VOID); }
		public TerminalNode VOID(int i) {
			return getToken(CmmParser.VOID, i);
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
		enterRule(_localctx, 92, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			match(FPTR);
			setState(696);
			match(LT);
			setState(706);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(697);
				type();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(698);
					match(COMMA);
					setState(699);
					type();
					}
					}
					setState(704);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case VOID:
				{
				setState(705);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(708);
			match(ARROW);
			setState(711);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(709);
				type();
				}
				break;
			case VOID:
				{
				setState(710);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(713);
			match(GT);
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

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(715);
			match(STRUCT);
			setState(716);
			match(IDENTIFIER);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u02d1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\7\2e\n\2\f\2\16\2h"+
		"\13\2\3\2\3\2\7\2l\n\2\f\2\16\2o\13\2\3\2\3\2\7\2s\n\2\f\2\16\2v\13\2"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\u0082\n\4\r\4\16\4\u0083"+
		"\3\4\3\4\6\4\u0088\n\4\r\4\16\4\u0089\3\4\6\4\u008d\n\4\r\4\16\4\u008e"+
		"\3\4\3\4\3\5\3\5\5\5\u0095\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\6\7\u00a5\n\7\r\7\16\7\u00a6\3\7\3\7\3\7\6\7\u00ac\n"+
		"\7\r\7\16\7\u00ad\3\7\6\7\u00b1\n\7\r\7\16\7\u00b2\3\7\3\7\3\b\7\b\u00b8"+
		"\n\b\f\b\16\b\u00bb\13\b\3\b\3\b\5\b\u00bf\n\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\6\b\u00c8\n\b\r\b\16\b\u00c9\3\b\3\b\6\b\u00ce\n\b\r\b\16\b\u00cf"+
		"\3\b\3\b\7\b\u00d4\n\b\f\b\16\b\u00d7\13\b\3\t\3\t\6\t\u00db\n\t\r\t\16"+
		"\t\u00dc\3\t\3\t\7\t\u00e1\n\t\f\t\16\t\u00e4\13\t\3\t\6\t\u00e7\n\t\r"+
		"\t\16\t\u00e8\3\t\3\t\3\t\5\t\u00ee\n\t\5\t\u00f0\n\t\3\n\3\n\3\n\3\n"+
		"\6\n\u00f6\n\n\r\n\16\n\u00f7\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13\u0101"+
		"\n\13\f\13\16\13\u0104\13\13\5\13\u0106\n\13\3\f\3\f\3\f\3\f\3\r\7\r\u010d"+
		"\n\r\f\r\16\r\u0110\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u011c"+
		"\n\r\3\r\7\r\u011f\n\r\f\r\16\r\u0122\13\r\3\16\3\16\3\16\5\16\u0127\n"+
		"\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u0134"+
		"\n\20\3\20\3\20\7\20\u0138\n\20\f\20\16\20\u013b\13\20\3\20\3\20\3\20"+
		"\5\20\u0140\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u014b"+
		"\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\7\24\u0158"+
		"\n\24\f\24\16\24\u015b\13\24\3\24\3\24\3\24\7\24\u0160\n\24\f\24\16\24"+
		"\u0163\13\24\3\24\6\24\u0166\n\24\r\24\16\24\u0167\3\24\3\24\5\24\u016c"+
		"\n\24\3\24\7\24\u016f\n\24\f\24\16\24\u0172\13\24\5\24\u0174\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\5\24\u017c\n\24\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\30\3\30\6\30\u0194\n\30\r\30\16\30\u0195\3\30\3\30\7\30\u019a\n\30"+
		"\f\30\16\30\u019d\13\30\3\30\6\30\u01a0\n\30\r\30\16\30\u01a1\3\30\3\30"+
		"\6\30\u01a6\n\30\r\30\16\30\u01a7\3\30\3\30\5\30\u01ac\n\30\5\30\u01ae"+
		"\n\30\3\31\7\31\u01b1\n\31\f\31\16\31\u01b4\13\31\3\31\3\31\3\31\6\31"+
		"\u01b9\n\31\r\31\16\31\u01ba\3\31\7\31\u01be\n\31\f\31\16\31\u01c1\13"+
		"\31\3\32\3\32\3\33\3\33\3\33\3\33\3\33\5\33\u01ca\n\33\3\34\3\34\3\34"+
		"\3\34\3\34\7\34\u01d1\n\34\f\34\16\34\u01d4\13\34\3\35\3\35\3\35\3\35"+
		"\3\35\7\35\u01db\n\35\f\35\16\35\u01de\13\35\3\36\3\36\3\36\3\36\3\36"+
		"\7\36\u01e5\n\36\f\36\16\36\u01e8\13\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\7\37\u01f3\n\37\f\37\16\37\u01f6\13\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \7 \u0201\n \f \16 \u0204\13 \3!\3!\3!\3!\3!\3!\3!\3!\3!\7"+
		"!\u020f\n!\f!\16!\u0212\13!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u021c"+
		"\n\"\f\"\16\"\u021f\13\"\3\"\5\"\u0222\n\"\3#\3#\3#\3#\3#\7#\u0229\n#"+
		"\f#\16#\u022c\13#\3#\3#\7#\u0230\n#\f#\16#\u0233\13#\3$\3$\3$\7$\u0238"+
		"\n$\f$\16$\u023b\13$\3%\3%\3%\3%\3%\3%\7%\u0243\n%\f%\16%\u0246\13%\3"+
		"%\3%\3%\3%\5%\u024c\n%\3&\3&\3&\7&\u0251\n&\f&\16&\u0254\13&\5&\u0256"+
		"\n&\3\'\3\'\3\'\3\'\3\'\5\'\u025d\n\'\3(\7(\u0260\n(\f(\16(\u0263\13("+
		"\3(\3(\3(\3(\5(\u0269\n(\3(\3(\3(\3(\5(\u026f\n(\7(\u0271\n(\f(\16(\u0274"+
		"\13(\3(\5(\u0277\n(\3(\7(\u027a\n(\f(\16(\u027d\13(\3)\7)\u0280\n)\f)"+
		"\16)\u0283\13)\3)\3)\3)\3)\5)\u0289\n)\3)\3)\3)\3)\5)\u028f\n)\7)\u0291"+
		"\n)\f)\16)\u0294\13)\3)\3)\6)\u0298\n)\r)\16)\u0299\3)\7)\u029d\n)\f)"+
		"\16)\u02a0\13)\3*\3*\3*\3+\3+\5+\u02a7\n+\3,\3,\3-\3-\3-\3-\5-\u02af\n"+
		"-\3.\3.\3.\3.\3.\5.\u02b6\n.\3/\3/\3\60\3\60\3\60\3\60\3\60\7\60\u02bf"+
		"\n\60\f\60\16\60\u02c2\13\60\3\60\5\60\u02c5\n\60\3\60\3\60\3\60\5\60"+
		"\u02ca\n\60\3\60\3\60\3\61\3\61\3\61\3\61\2\2\62\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`\2\4\3\2"+
		"\25\26\3\2\5\6\2\u030d\2f\3\2\2\2\4y\3\2\2\2\6\177\3\2\2\2\b\u0094\3\2"+
		"\2\2\n\u009d\3\2\2\2\f\u00a2\3\2\2\2\16\u00b9\3\2\2\2\20\u00ef\3\2\2\2"+
		"\22\u00f1\3\2\2\2\24\u0105\3\2\2\2\26\u0107\3\2\2\2\30\u010e\3\2\2\2\32"+
		"\u0123\3\2\2\2\34\u0128\3\2\2\2\36\u012c\3\2\2\2 \u0141\3\2\2\2\"\u0143"+
		"\3\2\2\2$\u014e\3\2\2\2&\u0173\3\2\2\2(\u017d\3\2\2\2*\u0183\3\2\2\2,"+
		"\u0189\3\2\2\2.\u01ad\3\2\2\2\60\u01b2\3\2\2\2\62\u01c2\3\2\2\2\64\u01c9"+
		"\3\2\2\2\66\u01cb\3\2\2\28\u01d5\3\2\2\2:\u01df\3\2\2\2<\u01e9\3\2\2\2"+
		">\u01f7\3\2\2\2@\u0205\3\2\2\2B\u0221\3\2\2\2D\u0223\3\2\2\2F\u0234\3"+
		"\2\2\2H\u024b\3\2\2\2J\u0255\3\2\2\2L\u025c\3\2\2\2N\u0261\3\2\2\2P\u0281"+
		"\3\2\2\2R\u02a1\3\2\2\2T\u02a6\3\2\2\2V\u02a8\3\2\2\2X\u02ae\3\2\2\2Z"+
		"\u02b0\3\2\2\2\\\u02b7\3\2\2\2^\u02b9\3\2\2\2`\u02cd\3\2\2\2be\5\n\6\2"+
		"ce\7\60\2\2db\3\2\2\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2gm\3\2\2"+
		"\2hf\3\2\2\2il\5\b\5\2jl\7\60\2\2ki\3\2\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2"+
		"\2\2mn\3\2\2\2np\3\2\2\2om\3\2\2\2pt\5\4\3\2qs\7\60\2\2rq\3\2\2\2sv\3"+
		"\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\2\2\3x\3\3\2\2\2yz"+
		"\7\4\2\2z{\b\3\1\2{|\7\31\2\2|}\7\32\2\2}~\5\6\4\2~\5\3\2\2\2\177\u0081"+
		"\7\20\2\2\u0080\u0082\7\60\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2"+
		"\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0088"+
		"\5\30\r\2\u0086\u0088\5\60\31\2\u0087\u0085\3\2\2\2\u0087\u0086\3\2\2"+
		"\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c"+
		"\3\2\2\2\u008b\u008d\7\60\2\2\u008c\u008b\3\2\2\2\u008d\u008e\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091"+
		"\7\21\2\2\u0091\7\3\2\2\2\u0092\u0095\5X-\2\u0093\u0095\7\b\2\2\u0094"+
		"\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\7-"+
		"\2\2\u0097\u0098\b\5\1\2\u0098\u0099\7\31\2\2\u0099\u009a\5\24\13\2\u009a"+
		"\u009b\7\32\2\2\u009b\u009c\5.\30\2\u009c\t\3\2\2\2\u009d\u009e\7\3\2"+
		"\2\u009e\u009f\7-\2\2\u009f\u00a0\b\6\1\2\u00a0\u00a1\5\f\7\2\u00a1\13"+
		"\3\2\2\2\u00a2\u00a4\7\20\2\2\u00a3\u00a5\7\60\2\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00ab"+
		"\3\2\2\2\u00a8\u00ac\5N(\2\u00a9\u00ac\5\16\b\2\u00aa\u00ac\5P)\2\u00ab"+
		"\u00a8\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00b0\3\2\2\2\u00af"+
		"\u00b1\7\60\2\2\u00b0\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b0\3"+
		"\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\7\21\2\2\u00b5"+
		"\r\3\2\2\2\u00b6\u00b8\7\60\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2"+
		"\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00be\3\2\2\2\u00bb\u00b9"+
		"\3\2\2\2\u00bc\u00bf\5X-\2\u00bd\u00bf\7\b\2\2\u00be\u00bc\3\2\2\2\u00be"+
		"\u00bd\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\7-\2\2\u00c1\u00c2\b\b"+
		"\1\2\u00c2\u00c3\7\31\2\2\u00c3\u00c4\5\24\13\2\u00c4\u00c5\7\32\2\2\u00c5"+
		"\u00c7\7\20\2\2\u00c6\u00c8\7\60\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3"+
		"\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb"+
		"\u00cd\5\22\n\2\u00cc\u00ce\7\60\2\2\u00cd\u00cc\3\2\2\2\u00ce\u00cf\3"+
		"\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1"+
		"\u00d5\7\21\2\2\u00d2\u00d4\7\60\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3"+
		"\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\17\3\2\2\2\u00d7"+
		"\u00d5\3\2\2\2\u00d8\u00da\7\20\2\2\u00d9\u00db\7\60\2\2\u00da\u00d9\3"+
		"\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00e2\3\2\2\2\u00de\u00e1\5\30\r\2\u00df\u00e1\5\60\31\2\u00e0\u00de"+
		"\3\2\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e2"+
		"\u00e3\3\2\2\2\u00e3\u00e6\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7\60"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8"+
		"\u00e9\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00f0\7\21\2\2\u00eb\u00ee\5"+
		"\30\r\2\u00ec\u00ee\5\60\31\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2"+
		"\u00ee\u00f0\3\2\2\2\u00ef\u00d8\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\21"+
		"\3\2\2\2\u00f1\u00f2\7\17\2\2\u00f2\u00f3\b\n\1\2\u00f3\u00f5\5\20\t\2"+
		"\u00f4\u00f6\7\60\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\16\2\2"+
		"\u00fa\u00fb\b\n\1\2\u00fb\u00fc\5\20\t\2\u00fc\23\3\2\2\2\u00fd\u0102"+
		"\5\26\f\2\u00fe\u00ff\7\37\2\2\u00ff\u0101\5\26\f\2\u0100\u00fe\3\2\2"+
		"\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0106"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\25\3\2\2\2\u0107\u0108\5X-\2\u0108\u0109\7-\2\2\u0109\u010a\b\f\1\2\u010a"+
		"\27\3\2\2\2\u010b\u010d\7\60\2\2\u010c\u010b\3\2\2\2\u010d\u0110\3\2\2"+
		"\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u011b\3\2\2\2\u0110\u010e"+
		"\3\2\2\2\u0111\u011c\5N(\2\u0112\u011c\5\36\20\2\u0113\u011c\5\34\17\2"+
		"\u0114\u011c\5\"\22\2\u0115\u011c\5$\23\2\u0116\u011c\5\32\16\2\u0117"+
		"\u011c\5 \21\2\u0118\u011c\5(\25\2\u0119\u011c\5*\26\2\u011a\u011c\5,"+
		"\27\2\u011b\u0111\3\2\2\2\u011b\u0112\3\2\2\2\u011b\u0113\3\2\2\2\u011b"+
		"\u0114\3\2\2\2\u011b\u0115\3\2\2\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2"+
		"\2\2\u011b\u0118\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011a\3\2\2\2\u011c"+
		"\u0120\3\2\2\2\u011d\u011f\7\60\2\2\u011e\u011d\3\2\2\2\u011f\u0122\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\31\3\2\2\2\u0122"+
		"\u0120\3\2\2\2\u0123\u0124\7\r\2\2\u0124\u0126\b\16\1\2\u0125\u0127\5"+
		"\62\32\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127\33\3\2\2\2\u0128"+
		"\u0129\5\66\34\2\u0129\u012a\7#\2\2\u012a\u012b\5\62\32\2\u012b\35\3\2"+
		"\2\2\u012c\u012d\7\13\2\2\u012d\u0133\b\20\1\2\u012e\u012f\7\31\2\2\u012f"+
		"\u0130\5\62\32\2\u0130\u0131\7\32\2\2\u0131\u0134\3\2\2\2\u0132\u0134"+
		"\5\62\32\2\u0133\u012e\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0135\3\2\2\2"+
		"\u0135\u0139\5.\30\2\u0136\u0138\7\60\2\2\u0137\u0136\3\2\2\2\u0138\u013b"+
		"\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013f\3\2\2\2\u013b"+
		"\u0139\3\2\2\2\u013c\u013d\7\f\2\2\u013d\u013e\b\20\1\2\u013e\u0140\5"+
		".\30\2\u013f\u013c\3\2\2\2\u013f\u0140\3\2\2\2\u0140\37\3\2\2\2\u0141"+
		"\u0142\5H%\2\u0142!\3\2\2\2\u0143\u0144\7\t\2\2\u0144\u014a\b\22\1\2\u0145"+
		"\u0146\7\31\2\2\u0146\u0147\5\62\32\2\u0147\u0148\7\32\2\2\u0148\u014b"+
		"\3\2\2\2\u0149\u014b\5\62\32\2\u014a\u0145\3\2\2\2\u014a\u0149\3\2\2\2"+
		"\u014b\u014c\3\2\2\2\u014c\u014d\5.\30\2\u014d#\3\2\2\2\u014e\u014f\7"+
		"\n\2\2\u014f\u0150\b\23\1\2\u0150\u0151\5&\24\2\u0151%\3\2\2\2\u0152\u0153"+
		"\7\20\2\2\u0153\u0159\7\60\2\2\u0154\u0158\5\30\r\2\u0155\u0158\5\60\31"+
		"\2\u0156\u0158\7\60\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2"+
		"\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c\u015d\7\60\2\2\u015d"+
		"\u0161\7\21\2\2\u015e\u0160\7\60\2\2\u015f\u015e\3\2\2\2\u0160\u0163\3"+
		"\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u0174\3\2\2\2\u0163"+
		"\u0161\3\2\2\2\u0164\u0166\7\60\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3"+
		"\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u016b\3\2\2\2\u0169"+
		"\u016c\5\30\r\2\u016a\u016c\5\60\31\2\u016b\u0169\3\2\2\2\u016b\u016a"+
		"\3\2\2\2\u016c\u0170\3\2\2\2\u016d\u016f\7\60\2\2\u016e\u016d\3\2\2\2"+
		"\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0152\3\2\2\2\u0173\u0165\3\2\2\2\u0174"+
		"\u0175\3\2\2\2\u0175\u017b\7\t\2\2\u0176\u0177\7\31\2\2\u0177\u0178\5"+
		"\62\32\2\u0178\u0179\7\32\2\2\u0179\u017c\3\2\2\2\u017a\u017c\5\62\32"+
		"\2\u017b\u0176\3\2\2\2\u017b\u017a\3\2\2\2\u017c\'\3\2\2\2\u017d\u017e"+
		"\7\22\2\2\u017e\u017f\b\25\1\2\u017f\u0180\7\31\2\2\u0180\u0181\5\66\34"+
		"\2\u0181\u0182\7\32\2\2\u0182)\3\2\2\2\u0183\u0184\7\24\2\2\u0184\u0185"+
		"\b\26\1\2\u0185\u0186\7\31\2\2\u0186\u0187\7-\2\2\u0187\u0188\7\32\2\2"+
		"\u0188+\3\2\2\2\u0189\u018a\7\23\2\2\u018a\u018b\b\27\1\2\u018b\u018c"+
		"\7\31\2\2\u018c\u018d\5\62\32\2\u018d\u018e\7\37\2\2\u018e\u018f\5\62"+
		"\32\2\u018f\u0190\7\32\2\2\u0190-\3\2\2\2\u0191\u0193\7\20\2\2\u0192\u0194"+
		"\7\60\2\2\u0193\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2"+
		"\u0195\u0196\3\2\2\2\u0196\u019b\3\2\2\2\u0197\u019a\5\30\r\2\u0198\u019a"+
		"\5\60\31\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a\u019d\3\2\2\2"+
		"\u019b\u0199\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019e\u01a0\7\60\2\2\u019f\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2"+
		"\u01a1\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01ae"+
		"\7\21\2\2\u01a4\u01a6\7\60\2\2\u01a5\u01a4\3\2\2\2\u01a6\u01a7\3\2\2\2"+
		"\u01a7\u01a5\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01ac"+
		"\5\30\r\2\u01aa\u01ac\5\60\31\2\u01ab\u01a9\3\2\2\2\u01ab\u01aa\3\2\2"+
		"\2\u01ac\u01ae\3\2\2\2\u01ad\u0191\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ae/"+
		"\3\2\2\2\u01af\u01b1\7\60\2\2\u01b0\u01af\3\2\2\2\u01b1\u01b4\3\2\2\2"+
		"\u01b2\u01b0\3\2\2\2\u01b2\u01b3\3\2\2\2\u01b3\u01b8\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b5\u01b6\5\30\r\2\u01b6\u01b7\7\35\2\2\u01b7\u01b9\3\2\2\2"+
		"\u01b8\u01b5\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb"+
		"\3\2\2\2\u01bb\u01bf\3\2\2\2\u01bc\u01be\7\60\2\2\u01bd\u01bc\3\2\2\2"+
		"\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\61"+
		"\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3\5\64\33\2\u01c3\63\3\2\2\2\u01c4"+
		"\u01c5\5\66\34\2\u01c5\u01c6\7#\2\2\u01c6\u01c7\5\64\33\2\u01c7\u01ca"+
		"\3\2\2\2\u01c8\u01ca\5\66\34\2\u01c9\u01c4\3\2\2\2\u01c9\u01c8\3\2\2\2"+
		"\u01ca\65\3\2\2\2\u01cb\u01d2\58\35\2\u01cc\u01cd\7*\2\2\u01cd\u01ce\5"+
		"8\35\2\u01ce\u01cf\b\34\1\2\u01cf\u01d1\3\2\2\2\u01d0\u01cc\3\2\2\2\u01d1"+
		"\u01d4\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\67\3\2\2"+
		"\2\u01d4\u01d2\3\2\2\2\u01d5\u01dc\5:\36\2\u01d6\u01d7\7)\2\2\u01d7\u01d8"+
		"\5:\36\2\u01d8\u01d9\b\35\1\2\u01d9\u01db\3\2\2\2\u01da\u01d6\3\2\2\2"+
		"\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd9\3"+
		"\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e6\5<\37\2\u01e0\u01e1\7$\2\2\u01e1"+
		"\u01e2\5<\37\2\u01e2\u01e3\b\36\1\2\u01e3\u01e5\3\2\2\2\u01e4\u01e0\3"+
		"\2\2\2\u01e5\u01e8\3\2\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7"+
		";\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e9\u01f4\5> \2\u01ea\u01eb\7!\2\2\u01eb"+
		"\u01ec\5> \2\u01ec\u01ed\b\37\1\2\u01ed\u01f3\3\2\2\2\u01ee\u01ef\7\""+
		"\2\2\u01ef\u01f0\5> \2\u01f0\u01f1\b\37\1\2\u01f1\u01f3\3\2\2\2\u01f2"+
		"\u01ea\3\2\2\2\u01f2\u01ee\3\2\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5=\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u0202"+
		"\5@!\2\u01f8\u01f9\7\'\2\2\u01f9\u01fa\5@!\2\u01fa\u01fb\b \1\2\u01fb"+
		"\u0201\3\2\2\2\u01fc\u01fd\7(\2\2\u01fd\u01fe\5@!\2\u01fe\u01ff\b \1\2"+
		"\u01ff\u0201\3\2\2\2\u0200\u01f8\3\2\2\2\u0200\u01fc\3\2\2\2\u0201\u0204"+
		"\3\2\2\2\u0202\u0200\3\2\2\2\u0202\u0203\3\2\2\2\u0203?\3\2\2\2\u0204"+
		"\u0202\3\2\2\2\u0205\u0210\5B\"\2\u0206\u0207\7%\2\2\u0207\u0208\5B\""+
		"\2\u0208\u0209\b!\1\2\u0209\u020f\3\2\2\2\u020a\u020b\7&\2\2\u020b\u020c"+
		"\5B\"\2\u020c\u020d\b!\1\2\u020d\u020f\3\2\2\2\u020e\u0206\3\2\2\2\u020e"+
		"\u020a\3\2\2\2\u020f\u0212\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u0211\3\2"+
		"\2\2\u0211A\3\2\2\2\u0212\u0210\3\2\2\2\u0213\u0214\7(\2\2\u0214\u0215"+
		"\5B\"\2\u0215\u0216\b\"\1\2\u0216\u021c\3\2\2\2\u0217\u0218\7+\2\2\u0218"+
		"\u0219\5B\"\2\u0219\u021a\b\"\1\2\u021a\u021c\3\2\2\2\u021b\u0213\3\2"+
		"\2\2\u021b\u0217\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d"+
		"\u021e\3\2\2\2\u021e\u0222\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0222\5D"+
		"#\2\u0221\u021d\3\2\2\2\u0221\u0220\3\2\2\2\u0222C\3\2\2\2\u0223\u022a"+
		"\5F$\2\u0224\u0225\7\33\2\2\u0225\u0226\5\62\32\2\u0226\u0227\7\34\2\2"+
		"\u0227\u0229\3\2\2\2\u0228\u0224\3\2\2\2\u0229\u022c\3\2\2\2\u022a\u0228"+
		"\3\2\2\2\u022a\u022b\3\2\2\2\u022b\u0231\3\2\2\2\u022c\u022a\3\2\2\2\u022d"+
		"\u022e\7\36\2\2\u022e\u0230\5D#\2\u022f\u022d\3\2\2\2\u0230\u0233\3\2"+
		"\2\2\u0231\u022f\3\2\2\2\u0231\u0232\3\2\2\2\u0232E\3\2\2\2\u0233\u0231"+
		"\3\2\2\2\u0234\u0239\5H%\2\u0235\u0236\7\36\2\2\u0236\u0238\7-\2\2\u0237"+
		"\u0235\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a\3\2"+
		"\2\2\u023aG\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u0244\5L\'\2\u023d\u023e"+
		"\7\31\2\2\u023e\u023f\5J&\2\u023f\u0240\7\32\2\2\u0240\u0241\b%\1\2\u0241"+
		"\u0243\3\2\2\2\u0242\u023d\3\2\2\2\u0243\u0246\3\2\2\2\u0244\u0242\3\2"+
		"\2\2\u0244\u0245\3\2\2\2\u0245\u024c\3\2\2\2\u0246\u0244\3\2\2\2\u0247"+
		"\u0248\7\31\2\2\u0248\u0249\5\62\32\2\u0249\u024a\7\32\2\2\u024a\u024c"+
		"\3\2\2\2\u024b\u023c\3\2\2\2\u024b\u0247\3\2\2\2\u024cI\3\2\2\2\u024d"+
		"\u0252\5\62\32\2\u024e\u024f\7\37\2\2\u024f\u0251\5\62\32\2\u0250\u024e"+
		"\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0256\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u024d\3\2\2\2\u0255\u0256\3\2"+
		"\2\2\u0256K\3\2\2\2\u0257\u025d\5V,\2\u0258\u025d\7.\2\2\u0259\u025d\7"+
		"-\2\2\u025a\u025d\5*\26\2\u025b\u025d\5,\27\2\u025c\u0257\3\2\2\2\u025c"+
		"\u0258\3\2\2\2\u025c\u0259\3\2\2\2\u025c\u025a\3\2\2\2\u025c\u025b\3\2"+
		"\2\2\u025dM\3\2\2\2\u025e\u0260\7\60\2\2\u025f\u025e\3\2\2\2\u0260\u0263"+
		"\3\2\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263"+
		"\u0261\3\2\2\2\u0264\u0265\5X-\2\u0265\u0268\5R*\2\u0266\u0267\7#\2\2"+
		"\u0267\u0269\5\62\32\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269\u0272"+
		"\3\2\2\2\u026a\u026b\7\37\2\2\u026b\u026e\5R*\2\u026c\u026d\7#\2\2\u026d"+
		"\u026f\5\62\32\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271\3"+
		"\2\2\2\u0270\u026a\3\2\2\2\u0271\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272"+
		"\u0273\3\2\2\2\u0273\u0276\3\2\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7\35"+
		"\2\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027b\3\2\2\2\u0278"+
		"\u027a\7\60\2\2\u0279\u0278\3\2\2\2\u027a\u027d\3\2\2\2\u027b\u0279\3"+
		"\2\2\2\u027b\u027c\3\2\2\2\u027cO\3\2\2\2\u027d\u027b\3\2\2\2\u027e\u0280"+
		"\7\60\2\2\u027f\u027e\3\2\2\2\u0280\u0283\3\2\2\2\u0281\u027f\3\2\2\2"+
		"\u0281\u0282\3\2\2\2\u0282\u0297\3\2\2\2\u0283\u0281\3\2\2\2\u0284\u0285"+
		"\5X-\2\u0285\u0288\5R*\2\u0286\u0287\7#\2\2\u0287\u0289\5\62\32\2\u0288"+
		"\u0286\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u0292\3\2\2\2\u028a\u028b\7\37"+
		"\2\2\u028b\u028e\5R*\2\u028c\u028d\7#\2\2\u028d\u028f\5\62\32\2\u028e"+
		"\u028c\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0291\3\2\2\2\u0290\u028a\3\2"+
		"\2\2\u0291\u0294\3\2\2\2\u0292\u0290\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0295\3\2\2\2\u0294\u0292\3\2\2\2\u0295\u0296\7\35\2\2\u0296\u0298\3"+
		"\2\2\2\u0297\u0284\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029e\3\2\2\2\u029b\u029d\7\60\2\2\u029c\u029b\3"+
		"\2\2\2\u029d\u02a0\3\2\2\2\u029e\u029c\3\2\2\2\u029e\u029f\3\2\2\2\u029f"+
		"Q\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02a2\7-\2\2\u02a2\u02a3\b*\1\2\u02a3"+
		"S\3\2\2\2\u02a4\u02a7\5V,\2\u02a5\u02a7\7.\2\2\u02a6\u02a4\3\2\2\2\u02a6"+
		"\u02a5\3\2\2\2\u02a7U\3\2\2\2\u02a8\u02a9\t\2\2\2\u02a9W\3\2\2\2\u02aa"+
		"\u02af\5\\/\2\u02ab\u02af\5Z.\2\u02ac\u02af\5^\60\2\u02ad\u02af\5`\61"+
		"\2\u02ae\u02aa\3\2\2\2\u02ae\u02ab\3\2\2\2\u02ae\u02ac\3\2\2\2\u02ae\u02ad"+
		"\3\2\2\2\u02afY\3\2\2\2\u02b0\u02b1\7\7\2\2\u02b1\u02b5\7 \2\2\u02b2\u02b6"+
		"\5\\/\2\u02b3\u02b6\5`\61\2\u02b4\u02b6\5Z.\2\u02b5\u02b2\3\2\2\2\u02b5"+
		"\u02b3\3\2\2\2\u02b5\u02b4\3\2\2\2\u02b6[\3\2\2\2\u02b7\u02b8\t\3\2\2"+
		"\u02b8]\3\2\2\2\u02b9\u02ba\7\27\2\2\u02ba\u02c4\7\"\2\2\u02bb\u02c0\5"+
		"X-\2\u02bc\u02bd\7\37\2\2\u02bd\u02bf\5X-\2\u02be\u02bc\3\2\2\2\u02bf"+
		"\u02c2\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c5\3\2"+
		"\2\2\u02c2\u02c0\3\2\2\2\u02c3\u02c5\7\b\2\2\u02c4\u02bb\3\2\2\2\u02c4"+
		"\u02c3\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6\u02c9\7,\2\2\u02c7\u02ca\5X-"+
		"\2\u02c8\u02ca\7\b\2\2\u02c9\u02c7\3\2\2\2\u02c9\u02c8\3\2\2\2\u02ca\u02cb"+
		"\3\2\2\2\u02cb\u02cc\7!\2\2\u02cc_\3\2\2\2\u02cd\u02ce\7\3\2\2\u02ce\u02cf"+
		"\7-\2\2\u02cfa\3\2\2\2_dfkmt\u0083\u0087\u0089\u008e\u0094\u00a6\u00ab"+
		"\u00ad\u00b2\u00b9\u00be\u00c9\u00cf\u00d5\u00dc\u00e0\u00e2\u00e8\u00ed"+
		"\u00ef\u00f7\u0102\u0105\u010e\u011b\u0120\u0126\u0133\u0139\u013f\u014a"+
		"\u0157\u0159\u0161\u0167\u016b\u0170\u0173\u017b\u0195\u0199\u019b\u01a1"+
		"\u01a7\u01ab\u01ad\u01b2\u01ba\u01bf\u01c9\u01d2\u01dc\u01e6\u01f2\u01f4"+
		"\u0200\u0202\u020e\u0210\u021b\u021d\u0221\u022a\u0231\u0239\u0244\u024b"+
		"\u0252\u0255\u025c\u0261\u0268\u026e\u0272\u0276\u027b\u0281\u0288\u028e"+
		"\u0292\u0299\u029e\u02a6\u02ae\u02b5\u02c0\u02c4\u02c9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}