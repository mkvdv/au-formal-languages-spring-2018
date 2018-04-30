// Generated from L_Parser.g4 by ANTLR 4.7.1

package ru.spbau.mit.fl;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link L_Parser}.
 */
public interface L_ParserListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link L_Parser#prog}.
     *
     * @param ctx the parse tree
     */
    void enterProg(L_Parser.ProgContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#prog}.
     *
     * @param ctx the parse tree
     */
    void exitProg(L_Parser.ProgContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#def_func}.
     *
     * @param ctx the parse tree
     */
    void enterDef_func(L_Parser.Def_funcContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#def_func}.
     *
     * @param ctx the parse tree
     */
    void exitDef_func(L_Parser.Def_funcContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#args}.
     *
     * @param ctx the parse tree
     */
    void enterArgs(L_Parser.ArgsContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#args}.
     *
     * @param ctx the parse tree
     */
    void exitArgs(L_Parser.ArgsContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#left_assoc_operator}.
     *
     * @param ctx the parse tree
     */
    void enterLeft_assoc_operator(L_Parser.Left_assoc_operatorContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#left_assoc_operator}.
     *
     * @param ctx the parse tree
     */
    void exitLeft_assoc_operator(L_Parser.Left_assoc_operatorContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#right_assoc_operator}.
     *
     * @param ctx the parse tree
     */
    void enterRight_assoc_operator(L_Parser.Right_assoc_operatorContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#right_assoc_operator}.
     *
     * @param ctx the parse tree
     */
    void exitRight_assoc_operator(L_Parser.Right_assoc_operatorContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#call}.
     *
     * @param ctx the parse tree
     */
    void enterCall(L_Parser.CallContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#call}.
     *
     * @param ctx the parse tree
     */
    void exitCall(L_Parser.CallContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void enterExpr(L_Parser.ExprContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#expr}.
     *
     * @param ctx the parse tree
     */
    void exitExpr(L_Parser.ExprContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#statements}.
     *
     * @param ctx the parse tree
     */
    void enterStatements(L_Parser.StatementsContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#statements}.
     *
     * @param ctx the parse tree
     */
    void exitStatements(L_Parser.StatementsContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void enterStatement(L_Parser.StatementContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#statement}.
     *
     * @param ctx the parse tree
     */
    void exitStatement(L_Parser.StatementContext ctx);

    /**
     * Enter a parse tree produced by {@link L_Parser#literal}.
     *
     * @param ctx the parse tree
     */
    void enterLiteral(L_Parser.LiteralContext ctx);

    /**
     * Exit a parse tree produced by {@link L_Parser#literal}.
     *
     * @param ctx the parse tree
     */
    void exitLiteral(L_Parser.LiteralContext ctx);
}