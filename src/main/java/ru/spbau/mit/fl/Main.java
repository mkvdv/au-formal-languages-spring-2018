package ru.spbau.mit.fl;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTree;

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

        MyErrorListener errorListener = new MyErrorListener();
        L_Lexer lexer = null;
        try {
            lexer = new L_Lexer(new ANTLRFileStream(args[0]));
            lexer.addErrorListener(errorListener);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        L_Parser parser = new L_Parser(tokens);
        MyErrorListener parserErrorListener = new MyErrorListener();
        parser.addErrorListener(parserErrorListener);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.prog(); // begin parsing at prog rule

        if (errorListener.wasError()) {
            System.err.println("# Terminating cause lexer error");
            return;
        } else if (parserErrorListener.wasError()) {
            System.err.println("# Terminating cause parser error");
            return;
        }

        MyParseTreePrinter printer = new MyParseTreePrinter();

        printer.walk(tree, "|-");
        System.out.print(printer.getText());
    }

    @Deprecated
    private static void lexer_main(String[] args) {
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
        private boolean errorFlag = false;

        boolean wasError() {
            return errorFlag;
        }

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
            errorFlag = true;
        }

        @Override
        public void reportAmbiguity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, boolean exact, BitSet ambigAlts, ATNConfigSet configs) {
            errorFlag = true;
        }

        @Override
        public void reportAttemptingFullContext(Parser recognizer, DFA dfa, int startIndex, int stopIndex, BitSet conflictingAlts, ATNConfigSet configs) {
            errorFlag = true;
        }

        @Override
        public void reportContextSensitivity(Parser recognizer, DFA dfa, int startIndex, int stopIndex, int prediction, ATNConfigSet configs) {
            errorFlag = true;
        }
    }
}
