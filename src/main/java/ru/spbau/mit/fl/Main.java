package ru.spbau.mit.fl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.BitSet;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("\n>> [ERROR] unspecified filename << \n");
            System.exit(-1);
        }

        if (!Files.exists(Paths.get(args[0]))) {
            System.out.println("\n>> [ERROR] file does not exist << \n");
            System.exit(-1);
        }


        L_Lexer lexer = null;
        try {
            lexer = new L_Lexer(new ANTLRFileStream(args[0]));
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        MyErrorListener errorListener = new MyErrorListener();
        lexer.addErrorListener(errorListener);

        LexerWrapper wrapper = new LexerWrapper(lexer);
        int lastLineno = 1;
        while (wrapper.hasNext()) {
            TokenPrintable tok = wrapper.nextTok();

            if (tok.lineno != lastLineno) {
                System.out.println();
                lastLineno = tok.lineno;
            }

            tok.print();
            System.out.print(";\n");

        }

        if (lexer._mode == L_Lexer.IN_MULTI_COMMENT) {
            System.err.println("\n>> [ERROR] Unclosed comment << \n");
            System.exit(-1);
        }
    }


    private static class MyErrorListener implements ANTLRErrorListener {
        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            System.exit(-1);
        }

        @Override
        public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
            System.exit(-1);
        }

        @Override
        public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
            System.exit(-1);
        }

        @Override
        public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
            System.exit(-1);
        }
    }

}
