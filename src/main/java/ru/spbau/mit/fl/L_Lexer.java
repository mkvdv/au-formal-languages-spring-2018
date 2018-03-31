// Generated from L_Lexer.g4 by ANTLR 4.5.3

package ru.spbau.mit.fl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L_Lexer extends Lexer {
	public static final int
            IF = 1, THEN = 2, ELSE = 3, WHILE = 4, DO = 5, READ = 6, WRITE = 7, TRUE = 8, FALSE = 9,
            LINE_COMMENT = 10, MULTILINE_COMMENT_EXIT = 11, DecimalFloatingPointLiteral = 12,
            DecimalIntegerLiteral = 13, ADD = 14, MINUS = 15, MUL = 16, DIV = 17, MOD = 18, ASSIGN = 19,
            LEQ = 20, GEQ = 21, LESS = 22, GREATER = 23, EQ = 24, NEQ = 25, AND = 26, OR = 27, LP = 28,
            RP = 29, SEMI = 30, LBR = 31, RBR = 32, ID = 33, WS = 34;
	public static final String[] ruleNames = {
            "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "TRUE", "FALSE",
            "NL", "LINE_COMMENT", "MULTILINE_COMMENT", "MULTILINE_COMMENT_EXIT", "CANT_EXIT",
            "WE_NEED_TO_GO_DEEPER", "COMMENT", "DecimalFloatingPointLiteral", "DecimalIntegerLiteral",
            "ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix",
            "IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit",
            "DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "ADD", "MINUS",
            "MUL", "DIV", "MOD", "ASSIGN", "LEQ", "GEQ", "LESS", "GREATER", "EQ",
            "NEQ", "AND", "OR", "LP", "RP", "SEMI", "LBR", "RBR", "ID", "WS"
	};
	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	public static final String _serializedATN =
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2$\u0163\b\1\b\1\4" +
                    "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n" +
                    "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
                    "\t\64\4\65\t\65\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3" +
                    "\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b" +
                    "\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\5" +
                    "\13\u009c\n\13\3\f\3\f\3\f\3\f\7\f\u00a2\n\f\f\f\16\f\u00a5\13\f\3\f\3" +
                    "\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16" +
                    "\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20" +
                    "\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\5\22\u00cf\n\22\3\22\5\22" +
                    "\u00d2\n\22\3\22\5\22\u00d5\n\22\3\22\3\22\3\22\5\22\u00da\n\22\3\22\5" +
                    "\22\u00dd\n\22\3\22\3\22\3\22\5\22\u00e2\n\22\3\22\3\22\5\22\u00e6\n\22" +
                    "\3\22\3\22\5\22\u00ea\n\22\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\24\3" +
                    "\25\3\25\3\26\5\26\u00f6\n\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31" +
                    "\3\32\3\32\3\32\5\32\u0103\n\32\3\32\3\32\3\32\3\32\5\32\u0109\n\32\3" +
                    "\33\3\33\3\33\5\33\u010e\n\33\3\33\3\33\5\33\u0112\n\33\3\34\3\34\5\34" +
                    "\u0116\n\34\3\35\3\35\3\36\3\36\5\36\u011c\n\36\3\37\3\37\5\37\u0120\n" +
                    "\37\3 \6 \u0123\n \r \16 \u0124\3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&" +
                    "\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3." +
                    "\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\7\64\u0156" +
                    "\n\64\f\64\16\64\u0159\13\64\3\65\3\65\3\65\6\65\u015e\n\65\r\65\16\65" +
                    "\u015f\3\65\3\65\3\u00a3\2\66\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13" +
                    "\26\2\30\f\32\2\34\r\36\2 \2\"\2$\16&\17(\2*\2,\2.\2\60\2\62\2\64\2\66" +
                    "\28\2:\2<\2>\2@\2B\20D\21F\22H\23J\24L\25N\26P\27R\30T\31V\32X\33Z\34" +
                    "\\\35^\36`\37b d!f\"h#j$\4\2\3\13\4\2\f\f\17\17\4\2GGgg\4\2--//\6\2FF" +
                    "HHffhh\4\2NNnn\3\2\62;\4\2aac|\5\2\62;aac|\5\2\13\f\17\17\"\"\u016d\2" +
                    "\4\3\2\2\2\2\6\3\2\2\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2" +
                    "\2\2\20\3\2\2\2\2\22\3\2\2\2\2\24\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2" +
                    "$\3\2\2\2\2&\3\2\2\2\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3" +
                    "\2\2\2\2L\3\2\2\2\2N\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2" +
                    "\2\2X\3\2\2\2\2Z\3\2\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2" +
                    "\2d\3\2\2\2\2f\3\2\2\2\2h\3\2\2\2\2j\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2\2" +
                    "\3 \3\2\2\2\3\"\3\2\2\2\4l\3\2\2\2\6o\3\2\2\2\bt\3\2\2\2\ny\3\2\2\2\f" +
                    "\177\3\2\2\2\16\u0082\3\2\2\2\20\u0087\3\2\2\2\22\u008d\3\2\2\2\24\u0092" +
                    "\3\2\2\2\26\u009b\3\2\2\2\30\u009d\3\2\2\2\32\u00a8\3\2\2\2\34\u00b0\3" +
                    "\2\2\2\36\u00b8\3\2\2\2 \u00c0\3\2\2\2\"\u00c7\3\2\2\2$\u00e9\3\2\2\2" +
                    "&\u00eb\3\2\2\2(\u00ef\3\2\2\2*\u00f2\3\2\2\2,\u00f5\3\2\2\2.\u00f9\3" +
                    "\2\2\2\60\u00fb\3\2\2\2\62\u00fd\3\2\2\2\64\u0108\3\2\2\2\66\u0111\3\2" +
                    "\2\28\u0115\3\2\2\2:\u0117\3\2\2\2<\u0119\3\2\2\2>\u011f\3\2\2\2@\u0122" +
                    "\3\2\2\2B\u0126\3\2\2\2D\u0128\3\2\2\2F\u012a\3\2\2\2H\u012c\3\2\2\2J" +
                    "\u012e\3\2\2\2L\u0130\3\2\2\2N\u0133\3\2\2\2P\u0136\3\2\2\2R\u0139\3\2" +
                    "\2\2T\u013b\3\2\2\2V\u013d\3\2\2\2X\u0140\3\2\2\2Z\u0143\3\2\2\2\\\u0146" +
                    "\3\2\2\2^\u0149\3\2\2\2`\u014b\3\2\2\2b\u014d\3\2\2\2d\u014f\3\2\2\2f" +
                    "\u0151\3\2\2\2h\u0153\3\2\2\2j\u015d\3\2\2\2lm\7k\2\2mn\7h\2\2n\5\3\2" +
                    "\2\2op\7v\2\2pq\7j\2\2qr\7g\2\2rs\7p\2\2s\7\3\2\2\2tu\7g\2\2uv\7n\2\2" +
                    "vw\7u\2\2wx\7g\2\2x\t\3\2\2\2yz\7y\2\2z{\7j\2\2{|\7k\2\2|}\7n\2\2}~\7" +
                    "g\2\2~\13\3\2\2\2\177\u0080\7f\2\2\u0080\u0081\7q\2\2\u0081\r\3\2\2\2" +
                    "\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7c\2\2\u0085\u0086" +
                    "\7f\2\2\u0086\17\3\2\2\2\u0087\u0088\7y\2\2\u0088\u0089\7t\2\2\u0089\u008a" +
                    "\7k\2\2\u008a\u008b\7v\2\2\u008b\u008c\7g\2\2\u008c\21\3\2\2\2\u008d\u008e" +
                    "\7v\2\2\u008e\u008f\7t\2\2\u008f\u0090\7w\2\2\u0090\u0091\7g\2\2\u0091" +
                    "\23\3\2\2\2\u0092\u0093\7h\2\2\u0093\u0094\7c\2\2\u0094\u0095\7n\2\2\u0095" +
                    "\u0096\7u\2\2\u0096\u0097\7g\2\2\u0097\25\3\2\2\2\u0098\u009c\t\2\2\2" +
                    "\u0099\u009a\7\17\2\2\u009a\u009c\7\f\2\2\u009b\u0098\3\2\2\2\u009b\u0099" +
                    "\3\2\2\2\u009c\27\3\2\2\2\u009d\u009e\7\61\2\2\u009e\u009f\7\61\2\2\u009f" +
                    "\u00a3\3\2\2\2\u00a0\u00a2\13\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3" +
                    "\2\2\2\u00a3\u00a4\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5" +
                    "\u00a3\3\2\2\2\u00a6\u00a7\5\26\13\2\u00a7\31\3\2\2\2\u00a8\u00a9\7\61" +
                    "\2\2\u00a9\u00aa\7,\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00ac\b\r\2\2\u00ac" +
                    "\u00ad\3\2\2\2\u00ad\u00ae\b\r\3\2\u00ae\u00af\b\r\4\2\u00af\33\3\2\2" +
                    "\2\u00b0\u00b1\7,\2\2\u00b1\u00b2\7\61\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4" +
                    "\6\16\2\2\u00b4\u00b5\b\16\5\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\b\16\6" +
                    "\2\u00b7\35\3\2\2\2\u00b8\u00b9\7,\2\2\u00b9\u00ba\7\61\2\2\u00ba\u00bb" +
                    "\3\2\2\2\u00bb\u00bc\6\17\3\2\u00bc\u00bd\b\17\7\2\u00bd\u00be\3\2\2\2" +
                    "\u00be\u00bf\b\17\3\2\u00bf\37\3\2\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2" +
                    "\7,\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c4\b\20\b\2\u00c4\u00c5\3\2\2\2\u00c5" +
                    "\u00c6\b\20\3\2\u00c6!\3\2\2\2\u00c7\u00c8\13\2\2\2\u00c8\u00c9\3\2\2" +
                    "\2\u00c9\u00ca\b\21\3\2\u00ca#\3\2\2\2\u00cb\u00cc\5\66\33\2\u00cc\u00ce" +
                    "\7\60\2\2\u00cd\u00cf\5\66\33\2\u00ce\u00cd\3\2\2\2\u00ce\u00cf\3\2\2" +
                    "\2\u00cf\u00d1\3\2\2\2\u00d0\u00d2\5(\24\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2" +
                    "\3\2\2\2\u00d2\u00d4\3\2\2\2\u00d3\u00d5\5\60\30\2\u00d4\u00d3\3\2\2\2" +
                    "\u00d4\u00d5\3\2\2\2\u00d5\u00ea\3\2\2\2\u00d6\u00d7\7\60\2\2\u00d7\u00d9" +
                    "\5\66\33\2\u00d8\u00da\5(\24\2\u00d9\u00d8\3\2\2\2\u00d9\u00da\3\2\2\2" +
                    "\u00da\u00dc\3\2\2\2\u00db\u00dd\5\60\30\2\u00dc\u00db\3\2\2\2\u00dc\u00dd" +
                    "\3\2\2\2\u00dd\u00ea\3\2\2\2\u00de\u00df\5\66\33\2\u00df\u00e1\5(\24\2" +
                    "\u00e0\u00e2\5\60\30\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ea" +
                    "\3\2\2\2\u00e3\u00e5\5\66\33\2\u00e4\u00e6\5(\24\2\u00e5\u00e4\3\2\2\2" +
                    "\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\5\60\30\2\u00e8\u00ea" +
                    "\3\2\2\2\u00e9\u00cb\3\2\2\2\u00e9\u00d6\3\2\2\2\u00e9\u00de\3\2\2\2\u00e9" +
                    "\u00e3\3\2\2\2\u00ea%\3\2\2\2\u00eb\u00ed\5\64\32\2\u00ec\u00ee\5\62\31" +
                    "\2\u00ed\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\'\3\2\2\2\u00ef\u00f0" +
                    "\5*\25\2\u00f0\u00f1\5,\26\2\u00f1)\3\2\2\2\u00f2\u00f3\t\3\2\2\u00f3" +
                    "+\3\2\2\2\u00f4\u00f6\5.\27\2\u00f5\u00f4\3\2\2\2\u00f5\u00f6\3\2\2\2" +
                    "\u00f6\u00f7\3\2\2\2\u00f7\u00f8\5\66\33\2\u00f8-\3\2\2\2\u00f9\u00fa" +
                    "\t\4\2\2\u00fa/\3\2\2\2\u00fb\u00fc\t\5\2\2\u00fc\61\3\2\2\2\u00fd\u00fe" +
                    "\t\6\2\2\u00fe\63\3\2\2\2\u00ff\u0109\7\62\2\2\u0100\u0102\5:\35\2\u0101" +
                    "\u0103\5\66\33\2\u0102\u0101\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0109\3" +
                    "\2\2\2\u0104\u0105\5:\35\2\u0105\u0106\5@ \2\u0106\u0107\5\66\33\2\u0107" +
                    "\u0109\3\2\2\2\u0108\u00ff\3\2\2\2\u0108\u0100\3\2\2\2\u0108\u0104\3\2" +
                    "\2\2\u0109\65\3\2\2\2\u010a\u0112\58\34\2\u010b\u010d\58\34\2\u010c\u010e" +
                    "\5<\36\2\u010d\u010c\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f" +
                    "\u0110\58\34\2\u0110\u0112\3\2\2\2\u0111\u010a\3\2\2\2\u0111\u010b\3\2" +
                    "\2\2\u0112\67\3\2\2\2\u0113\u0116\7\62\2\2\u0114\u0116\5:\35\2\u0115\u0113" +
                    "\3\2\2\2\u0115\u0114\3\2\2\2\u01169\3\2\2\2\u0117\u0118\t\7\2\2\u0118" +
                    ";\3\2\2\2\u0119\u011b\5>\37\2\u011a\u011c\5<\36\2\u011b\u011a\3\2\2\2" +
                    "\u011b\u011c\3\2\2\2\u011c=\3\2\2\2\u011d\u0120\58\34\2\u011e\u0120\7" +
                    "a\2\2\u011f\u011d\3\2\2\2\u011f\u011e\3\2\2\2\u0120?\3\2\2\2\u0121\u0123" +
                    "\7a\2\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124" +
                    "\u0125\3\2\2\2\u0125A\3\2\2\2\u0126\u0127\7-\2\2\u0127C\3\2\2\2\u0128" +
                    "\u0129\7/\2\2\u0129E\3\2\2\2\u012a\u012b\7,\2\2\u012bG\3\2\2\2\u012c\u012d" +
                    "\7\61\2\2\u012dI\3\2\2\2\u012e\u012f\7\'\2\2\u012fK\3\2\2\2\u0130\u0131" +
                    "\7<\2\2\u0131\u0132\7?\2\2\u0132M\3\2\2\2\u0133\u0134\7>\2\2\u0134\u0135" +
                    "\7?\2\2\u0135O\3\2\2\2\u0136\u0137\7@\2\2\u0137\u0138\7?\2\2\u0138Q\3" +
                    "\2\2\2\u0139\u013a\7>\2\2\u013aS\3\2\2\2\u013b\u013c\7@\2\2\u013cU\3\2" +
                    "\2\2\u013d\u013e\7?\2\2\u013e\u013f\7?\2\2\u013fW\3\2\2\2\u0140\u0141" +
                    "\7#\2\2\u0141\u0142\7?\2\2\u0142Y\3\2\2\2\u0143\u0144\7(\2\2\u0144\u0145" +
                    "\7(\2\2\u0145[\3\2\2\2\u0146\u0147\7~\2\2\u0147\u0148\7~\2\2\u0148]\3" +
                    "\2\2\2\u0149\u014a\7*\2\2\u014a_\3\2\2\2\u014b\u014c\7+\2\2\u014ca\3\2" +
                    "\2\2\u014d\u014e\7=\2\2\u014ec\3\2\2\2\u014f\u0150\7}\2\2\u0150e\3\2\2" +
                    "\2\u0151\u0152\7\177\2\2\u0152g\3\2\2\2\u0153\u0157\t\b\2\2\u0154\u0156" +
                    "\t\t\2\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157" +
                    "\u0158\3\2\2\2\u0158i\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015e\t\n\2\2" +
                    "\u015b\u015c\7\17\2\2\u015c\u015e\7\f\2\2\u015d\u015a\3\2\2\2\u015d\u015b" +
                    "\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160" +
                    "\u0161\3\2\2\2\u0161\u0162\b\65\t\2\u0162k\3\2\2\2\33\2\3\u009b\u00a3" +
                    "\u00ce\u00d1\u00d4\u00d9\u00dc\u00e1\u00e5\u00e9\u00ed\u00f5\u0102\u0108" +
                    "\u010d\u0111\u0115\u011b\u011f\u0124\u0157\u015d\u015f\n\3\r\2\5\2\2\7" +
                    "\3\2\3\16\3\6\2\2\3\17\4\3\20\5\b\2\2";
    public static final int IN_MULTI_COMMENT = 1;
	public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
	private static final String[] _LITERAL_NAMES = {
            null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'",
            "'true'", "'false'", null, null, null, null, "'+'", "'-'", "'*'", "'/'",
            "'%'", "':='", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'&&'", "'||'",
            "'('", "')'", "';'", "'{'", "'}'"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
	private static final String[] _SYMBOLIC_NAMES = {
            null, "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "TRUE", "FALSE",
            "LINE_COMMENT", "MULTILINE_COMMENT_EXIT", "DecimalFloatingPointLiteral",
            "DecimalIntegerLiteral", "ADD", "MINUS", "MUL", "DIV", "MOD", "ASSIGN",
            "LEQ", "GEQ", "LESS", "GREATER", "EQ", "NEQ", "AND", "OR", "LP", "RP",
            "SEMI", "LBR", "RBR", "ID", "WS"
	};
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

    public static String[] modeNames = {
            "DEFAULT_MODE", "IN_MULTI_COMMENT"
    };

    static {
        RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION);
    }

	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}

    int nested_multiline_comment_count = 0;

	public L_Lexer(CharStream input) {
		super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@Override
    public String getGrammarFileName() {
        return "L_Lexer.g4";
    }

	@Override
    public String[] getRuleNames() {
        return ruleNames;
    }

	@Override
    public String getSerializedATN() {
        return _serializedATN;
    }

	@Override
    public String[] getModeNames() {
        return modeNames;
    }

	@Override
    public ATN getATN() {
        return _ATN;
    }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
            case 11:
                MULTILINE_COMMENT_action((RuleContext) _localctx, actionIndex);
                break;
            case 12:
                MULTILINE_COMMENT_EXIT_action((RuleContext) _localctx, actionIndex);
                break;
            case 13:
                CANT_EXIT_action((RuleContext) _localctx, actionIndex);
                break;
            case 14:
                WE_NEED_TO_GO_DEEPER_action((RuleContext) _localctx, actionIndex);
                break;
		}
	}

	private void MULTILINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 0:
                nested_multiline_comment_count = 1;
                break;
		}
	}

    private void MULTILINE_COMMENT_EXIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 1:
                nested_multiline_comment_count -= 1;
                break;
		}
	}

	private void CANT_EXIT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 2:
                nested_multiline_comment_count -= 1;
                break;
		}
	}

	private void WE_NEED_TO_GO_DEEPER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
            case 3:
                nested_multiline_comment_count += 1;
                break;
		}
	}

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
            case 12:
                return MULTILINE_COMMENT_EXIT_sempred((RuleContext) _localctx, predIndex);
            case 13:
                return CANT_EXIT_sempred((RuleContext) _localctx, predIndex);
		}
		return true;
	}

    private boolean MULTILINE_COMMENT_EXIT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
            case 0:
                return nested_multiline_comment_count == 1;
		}
		return true;
	}

	private boolean CANT_EXIT_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
            case 1:
                return nested_multiline_comment_count > 1;
		}
		return true;
	}
}