package ru.spbau.mit.fl;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MyParseTreePrinter {
    private final String STEP = "--";
    private StringBuilder sb = new StringBuilder();

    // helper function
    private boolean isTerminalWithThisType(ParseTree node, int tokenType) {
        if (node instanceof TerminalNode) {
            TerminalNode term = (TerminalNode) node;
            TokenPrintable tok = LexerWrapper.getPrintableToken(term.getSymbol());
            return tok.realToken.getType() == tokenType;
        }
        return false;
    }

    private void printlnRuleName(int ruleIndex, String margin) {
        sb.append(margin + L_Parser.ruleNames[ruleIndex] + '\n');
    }

    private void println(String str, String margin) {
        sb.append(margin + str + '\n');
    }

    public void walk(ParseTree t, String margin) {
        if (t instanceof ErrorNode) {
            printErrorNode((ErrorNode) t, margin);
            return;
        } else if (t instanceof TerminalNode) {
            printTerminal((TerminalNode) t, margin);
            return;
        }
        RuleNode r = (RuleNode) t;
        int n = r.getChildCount();

        /*
         * This awfull code is for sugar.
         */
        if (r.getRuleContext().getRuleIndex() == L_Parser.RULE_statement) {
            if (n >= 2 && isTerminalWithThisType(r.getChild(0), L_Parser.ID) &&
                    isTerminalWithThisType(r.getChild(1), L_Parser.COMMA)) {
                // sugar - pairing assign
                // print like this is two statements
                // ID COMMA ID ASSIGN expr COMMA expr SEMI
                // 0  1     2  3      4    5     6    7
                printRule(r, margin); // 1st statement
                walk(r.getChild(0), margin + STEP);
                walk(r.getChild(3), margin + STEP);
                walk(r.getChild(4), margin + STEP);

                printRule(r, margin); // 2nd statement
                walk(r.getChild(2), margin + STEP);
                walk(r.getChild(3), margin + STEP);
                walk(r.getChild(6), margin + STEP);

                // ignore SEMI
                return;
            } else if (n >= 3 && isTerminalWithThisType(r.getChild(0), L_Parser.ID) &&
                    (isTerminalWithThisType(r.getChild(1), L_Parser.ADD) && isTerminalWithThisType(r.getChild(2), L_Parser.ADD) ||
                            (isTerminalWithThisType(r.getChild(1), L_Parser.MINUS) && isTerminalWithThisType(r.getChild(2), L_Parser.MINUS)))
                    ) {
                // print like this is two statements
                // |   ID ADD   ADD   SEMI
                // |   ID MINUS MINUS SEMI
                //     0  1     2     3

                int signIndex = L_Lexer.MINUS;
                if (isTerminalWithThisType(r.getChild(1), L_Parser.ADD)) {
                    signIndex = L_Lexer.ADD;
                }
                /*
                *   |-----statement
                    |-------ID(x, 3, 0, 1)
                    |-------ASSIGN(3, 2, 4)
                    |-------expr
                    |---------expr
                    |-----------ID(x, 3, 5, 6)
                    |---------left_assoc_operator
                    |-----------ADD(3, 7, 8)
                    |---------expr
                    |-----------literal
                    |-------------DecimalIntegerLiteral(1, 3, 9, 10)
                * */

                printRule(r, margin); //  statement
                walk(r.getChild(0), margin + STEP); // ID

                // helpful data wxtract from ID
                TerminalNode id_term = (TerminalNode) r.getChild(0);
                LexerWrapper.TokenId id_tok = (LexerWrapper.TokenId) LexerWrapper.getPrintableToken(id_term.getSymbol());
                int id_len = id_tok.ixCharEnd - id_tok.ixCharBegin; // may be here bug=)
                int lineno = id_tok.lineno;


                // gen and print ASSIGN
                int last_end_pos = 0;
                {
                    String assign = String.format("%s(%d, %d, %d)",
                            L_Lexer.VOCABULARY.getSymbolicName(L_Lexer.ASSIGN),
                            lineno, id_tok.ixCharEnd + 1, id_tok.ixCharEnd + 1 + 2);
                    println(assign, margin + STEP); // ASSIGN
                    last_end_pos = id_tok.ixCharEnd + 1 + 2;
                }


                // print expr
                printlnRuleName(L_Parser.RULE_expr, margin + STEP);

                // print 3 exprs -- id, assoc_operator and literal
                margin += STEP;

                // |---------expr
                // |-----------ID(x, 3, 5, 6)
                {
                    printlnRuleName(L_Parser.RULE_expr, margin + STEP);

                    String id = String.format("%s(%s, %d, %d, %d)",
                            L_Lexer.VOCABULARY.getSymbolicName(L_Lexer.ID),
                            id_tok.getValue(),
                            lineno,
                            last_end_pos + 1,
                            last_end_pos + 1 + id_len);
                    println(id, margin + STEP + STEP); // ID2

                    last_end_pos = last_end_pos + 1 + id_len;
                }

                // |---------left_assoc_operator
                // |-----------ADD(3, 7, 8) // or MINUS
                {
                    printlnRuleName(L_Parser.RULE_left_assoc_operator, margin + STEP);

                    String id = String.format("%s(%d, %d, %d)",
                            L_Lexer.VOCABULARY.getSymbolicName(signIndex),
                            lineno,
                            last_end_pos + 1,
                            last_end_pos + 1 + 1);
                    println(id, margin + STEP + STEP); // ID2

                    last_end_pos = last_end_pos + 1 + 1;
                }


                // |---------expr
                // |-----------literal
                // |-------------DecimalIntegerLiteral(1, 3, 9, 10)
                {
                    printlnRuleName(L_Parser.RULE_expr, margin + STEP);
                    printlnRuleName(L_Parser.RULE_literal, margin + STEP + STEP);
                    // id_:=_id_+_1

                    // print '1' literal
                    // create text like 'DecimalIntegerLiteral(1, 1, 11, 12)'
                    String type = L_Lexer.VOCABULARY.getSymbolicName(L_Lexer.DecimalIntegerLiteral);
                    String text = String.format("%s(%d, %d, %d, %d)",
                            type, 1, lineno,
                            last_end_pos + 1,
                            last_end_pos + 1 + 1);
                    sb.append(margin + STEP + STEP + STEP + text + '\n');
                }
                // ignore SEMI
                return;
            } else if (n == 8 && isTerminalWithThisType(r.getChild(0), L_Parser.IF)) {
                // if without else
                // basic printing
                printRule(r, margin);
                for (int i = 0; i < n; i++) {
                    walk(r.getChild(i), margin + STEP);
                }

                // get last token info -- it is RBR - kw
                TerminalNode kw_term = (TerminalNode) r.getChild(n - 1);
                LexerWrapper.TokenKW rbr_tok = (LexerWrapper.TokenKW) LexerWrapper.getPrintableToken(kw_term.getSymbol());

                String else_name = L_Lexer.VOCABULARY.getSymbolicName(L_Lexer.ELSE);
                String else_str = String.format("%s(%d, %d, %d)",
                        else_name,
                        rbr_tok.lineno,
                        rbr_tok.ixCharEnd + 1,
                        rbr_tok.ixCharEnd + 1 + else_name.length());
                println(else_str, margin + STEP);

                printlnRuleName(L_Parser.RULE_statements, margin + STEP);

                return;
            }
        }

        // basic printing
        printRule(r, margin);
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
        if (tok.realToken.getType() == L_Lexer.LP || tok.realToken.getType() == L_Lexer.RP
                || tok.realToken.getType() == L_Lexer.COMMA || tok.realToken.getType() == L_Lexer.LBR
                || tok.realToken.getType() == L_Lexer.RBR || tok.realToken.getType() == L_Lexer.SEMI) {
            return;
        }
        sb.append(margin + tok.getText() + '\n');

    }

    public String getText() {
        return sb.toString();
    }

}