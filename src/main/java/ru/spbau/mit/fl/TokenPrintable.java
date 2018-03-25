package ru.spbau.mit.fl;

import org.antlr.v4.runtime.Token;

abstract class TokenPrintable {
    protected int ixCharBegin, ixCharEnd, lineno;
    protected String type;

    TokenPrintable(Token tok) {
        lineno = tok.getLine();
        ixCharBegin = tok.getCharPositionInLine();
        ixCharEnd = tok.getCharPositionInLine() + tok.getText().length();
        type = L_Lexer.VOCABULARY.getSymbolicName(tok.getType());
    }

    abstract void print();
}
