// Generated from Text2Expr.g4 by ANTLR 4.7
package xyz.javecs.tools.text2expr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Text2ExprParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PREFIX=8, LEVEL=9, 
		JAPANESE=10, SYMBOL=11, OPERATOR=12, NUMBER=13, ID=14, NEWLINE=15, WS=16;
	public static final int
		RULE_text2expr = 0, RULE_text = 1, RULE_word = 2, RULE_field = 3, RULE_value = 4, 
		RULE_expr = 5, RULE_optionalValue = 6;
	public static final String[] ruleNames = {
		"text2expr", "text", "word", "field", "value", "expr", "optionalValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "':'", "'?'", "'|'", "'('", "')'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, "PREFIX", "LEVEL", "JAPANESE", 
		"SYMBOL", "OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Text2Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Text2ExprParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class Text2exprContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public List<TextContext> text() {
			return getRuleContexts(TextContext.class);
		}
		public TextContext text(int i) {
			return getRuleContext(TextContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Text2exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text2expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitText2expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Text2exprContext text2expr() throws RecognitionException {
		Text2exprContext _localctx = new Text2exprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_text2expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				text();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==PREFIX || _la==ID );
			setState(19);
			match(NEWLINE);
			setState(21); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(20);
				expr();
				}
				}
				setState(23); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << PREFIX) | (1L << LEVEL) | (1L << JAPANESE) | (1L << SYMBOL) | (1L << OPERATOR) | (1L << NUMBER) | (1L << ID) | (1L << NEWLINE) | (1L << WS))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TextContext extends ParserRuleContext {
		public TextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_text; }
	 
		public TextContext() { }
		public void copyFrom(TextContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WordAssignContext extends TextContext {
		public TerminalNode ID() { return getToken(Text2ExprParser.ID, 0); }
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public WordAssignContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWordAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordDefineContext extends TextContext {
		public WordContext word() {
			return getRuleContext(WordContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public WordDefineContext(TextContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWordDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextContext text() throws RecognitionException {
		TextContext _localctx = new TextContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_text);
		try {
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PREFIX:
				_localctx = new WordDefineContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				word(0);
				setState(26);
				match(NEWLINE);
				}
				break;
			case ID:
				_localctx = new WordAssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(28);
				match(ID);
				setState(29);
				match(T__0);
				setState(30);
				word(0);
				setState(31);
				match(NEWLINE);
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

	public static class WordContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public List<WordContext> word() {
			return getRuleContexts(WordContext.class);
		}
		public WordContext word(int i) {
			return getRuleContext(WordContext.class,i);
		}
		public WordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_word; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WordContext word() throws RecognitionException {
		return word(0);
	}

	private WordContext word(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		WordContext _localctx = new WordContext(_ctx, _parentState);
		WordContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_word, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(36);
			field();
			}
			_ctx.stop = _input.LT(-1);
			setState(43);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new WordContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_word);
					setState(38);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(39);
					match(T__1);
					setState(40);
					word(3);
					}
					} 
				}
				setState(45);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public static class FieldContext extends ParserRuleContext {
		public Token op;
		public TerminalNode PREFIX() { return getToken(Text2ExprParser.PREFIX, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_field);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(PREFIX);
			setState(47);
			((FieldContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__2 || _la==T__3) ) {
				((FieldContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(48);
			value(0);
			}
		}
		catch (RecognitionException re) {
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
		public TerminalNode JAPANESE() { return getToken(Text2ExprParser.JAPANESE, 0); }
		public OptionalValueContext optionalValue() {
			return getRuleContext(OptionalValueContext.class,0);
		}
		public TerminalNode SYMBOL() { return getToken(Text2ExprParser.SYMBOL, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		return value(0);
	}

	private ValueContext value(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueContext _localctx = new ValueContext(_ctx, _parentState);
		ValueContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_value, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JAPANESE:
				{
				setState(51);
				match(JAPANESE);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(52);
					optionalValue();
					}
					break;
				}
				}
				break;
			case SYMBOL:
				{
				setState(55);
				match(SYMBOL);
				setState(57);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(56);
					optionalValue();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(66);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ValueContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_value);
					setState(61);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(62);
					match(T__4);
					setState(63);
					value(4);
					}
					} 
				}
				setState(68);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(Text2ExprParser.NEWLINE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expr);
		try {
			int _alt;
			setState(75);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(69);
						matchWildcard();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(72); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
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

	public static class OptionalValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(Text2ExprParser.NUMBER, 0); }
		public OptionalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Text2ExprVisitor ) return ((Text2ExprVisitor<? extends T>)visitor).visitOptionalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionalValueContext optionalValue() throws RecognitionException {
		OptionalValueContext _localctx = new OptionalValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_optionalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__5);
			setState(78);
			match(NUMBER);
			setState(79);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
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
		case 2:
			return word_sempred((WordContext)_localctx, predIndex);
		case 4:
			return value_sempred((ValueContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean word_sempred(WordContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean value_sempred(ValueContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22T\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3$\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\7\4,\n\4\f\4\16\4/\13\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\5\68\n\6\3\6\3\6\5\6<\n\6\5\6>\n\6\3\6\3\6\3\6\7\6C\n\6\f\6\16"+
		"\6F\13\6\3\7\6\7I\n\7\r\7\16\7J\3\7\5\7N\n\7\3\b\3\b\3\b\3\b\3\b\2\4\6"+
		"\n\t\2\4\6\b\n\f\16\2\3\3\2\5\6\2V\2\21\3\2\2\2\4#\3\2\2\2\6%\3\2\2\2"+
		"\b\60\3\2\2\2\n=\3\2\2\2\fM\3\2\2\2\16O\3\2\2\2\20\22\5\4\3\2\21\20\3"+
		"\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\27\7"+
		"\21\2\2\26\30\5\f\7\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27\3\2\2\2\31\32"+
		"\3\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7\21\2\2\35$\3\2\2\2\36\37\7"+
		"\20\2\2\37 \7\3\2\2 !\5\6\4\2!\"\7\21\2\2\"$\3\2\2\2#\33\3\2\2\2#\36\3"+
		"\2\2\2$\5\3\2\2\2%&\b\4\1\2&\'\5\b\5\2\'-\3\2\2\2()\f\4\2\2)*\7\4\2\2"+
		"*,\5\6\4\5+(\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\7\3\2\2\2/-\3\2\2"+
		"\2\60\61\7\n\2\2\61\62\t\2\2\2\62\63\5\n\6\2\63\t\3\2\2\2\64\65\b\6\1"+
		"\2\65\67\7\f\2\2\668\5\16\b\2\67\66\3\2\2\2\678\3\2\2\28>\3\2\2\29;\7"+
		"\r\2\2:<\5\16\b\2;:\3\2\2\2;<\3\2\2\2<>\3\2\2\2=\64\3\2\2\2=9\3\2\2\2"+
		">D\3\2\2\2?@\f\5\2\2@A\7\7\2\2AC\5\n\6\6B?\3\2\2\2CF\3\2\2\2DB\3\2\2\2"+
		"DE\3\2\2\2E\13\3\2\2\2FD\3\2\2\2GI\13\2\2\2HG\3\2\2\2IJ\3\2\2\2JH\3\2"+
		"\2\2JK\3\2\2\2KN\3\2\2\2LN\7\21\2\2MH\3\2\2\2ML\3\2\2\2N\r\3\2\2\2OP\7"+
		"\b\2\2PQ\7\17\2\2QR\7\t\2\2R\17\3\2\2\2\f\23\31#-\67;=DJM";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}