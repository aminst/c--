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
		RULE_cmm = 0, RULE_main = 1, RULE_function = 2, RULE_struct = 3, RULE_structScope = 4, 
		RULE_structFunc = 5, RULE_setGetFuncs = 6, RULE_callArgsDef = 7, RULE_funcArgs = 8, 
		RULE_statement = 9, RULE_returnStatement = 10, RULE_assignStatement = 11, 
		RULE_ifStatement = 12, RULE_callStatement = 13, RULE_whileStatement = 14, 
		RULE_doWhileStatement = 15, RULE_doWhileStatementScope = 16, RULE_displayStatement = 17, 
		RULE_sizeStatement = 18, RULE_appendStatement = 19, RULE_statementScope = 20, 
		RULE_oneLineStatement = 21, RULE_expression = 22, RULE_assignExpression = 23, 
		RULE_logicalOrExpression = 24, RULE_logicalAndExpression = 25, RULE_equalExpression = 26, 
		RULE_comparisonExpression = 27, RULE_plusMinusExpression = 28, RULE_multiplyDivideExpression = 29, 
		RULE_unaryExpression = 30, RULE_retrieveListExpression = 31, RULE_accessMemberExpression = 32, 
		RULE_parantheseExpression = 33, RULE_callArgs = 34, RULE_valueExpression = 35, 
		RULE_varDeclaration = 36, RULE_oneLineVarDeclaration = 37, RULE_varDecName = 38, 
		RULE_value = 39, RULE_boolValue = 40, RULE_type = 41, RULE_listType = 42, 
		RULE_primitiveType = 43, RULE_fptrType = 44, RULE_structType = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"cmm", "main", "function", "struct", "structScope", "structFunc", "setGetFuncs", 
			"callArgsDef", "funcArgs", "statement", "returnStatement", "assignStatement", 
			"ifStatement", "callStatement", "whileStatement", "doWhileStatement", 
			"doWhileStatementScope", "displayStatement", "sizeStatement", "appendStatement", 
			"statementScope", "oneLineStatement", "expression", "assignExpression", 
			"logicalOrExpression", "logicalAndExpression", "equalExpression", "comparisonExpression", 
			"plusMinusExpression", "multiplyDivideExpression", "unaryExpression", 
			"retrieveListExpression", "accessMemberExpression", "parantheseExpression", 
			"callArgs", "valueExpression", "varDeclaration", "oneLineVarDeclaration", 
			"varDecName", "value", "boolValue", "type", "listType", "primitiveType", 
			"fptrType", "structType"
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
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(94);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STRUCT:
						{
						setState(92);
						struct();
						}
						break;
					case NEWLINE:
						{
						setState(93);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << FPTR) | (1L << NEWLINE))) != 0)) {
				{
				setState(101);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STRUCT:
				case INT:
				case BOOL:
				case LIST:
				case VOID:
				case FPTR:
					{
					setState(99);
					function();
					}
					break;
				case NEWLINE:
					{
					setState(100);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			main();
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(107);
				match(NEWLINE);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
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
		public StatementScopeContext statementScope() {
			return getRuleContext(StatementScopeContext.class,0);
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
			setState(115);
			match(MAIN);
			 System.out.print("MAIN\n");
			setState(117);
			match(LPAR);
			setState(118);
			match(RPAR);
			setState(119);
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
		enterRule(_localctx, 4, RULE_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(121);
				type();
				}
				break;
			case VOID:
				{
				setState(122);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(125);
			((FunctionContext)_localctx).func_dec = match(IDENTIFIER);
			 System.out.print("FunctionDec : "+(((FunctionContext)_localctx).func_dec!=null?((FunctionContext)_localctx).func_dec.getText():null)+"\n");
			setState(127);
			match(LPAR);
			setState(128);
			callArgsDef();
			setState(129);
			match(RPAR);
			setState(130);
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
		enterRule(_localctx, 6, RULE_struct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(STRUCT);
			setState(133);
			((StructContext)_localctx).struct_dec = match(IDENTIFIER);
			 System.out.print("StructDec : "+(((StructContext)_localctx).struct_dec!=null?((StructContext)_localctx).struct_dec.getText():null) +"\n");
			setState(135);
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
		enterRule(_localctx, 8, RULE_structScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(BEGIN);
			setState(139); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(138);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(141); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case VOID:
			case FPTR:
				{
				{
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(143);
						varDeclaration();
						}
						break;
					case 2:
						{
						setState(144);
						structFunc();
						}
						break;
					case 3:
						{
						setState(145);
						oneLineVarDeclaration();
						}
						break;
					}
					setState(149); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(148);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(151); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(155); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << VOID) | (1L << FPTR))) != 0) );
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(157);
					match(NEWLINE);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case END:
			case NEWLINE:
				{
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(163);
					match(NEWLINE);
					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(171);
			match(END);
			setState(172);
			match(NEWLINE);
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
		public TerminalNode IDENTIFIER() { return getToken(CmmParser.IDENTIFIER, 0); }
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public CallArgsDefContext callArgsDef() {
			return getRuleContext(CallArgsDefContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public SetGetFuncsContext setGetFuncs() {
			return getRuleContext(SetGetFuncsContext.class,0);
		}
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
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
		enterRule(_localctx, 10, RULE_structFunc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(174);
				type();
				}
				break;
			case VOID:
				{
				setState(175);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(178);
			match(IDENTIFIER);
			setState(179);
			match(LPAR);
			setState(180);
			callArgsDef();
			setState(181);
			match(RPAR);
			setState(182);
			match(BEGIN);
			setState(183);
			match(NEWLINE);
			setState(184);
			setGetFuncs();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(185);
				match(NEWLINE);
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(191);
			match(END);
			setState(192);
			match(NEWLINE);
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
		public List<StatementScopeContext> statementScope() {
			return getRuleContexts(StatementScopeContext.class);
		}
		public StatementScopeContext statementScope(int i) {
			return getRuleContext(StatementScopeContext.class,i);
		}
		public TerminalNode GET() { return getToken(CmmParser.GET, 0); }
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
		enterRule(_localctx, 12, RULE_setGetFuncs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SET);
			 System.out.print("Setter\n");
			setState(196);
			statementScope();
			setState(197);
			match(GET);
			 System.out.print("Getter\n");
			setState(199);
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
		enterRule(_localctx, 14, RULE_callArgsDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << FPTR))) != 0)) {
				{
				setState(201);
				funcArgs();
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(202);
					match(COMMA);
					setState(203);
					funcArgs();
					}
					}
					setState(208);
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
		enterRule(_localctx, 16, RULE_funcArgs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			type();
			setState(212);
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
		enterRule(_localctx, 18, RULE_statement);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(217);
				assignStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(219);
				doWhileStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(220);
				returnStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(221);
				callStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(222);
				displayStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(223);
				sizeStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(224);
				appendStatement();
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
		enterRule(_localctx, 20, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(RETURN);
			 System.out.print("Return\n");
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM))) != 0)) {
				{
				setState(229);
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
		enterRule(_localctx, 22, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			logicalOrExpression();
			setState(233);
			match(ASSIGN);
			setState(234);
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
		enterRule(_localctx, 24, RULE_ifStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IF);
			 System.out.print("Conditional : if\n");
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				{
				setState(238);
				match(LPAR);
				setState(239);
				expression();
				setState(240);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(242);
				expression();
				}
				break;
			}
			setState(245);
			statementScope();
			setState(249);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(246);
					match(NEWLINE);
					}
					} 
				}
				setState(251);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(252);
				match(ELSE);
				 System.out.print("Conditional : else\n");
				setState(254);
				statementScope();
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
		enterRule(_localctx, 26, RULE_callStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
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
		enterRule(_localctx, 28, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(WHILE);
			 System.out.print("Loop : while\n");
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				{
				setState(261);
				match(LPAR);
				setState(262);
				expression();
				setState(263);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(265);
				expression();
				}
				break;
			}
			setState(268);
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
		enterRule(_localctx, 30, RULE_doWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(DO);
			 System.out.print("Loop : do...while\n");
			setState(272);
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
		public TerminalNode BEGIN() { return getToken(CmmParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(CmmParser.END, 0); }
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CmmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CmmParser.NEWLINE, i);
		}
		public TerminalNode LPAR() { return getToken(CmmParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CmmParser.RPAR, 0); }
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
		enterRule(_localctx, 32, RULE_doWhileStatementScope);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(BEGIN);
			setState(276); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(275);
					match(NEWLINE);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(278); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(299);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(289); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						setState(280);
						statement();
						}
						break;
					case 2:
						{
						setState(281);
						oneLineStatement();
						}
						break;
					}
					setState(285); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(284);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(287); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(291); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << RETURN) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << FPTR) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM) | (1L << NEWLINE))) != 0) );
				}
				break;
			case 2:
				{
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(293);
					match(NEWLINE);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(301);
			match(END);
			setState(302);
			match(WHILE);
			setState(308);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				{
				setState(303);
				match(LPAR);
				setState(304);
				expression();
				setState(305);
				match(RPAR);
				}
				}
				break;
			case 2:
				{
				setState(307);
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
		enterRule(_localctx, 34, RULE_displayStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(DISPLAY);
			 System.out.print("Build-in : display\n");
			setState(312);
			match(LPAR);
			setState(313);
			logicalOrExpression();
			setState(314);
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
		enterRule(_localctx, 36, RULE_sizeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(SIZE);
			 System.out.print("Size\n");
			setState(318);
			match(LPAR);
			setState(319);
			match(IDENTIFIER);
			setState(320);
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
		enterRule(_localctx, 38, RULE_appendStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(APPEND);
			 System.out.print("Append\n");
			setState(324);
			match(LPAR);
			setState(325);
			expression();
			setState(326);
			match(COMMA);
			setState(327);
			expression();
			setState(328);
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
		enterRule(_localctx, 40, RULE_statementScope);
		int _la;
		try {
			int _alt;
			setState(377);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BEGIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				match(BEGIN);
				setState(332); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(331);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(334); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(345); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(338);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
						case 1:
							{
							setState(336);
							statement();
							}
							break;
						case 2:
							{
							setState(337);
							oneLineStatement();
							}
							break;
						}
						setState(341); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(340);
								match(NEWLINE);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(343); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						}
						setState(347); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << RETURN) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << FPTR) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM) | (1L << NEWLINE))) != 0) );
					}
					break;
				case 2:
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
					}
					break;
				}
				setState(357);
				match(END);
				setState(359); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(358);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(361); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(364); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(363);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(366); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(370);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(368);
					statement();
					}
					break;
				case 2:
					{
					setState(369);
					oneLineStatement();
					}
					break;
				}
				setState(373); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(372);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(375); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 42, RULE_oneLineStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << WHILE) | (1L << DO) | (1L << IF) | (1L << RETURN) | (1L << DISPLAY) | (1L << APPEND) | (1L << SIZE) | (1L << TRUE) | (1L << FALSE) | (1L << FPTR) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM))) != 0)) {
				{
				{
				setState(379);
				statement();
				setState(380);
				match(SEMICOLON);
				}
				}
				setState(386);
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
		enterRule(_localctx, 44, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
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
		enterRule(_localctx, 46, RULE_assignExpression);
		try {
			setState(394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(389);
				logicalOrExpression();
				setState(390);
				match(ASSIGN);
				setState(391);
				assignExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(393);
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
		enterRule(_localctx, 48, RULE_logicalOrExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			logicalAndExpression();
			setState(402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(397);
				match(OR);
				 System.out.print("Operator : |\n");
				setState(399);
				logicalAndExpression();
				}
				}
				setState(404);
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
		enterRule(_localctx, 50, RULE_logicalAndExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			equalExpression();
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(406);
				match(AND);
				 System.out.print("Operator : &\n");
				setState(408);
				equalExpression();
				}
				}
				setState(413);
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
		enterRule(_localctx, 52, RULE_equalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			comparisonExpression();
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EQUAL) {
				{
				{
				setState(415);
				match(EQUAL);
				 System.out.print("Operator : ==\n");
				setState(417);
				comparisonExpression();
				}
				}
				setState(422);
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
		enterRule(_localctx, 54, RULE_comparisonExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			plusMinusExpression();
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==GT || _la==LT) {
				{
				{
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case GT:
					{
					setState(424);
					match(GT);
					 System.out.print("Operator : >\n");
					}
					break;
				case LT:
					{
					setState(426);
					match(LT);
					 System.out.print("Operator : <\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(430);
				plusMinusExpression();
				}
				}
				setState(435);
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
		enterRule(_localctx, 56, RULE_plusMinusExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			multiplyDivideExpression();
			setState(446);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(441);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(437);
					match(PLUS);
					 System.out.print("Operator : +\n");
					}
					break;
				case MINUS:
					{
					setState(439);
					match(MINUS);
					 System.out.print("Operator : -\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(443);
				multiplyDivideExpression();
				}
				}
				setState(448);
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
		enterRule(_localctx, 58, RULE_multiplyDivideExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(449);
			unaryExpression();
			setState(459);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AESTRIK || _la==DIVIDE) {
				{
				{
				setState(454);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AESTRIK:
					{
					setState(450);
					match(AESTRIK);
					 System.out.print("Operator : *\n");
					}
					break;
				case DIVIDE:
					{
					setState(452);
					match(DIVIDE);
					 System.out.print("Operator : /\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(456);
				unaryExpression();
				}
				}
				setState(461);
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
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(CmmParser.MINUS, 0); }
		public TerminalNode TILDE() { return getToken(CmmParser.TILDE, 0); }
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
		enterRule(_localctx, 60, RULE_unaryExpression);
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
					{
					setState(462);
					match(MINUS);
					 System.out.print("Operator : -\n");
					}
					break;
				case TILDE:
					{
					setState(464);
					match(TILDE);
					 System.out.print("Operator : ~\n");
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(468);
				unaryExpression();
				}
				break;
			case TRUE:
			case FALSE:
			case LPAR:
			case IDENTIFIER:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
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
		enterRule(_localctx, 62, RULE_retrieveListExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(472);
			accessMemberExpression();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACKET) {
				{
				{
				setState(473);
				match(LBRACKET);
				setState(474);
				expression();
				setState(475);
				match(RBRACKET);
				}
				}
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(486);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(482);
					match(DOT);
					setState(483);
					retrieveListExpression();
					}
					} 
				}
				setState(488);
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
		enterRule(_localctx, 64, RULE_accessMemberExpression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			parantheseExpression();
			setState(494);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(490);
					match(DOT);
					setState(491);
					match(IDENTIFIER);
					}
					} 
				}
				setState(496);
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
		enterRule(_localctx, 66, RULE_parantheseExpression);
		int _la;
		try {
			setState(511);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case IDENTIFIER:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(497);
				valueExpression();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LPAR) {
					{
					{
					setState(498);
					match(LPAR);
					setState(499);
					callArgs();
					setState(500);
					match(RPAR);
					}
					}
					setState(506);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				match(LPAR);
				setState(508);
				expression();
				setState(509);
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
		enterRule(_localctx, 68, RULE_callArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << LPAR) | (1L << MINUS) | (1L << TILDE) | (1L << IDENTIFIER) | (1L << NUM))) != 0)) {
				{
				setState(513);
				expression();
				setState(518);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(514);
					match(COMMA);
					setState(515);
					expression();
					}
					}
					setState(520);
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
		enterRule(_localctx, 70, RULE_valueExpression);
		try {
			setState(526);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(524);
				match(NUM);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				match(IDENTIFIER);
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
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public TerminalNode SEMICOLON() { return getToken(CmmParser.SEMICOLON, 0); }
		public List<TerminalNode> ASSIGN() { return getTokens(CmmParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(CmmParser.ASSIGN, i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 72, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			type();
			{
			setState(529);
			varDecName();
			setState(535);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(530);
				match(ASSIGN);
				setState(533);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
				case NUM:
					{
					setState(531);
					value();
					}
					break;
				case IDENTIFIER:
					{
					setState(532);
					varDecName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(537);
				match(COMMA);
				{
				setState(538);
				varDecName();
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(539);
					match(ASSIGN);
					setState(542);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case NUM:
						{
						setState(540);
						value();
						}
						break;
					case IDENTIFIER:
						{
						setState(541);
						varDecName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(552);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(551);
				match(SEMICOLON);
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

	public static class OneLineVarDeclarationContext extends ParserRuleContext {
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
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
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
		enterRule(_localctx, 74, RULE_oneLineVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				type();
				{
				setState(555);
				varDecName();
				setState(561);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASSIGN) {
					{
					setState(556);
					match(ASSIGN);
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TRUE:
					case FALSE:
					case NUM:
						{
						setState(557);
						value();
						}
						break;
					case IDENTIFIER:
						{
						setState(558);
						varDecName();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
				}

				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(563);
					match(COMMA);
					{
					setState(564);
					varDecName();
					setState(570);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ASSIGN) {
						{
						setState(565);
						match(ASSIGN);
						setState(568);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case TRUE:
						case FALSE:
						case NUM:
							{
							setState(566);
							value();
							}
							break;
						case IDENTIFIER:
							{
							setState(567);
							varDecName();
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						}
					}

					}
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(577);
				match(SEMICOLON);
				}
				}
				setState(581); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STRUCT) | (1L << INT) | (1L << BOOL) | (1L << LIST) | (1L << FPTR))) != 0) );
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
		enterRule(_localctx, 76, RULE_varDecName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(583);
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
		enterRule(_localctx, 78, RULE_value);
		try {
			setState(588);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				boolValue();
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(587);
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
		enterRule(_localctx, 80, RULE_boolValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
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
		enterRule(_localctx, 82, RULE_type);
		try {
			setState(596);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				primitiveType();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 2);
				{
				setState(593);
				listType();
				}
				break;
			case FPTR:
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				fptrType();
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 4);
				{
				setState(595);
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
		enterRule(_localctx, 84, RULE_listType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(598);
			match(LIST);
			setState(599);
			match(SHARP);
			setState(603);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case BOOL:
				{
				setState(600);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(601);
				structType();
				}
				break;
			case LIST:
				{
				setState(602);
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
		enterRule(_localctx, 86, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
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
		enterRule(_localctx, 88, RULE_fptrType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(FPTR);
			setState(608);
			match(LT);
			setState(618);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(609);
				type();
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(610);
					match(COMMA);
					setState(611);
					type();
					}
					}
					setState(616);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case VOID:
				{
				setState(617);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(620);
			match(ARROW);
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRUCT:
			case INT:
			case BOOL:
			case LIST:
			case FPTR:
				{
				setState(621);
				type();
				}
				break;
			case VOID:
				{
				setState(622);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(625);
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
		enterRule(_localctx, 90, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			match(STRUCT);
			setState(628);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\61\u0279\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\7\2a\n\2\f\2\16\2d\13\2\3\2\3\2\7\2h\n"+
		"\2\f\2\16\2k\13\2\3\2\3\2\7\2o\n\2\f\2\16\2r\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\5\4~\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\6\6\u008e\n\6\r\6\16\6\u008f\3\6\3\6\3\6\5\6\u0095\n"+
		"\6\3\6\6\6\u0098\n\6\r\6\16\6\u0099\6\6\u009c\n\6\r\6\16\6\u009d\3\6\7"+
		"\6\u00a1\n\6\f\6\16\6\u00a4\13\6\3\6\7\6\u00a7\n\6\f\6\16\6\u00aa\13\6"+
		"\5\6\u00ac\n\6\3\6\3\6\3\6\3\7\3\7\5\7\u00b3\n\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\t\3\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2\13\t\5\t\u00d4"+
		"\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13\u00e4\n\13\3\f\3\f\3\f\5\f\u00e9\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u00f6\n\16\3\16\3\16\7\16\u00fa\n\16\f\16"+
		"\16\16\u00fd\13\16\3\16\3\16\3\16\5\16\u0102\n\16\3\17\3\17\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u010d\n\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\6\22\u0117\n\22\r\22\16\22\u0118\3\22\3\22\5\22\u011d\n\22"+
		"\3\22\6\22\u0120\n\22\r\22\16\22\u0121\6\22\u0124\n\22\r\22\16\22\u0125"+
		"\3\22\7\22\u0129\n\22\f\22\16\22\u012c\13\22\5\22\u012e\n\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u0137\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\6\26\u014f\n\26\r\26\16\26\u0150\3\26\3\26\5\26\u0155\n\26"+
		"\3\26\6\26\u0158\n\26\r\26\16\26\u0159\6\26\u015c\n\26\r\26\16\26\u015d"+
		"\3\26\7\26\u0161\n\26\f\26\16\26\u0164\13\26\5\26\u0166\n\26\3\26\3\26"+
		"\6\26\u016a\n\26\r\26\16\26\u016b\3\26\6\26\u016f\n\26\r\26\16\26\u0170"+
		"\3\26\3\26\5\26\u0175\n\26\3\26\6\26\u0178\n\26\r\26\16\26\u0179\5\26"+
		"\u017c\n\26\3\27\3\27\3\27\7\27\u0181\n\27\f\27\16\27\u0184\13\27\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\5\31\u018d\n\31\3\32\3\32\3\32\3\32\7\32"+
		"\u0193\n\32\f\32\16\32\u0196\13\32\3\33\3\33\3\33\3\33\7\33\u019c\n\33"+
		"\f\33\16\33\u019f\13\33\3\34\3\34\3\34\3\34\7\34\u01a5\n\34\f\34\16\34"+
		"\u01a8\13\34\3\35\3\35\3\35\3\35\3\35\5\35\u01af\n\35\3\35\7\35\u01b2"+
		"\n\35\f\35\16\35\u01b5\13\35\3\36\3\36\3\36\3\36\3\36\5\36\u01bc\n\36"+
		"\3\36\7\36\u01bf\n\36\f\36\16\36\u01c2\13\36\3\37\3\37\3\37\3\37\3\37"+
		"\5\37\u01c9\n\37\3\37\7\37\u01cc\n\37\f\37\16\37\u01cf\13\37\3 \3 \3 "+
		"\3 \5 \u01d5\n \3 \3 \5 \u01d9\n \3!\3!\3!\3!\3!\7!\u01e0\n!\f!\16!\u01e3"+
		"\13!\3!\3!\7!\u01e7\n!\f!\16!\u01ea\13!\3\"\3\"\3\"\7\"\u01ef\n\"\f\""+
		"\16\"\u01f2\13\"\3#\3#\3#\3#\3#\7#\u01f9\n#\f#\16#\u01fc\13#\3#\3#\3#"+
		"\3#\5#\u0202\n#\3$\3$\3$\7$\u0207\n$\f$\16$\u020a\13$\5$\u020c\n$\3%\3"+
		"%\3%\5%\u0211\n%\3&\3&\3&\3&\3&\5&\u0218\n&\5&\u021a\n&\3&\3&\3&\3&\3"+
		"&\5&\u0221\n&\5&\u0223\n&\7&\u0225\n&\f&\16&\u0228\13&\3&\5&\u022b\n&"+
		"\3\'\3\'\3\'\3\'\3\'\5\'\u0232\n\'\5\'\u0234\n\'\3\'\3\'\3\'\3\'\3\'\5"+
		"\'\u023b\n\'\5\'\u023d\n\'\7\'\u023f\n\'\f\'\16\'\u0242\13\'\3\'\3\'\6"+
		"\'\u0246\n\'\r\'\16\'\u0247\3(\3(\3(\3)\3)\5)\u024f\n)\3*\3*\3+\3+\3+"+
		"\3+\5+\u0257\n+\3,\3,\3,\3,\3,\5,\u025e\n,\3-\3-\3.\3.\3.\3.\3.\7.\u0267"+
		"\n.\f.\16.\u026a\13.\3.\5.\u026d\n.\3.\3.\3.\5.\u0272\n.\3.\3.\3/\3/\3"+
		"/\3/\2\2\60\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRTVXZ\\\2\4\3\2\25\26\3\2\5\6\2\u02a7\2b\3\2\2\2\4u\3\2\2"+
		"\2\6}\3\2\2\2\b\u0086\3\2\2\2\n\u008b\3\2\2\2\f\u00b2\3\2\2\2\16\u00c4"+
		"\3\2\2\2\20\u00d3\3\2\2\2\22\u00d5\3\2\2\2\24\u00e3\3\2\2\2\26\u00e5\3"+
		"\2\2\2\30\u00ea\3\2\2\2\32\u00ee\3\2\2\2\34\u0103\3\2\2\2\36\u0105\3\2"+
		"\2\2 \u0110\3\2\2\2\"\u0114\3\2\2\2$\u0138\3\2\2\2&\u013e\3\2\2\2(\u0144"+
		"\3\2\2\2*\u017b\3\2\2\2,\u0182\3\2\2\2.\u0185\3\2\2\2\60\u018c\3\2\2\2"+
		"\62\u018e\3\2\2\2\64\u0197\3\2\2\2\66\u01a0\3\2\2\28\u01a9\3\2\2\2:\u01b6"+
		"\3\2\2\2<\u01c3\3\2\2\2>\u01d8\3\2\2\2@\u01da\3\2\2\2B\u01eb\3\2\2\2D"+
		"\u0201\3\2\2\2F\u020b\3\2\2\2H\u0210\3\2\2\2J\u0212\3\2\2\2L\u0245\3\2"+
		"\2\2N\u0249\3\2\2\2P\u024e\3\2\2\2R\u0250\3\2\2\2T\u0256\3\2\2\2V\u0258"+
		"\3\2\2\2X\u025f\3\2\2\2Z\u0261\3\2\2\2\\\u0275\3\2\2\2^a\5\b\5\2_a\7\60"+
		"\2\2`^\3\2\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ci\3\2\2\2db\3\2"+
		"\2\2eh\5\6\4\2fh\7\60\2\2ge\3\2\2\2gf\3\2\2\2hk\3\2\2\2ig\3\2\2\2ij\3"+
		"\2\2\2jl\3\2\2\2ki\3\2\2\2lp\5\4\3\2mo\7\60\2\2nm\3\2\2\2or\3\2\2\2pn"+
		"\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7\2\2\3t\3\3\2\2\2uv\7\4\2\2"+
		"vw\b\3\1\2wx\7\31\2\2xy\7\32\2\2yz\5*\26\2z\5\3\2\2\2{~\5T+\2|~\7\b\2"+
		"\2}{\3\2\2\2}|\3\2\2\2~\177\3\2\2\2\177\u0080\7-\2\2\u0080\u0081\b\4\1"+
		"\2\u0081\u0082\7\31\2\2\u0082\u0083\5\20\t\2\u0083\u0084\7\32\2\2\u0084"+
		"\u0085\5*\26\2\u0085\7\3\2\2\2\u0086\u0087\7\3\2\2\u0087\u0088\7-\2\2"+
		"\u0088\u0089\b\5\1\2\u0089\u008a\5\n\6\2\u008a\t\3\2\2\2\u008b\u008d\7"+
		"\20\2\2\u008c\u008e\7\60\2\2\u008d\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u00ab\3\2\2\2\u0091\u0095\5J"+
		"&\2\u0092\u0095\5\f\7\2\u0093\u0095\5L\'\2\u0094\u0091\3\2\2\2\u0094\u0092"+
		"\3\2\2\2\u0094\u0093\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0098\7\60\2\2"+
		"\u0097\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u009a"+
		"\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0094\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a2\3\2\2\2\u009f\u00a1\7\60"+
		"\2\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00ac\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5\u00a7\7\60"+
		"\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00ab\u009b\3\2"+
		"\2\2\u00ab\u00a8\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\7\21\2\2\u00ae"+
		"\u00af\7\60\2\2\u00af\13\3\2\2\2\u00b0\u00b3\5T+\2\u00b1\u00b3\7\b\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5"+
		"\7-\2\2\u00b5\u00b6\7\31\2\2\u00b6\u00b7\5\20\t\2\u00b7\u00b8\7\32\2\2"+
		"\u00b8\u00b9\7\20\2\2\u00b9\u00ba\7\60\2\2\u00ba\u00be\5\16\b\2\u00bb"+
		"\u00bd\7\60\2\2\u00bc\u00bb\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1"+
		"\u00c2\7\21\2\2\u00c2\u00c3\7\60\2\2\u00c3\r\3\2\2\2\u00c4\u00c5\7\17"+
		"\2\2\u00c5\u00c6\b\b\1\2\u00c6\u00c7\5*\26\2\u00c7\u00c8\7\16\2\2\u00c8"+
		"\u00c9\b\b\1\2\u00c9\u00ca\5*\26\2\u00ca\17\3\2\2\2\u00cb\u00d0\5\22\n"+
		"\2\u00cc\u00cd\7\37\2\2\u00cd\u00cf\5\22\n\2\u00ce\u00cc\3\2\2\2\u00cf"+
		"\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d4\3\2"+
		"\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00cb\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4"+
		"\21\3\2\2\2\u00d5\u00d6\5T+\2\u00d6\u00d7\7-\2\2\u00d7\u00d8\b\n\1\2\u00d8"+
		"\23\3\2\2\2\u00d9\u00e4\5J&\2\u00da\u00e4\5\32\16\2\u00db\u00e4\5\30\r"+
		"\2\u00dc\u00e4\5\36\20\2\u00dd\u00e4\5 \21\2\u00de\u00e4\5\26\f\2\u00df"+
		"\u00e4\5\34\17\2\u00e0\u00e4\5$\23\2\u00e1\u00e4\5&\24\2\u00e2\u00e4\5"+
		"(\25\2\u00e3\u00d9\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00dc\3\2\2\2\u00e3\u00dd\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00df\3\2"+
		"\2\2\u00e3\u00e0\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\25\3\2\2\2\u00e5\u00e6\7\r\2\2\u00e6\u00e8\b\f\1\2\u00e7\u00e9\5.\30"+
		"\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\27\3\2\2\2\u00ea\u00eb"+
		"\5\62\32\2\u00eb\u00ec\7#\2\2\u00ec\u00ed\5.\30\2\u00ed\31\3\2\2\2\u00ee"+
		"\u00ef\7\13\2\2\u00ef\u00f5\b\16\1\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2"+
		"\5.\30\2\u00f2\u00f3\7\32\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f6\5.\30\2"+
		"\u00f5\u00f0\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00fb"+
		"\5*\26\2\u00f8\u00fa\7\60\2\2\u00f9\u00f8\3\2\2\2\u00fa\u00fd\3\2\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u0101\3\2\2\2\u00fd\u00fb"+
		"\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff\u0100\b\16\1\2\u0100\u0102\5*\26\2"+
		"\u0101\u00fe\3\2\2\2\u0101\u0102\3\2\2\2\u0102\33\3\2\2\2\u0103\u0104"+
		"\5D#\2\u0104\35\3\2\2\2\u0105\u0106\7\t\2\2\u0106\u010c\b\20\1\2\u0107"+
		"\u0108\7\31\2\2\u0108\u0109\5.\30\2\u0109\u010a\7\32\2\2\u010a\u010d\3"+
		"\2\2\2\u010b\u010d\5.\30\2\u010c\u0107\3\2\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\5*\26\2\u010f\37\3\2\2\2\u0110\u0111\7\n\2"+
		"\2\u0111\u0112\b\21\1\2\u0112\u0113\5\"\22\2\u0113!\3\2\2\2\u0114\u0116"+
		"\7\20\2\2\u0115\u0117\7\60\2\2\u0116\u0115\3\2\2\2\u0117\u0118\3\2\2\2"+
		"\u0118\u0116\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u012d\3\2\2\2\u011a\u011d"+
		"\5\24\13\2\u011b\u011d\5,\27\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2"+
		"\u011d\u011f\3\2\2\2\u011e\u0120\7\60\2\2\u011f\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0124\3\2\2\2\u0123"+
		"\u011c\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2"+
		"\2\2\u0126\u012e\3\2\2\2\u0127\u0129\7\60\2\2\u0128\u0127\3\2\2\2\u0129"+
		"\u012c\3\2\2\2\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012e\3\2"+
		"\2\2\u012c\u012a\3\2\2\2\u012d\u0123\3\2\2\2\u012d\u012a\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7\21\2\2\u0130\u0136\7\t\2\2\u0131\u0132\7"+
		"\31\2\2\u0132\u0133\5.\30\2\u0133\u0134\7\32\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0137\5.\30\2\u0136\u0131\3\2\2\2\u0136\u0135\3\2\2\2\u0137#\3\2\2\2"+
		"\u0138\u0139\7\22\2\2\u0139\u013a\b\23\1\2\u013a\u013b\7\31\2\2\u013b"+
		"\u013c\5\62\32\2\u013c\u013d\7\32\2\2\u013d%\3\2\2\2\u013e\u013f\7\24"+
		"\2\2\u013f\u0140\b\24\1\2\u0140\u0141\7\31\2\2\u0141\u0142\7-\2\2\u0142"+
		"\u0143\7\32\2\2\u0143\'\3\2\2\2\u0144\u0145\7\23\2\2\u0145\u0146\b\25"+
		"\1\2\u0146\u0147\7\31\2\2\u0147\u0148\5.\30\2\u0148\u0149\7\37\2\2\u0149"+
		"\u014a\5.\30\2\u014a\u014b\7\32\2\2\u014b)\3\2\2\2\u014c\u014e\7\20\2"+
		"\2\u014d\u014f\7\60\2\2\u014e\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150"+
		"\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0165\3\2\2\2\u0152\u0155\5\24"+
		"\13\2\u0153\u0155\5,\27\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0158\7\60\2\2\u0157\u0156\3\2\2\2\u0158\u0159\3"+
		"\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b"+
		"\u0154\3\2\2\2\u015c\u015d\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2"+
		"\2\2\u015e\u0166\3\2\2\2\u015f\u0161\7\60\2\2\u0160\u015f\3\2\2\2\u0161"+
		"\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163\u0166\3\2"+
		"\2\2\u0164\u0162\3\2\2\2\u0165\u015b\3\2\2\2\u0165\u0162\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\7\21\2\2\u0168\u016a\7\60\2\2\u0169\u0168\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c"+
		"\u017c\3\2\2\2\u016d\u016f\7\60\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3"+
		"\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0174\3\2\2\2\u0172"+
		"\u0175\5\24\13\2\u0173\u0175\5,\27\2\u0174\u0172\3\2\2\2\u0174\u0173\3"+
		"\2\2\2\u0175\u0177\3\2\2\2\u0176\u0178\7\60\2\2\u0177\u0176\3\2\2\2\u0178"+
		"\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017c\3\2"+
		"\2\2\u017b\u014c\3\2\2\2\u017b\u016e\3\2\2\2\u017c+\3\2\2\2\u017d\u017e"+
		"\5\24\13\2\u017e\u017f\7\35\2\2\u017f\u0181\3\2\2\2\u0180\u017d\3\2\2"+
		"\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2\2\2\u0183-"+
		"\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\5\60\31\2\u0186/\3\2\2\2\u0187"+
		"\u0188\5\62\32\2\u0188\u0189\7#\2\2\u0189\u018a\5\60\31\2\u018a\u018d"+
		"\3\2\2\2\u018b\u018d\5\62\32\2\u018c\u0187\3\2\2\2\u018c\u018b\3\2\2\2"+
		"\u018d\61\3\2\2\2\u018e\u0194\5\64\33\2\u018f\u0190\7*\2\2\u0190\u0191"+
		"\b\32\1\2\u0191\u0193\5\64\33\2\u0192\u018f\3\2\2\2\u0193\u0196\3\2\2"+
		"\2\u0194\u0192\3\2\2\2\u0194\u0195\3\2\2\2\u0195\63\3\2\2\2\u0196\u0194"+
		"\3\2\2\2\u0197\u019d\5\66\34\2\u0198\u0199\7)\2\2\u0199\u019a\b\33\1\2"+
		"\u019a\u019c\5\66\34\2\u019b\u0198\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\65\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a6\58\35\2\u01a1\u01a2\7$\2\2\u01a2\u01a3\b\34\1\2\u01a3\u01a5\58"+
		"\35\2\u01a4\u01a1\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6"+
		"\u01a7\3\2\2\2\u01a7\67\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01b3\5:\36"+
		"\2\u01aa\u01ab\7!\2\2\u01ab\u01af\b\35\1\2\u01ac\u01ad\7\"\2\2\u01ad\u01af"+
		"\b\35\1\2\u01ae\u01aa\3\2\2\2\u01ae\u01ac\3\2\2\2\u01af\u01b0\3\2\2\2"+
		"\u01b0\u01b2\5:\36\2\u01b1\u01ae\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1"+
		"\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b49\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6"+
		"\u01c0\5<\37\2\u01b7\u01b8\7\'\2\2\u01b8\u01bc\b\36\1\2\u01b9\u01ba\7"+
		"(\2\2\u01ba\u01bc\b\36\1\2\u01bb\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc"+
		"\u01bd\3\2\2\2\u01bd\u01bf\5<\37\2\u01be\u01bb\3\2\2\2\u01bf\u01c2\3\2"+
		"\2\2\u01c0\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1;\3\2\2\2\u01c2\u01c0"+
		"\3\2\2\2\u01c3\u01cd\5> \2\u01c4\u01c5\7%\2\2\u01c5\u01c9\b\37\1\2\u01c6"+
		"\u01c7\7&\2\2\u01c7\u01c9\b\37\1\2\u01c8\u01c4\3\2\2\2\u01c8\u01c6\3\2"+
		"\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cc\5> \2\u01cb\u01c8\3\2\2\2\u01cc\u01cf"+
		"\3\2\2\2\u01cd\u01cb\3\2\2\2\u01cd\u01ce\3\2\2\2\u01ce=\3\2\2\2\u01cf"+
		"\u01cd\3\2\2\2\u01d0\u01d1\7(\2\2\u01d1\u01d5\b \1\2\u01d2\u01d3\7+\2"+
		"\2\u01d3\u01d5\b \1\2\u01d4\u01d0\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5\u01d6"+
		"\3\2\2\2\u01d6\u01d9\5> \2\u01d7\u01d9\5@!\2\u01d8\u01d4\3\2\2\2\u01d8"+
		"\u01d7\3\2\2\2\u01d9?\3\2\2\2\u01da\u01e1\5B\"\2\u01db\u01dc\7\33\2\2"+
		"\u01dc\u01dd\5.\30\2\u01dd\u01de\7\34\2\2\u01de\u01e0\3\2\2\2\u01df\u01db"+
		"\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2"+
		"\u01e8\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e5\7\36\2\2\u01e5\u01e7\5"+
		"@!\2\u01e6\u01e4\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9A\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01f0\5D#\2\u01ec"+
		"\u01ed\7\36\2\2\u01ed\u01ef\7-\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f2\3\2"+
		"\2\2\u01f0\u01ee\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1C\3\2\2\2\u01f2\u01f0"+
		"\3\2\2\2\u01f3\u01fa\5H%\2\u01f4\u01f5\7\31\2\2\u01f5\u01f6\5F$\2\u01f6"+
		"\u01f7\7\32\2\2\u01f7\u01f9\3\2\2\2\u01f8\u01f4\3\2\2\2\u01f9\u01fc\3"+
		"\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u0202\3\2\2\2\u01fc"+
		"\u01fa\3\2\2\2\u01fd\u01fe\7\31\2\2\u01fe\u01ff\5.\30\2\u01ff\u0200\7"+
		"\32\2\2\u0200\u0202\3\2\2\2\u0201\u01f3\3\2\2\2\u0201\u01fd\3\2\2\2\u0202"+
		"E\3\2\2\2\u0203\u0208\5.\30\2\u0204\u0205\7\37\2\2\u0205\u0207\5.\30\2"+
		"\u0206\u0204\3\2\2\2\u0207\u020a\3\2\2\2\u0208\u0206\3\2\2\2\u0208\u0209"+
		"\3\2\2\2\u0209\u020c\3\2\2\2\u020a\u0208\3\2\2\2\u020b\u0203\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020cG\3\2\2\2\u020d\u0211\5R*\2\u020e\u0211\7.\2\2\u020f"+
		"\u0211\7-\2\2\u0210\u020d\3\2\2\2\u0210\u020e\3\2\2\2\u0210\u020f\3\2"+
		"\2\2\u0211I\3\2\2\2\u0212\u0213\5T+\2\u0213\u0219\5N(\2\u0214\u0217\7"+
		"#\2\2\u0215\u0218\5P)\2\u0216\u0218\5N(\2\u0217\u0215\3\2\2\2\u0217\u0216"+
		"\3\2\2\2\u0218\u021a\3\2\2\2\u0219\u0214\3\2\2\2\u0219\u021a\3\2\2\2\u021a"+
		"\u0226\3\2\2\2\u021b\u021c\7\37\2\2\u021c\u0222\5N(\2\u021d\u0220\7#\2"+
		"\2\u021e\u0221\5P)\2\u021f\u0221\5N(\2\u0220\u021e\3\2\2\2\u0220\u021f"+
		"\3\2\2\2\u0221\u0223\3\2\2\2\u0222\u021d\3\2\2\2\u0222\u0223\3\2\2\2\u0223"+
		"\u0225\3\2\2\2\u0224\u021b\3\2\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2"+
		"\2\2\u0226\u0227\3\2\2\2\u0227\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0229"+
		"\u022b\7\35\2\2\u022a\u0229\3\2\2\2\u022a\u022b\3\2\2\2\u022bK\3\2\2\2"+
		"\u022c\u022d\5T+\2\u022d\u0233\5N(\2\u022e\u0231\7#\2\2\u022f\u0232\5"+
		"P)\2\u0230\u0232\5N(\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2\2\u0232\u0234"+
		"\3\2\2\2\u0233\u022e\3\2\2\2\u0233\u0234\3\2\2\2\u0234\u0240\3\2\2\2\u0235"+
		"\u0236\7\37\2\2\u0236\u023c\5N(\2\u0237\u023a\7#\2\2\u0238\u023b\5P)\2"+
		"\u0239\u023b\5N(\2\u023a\u0238\3\2\2\2\u023a\u0239\3\2\2\2\u023b\u023d"+
		"\3\2\2\2\u023c\u0237\3\2\2\2\u023c\u023d\3\2\2\2\u023d\u023f\3\2\2\2\u023e"+
		"\u0235\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240\u0241\3\2"+
		"\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\7\35\2\2\u0244"+
		"\u0246\3\2\2\2\u0245\u022c\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0245\3\2"+
		"\2\2\u0247\u0248\3\2\2\2\u0248M\3\2\2\2\u0249\u024a\7-\2\2\u024a\u024b"+
		"\b(\1\2\u024bO\3\2\2\2\u024c\u024f\5R*\2\u024d\u024f\7.\2\2\u024e\u024c"+
		"\3\2\2\2\u024e\u024d\3\2\2\2\u024fQ\3\2\2\2\u0250\u0251\t\2\2\2\u0251"+
		"S\3\2\2\2\u0252\u0257\5X-\2\u0253\u0257\5V,\2\u0254\u0257\5Z.\2\u0255"+
		"\u0257\5\\/\2\u0256\u0252\3\2\2\2\u0256\u0253\3\2\2\2\u0256\u0254\3\2"+
		"\2\2\u0256\u0255\3\2\2\2\u0257U\3\2\2\2\u0258\u0259\7\7\2\2\u0259\u025d"+
		"\7 \2\2\u025a\u025e\5X-\2\u025b\u025e\5\\/\2\u025c\u025e\5V,\2\u025d\u025a"+
		"\3\2\2\2\u025d\u025b\3\2\2\2\u025d\u025c\3\2\2\2\u025eW\3\2\2\2\u025f"+
		"\u0260\t\3\2\2\u0260Y\3\2\2\2\u0261\u0262\7\27\2\2\u0262\u026c\7\"\2\2"+
		"\u0263\u0268\5T+\2\u0264\u0265\7\37\2\2\u0265\u0267\5T+\2\u0266\u0264"+
		"\3\2\2\2\u0267\u026a\3\2\2\2\u0268\u0266\3\2\2\2\u0268\u0269\3\2\2\2\u0269"+
		"\u026d\3\2\2\2\u026a\u0268\3\2\2\2\u026b\u026d\7\b\2\2\u026c\u0263\3\2"+
		"\2\2\u026c\u026b\3\2\2\2\u026d\u026e\3\2\2\2\u026e\u0271\7,\2\2\u026f"+
		"\u0272\5T+\2\u0270\u0272\7\b\2\2\u0271\u026f\3\2\2\2\u0271\u0270\3\2\2"+
		"\2\u0272\u0273\3\2\2\2\u0273\u0274\7!\2\2\u0274[\3\2\2\2\u0275\u0276\7"+
		"\3\2\2\u0276\u0277\7-\2\2\u0277]\3\2\2\2R`bgip}\u008f\u0094\u0099\u009d"+
		"\u00a2\u00a8\u00ab\u00b2\u00be\u00d0\u00d3\u00e3\u00e8\u00f5\u00fb\u0101"+
		"\u010c\u0118\u011c\u0121\u0125\u012a\u012d\u0136\u0150\u0154\u0159\u015d"+
		"\u0162\u0165\u016b\u0170\u0174\u0179\u017b\u0182\u018c\u0194\u019d\u01a6"+
		"\u01ae\u01b3\u01bb\u01c0\u01c8\u01cd\u01d4\u01d8\u01e1\u01e8\u01f0\u01fa"+
		"\u0201\u0208\u020b\u0210\u0217\u0219\u0220\u0222\u0226\u022a\u0231\u0233"+
		"\u023a\u023c\u0240\u0247\u024e\u0256\u025d\u0268\u026c\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}