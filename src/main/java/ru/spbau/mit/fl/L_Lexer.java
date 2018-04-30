// Generated from L_Lexer.g4 by ANTLR 4.7.1

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
            DecimalIntegerLiteral = 13, ADD = 14, MINUS = 15, POW = 16, MUL = 17, DIV = 18, MOD = 19,
            ASSIGN = 20, LEQ = 21, GEQ = 22, LESS = 23, GREATER = 24, EQ = 25, NEQ = 26, AND = 27,
            OR = 28, LP = 29, RP = 30, SEMI = 31, COMMA = 32, LBR = 33, RBR = 34, ID = 35, WS = 36;
    public static final int
            IN_MULTI_COMMENT = 1;
    public static final String[] ruleNames = {
            "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "TRUE", "FALSE",
            "NL", "LINE_COMMENT", "MULTILINE_COMMENT", "MULTILINE_COMMENT_EXIT", "CANT_EXIT",
            "WE_NEED_TO_GO_DEEPER", "COMMENT", "DecimalFloatingPointLiteral", "DecimalIntegerLiteral",
            "ExponentPart", "ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix",
            "IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit",
            "DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "ADD", "MINUS",
            "POW", "MUL", "DIV", "MOD", "ASSIGN", "LEQ", "GEQ", "LESS", "GREATER",
            "EQ", "NEQ", "AND", "OR", "LP", "RP", "SEMI", "COMMA", "LBR", "RBR", "ID",
            "WS"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u016f\b\1\b\1\4" +
                    "\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n" +
                    "\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22" +
                    "\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31" +
                    "\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t" +
                    " \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t" +
                    "+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64" +
                    "\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3" +
                    "\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7" +
                    "\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\3\13\3\13\3\13\5\13\u00a0\n\13\3\f\3\f\3\f\3\f\7\f\u00a6\n\f\f\f\16" +
                    "\f\u00a9\13\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16" +
                    "\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17" +
                    "\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22" +
                    "\3\22\5\22\u00d6\n\22\3\22\5\22\u00d9\n\22\3\22\5\22\u00dc\n\22\3\22\3" +
                    "\22\3\22\5\22\u00e1\n\22\3\22\5\22\u00e4\n\22\3\22\3\22\3\22\5\22\u00e9" +
                    "\n\22\3\22\3\22\5\22\u00ed\n\22\3\22\3\22\5\22\u00f1\n\22\3\23\3\23\5" +
                    "\23\u00f5\n\23\3\24\3\24\3\24\3\25\3\25\3\26\5\26\u00fd\n\26\3\26\3\26" +
                    "\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\5\32\u010a\n\32\3\32\3\32" +
                    "\3\32\3\32\5\32\u0110\n\32\3\33\3\33\3\33\5\33\u0115\n\33\3\33\3\33\5" +
                    "\33\u0119\n\33\3\34\3\34\5\34\u011d\n\34\3\35\3\35\3\36\3\36\5\36\u0123" +
                    "\n\36\3\37\3\37\5\37\u0127\n\37\3 \6 \u012a\n \r \16 \u012b\3!\3!\3\"" +
                    "\3\"\3#\3#\3#\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3" +
                    "+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62" +
                    "\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\7\66\u0162\n\66\f\66\16\66\u0165" +
                    "\13\66\3\67\3\67\3\67\6\67\u016a\n\67\r\67\16\67\u016b\3\67\3\67\3\u00a7" +
                    "\28\4\3\6\4\b\5\n\6\f\7\16\b\20\t\22\n\24\13\26\2\30\f\32\2\34\r\36\2" +
                    " \2\"\2$\16&\17(\2*\2,\2.\2\60\2\62\2\64\2\66\28\2:\2<\2>\2@\2B\20D\21" +
                    "F\22H\23J\24L\25N\26P\27R\30T\31V\32X\33Z\34\\\35^\36`\37b d!f\"h#j$l" +
                    "%n&\4\2\3\13\4\2\f\f\17\17\4\2GGgg\4\2--//\6\2FFHHffhh\4\2NNnn\3\2\62" +
                    ";\4\2aac|\5\2\62;aac|\5\2\13\f\17\17\"\"\2\u0179\2\4\3\2\2\2\2\6\3\2\2" +
                    "\2\2\b\3\2\2\2\2\n\3\2\2\2\2\f\3\2\2\2\2\16\3\2\2\2\2\20\3\2\2\2\2\22" +
                    "\3\2\2\2\2\24\3\2\2\2\2\30\3\2\2\2\2\32\3\2\2\2\2$\3\2\2\2\2&\3\2\2\2" +
                    "\2B\3\2\2\2\2D\3\2\2\2\2F\3\2\2\2\2H\3\2\2\2\2J\3\2\2\2\2L\3\2\2\2\2N" +
                    "\3\2\2\2\2P\3\2\2\2\2R\3\2\2\2\2T\3\2\2\2\2V\3\2\2\2\2X\3\2\2\2\2Z\3\2" +
                    "\2\2\2\\\3\2\2\2\2^\3\2\2\2\2`\3\2\2\2\2b\3\2\2\2\2d\3\2\2\2\2f\3\2\2" +
                    "\2\2h\3\2\2\2\2j\3\2\2\2\2l\3\2\2\2\2n\3\2\2\2\3\34\3\2\2\2\3\36\3\2\2" +
                    "\2\3 \3\2\2\2\3\"\3\2\2\2\4p\3\2\2\2\6s\3\2\2\2\bx\3\2\2\2\n}\3\2\2\2" +
                    "\f\u0083\3\2\2\2\16\u0086\3\2\2\2\20\u008b\3\2\2\2\22\u0091\3\2\2\2\24" +
                    "\u0096\3\2\2\2\26\u009f\3\2\2\2\30\u00a1\3\2\2\2\32\u00ae\3\2\2\2\34\u00b6" +
                    "\3\2\2\2\36\u00bf\3\2\2\2 \u00c7\3\2\2\2\"\u00ce\3\2\2\2$\u00f0\3\2\2" +
                    "\2&\u00f2\3\2\2\2(\u00f6\3\2\2\2*\u00f9\3\2\2\2,\u00fc\3\2\2\2.\u0100" +
                    "\3\2\2\2\60\u0102\3\2\2\2\62\u0104\3\2\2\2\64\u010f\3\2\2\2\66\u0118\3" +
                    "\2\2\28\u011c\3\2\2\2:\u011e\3\2\2\2<\u0120\3\2\2\2>\u0126\3\2\2\2@\u0129" +
                    "\3\2\2\2B\u012d\3\2\2\2D\u012f\3\2\2\2F\u0131\3\2\2\2H\u0134\3\2\2\2J" +
                    "\u0136\3\2\2\2L\u0138\3\2\2\2N\u013a\3\2\2\2P\u013d\3\2\2\2R\u0140\3\2" +
                    "\2\2T\u0143\3\2\2\2V\u0145\3\2\2\2X\u0147\3\2\2\2Z\u014a\3\2\2\2\\\u014d" +
                    "\3\2\2\2^\u0150\3\2\2\2`\u0153\3\2\2\2b\u0155\3\2\2\2d\u0157\3\2\2\2f" +
                    "\u0159\3\2\2\2h\u015b\3\2\2\2j\u015d\3\2\2\2l\u015f\3\2\2\2n\u0169\3\2" +
                    "\2\2pq\7k\2\2qr\7h\2\2r\5\3\2\2\2st\7v\2\2tu\7j\2\2uv\7g\2\2vw\7p\2\2" +
                    "w\7\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7g\2\2|\t\3\2\2\2}~\7y\2\2~\177" +
                    "\7j\2\2\177\u0080\7k\2\2\u0080\u0081\7n\2\2\u0081\u0082\7g\2\2\u0082\13" +
                    "\3\2\2\2\u0083\u0084\7f\2\2\u0084\u0085\7q\2\2\u0085\r\3\2\2\2\u0086\u0087" +
                    "\7t\2\2\u0087\u0088\7g\2\2\u0088\u0089\7c\2\2\u0089\u008a\7f\2\2\u008a" +
                    "\17\3\2\2\2\u008b\u008c\7y\2\2\u008c\u008d\7t\2\2\u008d\u008e\7k\2\2\u008e" +
                    "\u008f\7v\2\2\u008f\u0090\7g\2\2\u0090\21\3\2\2\2\u0091\u0092\7v\2\2\u0092" +
                    "\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u0095\7g\2\2\u0095\23\3\2\2\2\u0096" +
                    "\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099\u009a\7u\2\2" +
                    "\u009a\u009b\7g\2\2\u009b\25\3\2\2\2\u009c\u00a0\t\2\2\2\u009d\u009e\7" +
                    "\17\2\2\u009e\u00a0\7\f\2\2\u009f\u009c\3\2\2\2\u009f\u009d\3\2\2\2\u00a0" +
                    "\27\3\2\2\2\u00a1\u00a2\7\61\2\2\u00a2\u00a3\7\61\2\2\u00a3\u00a7\3\2" +
                    "\2\2\u00a4\u00a6\13\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7" +
                    "\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a7\3\2" +
                    "\2\2\u00aa\u00ab\5\26\13\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\b\f\2\2\u00ad" +
                    "\31\3\2\2\2\u00ae\u00af\7\61\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\3\2\2" +
                    "\2\u00b1\u00b2\b\r\3\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\b\r\4\2\u00b4\u00b5" +
                    "\b\r\5\2\u00b5\33\3\2\2\2\u00b6\u00b7\7,\2\2\u00b7\u00b8\7\61\2\2\u00b8" +
                    "\u00b9\3\2\2\2\u00b9\u00ba\6\16\2\2\u00ba\u00bb\b\16\6\2\u00bb\u00bc\3" +
                    "\2\2\2\u00bc\u00bd\b\16\7\2\u00bd\u00be\b\16\2\2\u00be\35\3\2\2\2\u00bf" +
                    "\u00c0\7,\2\2\u00c0\u00c1\7\61\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c3\6\17" +
                    "\3\2\u00c3\u00c4\b\17\b\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6\b\17\4\2\u00c6" +
                    "\37\3\2\2\2\u00c7\u00c8\7\61\2\2\u00c8\u00c9\7,\2\2\u00c9\u00ca\3\2\2" +
                    "\2\u00ca\u00cb\b\20\t\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\b\20\4\2\u00cd" +
                    "!\3\2\2\2\u00ce\u00cf\13\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\21\4" +
                    "\2\u00d1#\3\2\2\2\u00d2\u00d3\5\66\33\2\u00d3\u00d5\7\60\2\2\u00d4\u00d6" +
                    "\5\66\33\2\u00d5\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2" +
                    "\u00d7\u00d9\5(\24\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00db" +
                    "\3\2\2\2\u00da\u00dc\5\60\30\2\u00db\u00da\3\2\2\2\u00db\u00dc\3\2\2\2" +
                    "\u00dc\u00f1\3\2\2\2\u00dd\u00de\7\60\2\2\u00de\u00e0\5\66\33\2\u00df" +
                    "\u00e1\5(\24\2\u00e0\u00df\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00e3\3\2" +
                    "\2\2\u00e2\u00e4\5\60\30\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4" +
                    "\u00f1\3\2\2\2\u00e5\u00e6\5\66\33\2\u00e6\u00e8\5(\24\2\u00e7\u00e9\5" +
                    "\60\30\2\u00e8\u00e7\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f1\3\2\2\2\u00ea" +
                    "\u00ec\5\66\33\2\u00eb\u00ed\5(\24\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3" +
                    "\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00ef\5\60\30\2\u00ef\u00f1\3\2\2\2\u00f0" +
                    "\u00d2\3\2\2\2\u00f0\u00dd\3\2\2\2\u00f0\u00e5\3\2\2\2\u00f0\u00ea\3\2" +
                    "\2\2\u00f1%\3\2\2\2\u00f2\u00f4\5\64\32\2\u00f3\u00f5\5\62\31\2\u00f4" +
                    "\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\'\3\2\2\2\u00f6\u00f7\5*\25\2" +
                    "\u00f7\u00f8\5,\26\2\u00f8)\3\2\2\2\u00f9\u00fa\t\3\2\2\u00fa+\3\2\2\2" +
                    "\u00fb\u00fd\5.\27\2\u00fc\u00fb\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe" +
                    "\3\2\2\2\u00fe\u00ff\5\66\33\2\u00ff-\3\2\2\2\u0100\u0101\t\4\2\2\u0101" +
                    "/\3\2\2\2\u0102\u0103\t\5\2\2\u0103\61\3\2\2\2\u0104\u0105\t\6\2\2\u0105" +
                    "\63\3\2\2\2\u0106\u0110\7\62\2\2\u0107\u0109\5:\35\2\u0108\u010a\5\66" +
                    "\33\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u0110\3\2\2\2\u010b" +
                    "\u010c\5:\35\2\u010c\u010d\5@ \2\u010d\u010e\5\66\33\2\u010e\u0110\3\2" +
                    "\2\2\u010f\u0106\3\2\2\2\u010f\u0107\3\2\2\2\u010f\u010b\3\2\2\2\u0110" +
                    "\65\3\2\2\2\u0111\u0119\58\34\2\u0112\u0114\58\34\2\u0113\u0115\5<\36" +
                    "\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117" +
                    "\58\34\2\u0117\u0119\3\2\2\2\u0118\u0111\3\2\2\2\u0118\u0112\3\2\2\2\u0119" +
                    "\67\3\2\2\2\u011a\u011d\7\62\2\2\u011b\u011d\5:\35\2\u011c\u011a\3\2\2" +
                    "\2\u011c\u011b\3\2\2\2\u011d9\3\2\2\2\u011e\u011f\t\7\2\2\u011f;\3\2\2" +
                    "\2\u0120\u0122\5>\37\2\u0121\u0123\5<\36\2\u0122\u0121\3\2\2\2\u0122\u0123" +
                    "\3\2\2\2\u0123=\3\2\2\2\u0124\u0127\58\34\2\u0125\u0127\7a\2\2\u0126\u0124" +
                    "\3\2\2\2\u0126\u0125\3\2\2\2\u0127?\3\2\2\2\u0128\u012a\7a\2\2\u0129\u0128" +
                    "\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c" +
                    "A\3\2\2\2\u012d\u012e\7-\2\2\u012eC\3\2\2\2\u012f\u0130\7/\2\2\u0130E" +
                    "\3\2\2\2\u0131\u0132\7,\2\2\u0132\u0133\7,\2\2\u0133G\3\2\2\2\u0134\u0135" +
                    "\7,\2\2\u0135I\3\2\2\2\u0136\u0137\7\61\2\2\u0137K\3\2\2\2\u0138\u0139" +
                    "\7\'\2\2\u0139M\3\2\2\2\u013a\u013b\7<\2\2\u013b\u013c\7?\2\2\u013cO\3" +
                    "\2\2\2\u013d\u013e\7>\2\2\u013e\u013f\7?\2\2\u013fQ\3\2\2\2\u0140\u0141" +
                    "\7@\2\2\u0141\u0142\7?\2\2\u0142S\3\2\2\2\u0143\u0144\7>\2\2\u0144U\3" +
                    "\2\2\2\u0145\u0146\7@\2\2\u0146W\3\2\2\2\u0147\u0148\7?\2\2\u0148\u0149" +
                    "\7?\2\2\u0149Y\3\2\2\2\u014a\u014b\7#\2\2\u014b\u014c\7?\2\2\u014c[\3" +
                    "\2\2\2\u014d\u014e\7(\2\2\u014e\u014f\7(\2\2\u014f]\3\2\2\2\u0150\u0151" +
                    "\7~\2\2\u0151\u0152\7~\2\2\u0152_\3\2\2\2\u0153\u0154\7*\2\2\u0154a\3" +
                    "\2\2\2\u0155\u0156\7+\2\2\u0156c\3\2\2\2\u0157\u0158\7=\2\2\u0158e\3\2" +
                    "\2\2\u0159\u015a\7.\2\2\u015ag\3\2\2\2\u015b\u015c\7}\2\2\u015ci\3\2\2" +
                    "\2\u015d\u015e\7\177\2\2\u015ek\3\2\2\2\u015f\u0163\t\b\2\2\u0160\u0162" +
                    "\t\t\2\2\u0161\u0160\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163" +
                    "\u0164\3\2\2\2\u0164m\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u016a\t\n\2\2" +
                    "\u0167\u0168\7\17\2\2\u0168\u016a\7\f\2\2\u0169\u0166\3\2\2\2\u0169\u0167" +
                    "\3\2\2\2\u016a\u016b\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c" +
                    "\u016d\3\2\2\2\u016d\u016e\b\67\2\2\u016eo\3\2\2\2\33\2\3\u009f\u00a7" +
                    "\u00d5\u00d8\u00db\u00e0\u00e3\u00e8\u00ec\u00f0\u00f4\u00fc\u0109\u010f" +
                    "\u0114\u0118\u011c\u0122\u0126\u012b\u0163\u0169\u016b\n\b\2\2\3\r\2\5" +
                    "\2\2\7\3\2\3\16\3\6\2\2\3\17\4\3\20\5";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = {
            null, "'if'", "'then'", "'else'", "'while'", "'do'", "'read'", "'write'",
            "'true'", "'false'", null, null, null, null, "'+'", "'-'", "'**'", "'*'",
            "'/'", "'%'", "':='", "'<='", "'>='", "'<'", "'>'", "'=='", "'!='", "'&&'",
            "'||'", "'('", "')'", "';'", "','", "'{'", "'}'"
    };
    private static final String[] _SYMBOLIC_NAMES = {
            null, "IF", "THEN", "ELSE", "WHILE", "DO", "READ", "WRITE", "TRUE", "FALSE",
            "LINE_COMMENT", "MULTILINE_COMMENT_EXIT", "DecimalFloatingPointLiteral",
            "DecimalIntegerLiteral", "ADD", "MINUS", "POW", "MUL", "DIV", "MOD", "ASSIGN",
            "LEQ", "GEQ", "LESS", "GREATER", "EQ", "NEQ", "AND", "OR", "LP", "RP",
            "SEMI", "COMMA", "LBR", "RBR", "ID", "WS"
    };
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };
    public static String[] modeNames = {
            "DEFAULT_MODE", "IN_MULTI_COMMENT"
    };

    static {
        RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION);
    }

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
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
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
    public String[] getChannelNames() {
        return channelNames;
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