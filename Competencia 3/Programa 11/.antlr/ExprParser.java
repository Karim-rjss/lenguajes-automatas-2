// Generated from c:/Users/Karim Rios/Documents/vscode/Verano/Lenguajes y automatas 2/Competencia 3/Programa 11/Expr.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PUBLIC=1, CLASS=2, STATIC=3, VOID=4, STRING=5, INT=6, CADENA=7, NUM=8, 
		ID=9, IGUAL=10, PAR_IZQ=11, PAR_DER=12, CORCH_IZQ=13, CORCH_DER=14, LLAVE_IZQ=15, 
		LLAVE_DER=16, PUNTO_COMA=17, MAS=18, PUNTO=19, WS=20;
	public static final int
		RULE_root = 0, RULE_expr = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'public'", "'class'", "'static'", "'void'", "'String'", "'int'", 
			null, null, null, "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
			"'+'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUBLIC", "CLASS", "STATIC", "VOID", "STRING", "INT", "CADENA", 
			"NUM", "ID", "IGUAL", "PAR_IZQ", "PAR_DER", "CORCH_IZQ", "CORCH_DER", 
			"LLAVE_IZQ", "LLAVE_DER", "PUNTO_COMA", "MAS", "PUNTO", "WS"
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
	public String getGrammarFileName() { return "Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExprParser.EOF, 0); }
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			expr();
			setState(5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TerminalNode> PUBLIC() { return getTokens(ExprParser.PUBLIC); }
		public TerminalNode PUBLIC(int i) {
			return getToken(ExprParser.PUBLIC, i);
		}
		public TerminalNode CLASS() { return getToken(ExprParser.CLASS, 0); }
		public List<TerminalNode> ID() { return getTokens(ExprParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(ExprParser.ID, i);
		}
		public List<TerminalNode> LLAVE_IZQ() { return getTokens(ExprParser.LLAVE_IZQ); }
		public TerminalNode LLAVE_IZQ(int i) {
			return getToken(ExprParser.LLAVE_IZQ, i);
		}
		public TerminalNode STATIC() { return getToken(ExprParser.STATIC, 0); }
		public TerminalNode VOID() { return getToken(ExprParser.VOID, 0); }
		public List<TerminalNode> PAR_IZQ() { return getTokens(ExprParser.PAR_IZQ); }
		public TerminalNode PAR_IZQ(int i) {
			return getToken(ExprParser.PAR_IZQ, i);
		}
		public TerminalNode STRING() { return getToken(ExprParser.STRING, 0); }
		public TerminalNode CORCH_IZQ() { return getToken(ExprParser.CORCH_IZQ, 0); }
		public TerminalNode CORCH_DER() { return getToken(ExprParser.CORCH_DER, 0); }
		public List<TerminalNode> PAR_DER() { return getTokens(ExprParser.PAR_DER); }
		public TerminalNode PAR_DER(int i) {
			return getToken(ExprParser.PAR_DER, i);
		}
		public List<TerminalNode> INT() { return getTokens(ExprParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(ExprParser.INT, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(ExprParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(ExprParser.IGUAL, i);
		}
		public List<TerminalNode> NUM() { return getTokens(ExprParser.NUM); }
		public TerminalNode NUM(int i) {
			return getToken(ExprParser.NUM, i);
		}
		public List<TerminalNode> PUNTO_COMA() { return getTokens(ExprParser.PUNTO_COMA); }
		public TerminalNode PUNTO_COMA(int i) {
			return getToken(ExprParser.PUNTO_COMA, i);
		}
		public List<TerminalNode> MAS() { return getTokens(ExprParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(ExprParser.MAS, i);
		}
		public List<TerminalNode> PUNTO() { return getTokens(ExprParser.PUNTO); }
		public TerminalNode PUNTO(int i) {
			return getToken(ExprParser.PUNTO, i);
		}
		public TerminalNode CADENA() { return getToken(ExprParser.CADENA, 0); }
		public List<TerminalNode> LLAVE_DER() { return getTokens(ExprParser.LLAVE_DER); }
		public TerminalNode LLAVE_DER(int i) {
			return getToken(ExprParser.LLAVE_DER, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			match(PUBLIC);
			setState(8);
			match(CLASS);
			setState(9);
			match(ID);
			setState(10);
			match(LLAVE_IZQ);
			setState(11);
			match(PUBLIC);
			setState(12);
			match(STATIC);
			setState(13);
			match(VOID);
			setState(14);
			match(ID);
			setState(15);
			match(PAR_IZQ);
			setState(16);
			match(STRING);
			setState(17);
			match(CORCH_IZQ);
			setState(18);
			match(CORCH_DER);
			setState(19);
			match(ID);
			setState(20);
			match(PAR_DER);
			setState(21);
			match(LLAVE_IZQ);
			setState(22);
			match(INT);
			setState(23);
			match(ID);
			setState(24);
			match(IGUAL);
			setState(25);
			match(NUM);
			setState(26);
			match(PUNTO_COMA);
			setState(27);
			match(INT);
			setState(28);
			match(ID);
			setState(29);
			match(IGUAL);
			setState(30);
			match(NUM);
			setState(31);
			match(PUNTO_COMA);
			setState(32);
			match(INT);
			setState(33);
			match(ID);
			setState(34);
			match(IGUAL);
			setState(35);
			match(ID);
			setState(36);
			match(MAS);
			setState(37);
			match(ID);
			setState(38);
			match(PUNTO_COMA);
			setState(39);
			match(ID);
			setState(40);
			match(PUNTO);
			setState(41);
			match(ID);
			setState(42);
			match(PUNTO);
			setState(43);
			match(ID);
			setState(44);
			match(PAR_IZQ);
			setState(45);
			match(CADENA);
			setState(46);
			match(MAS);
			setState(47);
			match(ID);
			setState(48);
			match(PAR_DER);
			setState(49);
			match(PUNTO_COMA);
			setState(50);
			match(LLAVE_DER);
			setState(51);
			match(LLAVE_DER);
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
		"\u0004\u0001\u00146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u00003\u0000\u0004"+
		"\u0001\u0000\u0000\u0000\u0002\u0007\u0001\u0000\u0000\u0000\u0004\u0005"+
		"\u0003\u0002\u0001\u0000\u0005\u0006\u0005\u0000\u0000\u0001\u0006\u0001"+
		"\u0001\u0000\u0000\u0000\u0007\b\u0005\u0001\u0000\u0000\b\t\u0005\u0002"+
		"\u0000\u0000\t\n\u0005\t\u0000\u0000\n\u000b\u0005\u000f\u0000\u0000\u000b"+
		"\f\u0005\u0001\u0000\u0000\f\r\u0005\u0003\u0000\u0000\r\u000e\u0005\u0004"+
		"\u0000\u0000\u000e\u000f\u0005\t\u0000\u0000\u000f\u0010\u0005\u000b\u0000"+
		"\u0000\u0010\u0011\u0005\u0005\u0000\u0000\u0011\u0012\u0005\r\u0000\u0000"+
		"\u0012\u0013\u0005\u000e\u0000\u0000\u0013\u0014\u0005\t\u0000\u0000\u0014"+
		"\u0015\u0005\f\u0000\u0000\u0015\u0016\u0005\u000f\u0000\u0000\u0016\u0017"+
		"\u0005\u0006\u0000\u0000\u0017\u0018\u0005\t\u0000\u0000\u0018\u0019\u0005"+
		"\n\u0000\u0000\u0019\u001a\u0005\b\u0000\u0000\u001a\u001b\u0005\u0011"+
		"\u0000\u0000\u001b\u001c\u0005\u0006\u0000\u0000\u001c\u001d\u0005\t\u0000"+
		"\u0000\u001d\u001e\u0005\n\u0000\u0000\u001e\u001f\u0005\b\u0000\u0000"+
		"\u001f \u0005\u0011\u0000\u0000 !\u0005\u0006\u0000\u0000!\"\u0005\t\u0000"+
		"\u0000\"#\u0005\n\u0000\u0000#$\u0005\t\u0000\u0000$%\u0005\u0012\u0000"+
		"\u0000%&\u0005\t\u0000\u0000&\'\u0005\u0011\u0000\u0000\'(\u0005\t\u0000"+
		"\u0000()\u0005\u0013\u0000\u0000)*\u0005\t\u0000\u0000*+\u0005\u0013\u0000"+
		"\u0000+,\u0005\t\u0000\u0000,-\u0005\u000b\u0000\u0000-.\u0005\u0007\u0000"+
		"\u0000./\u0005\u0012\u0000\u0000/0\u0005\t\u0000\u000001\u0005\f\u0000"+
		"\u000012\u0005\u0011\u0000\u000023\u0005\u0010\u0000\u000034\u0005\u0010"+
		"\u0000\u00004\u0003\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}