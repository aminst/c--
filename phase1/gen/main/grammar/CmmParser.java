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
		RULE_appendStatement = 21, RULE_functionCallStatement = 22, RULE_statementScope = 23, 
		RULE_oneLineStatement = 24, RULE_expression = 25, RULE_assignExpression = 26, 
		RULE_logicalOrExpression = 27, RULE_logicalAndExpression = 28, RULE_equalExpression = 29, 
		RULE_comparisonExpression = 30, RULE_plusMinusExpression = 31, RULE_multiplyDivideExpression = 32, 
		RULE_unaryExpression = 33, RULE_retrieveListExpression = 34, RULE_accessMemberExpression = 35, 
		RULE_parantheseExpression = 36, RULE_callArgs = 37, RULE_valueExpression = 38, 
		RULE_varDeclaration = 39, RULE_oneLineVarDeclaration = 40, RULE_varDecName = 41, 
		RULE_value = 42, RULE_boolValue = 43, RULE_type = 44, RULE_listType = 45, 
		RULE_primitiveType = 46, RULE_fptrType = 47, RULE_structType = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "main", "mainStatementScope", "function", "struct", "structScope", 
			"structFunc", "setGetStatementScope", "setGetFuncs", "callArgsDef", "funcArgs", 
			"statement", "returnStatement", "assignStatement", "ifStatement", "callStatement", 
			"whileStatement", "doWhileStatement", "doWhileStatementScope", "displayStatement", 
			"sizeStatement", "appendStatement", "functionCallStatement", "statementScope", 
			"oneLineStatement", "expression", "assignExpression", "logicalOrExpression", 
			"logicalAndExpression", "equalExpression", "comparisonExpression", "plusMinusExpression", 
			"multiplyDivideExpression", "unaryExpression", "retrieveListExpression", 
			"accessMemberExpression", "parantheseExpression", "callArgs", "valueExpression", 
			"varDeclaration", "oneLineVarDeclaration", "varDecName", "value", "boolValue", 
			"type", "listType", "primitiveType", "fptrType", "structType"
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
			setState(102);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(100);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRUCT:
						{
						setState(98);
						struct();
						}
						break;
					case NEWLINE:
						{
						setState(99);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << FPTR) | (1L << NEWLINE))) != 0)) {
				{
				setState(107);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCT:
				case INT:
				case BOOL:
				case LIST:
				case VOID:
				case FPTR:
					{
					setState(105);
					function();
					}
					break;
				case NEWLINE:
					{
					setState(106);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(112);
			main();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(113);
				match(NEWLINE);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
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
			setState(121);
			match(MAIN);
			 System.out.print("Main\n");
			setState(123);
			match(LPAR);
			setState(124);
			match(RPAR);
			setState(125);
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
			setState(127);
			match(BEGIN);
			setState(129); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(128);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(131); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(135); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(135);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						setState(133);
						statement();
						}
						break;
					case 2:
						{
						setState(134);
						oneLineStatement();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(137); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				match(NEWLINE);
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(144);
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
			setState(148);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(146);
				type();
				}
				break;
			case VOID:
				{
				setState(147);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(150);
			((FunctionContext)_localctx).func_dec = match(IDENTIFIER);
			 System.out.print("FunctionDec : "+(((FunctionContext)_localctx).func_dec!=null?((FunctionContext)_localctx).func_dec.getText():null)+"\n");
			setState(152);
			match(LPAR);
			setState(153);
			callArgsDef();
			setState(154);
			match(RPAR);
			setState(155);
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
			setState(157);
			match(STRUCT);
			setState(158);
			((StructContext)_localctx).struct_dec = match(IDENTIFIER);
			 System.out.print("StructDec : "+(((StructContext)_localctx).struct_dec!=null?((StructContext)_localctx).struct_dec.getText():null) +"\n");
			setState(160);
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
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(162);
				match(BEGIN);
				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(163);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(171); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(171);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
						case 1:
							{
							setState(168);
							varDeclaration();
							}
							break;
						case 2:
							{
							setState(169);
							structFunc();
							}
							break;
						case 3:
							{
							setState(170);
							oneLineVarDeclaration();
							}
							break;
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(173); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(176); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(175);
					match(NEWLINE);
					}
					}
					setState(178); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(180);
				match(END);
				}
				}
				break;
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case VOID:
			case FPTR:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(183); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(182);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(185); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(187);
					varDeclaration();
					}
					break;
				case 2:
					{
					setState(188);
					structFunc();
					}
					break;
				case 3:
					{
					setState(189);
					oneLineVarDeclaration();
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
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
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
			setState(197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(194);
				match(NEWLINE);
				}
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(200);
				type();
				}
				break;
			case VOID:
				{
				setState(201);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(204);
			((StructFuncContext)_localctx).var_dec = match(IDENTIFIER);
			 System.out.print("VarDec : "+(((StructFuncContext)_localctx).var_dec!=null?((StructFuncContext)_localctx).var_dec.getText():null)+"\n");
			setState(206);
			match(LPAR);
			setState(207);
			callArgsDef();
			setState(208);
			match(RPAR);
			setState(209);
			match(BEGIN);
			setState(211); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(210);
				match(NEWLINE);
				}
				}
				setState(213); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(215);
			setGetFuncs();
			setState(217); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(216);
				match(NEWLINE);
				}
				}
				setState(219); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(221);
			match(END);
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case MAIN:
			case INT:
			case BOOL:
			case LIST:
			case VOID:
			case FPTR:
			case NEWLINE:
				{
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						match(NEWLINE);
						}
						} 
					}
					setState(227);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				}
				break;
			case SEMICOLON:
				{
				setState(228);
				match(SEMICOLON);
				setState(232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(229);
						match(NEWLINE);
						}
						} 
					}
					setState(234);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(BEGIN);
				setState(239); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(238);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(241); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(245);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
						case 1:
							{
							setState(243);
							statement();
							}
							break;
						case 2:
							{
							setState(244);
							oneLineStatement();
							}
							break;
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				setState(251); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(250);
					match(NEWLINE);
					}
					}
					setState(253); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(255);
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
			case MINUS:
			case TILDE:
			case IDENTIFIER:
			case NUM:
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(256);
					statement();
					}
					break;
				case 2:
					{
					setState(257);
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
			setState(262);
			match(SET);
			 System.out.print("Setter\n");
			setState(264);
			setGetStatementScope();
			setState(266); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(265);
				match(NEWLINE);
				}
				}
				setState(268); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
			setState(270);
			match(GET);
			 System.out.print("Getter\n");
			setState(272);
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
			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << FPTR))) != 0)) {
				{
				setState(274);
				funcArgs();
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(275);
					match(COMMA);
					setState(276);
					funcArgs();
					}
					}
					setState(281);
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
			setState(284);
			type();
			setState(285);
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
		public FunctionCallStatementContext functionCallStatement() {
			return getRuleContext(FunctionCallStatementContext.class,0);
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
			setState(291);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(288);
					match(NEWLINE);
					}
					} 
				}
				setState(293);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(294);
				varDeclaration();
				}
				break;
			case 2:
				{
				setState(295);
				functionCallStatement();
				}
				break;
			case 3:
				{
				setState(296);
				ifStatement();
				}
				break;
			case 4:
				{
				setState(297);
				assignStatement();
				}
				break;
			case 5:
				{
				setState(298);
				whileStatement();
				}
				break;
			case 6:
				{
				setState(299);
				doWhileStatement();
				}
				break;
			case 7:
				{
				setState(300);
				returnStatement();
				}
				break;
			case 8:
				{
				setState(301);
				callStatement();
				}
				break;
			case 9:
				{
				setState(302);
				displayStatement();
				}
				break;
			case 10:
				{
				setState(303);
				sizeStatement();
				}
				break;
			case 11:
				{
				setState(304);
				appendStatement();
				}
				break;
			}
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(307);
					match(NEWLINE);
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public SizeStatementContext sizeStatement() {
			return getRuleContext(SizeStatementContext.class,0);
		}
		public DisplayStatementContext displayStatement() {
			return getRuleContext(DisplayStatementContext.class,0);
		}
		public AppendStatementContext appendStatement() {
			return getRuleContext(AppendStatementContext.class,0);
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
			setState(313);
			match(RETURN);
			 System.out.print("Return\n");
			setState(319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(315);
				expression();
				}
				break;
			case 2:
				{
				setState(316);
				sizeStatement();
				}
				break;
			case 3:
				{
				setState(317);
				displayStatement();
				}
				break;
			case 4:
				{
				setState(318);
				appendStatement();
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
			setState(321);
			logicalOrExpression();
			setState(322);
			match(ASSIGN);
			setState(323);
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
			setState(325);
			match(IF);
			 System.out.print("Conditional : if\n");
			setState(332);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				{
				setState(327);
				match(LPAR);
				setState(328);
				expression();
				setState(329);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(331);
				expression();
				}
				break;
			}
			setState(334);
			statementScope();
			setState(338);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(335);
					match(NEWLINE);
					}
					} 
				}
				setState(340);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(341);
				match(ELSE);
				 System.out.print("Conditional : else\n");
				setState(343);
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
			setState(346);
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
			setState(348);
			match(WHILE);
			 System.out.print("Loop : while\n");
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				{
				setState(350);
				match(LPAR);
				setState(351);
				expression();
				setState(352);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(354);
				expression();
				}
				break;
			}
			setState(357);
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
			setState(359);
			match(DO);
			 System.out.print("Loop : do...while\n");
			setState(361);
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
			setState(396);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				{
				setState(363);
				match(BEGIN);
				setState(364);
				match(NEWLINE);
				setState(370);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(368);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
						case 1:
							{
							setState(365);
							statement();
							}
							break;
						case 2:
							{
							setState(366);
							oneLineStatement();
							}
							break;
						case 3:
							{
							setState(367);
							match(NEWLINE);
							}
							break;
						}
						} 
					}
					setState(372);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
				}
				setState(373);
				match(NEWLINE);
				setState(374);
				match(END);
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(375);
					match(NEWLINE);
					}
					}
					setState(380);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case NEWLINE:
				{
				setState(382); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(381);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(384); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(386);
					statement();
					}
					break;
				case 2:
					{
					setState(387);
					oneLineStatement();
					}
					break;
				}
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(390);
					match(NEWLINE);
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(398);
			match(WHILE);
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				{
				setState(399);
				match(LPAR);
				setState(400);
				expression();
				setState(401);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(403);
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
		enterRule(_localctx, 38, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(DISPLAY);
			 System.out.print("Built-in : display\n");
			setState(408);
			match(LPAR);
			setState(409);
			expression();
			setState(410);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
			setState(412);
			match(SIZE);
			 System.out.print("Size\n");
			setState(414);
			match(LPAR);
			setState(415);
			expression();
			setState(416);
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
			setState(418);
			match(APPEND);
			 System.out.print("Append\n");
			setState(420);
			match(LPAR);
			setState(421);
			expression();
			setState(422);
			match(COMMA);
			setState(423);
			expression();
			setState(424);
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

	public static class FunctionCallStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
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
		public FunctionCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCallStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCallStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCallStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallStatementContext functionCallStatement() throws RecognitionException {
		FunctionCallStatementContext _localctx = new FunctionCallStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_functionCallStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(IDENTIFIER);
			 System.out.print("FunctionCall\n");
			setState(428);
			match(LPAR);
			setState(429);
			callArgs();
			setState(430);
			match(RPAR);
			setState(437);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(431);
					match(LPAR);
					setState(432);
					callArgs();
					setState(433);
					match(RPAR);
					}
					} 
				}
				setState(439);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
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
		enterRule(_localctx, 46, RULE_statementScope);
		int _la;
		try {
			int _alt;
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				match(BEGIN);
				setState(442); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(441);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(444); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(450);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(448);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
						case 1:
							{
							setState(446);
							statement();
							}
							break;
						case 2:
							{
							setState(447);
							oneLineStatement();
							}
							break;
						}
						} 
					}
					setState(452);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
				}
				setState(454); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(453);
					match(NEWLINE);
					}
					}
					setState(456); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				setState(458);
				match(END);
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(460); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(459);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(462); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(466);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(464);
					statement();
					}
					break;
				case 2:
					{
					setState(465);
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
		enterRule(_localctx, 48, RULE_oneLineStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(470);
					match(NEWLINE);
					}
					} 
				}
				setState(475);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			setState(479); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(476);
					statement();
					setState(477);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(481); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,59,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(483);
					match(NEWLINE);
					}
					} 
				}
				setState(488);
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
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
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
		enterRule(_localctx, 52, RULE_assignExpression);
		try {
			setState(496);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(491);
				logicalOrExpression();
				setState(492);
				match(ASSIGN);
				setState(493);
				assignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(495);
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
		enterRule(_localctx, 54, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			logicalAndExpression();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(499);
				match(OR);
				setState(500);
				logicalAndExpression();
				 System.out.print("Operator : |\n");
				}
				}
				setState(507);
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
		enterRule(_localctx, 56, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			equalExpression();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(509);
				match(AND);
				setState(510);
				equalExpression();
				 System.out.print("Operator : &\n");
				}
				}
				setState(517);
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
		enterRule(_localctx, 58, RULE_equalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			comparisonExpression();
			setState(525);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(519);
				match(EQUAL);
				setState(520);
				comparisonExpression();
				 System.out.print("Operator : ==\n");
				}
				}
				setState(527);
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
		enterRule(_localctx, 60, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			plusMinusExpression();
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT || _la==LT) {
				{
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GT:
					{
					{
					setState(529);
					match(GT);
					}
					setState(530);
					plusMinusExpression();
					 System.out.print("Operator : >\n");
					}
					break;
				case LT:
					{
					{
					setState(533);
					match(LT);
					}
					setState(534);
					plusMinusExpression();
					 System.out.print("Operator : <\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(541);
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
		enterRule(_localctx, 62, RULE_plusMinusExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			multiplyDivideExpression();
			setState(553);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(551);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						{
						setState(543);
						match(PLUS);
						}
						setState(544);
						multiplyDivideExpression();
						 System.out.print("Operator : +\n");
						}
						break;
					case MINUS:
						{
						{
						setState(547);
						match(MINUS);
						}
						setState(548);
						multiplyDivideExpression();
						 System.out.print("Operator : -\n");
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(555);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
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
		enterRule(_localctx, 64, RULE_multiplyDivideExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			unaryExpression();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AESTRIK || _la==DIVIDE) {
				{
				setState(565);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AESTRIK:
					{
					{
					setState(557);
					match(AESTRIK);
					}
					setState(558);
					unaryExpression();
					 System.out.print("Operator : *\n");
					}
					break;
				case DIVIDE:
					{
					{
					setState(561);
					match(DIVIDE);
					}
					setState(562);
					unaryExpression();
					 System.out.print("Operator : /\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(569);
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
		enterRule(_localctx, 66, RULE_unaryExpression);
		try {
			int _alt;
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(578); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						setState(578);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MINUS:
							{
							{
							setState(570);
							match(MINUS);
							}
							setState(571);
							unaryExpression();
							 System.out.print("Operator : -\n");
							}
							break;
						case TILDE:
							{
							{
							setState(574);
							match(TILDE);
							}
							setState(575);
							unaryExpression();
							 System.out.print("Operator : ~\n");
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(580); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case APPEND:
			case SIZE:
			case TRUE:
			case FALSE:
			case LPAR:
			case IDENTIFIER:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(582);
				retrieveListExpression();
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
		enterRule(_localctx, 68, RULE_retrieveListExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(585);
			accessMemberExpression();
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(586);
				match(LBRACKET);
				setState(587);
				expression();
				setState(588);
				match(RBRACKET);
				}
				}
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(599);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(595);
					match(DOT);
					setState(596);
					retrieveListExpression();
					}
					} 
				}
				setState(601);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 70, RULE_accessMemberExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			parantheseExpression();
			setState(607);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(603);
					match(DOT);
					setState(604);
					match(IDENTIFIER);
					}
					} 
				}
				setState(609);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 72, RULE_parantheseExpression);
		int _la;
		try {
			int _alt;
			setState(625);
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
				setState(610);
				valueExpression();
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(611);
						match(LPAR);
						setState(612);
						callArgs();
						setState(613);
						match(RPAR);
						}
						} 
					}
					setState(619);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(620);
				match(LPAR);
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM))) != 0)) {
					{
					setState(621);
					expression();
					}
				}

				setState(624);
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
		enterRule(_localctx, 74, RULE_callArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM))) != 0)) {
				{
				setState(627);
				expression();
				setState(632);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(628);
					match(COMMA);
					setState(629);
					expression();
					}
					}
					setState(634);
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
		enterRule(_localctx, 76, RULE_valueExpression);
		try {
			setState(642);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(638);
				match(NUM);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(639);
				match(IDENTIFIER);
				}
				break;
			case SIZE:
				enterOuterAlt(_localctx, 4);
				{
				setState(640);
				sizeStatement();
				}
				break;
			case APPEND:
				enterOuterAlt(_localctx, 5);
				{
				setState(641);
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
		enterRule(_localctx, 78, RULE_varDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(644);
				match(NEWLINE);
				}
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(650);
			type();
			{
			setState(651);
			varDecName();
			setState(654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(652);
				match(ASSIGN);
				setState(653);
				expression();
				}
			}

			}
			setState(664);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(656);
				match(COMMA);
				{
				setState(657);
				varDecName();
				setState(660);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(658);
					match(ASSIGN);
					setState(659);
					expression();
					}
				}

				}
				}
				}
				setState(666);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(668);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(667);
				match(SEMICOLON);
				}
				break;
			}
			setState(673);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(670);
					match(NEWLINE);
					}
					} 
				}
				setState(675);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,87,_ctx);
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
		enterRule(_localctx, 80, RULE_oneLineVarDeclaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(676);
				match(NEWLINE);
				}
				}
				setState(681);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(701); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(682);
					type();
					{
					setState(683);
					varDecName();
					setState(686);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(684);
						match(ASSIGN);
						setState(685);
						expression();
						}
					}

					}
					setState(696);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(688);
						match(COMMA);
						{
						setState(689);
						varDecName();
						setState(692);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ASSIGN) {
							{
							setState(690);
							match(ASSIGN);
							setState(691);
							expression();
							}
						}

						}
						}
						}
						setState(698);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(699);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(703); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(708);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(705);
					match(NEWLINE);
					}
					} 
				}
				setState(710);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
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
		enterRule(_localctx, 82, RULE_varDecName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(711);
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
		enterRule(_localctx, 84, RULE_value);
		try {
			setState(716);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(715);
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
		enterRule(_localctx, 86, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(718);
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
		enterRule(_localctx, 88, RULE_type);
		try {
			setState(724);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(720);
				primitiveType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(721);
				listType();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				fptrType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
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
		enterRule(_localctx, 90, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			match(LIST);
			setState(727);
			match(SHARP);
			setState(731);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				{
				setState(728);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(729);
				structType();
				}
				break;
			case LIST:
				{
				setState(730);
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
		enterRule(_localctx, 92, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
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
		enterRule(_localctx, 94, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(735);
			match(FPTR);
			setState(736);
			match(LT);
			setState(746);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(737);
				type();
				setState(742);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(738);
					match(COMMA);
					setState(739);
					type();
					}
					}
					setState(744);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case VOID:
				{
				setState(745);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(748);
			match(ARROW);
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(749);
				type();
				}
				break;
			case VOID:
				{
				setState(750);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(753);
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
		enterRule(_localctx, 96, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(755);
			match(STRUCT);
			setState(756);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u02f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\7\2g\n\2"+
		"\f\2\16\2j\13\2\3\2\3\2\7\2n\n\2\f\2\16\2q\13\2\3\2\3\2\7\2u\n\2\f\2\16"+
		"\2x\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\6\4\u0084\n\4\r\4\16"+
		"\4\u0085\3\4\3\4\6\4\u008a\n\4\r\4\16\4\u008b\3\4\6\4\u008f\n\4\r\4\16"+
		"\4\u0090\3\4\3\4\3\5\3\5\5\5\u0097\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\6\7\u00a7\n\7\r\7\16\7\u00a8\3\7\3\7\3\7\6\7"+
		"\u00ae\n\7\r\7\16\7\u00af\3\7\6\7\u00b3\n\7\r\7\16\7\u00b4\3\7\3\7\3\7"+
		"\6\7\u00ba\n\7\r\7\16\7\u00bb\3\7\3\7\3\7\5\7\u00c1\n\7\5\7\u00c3\n\7"+
		"\3\b\7\b\u00c6\n\b\f\b\16\b\u00c9\13\b\3\b\3\b\5\b\u00cd\n\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\6\b\u00d6\n\b\r\b\16\b\u00d7\3\b\3\b\6\b\u00dc\n\b"+
		"\r\b\16\b\u00dd\3\b\3\b\7\b\u00e2\n\b\f\b\16\b\u00e5\13\b\3\b\3\b\7\b"+
		"\u00e9\n\b\f\b\16\b\u00ec\13\b\5\b\u00ee\n\b\3\t\3\t\6\t\u00f2\n\t\r\t"+
		"\16\t\u00f3\3\t\3\t\7\t\u00f8\n\t\f\t\16\t\u00fb\13\t\3\t\6\t\u00fe\n"+
		"\t\r\t\16\t\u00ff\3\t\3\t\3\t\5\t\u0105\n\t\5\t\u0107\n\t\3\n\3\n\3\n"+
		"\3\n\6\n\u010d\n\n\r\n\16\n\u010e\3\n\3\n\3\n\3\n\3\13\3\13\3\13\7\13"+
		"\u0118\n\13\f\13\16\13\u011b\13\13\5\13\u011d\n\13\3\f\3\f\3\f\3\f\3\r"+
		"\7\r\u0124\n\r\f\r\16\r\u0127\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\5\r\u0134\n\r\3\r\7\r\u0137\n\r\f\r\16\r\u013a\13\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u0142\n\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u014f\n\20\3\20\3\20\7\20\u0153\n\20\f\20\16"+
		"\20\u0156\13\20\3\20\3\20\3\20\5\20\u015b\n\20\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0166\n\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\24\7\24\u0173\n\24\f\24\16\24\u0176\13\24\3\24\3\24"+
		"\3\24\7\24\u017b\n\24\f\24\16\24\u017e\13\24\3\24\6\24\u0181\n\24\r\24"+
		"\16\24\u0182\3\24\3\24\5\24\u0187\n\24\3\24\7\24\u018a\n\24\f\24\16\24"+
		"\u018d\13\24\5\24\u018f\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0197"+
		"\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\7\30\u01b6\n\30\f\30\16\30\u01b9\13\30\3\31\3\31\6\31\u01bd"+
		"\n\31\r\31\16\31\u01be\3\31\3\31\7\31\u01c3\n\31\f\31\16\31\u01c6\13\31"+
		"\3\31\6\31\u01c9\n\31\r\31\16\31\u01ca\3\31\3\31\6\31\u01cf\n\31\r\31"+
		"\16\31\u01d0\3\31\3\31\5\31\u01d5\n\31\5\31\u01d7\n\31\3\32\7\32\u01da"+
		"\n\32\f\32\16\32\u01dd\13\32\3\32\3\32\3\32\6\32\u01e2\n\32\r\32\16\32"+
		"\u01e3\3\32\7\32\u01e7\n\32\f\32\16\32\u01ea\13\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\34\5\34\u01f3\n\34\3\35\3\35\3\35\3\35\3\35\7\35\u01fa\n"+
		"\35\f\35\16\35\u01fd\13\35\3\36\3\36\3\36\3\36\3\36\7\36\u0204\n\36\f"+
		"\36\16\36\u0207\13\36\3\37\3\37\3\37\3\37\3\37\7\37\u020e\n\37\f\37\16"+
		"\37\u0211\13\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \7 \u021c\n \f \16 \u021f\13"+
		" \3!\3!\3!\3!\3!\3!\3!\3!\3!\7!\u022a\n!\f!\16!\u022d\13!\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0238\n\"\f\"\16\"\u023b\13\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\6#\u0245\n#\r#\16#\u0246\3#\5#\u024a\n#\3$\3$\3$\3$\3$\7"+
		"$\u0251\n$\f$\16$\u0254\13$\3$\3$\7$\u0258\n$\f$\16$\u025b\13$\3%\3%\3"+
		"%\7%\u0260\n%\f%\16%\u0263\13%\3&\3&\3&\3&\3&\7&\u026a\n&\f&\16&\u026d"+
		"\13&\3&\3&\5&\u0271\n&\3&\5&\u0274\n&\3\'\3\'\3\'\7\'\u0279\n\'\f\'\16"+
		"\'\u027c\13\'\5\'\u027e\n\'\3(\3(\3(\3(\3(\5(\u0285\n(\3)\7)\u0288\n)"+
		"\f)\16)\u028b\13)\3)\3)\3)\3)\5)\u0291\n)\3)\3)\3)\3)\5)\u0297\n)\7)\u0299"+
		"\n)\f)\16)\u029c\13)\3)\5)\u029f\n)\3)\7)\u02a2\n)\f)\16)\u02a5\13)\3"+
		"*\7*\u02a8\n*\f*\16*\u02ab\13*\3*\3*\3*\3*\5*\u02b1\n*\3*\3*\3*\3*\5*"+
		"\u02b7\n*\7*\u02b9\n*\f*\16*\u02bc\13*\3*\3*\6*\u02c0\n*\r*\16*\u02c1"+
		"\3*\7*\u02c5\n*\f*\16*\u02c8\13*\3+\3+\3+\3,\3,\5,\u02cf\n,\3-\3-\3.\3"+
		".\3.\3.\5.\u02d7\n.\3/\3/\3/\3/\3/\5/\u02de\n/\3\60\3\60\3\61\3\61\3\61"+
		"\3\61\3\61\7\61\u02e7\n\61\f\61\16\61\u02ea\13\61\3\61\5\61\u02ed\n\61"+
		"\3\61\3\61\3\61\5\61\u02f2\n\61\3\61\3\61\3\62\3\62\3\62\3\62\2\2\63\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJL"+
		"NPRTVXZ\\^`b\2\4\3\2\25\26\3\2\5\6\2\u0340\2h\3\2\2\2\4{\3\2\2\2\6\u0081"+
		"\3\2\2\2\b\u0096\3\2\2\2\n\u009f\3\2\2\2\f\u00c2\3\2\2\2\16\u00c7\3\2"+
		"\2\2\20\u0106\3\2\2\2\22\u0108\3\2\2\2\24\u011c\3\2\2\2\26\u011e\3\2\2"+
		"\2\30\u0125\3\2\2\2\32\u013b\3\2\2\2\34\u0143\3\2\2\2\36\u0147\3\2\2\2"+
		" \u015c\3\2\2\2\"\u015e\3\2\2\2$\u0169\3\2\2\2&\u018e\3\2\2\2(\u0198\3"+
		"\2\2\2*\u019e\3\2\2\2,\u01a4\3\2\2\2.\u01ac\3\2\2\2\60\u01d6\3\2\2\2\62"+
		"\u01db\3\2\2\2\64\u01eb\3\2\2\2\66\u01f2\3\2\2\28\u01f4\3\2\2\2:\u01fe"+
		"\3\2\2\2<\u0208\3\2\2\2>\u0212\3\2\2\2@\u0220\3\2\2\2B\u022e\3\2\2\2D"+
		"\u0249\3\2\2\2F\u024b\3\2\2\2H\u025c\3\2\2\2J\u0273\3\2\2\2L\u027d\3\2"+
		"\2\2N\u0284\3\2\2\2P\u0289\3\2\2\2R\u02a9\3\2\2\2T\u02c9\3\2\2\2V\u02ce"+
		"\3\2\2\2X\u02d0\3\2\2\2Z\u02d6\3\2\2\2\\\u02d8\3\2\2\2^\u02df\3\2\2\2"+
		"`\u02e1\3\2\2\2b\u02f5\3\2\2\2dg\5\n\6\2eg\7\60\2\2fd\3\2\2\2fe\3\2\2"+
		"\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2\2io\3\2\2\2jh\3\2\2\2kn\5\b\5\2ln\7\60"+
		"\2\2mk\3\2\2\2ml\3\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2pr\3\2\2\2qo\3\2"+
		"\2\2rv\5\4\3\2su\7\60\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3"+
		"\2\2\2xv\3\2\2\2yz\7\2\2\3z\3\3\2\2\2{|\7\4\2\2|}\b\3\1\2}~\7\31\2\2~"+
		"\177\7\32\2\2\177\u0080\5\6\4\2\u0080\5\3\2\2\2\u0081\u0083\7\20\2\2\u0082"+
		"\u0084\7\60\2\2\u0083\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0089\3\2\2\2\u0087\u008a\5\30\r\2\u0088"+
		"\u008a\5\62\32\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\u008b\3"+
		"\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\u008e\3\2\2\2\u008d"+
		"\u008f\7\60\2\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u008e\3"+
		"\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0093\7\21\2\2\u0093"+
		"\7\3\2\2\2\u0094\u0097\5Z.\2\u0095\u0097\7\b\2\2\u0096\u0094\3\2\2\2\u0096"+
		"\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0099\7-\2\2\u0099\u009a\b\5"+
		"\1\2\u009a\u009b\7\31\2\2\u009b\u009c\5\24\13\2\u009c\u009d\7\32\2\2\u009d"+
		"\u009e\5\60\31\2\u009e\t\3\2\2\2\u009f\u00a0\7\3\2\2\u00a0\u00a1\7-\2"+
		"\2\u00a1\u00a2\b\6\1\2\u00a2\u00a3\5\f\7\2\u00a3\13\3\2\2\2\u00a4\u00a6"+
		"\7\20\2\2\u00a5\u00a7\7\60\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ad\3\2\2\2\u00aa\u00ae"+
		"\5P)\2\u00ab\u00ae\5\16\b\2\u00ac\u00ae\5R*\2\u00ad\u00aa\3\2\2\2\u00ad"+
		"\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00ad\3\2"+
		"\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b2\3\2\2\2\u00b1\u00b3\7\60\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\21\2\2\u00b7\u00c3\3\2\2\2\u00b8"+
		"\u00ba\7\60\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3"+
		"\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00c1\5P)\2\u00be"+
		"\u00c1\5\16\b\2\u00bf\u00c1\5R*\2\u00c0\u00b9\3\2\2\2\u00c0\u00be\3\2"+
		"\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00a4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c3\r\3\2\2\2\u00c4\u00c6\7\60\2\2\u00c5\u00c4\3\2\2"+
		"\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cc"+
		"\3\2\2\2\u00c9\u00c7\3\2\2\2\u00ca\u00cd\5Z.\2\u00cb\u00cd\7\b\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cc\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\7-"+
		"\2\2\u00cf\u00d0\b\b\1\2\u00d0\u00d1\7\31\2\2\u00d1\u00d2\5\24\13\2\u00d2"+
		"\u00d3\7\32\2\2\u00d3\u00d5\7\20\2\2\u00d4\u00d6\7\60\2\2\u00d5\u00d4"+
		"\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8"+
		"\u00d9\3\2\2\2\u00d9\u00db\5\22\n\2\u00da\u00dc\7\60\2\2\u00db\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de"+
		"\u00df\3\2\2\2\u00df\u00ed\7\21\2\2\u00e0\u00e2\7\60\2\2\u00e1\u00e0\3"+
		"\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00ee\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00ea\7\35\2\2\u00e7\u00e9\7"+
		"\60\2\2\u00e8\u00e7\3\2\2\2\u00e9\u00ec\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00e3\3\2"+
		"\2\2\u00ed\u00e6\3\2\2\2\u00ee\17\3\2\2\2\u00ef\u00f1\7\20\2\2\u00f0\u00f2"+
		"\7\60\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f9\3\2\2\2\u00f5\u00f8\5\30\r\2\u00f6\u00f8"+
		"\5\62\32\2\u00f7\u00f5\3\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2"+
		"\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fc\u00fe\7\60\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0107"+
		"\7\21\2\2\u0102\u0105\5\30\r\2\u0103\u0105\5\62\32\2\u0104\u0102\3\2\2"+
		"\2\u0104\u0103\3\2\2\2\u0105\u0107\3\2\2\2\u0106\u00ef\3\2\2\2\u0106\u0104"+
		"\3\2\2\2\u0107\21\3\2\2\2\u0108\u0109\7\17\2\2\u0109\u010a\b\n\1\2\u010a"+
		"\u010c\5\20\t\2\u010b\u010d\7\60\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3"+
		"\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\3\2\2\2\u0110"+
		"\u0111\7\16\2\2\u0111\u0112\b\n\1\2\u0112\u0113\5\20\t\2\u0113\23\3\2"+
		"\2\2\u0114\u0119\5\26\f\2\u0115\u0116\7\37\2\2\u0116\u0118\5\26\f\2\u0117"+
		"\u0115\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0114\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\25\3\2\2\2\u011e\u011f\5Z.\2\u011f\u0120\7-\2\2\u0120"+
		"\u0121\b\f\1\2\u0121\27\3\2\2\2\u0122\u0124\7\60\2\2\u0123\u0122\3\2\2"+
		"\2\u0124\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0133"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0128\u0134\5P)\2\u0129\u0134\5.\30\2\u012a"+
		"\u0134\5\36\20\2\u012b\u0134\5\34\17\2\u012c\u0134\5\"\22\2\u012d\u0134"+
		"\5$\23\2\u012e\u0134\5\32\16\2\u012f\u0134\5 \21\2\u0130\u0134\5(\25\2"+
		"\u0131\u0134\5*\26\2\u0132\u0134\5,\27\2\u0133\u0128\3\2\2\2\u0133\u0129"+
		"\3\2\2\2\u0133\u012a\3\2\2\2\u0133\u012b\3\2\2\2\u0133\u012c\3\2\2\2\u0133"+
		"\u012d\3\2\2\2\u0133\u012e\3\2\2\2\u0133\u012f\3\2\2\2\u0133\u0130\3\2"+
		"\2\2\u0133\u0131\3\2\2\2\u0133\u0132\3\2\2\2\u0134\u0138\3\2\2\2\u0135"+
		"\u0137\7\60\2\2\u0136\u0135\3\2\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3"+
		"\2\2\2\u0138\u0139\3\2\2\2\u0139\31\3\2\2\2\u013a\u0138\3\2\2\2\u013b"+
		"\u013c\7\r\2\2\u013c\u0141\b\16\1\2\u013d\u0142\5\64\33\2\u013e\u0142"+
		"\5*\26\2\u013f\u0142\5(\25\2\u0140\u0142\5,\27\2\u0141\u013d\3\2\2\2\u0141"+
		"\u013e\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2"+
		"\2\2\u0142\33\3\2\2\2\u0143\u0144\58\35\2\u0144\u0145\7#\2\2\u0145\u0146"+
		"\5\64\33\2\u0146\35\3\2\2\2\u0147\u0148\7\13\2\2\u0148\u014e\b\20\1\2"+
		"\u0149\u014a\7\31\2\2\u014a\u014b\5\64\33\2\u014b\u014c\7\32\2\2\u014c"+
		"\u014f\3\2\2\2\u014d\u014f\5\64\33\2\u014e\u0149\3\2\2\2\u014e\u014d\3"+
		"\2\2\2\u014f\u0150\3\2\2\2\u0150\u0154\5\60\31\2\u0151\u0153\7\60\2\2"+
		"\u0152\u0151\3\2\2\2\u0153\u0156\3\2\2\2\u0154\u0152\3\2\2\2\u0154\u0155"+
		"\3\2\2\2\u0155\u015a\3\2\2\2\u0156\u0154\3\2\2\2\u0157\u0158\7\f\2\2\u0158"+
		"\u0159\b\20\1\2\u0159\u015b\5\60\31\2\u015a\u0157\3\2\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\37\3\2\2\2\u015c\u015d\5J&\2\u015d!\3\2\2\2\u015e\u015f"+
		"\7\t\2\2\u015f\u0165\b\22\1\2\u0160\u0161\7\31\2\2\u0161\u0162\5\64\33"+
		"\2\u0162\u0163\7\32\2\2\u0163\u0166\3\2\2\2\u0164\u0166\5\64\33\2\u0165"+
		"\u0160\3\2\2\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5\60"+
		"\31\2\u0168#\3\2\2\2\u0169\u016a\7\n\2\2\u016a\u016b\b\23\1\2\u016b\u016c"+
		"\5&\24\2\u016c%\3\2\2\2\u016d\u016e\7\20\2\2\u016e\u0174\7\60\2\2\u016f"+
		"\u0173\5\30\r\2\u0170\u0173\5\62\32\2\u0171\u0173\7\60\2\2\u0172\u016f"+
		"\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0171\3\2\2\2\u0173\u0176\3\2\2\2\u0174"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0177\3\2\2\2\u0176\u0174\3\2"+
		"\2\2\u0177\u0178\7\60\2\2\u0178\u017c\7\21\2\2\u0179\u017b\7\60\2\2\u017a"+
		"\u0179\3\2\2\2\u017b\u017e\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2"+
		"\2\2\u017d\u018f\3\2\2\2\u017e\u017c\3\2\2\2\u017f\u0181\7\60\2\2\u0180"+
		"\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0186\3\2\2\2\u0184\u0187\5\30\r\2\u0185\u0187\5\62\32\2\u0186"+
		"\u0184\3\2\2\2\u0186\u0185\3\2\2\2\u0187\u018b\3\2\2\2\u0188\u018a\7\60"+
		"\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b\u0189\3\2\2\2\u018b"+
		"\u018c\3\2\2\2\u018c\u018f\3\2\2\2\u018d\u018b\3\2\2\2\u018e\u016d\3\2"+
		"\2\2\u018e\u0180\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0196\7\t\2\2\u0191"+
		"\u0192\7\31\2\2\u0192\u0193\5\64\33\2\u0193\u0194\7\32\2\2\u0194\u0197"+
		"\3\2\2\2\u0195\u0197\5\64\33\2\u0196\u0191\3\2\2\2\u0196\u0195\3\2\2\2"+
		"\u0197\'\3\2\2\2\u0198\u0199\7\22\2\2\u0199\u019a\b\25\1\2\u019a\u019b"+
		"\7\31\2\2\u019b\u019c\5\64\33\2\u019c\u019d\7\32\2\2\u019d)\3\2\2\2\u019e"+
		"\u019f\7\24\2\2\u019f\u01a0\b\26\1\2\u01a0\u01a1\7\31\2\2\u01a1\u01a2"+
		"\5\64\33\2\u01a2\u01a3\7\32\2\2\u01a3+\3\2\2\2\u01a4\u01a5\7\23\2\2\u01a5"+
		"\u01a6\b\27\1\2\u01a6\u01a7\7\31\2\2\u01a7\u01a8\5\64\33\2\u01a8\u01a9"+
		"\7\37\2\2\u01a9\u01aa\5\64\33\2\u01aa\u01ab\7\32\2\2\u01ab-\3\2\2\2\u01ac"+
		"\u01ad\7-\2\2\u01ad\u01ae\b\30\1\2\u01ae\u01af\7\31\2\2\u01af\u01b0\5"+
		"L\'\2\u01b0\u01b7\7\32\2\2\u01b1\u01b2\7\31\2\2\u01b2\u01b3\5L\'\2\u01b3"+
		"\u01b4\7\32\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b1\3\2\2\2\u01b6\u01b9\3"+
		"\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8/\3\2\2\2\u01b9\u01b7"+
		"\3\2\2\2\u01ba\u01bc\7\20\2\2\u01bb\u01bd\7\60\2\2\u01bc\u01bb\3\2\2\2"+
		"\u01bd\u01be\3\2\2\2\u01be\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c4"+
		"\3\2\2\2\u01c0\u01c3\5\30\r\2\u01c1\u01c3\5\62\32\2\u01c2\u01c0\3\2\2"+
		"\2\u01c2\u01c1\3\2\2\2\u01c3\u01c6\3\2\2\2\u01c4\u01c2\3\2\2\2\u01c4\u01c5"+
		"\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4\3\2\2\2\u01c7\u01c9\7\60\2\2"+
		"\u01c8\u01c7\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01c8\3\2\2\2\u01ca\u01cb"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc\u01d7\7\21\2\2\u01cd\u01cf\7\60\2\2"+
		"\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d5\5\30\r\2\u01d3\u01d5\5\62\32"+
		"\2\u01d4\u01d2\3\2\2\2\u01d4\u01d3\3\2\2\2\u01d5\u01d7\3\2\2\2\u01d6\u01ba"+
		"\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d7\61\3\2\2\2\u01d8\u01da\7\60\2\2\u01d9"+
		"\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2"+
		"\2\2\u01dc\u01e1\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\5\30\r\2\u01df"+
		"\u01e0\7\35\2\2\u01e0\u01e2\3\2\2\2\u01e1\u01de\3\2\2\2\u01e2\u01e3\3"+
		"\2\2\2\u01e3\u01e1\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e8\3\2\2\2\u01e5"+
		"\u01e7\7\60\2\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3"+
		"\2\2\2\u01e8\u01e9\3\2\2\2\u01e9\63\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb"+
		"\u01ec\5\66\34\2\u01ec\65\3\2\2\2\u01ed\u01ee\58\35\2\u01ee\u01ef\7#\2"+
		"\2\u01ef\u01f0\5\66\34\2\u01f0\u01f3\3\2\2\2\u01f1\u01f3\58\35\2\u01f2"+
		"\u01ed\3\2\2\2\u01f2\u01f1\3\2\2\2\u01f3\67\3\2\2\2\u01f4\u01fb\5:\36"+
		"\2\u01f5\u01f6\7*\2\2\u01f6\u01f7\5:\36\2\u01f7\u01f8\b\35\1\2\u01f8\u01fa"+
		"\3\2\2\2\u01f9\u01f5\3\2\2\2\u01fa\u01fd\3\2\2\2\u01fb\u01f9\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc9\3\2\2\2\u01fd\u01fb\3\2\2\2\u01fe\u0205\5<\37\2"+
		"\u01ff\u0200\7)\2\2\u0200\u0201\5<\37\2\u0201\u0202\b\36\1\2\u0202\u0204"+
		"\3\2\2\2\u0203\u01ff\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206;\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u020f\5> \2\u0209"+
		"\u020a\7$\2\2\u020a\u020b\5> \2\u020b\u020c\b\37\1\2\u020c\u020e\3\2\2"+
		"\2\u020d\u0209\3\2\2\2\u020e\u0211\3\2\2\2\u020f\u020d\3\2\2\2\u020f\u0210"+
		"\3\2\2\2\u0210=\3\2\2\2\u0211\u020f\3\2\2\2\u0212\u021d\5@!\2\u0213\u0214"+
		"\7!\2\2\u0214\u0215\5@!\2\u0215\u0216\b \1\2\u0216\u021c\3\2\2\2\u0217"+
		"\u0218\7\"\2\2\u0218\u0219\5@!\2\u0219\u021a\b \1\2\u021a\u021c\3\2\2"+
		"\2\u021b\u0213\3\2\2\2\u021b\u0217\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b"+
		"\3\2\2\2\u021d\u021e\3\2\2\2\u021e?\3\2\2\2\u021f\u021d\3\2\2\2\u0220"+
		"\u022b\5B\"\2\u0221\u0222\7\'\2\2\u0222\u0223\5B\"\2\u0223\u0224\b!\1"+
		"\2\u0224\u022a\3\2\2\2\u0225\u0226\7(\2\2\u0226\u0227\5B\"\2\u0227\u0228"+
		"\b!\1\2\u0228\u022a\3\2\2\2\u0229\u0221\3\2\2\2\u0229\u0225\3\2\2\2\u022a"+
		"\u022d\3\2\2\2\u022b\u0229\3\2\2\2\u022b\u022c\3\2\2\2\u022cA\3\2\2\2"+
		"\u022d\u022b\3\2\2\2\u022e\u0239\5D#\2\u022f\u0230\7%\2\2\u0230\u0231"+
		"\5D#\2\u0231\u0232\b\"\1\2\u0232\u0238\3\2\2\2\u0233\u0234\7&\2\2\u0234"+
		"\u0235\5D#\2\u0235\u0236\b\"\1\2\u0236\u0238\3\2\2\2\u0237\u022f\3\2\2"+
		"\2\u0237\u0233\3\2\2\2\u0238\u023b\3\2\2\2\u0239\u0237\3\2\2\2\u0239\u023a"+
		"\3\2\2\2\u023aC\3\2\2\2\u023b\u0239\3\2\2\2\u023c\u023d\7(\2\2\u023d\u023e"+
		"\5D#\2\u023e\u023f\b#\1\2\u023f\u0245\3\2\2\2\u0240\u0241\7+\2\2\u0241"+
		"\u0242\5D#\2\u0242\u0243\b#\1\2\u0243\u0245\3\2\2\2\u0244\u023c\3\2\2"+
		"\2\u0244\u0240\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247"+
		"\3\2\2\2\u0247\u024a\3\2\2\2\u0248\u024a\5F$\2\u0249\u0244\3\2\2\2\u0249"+
		"\u0248\3\2\2\2\u024aE\3\2\2\2\u024b\u0252\5H%\2\u024c\u024d\7\33\2\2\u024d"+
		"\u024e\5\64\33\2\u024e\u024f\7\34\2\2\u024f\u0251\3\2\2\2\u0250\u024c"+
		"\3\2\2\2\u0251\u0254\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0259\3\2\2\2\u0254\u0252\3\2\2\2\u0255\u0256\7\36\2\2\u0256\u0258\5"+
		"F$\2\u0257\u0255\3\2\2\2\u0258\u025b\3\2\2\2\u0259\u0257\3\2\2\2\u0259"+
		"\u025a\3\2\2\2\u025aG\3\2\2\2\u025b\u0259\3\2\2\2\u025c\u0261\5J&\2\u025d"+
		"\u025e\7\36\2\2\u025e\u0260\7-\2\2\u025f\u025d\3\2\2\2\u0260\u0263\3\2"+
		"\2\2\u0261\u025f\3\2\2\2\u0261\u0262\3\2\2\2\u0262I\3\2\2\2\u0263\u0261"+
		"\3\2\2\2\u0264\u026b\5N(\2\u0265\u0266\7\31\2\2\u0266\u0267\5L\'\2\u0267"+
		"\u0268\7\32\2\2\u0268\u026a\3\2\2\2\u0269\u0265\3\2\2\2\u026a\u026d\3"+
		"\2\2\2\u026b\u0269\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u0274\3\2\2\2\u026d"+
		"\u026b\3\2\2\2\u026e\u0270\7\31\2\2\u026f\u0271\5\64\33\2\u0270\u026f"+
		"\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0274\7\32\2\2"+
		"\u0273\u0264\3\2\2\2\u0273\u026e\3\2\2\2\u0274K\3\2\2\2\u0275\u027a\5"+
		"\64\33\2\u0276\u0277\7\37\2\2\u0277\u0279\5\64\33\2\u0278\u0276\3\2\2"+
		"\2\u0279\u027c\3\2\2\2\u027a\u0278\3\2\2\2\u027a\u027b\3\2\2\2\u027b\u027e"+
		"\3\2\2\2\u027c\u027a\3\2\2\2\u027d\u0275\3\2\2\2\u027d\u027e\3\2\2\2\u027e"+
		"M\3\2\2\2\u027f\u0285\5X-\2\u0280\u0285\7.\2\2\u0281\u0285\7-\2\2\u0282"+
		"\u0285\5*\26\2\u0283\u0285\5,\27\2\u0284\u027f\3\2\2\2\u0284\u0280\3\2"+
		"\2\2\u0284\u0281\3\2\2\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2\2\u0285"+
		"O\3\2\2\2\u0286\u0288\7\60\2\2\u0287\u0286\3\2\2\2\u0288\u028b\3\2\2\2"+
		"\u0289\u0287\3\2\2\2\u0289\u028a\3\2\2\2\u028a\u028c\3\2\2\2\u028b\u0289"+
		"\3\2\2\2\u028c\u028d\5Z.\2\u028d\u0290\5T+\2\u028e\u028f\7#\2\2\u028f"+
		"\u0291\5\64\33\2\u0290\u028e\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u029a\3"+
		"\2\2\2\u0292\u0293\7\37\2\2\u0293\u0296\5T+\2\u0294\u0295\7#\2\2\u0295"+
		"\u0297\5\64\33\2\u0296\u0294\3\2\2\2\u0296\u0297\3\2\2\2\u0297\u0299\3"+
		"\2\2\2\u0298\u0292\3\2\2\2\u0299\u029c\3\2\2\2\u029a\u0298\3\2\2\2\u029a"+
		"\u029b\3\2\2\2\u029b\u029e\3\2\2\2\u029c\u029a\3\2\2\2\u029d\u029f\7\35"+
		"\2\2\u029e\u029d\3\2\2\2\u029e\u029f\3\2\2\2\u029f\u02a3\3\2\2\2\u02a0"+
		"\u02a2\7\60\2\2\u02a1\u02a0\3\2\2\2\u02a2\u02a5\3\2\2\2\u02a3\u02a1\3"+
		"\2\2\2\u02a3\u02a4\3\2\2\2\u02a4Q\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a6\u02a8"+
		"\7\60\2\2\u02a7\u02a6\3\2\2\2\u02a8\u02ab\3\2\2\2\u02a9\u02a7\3\2\2\2"+
		"\u02a9\u02aa\3\2\2\2\u02aa\u02bf\3\2\2\2\u02ab\u02a9\3\2\2\2\u02ac\u02ad"+
		"\5Z.\2\u02ad\u02b0\5T+\2\u02ae\u02af\7#\2\2\u02af\u02b1\5\64\33\2\u02b0"+
		"\u02ae\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1\u02ba\3\2\2\2\u02b2\u02b3\7\37"+
		"\2\2\u02b3\u02b6\5T+\2\u02b4\u02b5\7#\2\2\u02b5\u02b7\5\64\33\2\u02b6"+
		"\u02b4\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b9\3\2\2\2\u02b8\u02b2\3\2"+
		"\2\2\u02b9\u02bc\3\2\2\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb"+
		"\u02bd\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02be\7\35\2\2\u02be\u02c0\3"+
		"\2\2\2\u02bf\u02ac\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02bf\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c6\3\2\2\2\u02c3\u02c5\7\60\2\2\u02c4\u02c3\3"+
		"\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2\2\2\u02c6\u02c7\3\2\2\2\u02c7"+
		"S\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9\u02ca\7-\2\2\u02ca\u02cb\b+\1\2\u02cb"+
		"U\3\2\2\2\u02cc\u02cf\5X-\2\u02cd\u02cf\7.\2\2\u02ce\u02cc\3\2\2\2\u02ce"+
		"\u02cd\3\2\2\2\u02cfW\3\2\2\2\u02d0\u02d1\t\2\2\2\u02d1Y\3\2\2\2\u02d2"+
		"\u02d7\5^\60\2\u02d3\u02d7\5\\/\2\u02d4\u02d7\5`\61\2\u02d5\u02d7\5b\62"+
		"\2\u02d6\u02d2\3\2\2\2\u02d6\u02d3\3\2\2\2\u02d6\u02d4\3\2\2\2\u02d6\u02d5"+
		"\3\2\2\2\u02d7[\3\2\2\2\u02d8\u02d9\7\7\2\2\u02d9\u02dd\7 \2\2\u02da\u02de"+
		"\5^\60\2\u02db\u02de\5b\62\2\u02dc\u02de\5\\/\2\u02dd\u02da\3\2\2\2\u02dd"+
		"\u02db\3\2\2\2\u02dd\u02dc\3\2\2\2\u02de]\3\2\2\2\u02df\u02e0\t\3\2\2"+
		"\u02e0_\3\2\2\2\u02e1\u02e2\7\27\2\2\u02e2\u02ec\7\"\2\2\u02e3\u02e8\5"+
		"Z.\2\u02e4\u02e5\7\37\2\2\u02e5\u02e7\5Z.\2\u02e6\u02e4\3\2\2\2\u02e7"+
		"\u02ea\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e8\u02e9\3\2\2\2\u02e9\u02ed\3\2"+
		"\2\2\u02ea\u02e8\3\2\2\2\u02eb\u02ed\7\b\2\2\u02ec\u02e3\3\2\2\2\u02ec"+
		"\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\7,\2\2\u02ef\u02f2\5Z."+
		"\2\u02f0\u02f2\7\b\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\7!\2\2\u02f4a\3\2\2\2\u02f5\u02f6\7\3\2\2\u02f6\u02f7"+
		"\7-\2\2\u02f7c\3\2\2\2ffhmov\u0085\u0089\u008b\u0090\u0096\u00a8\u00ad"+
		"\u00af\u00b4\u00bb\u00c0\u00c2\u00c7\u00cc\u00d7\u00dd\u00e3\u00ea\u00ed"+
		"\u00f3\u00f7\u00f9\u00ff\u0104\u0106\u010e\u0119\u011c\u0125\u0133\u0138"+
		"\u0141\u014e\u0154\u015a\u0165\u0172\u0174\u017c\u0182\u0186\u018b\u018e"+
		"\u0196\u01b7\u01be\u01c2\u01c4\u01ca\u01d0\u01d4\u01d6\u01db\u01e3\u01e8"+
		"\u01f2\u01fb\u0205\u020f\u021b\u021d\u0229\u022b\u0237\u0239\u0244\u0246"+
		"\u0249\u0252\u0259\u0261\u026b\u0270\u0273\u027a\u027d\u0284\u0289\u0290"+
		"\u0296\u029a\u029e\u02a3\u02a9\u02b0\u02b6\u02ba\u02c1\u02c6\u02ce\u02d6"+
		"\u02dd\u02e8\u02ec\u02f1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}