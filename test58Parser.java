// Generated from test58.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class test58Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, ID=2, ATSIGN=3, ADDOP=4, SUBOP=5, INT=6, NEWLINE=7;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_banking = 2, RULE_createAccount = 3, 
		RULE_transferOp = 4, RULE_withExpr = 5, RULE_depoExpr = 6, RULE_balExpr = 7, 
		RULE_addPerson = 8, RULE_houseSell = 9;
	public static final String[] ruleNames = {
		"prog", "start", "banking", "createAccount", "transferOp", "withExpr", 
		"depoExpr", "balExpr", "addPerson", "houseSell"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "' '", null, "'@'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "ID", "ATSIGN", "ADDOP", "SUBOP", "INT", "NEWLINE"
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
	public String getGrammarFileName() { return "test58.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public test58Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public List<StartContext> start() {
			return getRuleContexts(StartContext.class);
		}
		public StartContext start(int i) {
			return getRuleContext(StartContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				start();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID || _la==NEWLINE );
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

	public static class StartContext extends ParserRuleContext {
		public BankingContext banking() {
			return getRuleContext(BankingContext.class,0);
		}
		public CreateAccountContext createAccount() {
			return getRuleContext(CreateAccountContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(test58Parser.NEWLINE, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			setState(28);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				banking();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				createAccount();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(27);
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

	public static class BankingContext extends ParserRuleContext {
		public WithExprContext withExpr() {
			return getRuleContext(WithExprContext.class,0);
		}
		public DepoExprContext depoExpr() {
			return getRuleContext(DepoExprContext.class,0);
		}
		public BalExprContext balExpr() {
			return getRuleContext(BalExprContext.class,0);
		}
		public HouseSellContext houseSell() {
			return getRuleContext(HouseSellContext.class,0);
		}
		public TransferOpContext transferOp() {
			return getRuleContext(TransferOpContext.class,0);
		}
		public BankingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_banking; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterBanking(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitBanking(this);
		}
	}

	public final BankingContext banking() throws RecognitionException {
		BankingContext _localctx = new BankingContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_banking);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				withExpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(31);
				depoExpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(32);
				balExpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(33);
				houseSell();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(34);
				transferOp();
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

	public static class CreateAccountContext extends ParserRuleContext {
		public AddPersonContext addPerson() {
			return getRuleContext(AddPersonContext.class,0);
		}
		public CreateAccountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createAccount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterCreateAccount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitCreateAccount(this);
		}
	}

	public final CreateAccountContext createAccount() throws RecognitionException {
		CreateAccountContext _localctx = new CreateAccountContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createAccount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			addPerson();
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

	public static class TransferOpContext extends ParserRuleContext {
		public WithExprContext withExpr() {
			return getRuleContext(WithExprContext.class,0);
		}
		public List<TerminalNode> SUBOP() { return getTokens(test58Parser.SUBOP); }
		public TerminalNode SUBOP(int i) {
			return getToken(test58Parser.SUBOP, i);
		}
		public DepoExprContext depoExpr() {
			return getRuleContext(DepoExprContext.class,0);
		}
		public TransferOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transferOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterTransferOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitTransferOp(this);
		}
	}

	public final TransferOpContext transferOp() throws RecognitionException {
		TransferOpContext _localctx = new TransferOpContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_transferOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			withExpr();
			setState(40);
			match(T__0);
			setState(41);
			match(SUBOP);
			setState(42);
			match(SUBOP);
			setState(43);
			match(T__0);
			setState(44);
			depoExpr();
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

	public static class WithExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(test58Parser.ID, 0); }
		public TerminalNode INT() { return getToken(test58Parser.INT, 0); }
		public TerminalNode SUBOP() { return getToken(test58Parser.SUBOP, 0); }
		public WithExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterWithExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitWithExpr(this);
		}
	}

	public final WithExprContext withExpr() throws RecognitionException {
		WithExprContext _localctx = new WithExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_withExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(ID);
			setState(47);
			match(T__0);
			setState(48);
			match(INT);
			setState(49);
			match(T__0);
			setState(50);
			match(SUBOP);
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

	public static class DepoExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(test58Parser.ID, 0); }
		public TerminalNode INT() { return getToken(test58Parser.INT, 0); }
		public TerminalNode ADDOP() { return getToken(test58Parser.ADDOP, 0); }
		public DepoExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_depoExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterDepoExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitDepoExpr(this);
		}
	}

	public final DepoExprContext depoExpr() throws RecognitionException {
		DepoExprContext _localctx = new DepoExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_depoExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(ID);
			setState(53);
			match(T__0);
			setState(54);
			match(INT);
			setState(55);
			match(T__0);
			setState(56);
			match(ADDOP);
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

	public static class BalExprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(test58Parser.ID, 0); }
		public BalExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterBalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitBalExpr(this);
		}
	}

	public final BalExprContext balExpr() throws RecognitionException {
		BalExprContext _localctx = new BalExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_balExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
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

	public static class AddPersonContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(test58Parser.ID, 0); }
		public TerminalNode ATSIGN() { return getToken(test58Parser.ATSIGN, 0); }
		public AddPersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addPerson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterAddPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitAddPerson(this);
		}
	}

	public final AddPersonContext addPerson() throws RecognitionException {
		AddPersonContext _localctx = new AddPersonContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_addPerson);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(ID);
			setState(61);
			match(T__0);
			setState(62);
			match(ATSIGN);
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

	public static class HouseSellContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(test58Parser.ID, 0); }
		public TerminalNode INT() { return getToken(test58Parser.INT, 0); }
		public HouseSellContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_houseSell; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).enterHouseSell(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof test58Listener ) ((test58Listener)listener).exitHouseSell(this);
		}
	}

	public final HouseSellContext houseSell() throws RecognitionException {
		HouseSellContext _localctx = new HouseSellContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_houseSell);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
			setState(65);
			match(T__0);
			setState(66);
			match(INT);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\tG\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\5"+
		"\4&\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2C\2\27\3\2\2\2\4\36\3\2\2\2\6%\3\2\2"+
		"\2\b\'\3\2\2\2\n)\3\2\2\2\f\60\3\2\2\2\16\66\3\2\2\2\20<\3\2\2\2\22>\3"+
		"\2\2\2\24B\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2"+
		"\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\37\5\6\4\2\34\37\5\b\5\2\35\37\7\t"+
		"\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 &\5\f\7\2"+
		"!&\5\16\b\2\"&\5\20\t\2#&\5\24\13\2$&\5\n\6\2% \3\2\2\2%!\3\2\2\2%\"\3"+
		"\2\2\2%#\3\2\2\2%$\3\2\2\2&\7\3\2\2\2\'(\5\22\n\2(\t\3\2\2\2)*\5\f\7\2"+
		"*+\7\3\2\2+,\7\7\2\2,-\7\7\2\2-.\7\3\2\2./\5\16\b\2/\13\3\2\2\2\60\61"+
		"\7\4\2\2\61\62\7\3\2\2\62\63\7\b\2\2\63\64\7\3\2\2\64\65\7\7\2\2\65\r"+
		"\3\2\2\2\66\67\7\4\2\2\678\7\3\2\289\7\b\2\29:\7\3\2\2:;\7\6\2\2;\17\3"+
		"\2\2\2<=\7\4\2\2=\21\3\2\2\2>?\7\4\2\2?@\7\3\2\2@A\7\5\2\2A\23\3\2\2\2"+
		"BC\7\4\2\2CD\7\3\2\2DE\7\b\2\2E\25\3\2\2\2\5\31\36%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}