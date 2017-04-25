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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, PREFIX=12, JAPANESE=13, NUMBER=14, ID=15, NEWLINE=16, 
		WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "PREFIX", "JAPANESE", "NUMBER", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "':'", "'^'", "'+'", "'-'", "'*'", "'/'", "'%'", "'('", "')'", 
		"','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"PREFIX", "JAPANESE", "NUMBER", "ID", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23n\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\5\r@\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\rH\n\r\3\16\6\16K\n\16\r\16\16\16L\3\17\6\17P\n\17\r\17\16\17Q\3\17"+
		"\3\17\6\17V\n\17\r\17\16\17W\5\17Z\n\17\3\20\3\20\7\20^\n\20\f\20\16\20"+
		"a\13\20\3\21\5\21d\n\21\3\21\3\21\3\22\6\22i\n\22\r\22\16\22j\3\22\3\22"+
		"\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\35\20\37\21!\22#\23\3\2\b\3\2\63\66\4\2\u3042\u3101\u4e02\ua001\3\2\62"+
		";\4\2C\\c|\5\2\62;C\\c|\4\2\13\13\"\"\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3"+
		"\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2"+
		"\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35"+
		"\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2\2\2\7)"+
		"\3\2\2\2\t+\3\2\2\2\13-\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2"+
		"\23\65\3\2\2\2\25\67\3\2\2\2\279\3\2\2\2\31G\3\2\2\2\33J\3\2\2\2\35O\3"+
		"\2\2\2\37[\3\2\2\2!c\3\2\2\2#h\3\2\2\2%&\7?\2\2&\4\3\2\2\2\'(\7<\2\2("+
		"\6\3\2\2\2)*\7`\2\2*\b\3\2\2\2+,\7-\2\2,\n\3\2\2\2-.\7/\2\2.\f\3\2\2\2"+
		"/\60\7,\2\2\60\16\3\2\2\2\61\62\7\61\2\2\62\20\3\2\2\2\63\64\7\'\2\2\64"+
		"\22\3\2\2\2\65\66\7*\2\2\66\24\3\2\2\2\678\7+\2\28\26\3\2\2\29:\7.\2\2"+
		":\30\3\2\2\2;<\7U\2\2<H\7H\2\2=?\7R\2\2>@\t\2\2\2?>\3\2\2\2?@\3\2\2\2"+
		"@H\3\2\2\2AB\7D\2\2BH\7H\2\2CD\7T\2\2DH\7F\2\2EF\7R\2\2FH\7T\2\2G;\3\2"+
		"\2\2G=\3\2\2\2GA\3\2\2\2GC\3\2\2\2GE\3\2\2\2H\32\3\2\2\2IK\t\3\2\2JI\3"+
		"\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\34\3\2\2\2NP\t\4\2\2ON\3\2\2\2P"+
		"Q\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SU\7\60\2\2TV\t\4\2\2UT\3\2\2\2"+
		"VW\3\2\2\2WU\3\2\2\2WX\3\2\2\2XZ\3\2\2\2YS\3\2\2\2YZ\3\2\2\2Z\36\3\2\2"+
		"\2[_\t\5\2\2\\^\t\6\2\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2"+
		"\2\2a_\3\2\2\2bd\7\17\2\2cb\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\f\2\2f\"\3"+
		"\2\2\2gi\t\7\2\2hg\3\2\2\2ij\3\2\2\2jh\3\2\2\2jk\3\2\2\2kl\3\2\2\2lm\b"+
		"\22\2\2m$\3\2\2\2\f\2?GLQWY_cj\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}