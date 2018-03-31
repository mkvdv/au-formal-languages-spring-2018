package ru.spbau.mit.fl;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Token;

public class LexerWrapper {
    private Lexer lex;
    private Token newTok;

    LexerWrapper(Lexer lex) {
        this.lex = lex;
        newTok = lex.nextToken();
    }

    boolean hasNext() {
        return newTok.getType() != Token.EOF;
    }

    TokenPrintable nextTok() {
        TokenPrintable res = null;

        switch (newTok.getType()) {
            case Token.EOF:
                assert false;
                break;

            case L_Lexer.DecimalIntegerLiteral:
                res = new TokenDecimal(newTok);
                break;

            case L_Lexer.DecimalFloatingPointLiteral:
                res = new TokenFloating(newTok);
                break;

            case L_Lexer.ID:
                res = new TokenId(newTok);
                break;

            case L_Lexer.LINE_COMMENT:
                res = new TokenLineComment(newTok);
                break;


            case L_Lexer.MULTILINE_COMMENT_EXIT:
                res = new TokenMultiLineComment(newTok);
                break;

            default:
                res = new TokenKW(newTok);
                break;
        }

        // update
        newTok = lex.nextToken();

        return res;
    }


    // STUFF //////////////////////////////////////////////////////////////////////////////
    static class TokenDecimal extends TokenPrintable {
        private long value;

        TokenDecimal(Token tok) {
            super(tok);

            String s = tok.getText().replace("_", "");
            if (s.charAt(s.length() - 1) == 'L' || s.charAt(s.length() - 1) == 'l') {
                s = s.substring(0, s.length() - 1);
            }
            value = Long.parseLong(s);
        }

        @Override
        public void print() {
            System.out.printf("%s(%d, %d, %d, %d)",
                    type, value, lineno, ixCharBegin, ixCharEnd);
        }
    }

    static class TokenFloating extends TokenPrintable {
        private double value;

        TokenFloating(Token tok) {
            super(tok);
            value = Double.parseDouble(tok.getText().replace("_", ""));
        }

        @Override
        public void print() {
            System.out.printf("%s(%f, %d, %d, %d)",
                    type, value, lineno, ixCharBegin, ixCharEnd);
        }
    }


    static class TokenId extends TokenPrintable {
        private String value;

        TokenId(Token tok) {
            super(tok);
            value = tok.getText();
        }

        @Override
        public void print() {
            System.out.printf("%s(%s, %d, %d, %d)",
                    type, value, lineno, ixCharBegin, ixCharEnd);
        }
    }

    static class TokenLineComment extends TokenPrintable {
        private String value;

        TokenLineComment(Token tok) {
            super(tok);

            // preprocess for beauty output
            value = tok.getText().substring(0, value.length() - 1);
        }

        @Override
        public void print() {
            System.out.printf("%s(%s, %d, %d, %d)",
                    type, value, lineno, ixCharBegin, ixCharEnd);
        }
    }

    static class TokenMultiLineComment extends TokenPrintable {
        private String value;

        TokenMultiLineComment(Token tok) {
            super(tok);
            value = tok.getText();
        }

        @Override
        public void print() {
            System.out.printf("%s(%s, %d, %d, %d)",
                    type, value, lineno, ixCharBegin, ixCharEnd);
        }
    }

    static class TokenKW extends TokenPrintable {
        TokenKW(Token tok) {
            super(tok);
        }

        @Override
        public void print() {
            System.out.printf("%s(%d, %d, %d)",
                    type, lineno, ixCharBegin, ixCharEnd);
        }
    }
}
