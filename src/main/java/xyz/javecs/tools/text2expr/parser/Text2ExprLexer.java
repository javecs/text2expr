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
		OPERATOR=9, NUMBER=10, ID=11, NEWLINE=12, WS=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "PREFIX", "LEVEL", "JAPANESE", 
		"OPERATOR", "NUMBER", "ID", "NEWLINE", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "','", "':'", "'?'", "'|'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, "PREFIX", "LEVEL", "JAPANESE", "OPERATOR", 
		"NUMBER", "ID", "NEWLINE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\\\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\62\n\7\3\b\3\b\3\t\6\t"+
		"\67\n\t\r\t\16\t8\3\n\3\n\3\13\6\13>\n\13\r\13\16\13?\3\13\3\13\6\13D"+
		"\n\13\r\13\16\13E\5\13H\n\13\3\f\3\f\7\fL\n\f\f\f\16\fO\13\f\3\r\5\rR"+
		"\n\r\3\r\3\r\3\16\6\16W\n\16\r\16\16\16X\3\16\3\16\2\2\17\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\3\2\t\3\2\63\66\4"+
		"\2\u3042\u3101\u4e02\ua001\7\2\'\'*/\61\61??``\3\2\62;\4\2C\\c|\5\2\62"+
		";C\\c|\4\2\13\13\"\"\2f\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2"+
		"\2\2\7!\3\2\2\2\t#\3\2\2\2\13%\3\2\2\2\r\61\3\2\2\2\17\63\3\2\2\2\21\66"+
		"\3\2\2\2\23:\3\2\2\2\25=\3\2\2\2\27I\3\2\2\2\31Q\3\2\2\2\33V\3\2\2\2\35"+
		"\36\7?\2\2\36\4\3\2\2\2\37 \7.\2\2 \6\3\2\2\2!\"\7<\2\2\"\b\3\2\2\2#$"+
		"\7A\2\2$\n\3\2\2\2%&\7~\2\2&\f\3\2\2\2\'(\7U\2\2(\62\7H\2\2)*\7R\2\2*"+
		"\62\5\17\b\2+,\7D\2\2,\62\7H\2\2-.\7T\2\2.\62\7F\2\2/\60\7R\2\2\60\62"+
		"\7T\2\2\61\'\3\2\2\2\61)\3\2\2\2\61+\3\2\2\2\61-\3\2\2\2\61/\3\2\2\2\62"+
		"\16\3\2\2\2\63\64\t\2\2\2\64\20\3\2\2\2\65\67\t\3\2\2\66\65\3\2\2\2\67"+
		"8\3\2\2\28\66\3\2\2\289\3\2\2\29\22\3\2\2\2:;\t\4\2\2;\24\3\2\2\2<>\t"+
		"\5\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@G\3\2\2\2AC\7\60\2\2BD"+
		"\t\5\2\2CB\3\2\2\2DE\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GA\3\2\2\2G"+
		"H\3\2\2\2H\26\3\2\2\2IM\t\6\2\2JL\t\7\2\2KJ\3\2\2\2LO\3\2\2\2MK\3\2\2"+
		"\2MN\3\2\2\2N\30\3\2\2\2OM\3\2\2\2PR\7\17\2\2QP\3\2\2\2QR\3\2\2\2RS\3"+
		"\2\2\2ST\7\f\2\2T\32\3\2\2\2UW\t\b\2\2VU\3\2\2\2WX\3\2\2\2XV\3\2\2\2X"+
		"Y\3\2\2\2YZ\3\2\2\2Z[\b\16\2\2[\34\3\2\2\2\13\2\618?EGMQX\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}