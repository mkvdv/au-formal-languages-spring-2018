// Generated from L_Parser.g4 by ANTLR 4.7.1

package ru.spbau.mit.fl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class L_Parser extends Parser {
    public static final int
            IF = 1, THEN = 2, ELSE = 3, WHILE = 4, DO = 5, READ = 6, WRITE = 7, TRUE = 8, FALSE = 9,
            LINE_COMMENT = 10, MULTILINE_COMMENT_EXIT = 11, DecimalFloatingPointLiteral = 12,
            DecimalIntegerLiteral = 13, ADD = 14, MINUS = 15, POW = 16, MUL = 17, DIV = 18, MOD = 19,
            ASSIGN = 20, LEQ = 21, GEQ = 22, LESS = 23, GREATER = 24, EQ = 25, NEQ = 26, AND = 27,
            OR = 28, LP = 29, RP = 30, SEMI = 31, COMMA = 32, LBR = 33, RBR = 34, ID = 35, WS = 36;
    public static final int
            RULE_prog = 0, RULE_def_func = 1, RULE_args = 2, RULE_left_assoc_operator = 3,
            RULE_right_assoc_operator = 4, RULE_call = 5, RULE_expr = 6, RULE_statements = 7,
            RULE_statement = 8, RULE_literal = 9;
    public static final String[] ruleNames = {
            "prog", "def_func", "args", "left_assoc_operator", "right_assoc_operator",
            "call", "expr", "statements", "statement", "literal"
    };
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0085\4\2\t\2\4" +
                    "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" +
                    "\13\3\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3" +
                    "\3\3\3\3\4\3\4\3\4\3\4\7\4+\n\4\f\4\16\4.\13\4\5\4\60\n\4\3\5\3\5\3\6" +
                    "\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bC\n\b\3\b" +
                    "\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\t\3\t\3\t\7\tU" +
                    "\n\t\f\t\16\tX\13\t\5\tZ\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3" +
                    "\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n" +
                    "\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3\13\2\3" +
                    "\16\f\2\4\6\b\n\f\16\20\22\24\2\4\5\2\20\21\23\25\27\36\4\2\n\13\16\17" +
                    "\2\u0089\2\31\3\2\2\2\4\36\3\2\2\2\6/\3\2\2\2\b\61\3\2\2\2\n\63\3\2\2" +
                    "\2\f\65\3\2\2\2\16B\3\2\2\2\20Y\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3\2" +
                    "\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2" +
                    "\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\5\20\t\2\35\3\3\2\2\2\36\37\7%" +
                    "\2\2\37 \7\37\2\2 !\5\6\4\2!\"\7 \2\2\"#\7#\2\2#$\5\20\t\2$%\7$\2\2%\5" +
                    "\3\2\2\2&\60\3\2\2\2\',\7%\2\2()\7\"\2\2)+\7%\2\2*(\3\2\2\2+.\3\2\2\2" +
                    ",*\3\2\2\2,-\3\2\2\2-\60\3\2\2\2.,\3\2\2\2/&\3\2\2\2/\'\3\2\2\2\60\7\3" +
                    "\2\2\2\61\62\t\2\2\2\62\t\3\2\2\2\63\64\7\22\2\2\64\13\3\2\2\2\65\66\7" +
                    "%\2\2\66\67\7\37\2\2\678\5\6\4\289\7 \2\29\r\3\2\2\2:;\b\b\1\2;C\5\f\7" +
                    "\2<C\7%\2\2=C\5\24\13\2>?\7\37\2\2?@\5\16\b\2@A\7 \2\2AC\3\2\2\2B:\3\2" +
                    "\2\2B<\3\2\2\2B=\3\2\2\2B>\3\2\2\2CN\3\2\2\2DE\f\5\2\2EF\5\n\6\2FG\5\16" +
                    "\b\5GM\3\2\2\2HI\f\4\2\2IJ\5\b\5\2JK\5\16\b\5KM\3\2\2\2LD\3\2\2\2LH\3" +
                    "\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\17\3\2\2\2PN\3\2\2\2QZ\3\2\2\2R" +
                    "V\5\22\n\2SU\5\22\n\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WZ\3\2\2" +
                    "\2XV\3\2\2\2YQ\3\2\2\2YR\3\2\2\2Z\21\3\2\2\2[\\\7%\2\2\\]\7\26\2\2]^\5" +
                    "\16\b\2^_\7!\2\2_\u0081\3\2\2\2`a\5\f\7\2ab\7!\2\2b\u0081\3\2\2\2cd\7" +
                    "\t\2\2de\5\16\b\2ef\7!\2\2f\u0081\3\2\2\2gh\7\b\2\2hi\7%\2\2i\u0081\7" +
                    "!\2\2jk\7\6\2\2kl\7\37\2\2lm\5\16\b\2mn\7 \2\2no\7\7\2\2op\7#\2\2pq\5" +
                    "\20\t\2qr\7$\2\2r\u0081\3\2\2\2st\7\3\2\2tu\7\37\2\2uv\5\16\b\2vw\7 \2" +
                    "\2wx\7\4\2\2xy\7#\2\2yz\5\20\t\2z{\7$\2\2{|\7\5\2\2|}\7#\2\2}~\5\20\t" +
                    "\2~\177\7$\2\2\177\u0081\3\2\2\2\u0080[\3\2\2\2\u0080`\3\2\2\2\u0080c" +
                    "\3\2\2\2\u0080g\3\2\2\2\u0080j\3\2\2\2\u0080s\3\2\2\2\u0081\23\3\2\2\2" +
                    "\u0082\u0083\t\3\2\2\u0083\25\3\2\2\2\13\31,/BLNVY\u0080";
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

    public L_Parser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
        return "L_Parser.g4";
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
    public ATN getATN() {
        return _ATN;
    }

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(23);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        {
                            {
                                setState(20);
                                def_func();
                            }
                        }
                    }
                    setState(25);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 0, _ctx);
                }
                setState(26);
                statements();
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Def_funcContext def_func() throws RecognitionException {
        Def_funcContext _localctx = new Def_funcContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_def_func);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(28);
                match(ID);
                setState(29);
                match(LP);
                setState(30);
                args();
                setState(31);
                match(RP);
                setState(32);
                match(LBR);
                setState(33);
                statements();
                setState(34);
                match(RBR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ArgsContext args() throws RecognitionException {
        ArgsContext _localctx = new ArgsContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_args);
        int _la;
        try {
            setState(45);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case RP:
                    enterOuterAlt(_localctx, 1);
                {
                }
                break;
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(37);
                    match(ID);
                    setState(42);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == COMMA) {
                        {
                            {
                                setState(38);
                                match(COMMA);
                                setState(39);
                                match(ID);
                            }
                        }
                        setState(44);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Left_assoc_operatorContext left_assoc_operator() throws RecognitionException {
        Left_assoc_operatorContext _localctx = new Left_assoc_operatorContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_left_assoc_operator);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << MINUS) | (1L << MUL) | (1L << DIV) | (1L << MOD) | (1L << LEQ) | (1L << GEQ) | (1L << LESS) | (1L << GREATER) | (1L << EQ) | (1L << NEQ) | (1L << AND) | (1L << OR))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final Right_assoc_operatorContext right_assoc_operator() throws RecognitionException {
        Right_assoc_operatorContext _localctx = new Right_assoc_operatorContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_right_assoc_operator);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(49);
                match(POW);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final CallContext call() throws RecognitionException {
        CallContext _localctx = new CallContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_call);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(51);
                match(ID);
                setState(52);
                match(LP);
                setState(53);
                args();
                setState(54);
                match(RP);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final ExprContext expr() throws RecognitionException {
        return expr(0);
    }

    private ExprContext expr(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        ExprContext _localctx = new ExprContext(_ctx, _parentState);
        ExprContext _prevctx = _localctx;
        int _startState = 12;
        enterRecursionRule(_localctx, 12, RULE_expr, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(64);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                    case 1: {
                        setState(57);
                        call();
                    }
                    break;
                    case 2: {
                        setState(58);
                        match(ID);
                    }
                    break;
                    case 3: {
                        setState(59);
                        literal();
                    }
                    break;
                    case 4: {
                        setState(60);
                        match(LP);
                        setState(61);
                        expr(0);
                        setState(62);
                        match(RP);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(76);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(74);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                                case 1: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(66);
                                    if (!(precpred(_ctx, 3)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 3)");
                                    setState(67);
                                    right_assoc_operator();
                                    setState(68);
                                    expr(3);
                                }
                                break;
                                case 2: {
                                    _localctx = new ExprContext(_parentctx, _parentState);
                                    pushNewRecursionContext(_localctx, _startState, RULE_expr);
                                    setState(70);
                                    if (!(precpred(_ctx, 2)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                    setState(71);
                                    left_assoc_operator();
                                    setState(72);
                                    expr(3);
                                }
                                break;
                            }
                        }
                    }
                    setState(78);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 5, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public final StatementsContext statements() throws RecognitionException {
        StatementsContext _localctx = new StatementsContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_statements);
        int _la;
        try {
            setState(87);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case EOF:
                case RBR:
                    enterOuterAlt(_localctx, 1);
                {
                }
                break;
                case IF:
                case WHILE:
                case READ:
                case WRITE:
                case ID:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(80);
                    statement();
                    setState(84);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << WHILE) | (1L << READ) | (1L << WRITE) | (1L << ID))) != 0)) {
                        {
                            {
                                setState(81);
                                statement();
                            }
                        }
                        setState(86);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                }
                break;
                default:
                    throw new NoViableAltException(this);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_statement);
        try {
            setState(126);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    setState(89);
                    match(ID);
                    setState(90);
                    match(ASSIGN);
                    setState(91);
                    expr(0);
                    setState(92);
                    match(SEMI);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(94);
                    call();
                    setState(95);
                    match(SEMI);
                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    setState(97);
                    match(WRITE);
                    setState(98);
                    expr(0);
                    setState(99);
                    match(SEMI);
                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
                    setState(101);
                    match(READ);
                    setState(102);
                    match(ID);
                    setState(103);
                    match(SEMI);
                }
                break;
                case 5:
                    enterOuterAlt(_localctx, 5);
                {
                    setState(104);
                    match(WHILE);
                    setState(105);
                    match(LP);
                    setState(106);
                    expr(0);
                    setState(107);
                    match(RP);
                    setState(108);
                    match(DO);
                    setState(109);
                    match(LBR);
                    setState(110);
                    statements();
                    setState(111);
                    match(RBR);
                }
                break;
                case 6:
                    enterOuterAlt(_localctx, 6);
                {
                    setState(113);
                    match(IF);
                    setState(114);
                    match(LP);
                    setState(115);
                    expr(0);
                    setState(116);
                    match(RP);
                    setState(117);
                    match(THEN);
                    setState(118);
                    match(LBR);
                    setState(119);
                    statements();
                    setState(120);
                    match(RBR);
                    setState(121);
                    match(ELSE);
                    setState(122);
                    match(LBR);
                    setState(123);
                    statements();
                    setState(124);
                    match(RBR);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public final LiteralContext literal() throws RecognitionException {
        LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(128);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << DecimalFloatingPointLiteral) | (1L << DecimalIntegerLiteral))) != 0))) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 6:
                return expr_sempred((ExprContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expr_sempred(ExprContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 3);
            case 1:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatementsContext statements() {
            return getRuleContext(StatementsContext.class, 0);
        }

        public List<Def_funcContext> def_func() {
            return getRuleContexts(Def_funcContext.class);
        }

        public Def_funcContext def_func(int i) {
            return getRuleContext(Def_funcContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitProg(this);
        }
    }

    public static class Def_funcContext extends ParserRuleContext {
        public Def_funcContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(L_Parser.ID, 0);
        }

        public TerminalNode LP() {
            return getToken(L_Parser.LP, 0);
        }

        public ArgsContext args() {
            return getRuleContext(ArgsContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(L_Parser.RP, 0);
        }

        public TerminalNode LBR() {
            return getToken(L_Parser.LBR, 0);
        }

        public StatementsContext statements() {
            return getRuleContext(StatementsContext.class, 0);
        }

        public TerminalNode RBR() {
            return getToken(L_Parser.RBR, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_def_func;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterDef_func(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitDef_func(this);
        }
    }

    public static class ArgsContext extends ParserRuleContext {
        public ArgsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(L_Parser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(L_Parser.ID, i);
        }

        public List<TerminalNode> COMMA() {
            return getTokens(L_Parser.COMMA);
        }

        public TerminalNode COMMA(int i) {
            return getToken(L_Parser.COMMA, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_args;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterArgs(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitArgs(this);
        }
    }

    public static class Left_assoc_operatorContext extends ParserRuleContext {
        public Left_assoc_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ADD() {
            return getToken(L_Parser.ADD, 0);
        }

        public TerminalNode MINUS() {
            return getToken(L_Parser.MINUS, 0);
        }

        public TerminalNode MUL() {
            return getToken(L_Parser.MUL, 0);
        }

        public TerminalNode DIV() {
            return getToken(L_Parser.DIV, 0);
        }

        public TerminalNode MOD() {
            return getToken(L_Parser.MOD, 0);
        }

        public TerminalNode LEQ() {
            return getToken(L_Parser.LEQ, 0);
        }

        public TerminalNode GEQ() {
            return getToken(L_Parser.GEQ, 0);
        }

        public TerminalNode LESS() {
            return getToken(L_Parser.LESS, 0);
        }

        public TerminalNode GREATER() {
            return getToken(L_Parser.GREATER, 0);
        }

        public TerminalNode EQ() {
            return getToken(L_Parser.EQ, 0);
        }

        public TerminalNode NEQ() {
            return getToken(L_Parser.NEQ, 0);
        }

        public TerminalNode AND() {
            return getToken(L_Parser.AND, 0);
        }

        public TerminalNode OR() {
            return getToken(L_Parser.OR, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_left_assoc_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterLeft_assoc_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitLeft_assoc_operator(this);
        }
    }

    public static class Right_assoc_operatorContext extends ParserRuleContext {
        public Right_assoc_operatorContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode POW() {
            return getToken(L_Parser.POW, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_right_assoc_operator;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterRight_assoc_operator(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitRight_assoc_operator(this);
        }
    }

    public static class CallContext extends ParserRuleContext {
        public CallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(L_Parser.ID, 0);
        }

        public TerminalNode LP() {
            return getToken(L_Parser.LP, 0);
        }

        public ArgsContext args() {
            return getRuleContext(ArgsContext.class, 0);
        }

        public TerminalNode RP() {
            return getToken(L_Parser.RP, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_call;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterCall(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitCall(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public CallContext call() {
            return getRuleContext(CallContext.class, 0);
        }

        public TerminalNode ID() {
            return getToken(L_Parser.ID, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public TerminalNode LP() {
            return getToken(L_Parser.LP, 0);
        }

        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }

        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class, i);
        }

        public TerminalNode RP() {
            return getToken(L_Parser.RP, 0);
        }

        public Right_assoc_operatorContext right_assoc_operator() {
            return getRuleContext(Right_assoc_operatorContext.class, 0);
        }

        public Left_assoc_operatorContext left_assoc_operator() {
            return getRuleContext(Left_assoc_operatorContext.class, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterExpr(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitExpr(this);
        }
    }

    public static class StatementsContext extends ParserRuleContext {
        public StatementsContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statements;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterStatements(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitStatements(this);
        }
    }

    public static class StatementContext extends ParserRuleContext {
        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode ID() {
            return getToken(L_Parser.ID, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(L_Parser.ASSIGN, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode SEMI() {
            return getToken(L_Parser.SEMI, 0);
        }

        public CallContext call() {
            return getRuleContext(CallContext.class, 0);
        }

        public TerminalNode WRITE() {
            return getToken(L_Parser.WRITE, 0);
        }

        public TerminalNode READ() {
            return getToken(L_Parser.READ, 0);
        }

        public TerminalNode WHILE() {
            return getToken(L_Parser.WHILE, 0);
        }

        public TerminalNode LP() {
            return getToken(L_Parser.LP, 0);
        }

        public TerminalNode RP() {
            return getToken(L_Parser.RP, 0);
        }

        public TerminalNode DO() {
            return getToken(L_Parser.DO, 0);
        }

        public List<TerminalNode> LBR() {
            return getTokens(L_Parser.LBR);
        }

        public TerminalNode LBR(int i) {
            return getToken(L_Parser.LBR, i);
        }

        public List<StatementsContext> statements() {
            return getRuleContexts(StatementsContext.class);
        }

        public StatementsContext statements(int i) {
            return getRuleContext(StatementsContext.class, i);
        }

        public List<TerminalNode> RBR() {
            return getTokens(L_Parser.RBR);
        }

        public TerminalNode RBR(int i) {
            return getToken(L_Parser.RBR, i);
        }

        public TerminalNode IF() {
            return getToken(L_Parser.IF, 0);
        }

        public TerminalNode THEN() {
            return getToken(L_Parser.THEN, 0);
        }

        public TerminalNode ELSE() {
            return getToken(L_Parser.ELSE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitStatement(this);
        }
    }

    public static class LiteralContext extends ParserRuleContext {
        public LiteralContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode DecimalFloatingPointLiteral() {
            return getToken(L_Parser.DecimalFloatingPointLiteral, 0);
        }

        public TerminalNode DecimalIntegerLiteral() {
            return getToken(L_Parser.DecimalIntegerLiteral, 0);
        }

        public TerminalNode TRUE() {
            return getToken(L_Parser.TRUE, 0);
        }

        public TerminalNode FALSE() {
            return getToken(L_Parser.FALSE, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).enterLiteral(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof L_ParserListener) ((L_ParserListener) listener).exitLiteral(this);
        }
    }
}