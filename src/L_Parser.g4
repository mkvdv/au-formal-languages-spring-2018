parser grammar L_Parser;

@header {
package ru.spbau.mit.fl;
}

options {tokenVocab=L_Lexer;}


// parser rules

prog
    :	(def_func)* statements // at least one statement in program
    ;

def_func
    :   ID LP args RP LBR statements RBR
    ;

args
    :                       // ()
    |   ID (COMMA ID)*      // (a) | (a, b, ..)
    ;

left_assoc_operator
    :   ADD | MINUS | MUL | DIV | MOD | LEQ | GEQ | LESS | GREATER | EQ | NEQ | AND | OR
    ;

right_assoc_operator
    :   POW
    ;

call
    :   ID LP args RP
    ;

expr
    :   call
    |   ID
    |   literal
    |   <assoc=right> expr right_assoc_operator expr
    |   expr left_assoc_operator expr
    |   LP expr RP
    ;

statements
    :   // empty statement
    |   statement (statement)*
    ;

statement
    :   ID ASSIGN expr SEMI
    |   call SEMI
    |   WRITE expr SEMI
    |   READ ID SEMI
    |   WHILE LP expr RP DO LBR statements RBR                  // while(expr) do {}
    |   IF LP expr RP THEN LBR statements RBR ELSE LBR statements RBR // if (e) then {} else {}
    ;

literal
    :   DecimalFloatingPointLiteral
    |   DecimalIntegerLiteral
    |   TRUE
    |   FALSE
    ;
