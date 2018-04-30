package ru.spbau.mit.fl;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyParseTreePrinter {
    private final String STEP = "--";
    private StringBuilder sb = new StringBuilder();

    public void walk(ParseTree t, String margin) {
        if (t instanceof ErrorNode) {
            printErrorNode((ErrorNode) t, margin);
            return;
        } else if (t instanceof TerminalNode) {
            printTerminal((TerminalNode) t, margin);
            return;
        }
        RuleNode r = (RuleNode) t;
        printRule(r, margin);
        int n = r.getChildCount();
        for (int i = 0; i < n; i++) {
            walk(r.getChild(i), margin + STEP);
        }
    }

    private void printRule(RuleNode r, String margin) {
        sb.append(margin + L_Parser.ruleNames[r.getRuleContext().getRuleIndex()] + '\n');
    }

    private void printErrorNode(ErrorNode r, String margin) {
        System.err.println("## [ERROR]: " + r.getText());
    }

    private void printTerminal(TerminalNode r, String margin) {
        TokenPrintable tok = LexerWrapper.getPrintableToken(r.getSymbol());
        sb.append(margin + tok.getText() + '\n');

    }

    public String getText() {
        return sb.toString();
    }

}