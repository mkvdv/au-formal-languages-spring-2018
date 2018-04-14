lexer grammar L_Lexer;

@header {
package ru.spbau.mit.fl;
}

@lexer::members
{
    int nested_multiline_comment_count = 0;
}


// keywords
IF : 'if';
THEN : 'then';
ELSE : 'else';
WHILE : 'while';
DO : 'do';
READ : 'read';
WRITE : 'write';

// literals
TRUE : 'true';
FALSE : 'false';

fragment
NL: ('\n'|'\r'|'\r\n');

LINE_COMMENT  : '//' .*? NL; // last line must be NL -- POSIX

/////////////////////////////////////////////////////////////////////////////////////////////////////
MULTILINE_COMMENT : '/*' { nested_multiline_comment_count = 1; } -> more, pushMode(IN_MULTI_COMMENT);

mode IN_MULTI_COMMENT;
MULTILINE_COMMENT_EXIT :
    '*/'
    { nested_multiline_comment_count == 1 }? // evaluate predicate in runtime
    { nested_multiline_comment_count -= 1; } -> popMode; //, skip  ;

CANT_EXIT :
    '*/'
    { nested_multiline_comment_count > 1 }?
    { nested_multiline_comment_count -= 1; } -> more;

WE_NEED_TO_GO_DEEPER :
    '/*'
    { nested_multiline_comment_count += 1; } -> more;

COMMENT:
    . -> more;

mode DEFAULT_MODE;
////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////
DecimalFloatingPointLiteral:
    Digits '.' (Digits)? (ExponentPart)? (FloatTypeSuffix)?
    | '.' Digits (ExponentPart)? (FloatTypeSuffix)?
    | Digits ExponentPart (FloatTypeSuffix)?
    | Digits (ExponentPart)? FloatTypeSuffix;


DecimalIntegerLiteral:
    DecimalNumeral (IntegerTypeSuffix)?;

////////////////////////////////////////////
fragment
ExponentPart:
    ExponentIndicator SignedInteger;

fragment
ExponentIndicator:
    'e' | 'E';

fragment
SignedInteger:
    (Sign) ? Digits;

fragment
Sign:
    '+' | '-';

fragment
FloatTypeSuffix:
    'f' |  'F' |  'd' | 'D' ;

fragment
IntegerTypeSuffix:
    'l' |  'L';

fragment
DecimalNumeral:
    '0'
    | NonZeroDigit (Digits)?
    | NonZeroDigit Underscores Digits;

fragment
Digits:
    Digit
    | Digit (DigitsAndUnderscores)? Digit;

fragment
Digit:
    '0'
    | NonZeroDigit;

fragment
NonZeroDigit:
    [0-9];

fragment
DigitsAndUnderscores:
    DigitOrUnderscore (DigitsAndUnderscores)? ;

fragment
DigitOrUnderscore:
    Digit
    | '_';

fragment
Underscores:
    '_'+;

/////////////////////////////////////////////////////////////////////
ADD: '+';
MINUS: '-';
POW: '**';
MUL: '*';
DIV: '/';
MOD: '%';

ASSIGN: ':=';
LEQ: '<=';
GEQ: '>=';
LESS: '<';
GREATER: '>';
EQ: '==';
NEQ: '!=';
AND : '&&';
OR : '||';

LP: '(';
RP: ')';
SEMI: ';';

LBR: '{';
RBR: '}';

ID: [_a-z][_a-z0-9]*;


WS: (' '|'\t'|'\n'|'\r'|'\r\n')+ -> skip;

