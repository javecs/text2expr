// Generated from Text2Expr.g4 by ANTLR 4.7
package xyz.javecs.tools.text2expr.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Text2ExprLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, PREFIX=6, LEVEL=7, JAPANESE=8, 
		SYMBOL=9, OPERATOR=10, NUMBER=11, ID=12, NEWLINE=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "PREFIX", "LEVEL", "JAPANESE", 
		"SYMBOL", "OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "':'", "'?'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PREFIX", "LEVEL", "JAPANESE", "SYMBOL", 
		"OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
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


	public Text2ExprLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Text2Expr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\64\n\7\3\b\3\b"+
		"\3\t\6\t9\n\t\r\t\16\t:\3\n\3\n\6\n?\n\n\r\n\16\n@\3\n\3\n\3\13\3\13\3"+
		"\f\6\fH\n\f\r\f\16\fI\3\f\3\f\6\fN\n\f\r\f\16\fO\5\fR\n\f\3\r\3\r\7\r"+
		"V\n\r\f\r\16\rY\13\r\3\16\5\16\\\n\16\3\16\3\16\3\17\6\17a\n\17\r\17\16"+
		"\17b\3\17\3\17\2\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\3\2\t\3\2\63\66\4\2\u3042\u3101\u4e02\ua001\7\2\'"+
		"\'*/\61\61??``\3\2\62;\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2q\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7#\3\2\2\2\t%\3"+
		"\2\2\2\13\'\3\2\2\2\r\63\3\2\2\2\17\65\3\2\2\2\218\3\2\2\2\23<\3\2\2\2"+
		"\25D\3\2\2\2\27G\3\2\2\2\31S\3\2\2\2\33[\3\2\2\2\35`\3\2\2\2\37 \7?\2"+
		"\2 \4\3\2\2\2!\"\7.\2\2\"\6\3\2\2\2#$\7<\2\2$\b\3\2\2\2%&\7A\2\2&\n\3"+
		"\2\2\2\'(\7~\2\2(\f\3\2\2\2)*\7U\2\2*\64\7H\2\2+,\7R\2\2,\64\5\17\b\2"+
		"-.\7D\2\2.\64\7H\2\2/\60\7T\2\2\60\64\7F\2\2\61\62\7R\2\2\62\64\7T\2\2"+
		"\63)\3\2\2\2\63+\3\2\2\2\63-\3\2\2\2\63/\3\2\2\2\63\61\3\2\2\2\64\16\3"+
		"\2\2\2\65\66\t\2\2\2\66\20\3\2\2\2\679\t\3\2\28\67\3\2\2\29:\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;\22\3\2\2\2<>\7$\2\2=?\4#\u0080\2>=\3\2\2\2?@\3\2"+
		"\2\2@>\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7$\2\2C\24\3\2\2\2DE\t\4\2\2E\26"+
		"\3\2\2\2FH\t\5\2\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JQ\3\2\2\2K"+
		"M\7\60\2\2LN\t\5\2\2ML\3\2\2\2NO\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2"+
		"QK\3\2\2\2QR\3\2\2\2R\30\3\2\2\2SW\t\6\2\2TV\t\7\2\2UT\3\2\2\2VY\3\2\2"+
		"\2WU\3\2\2\2WX\3\2\2\2X\32\3\2\2\2YW\3\2\2\2Z\\\7\17\2\2[Z\3\2\2\2[\\"+
		"\3\2\2\2\\]\3\2\2\2]^\7\f\2\2^\34\3\2\2\2_a\t\b\2\2`_\3\2\2\2ab\3\2\2"+
		"\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\17\2\2e\36\3\2\2\2\f\2\63:@IOQW["+
		"b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}