lexer grammar CustomLangLexer;
// Parser Rules (Định nghĩa cấu trúc ngôn ngữ)
tokens {
    INDENT,
    DEDENT
}

options {
    superClass = CustomLangLexerBase;
}
// Lexur
//Khai bao
DEF      : 'def';
RETURN   : 'return';
RAISE    : 'raise';
FROM     : 'from';
IMPORT   : 'import';
NONLOCAL : 'nonlocal';
AS       : 'as';
GLOBAL   : 'global';
ASSERT   : 'assert';
IF       : 'Nếu';
ELIF     : 'Ngược lại nếu';
ELSE     : 'Ngược lại';
WHILE    : 'Lặp';
FOR      : 'Duyệt';
IN       : 'trong';
TRY      : 'try';
NONE     : 'None';
FINALLY  : 'finally';
WITH     : 'with';
EXCEPT   : 'except';
LAMBDA   : 'lambda';
OR       : 'or';
AND      : 'and';
NOT      : 'not';
IS       : 'is';
CLASS    : 'class';
YIELD    : 'yield';
DEL      : 'del';
PASS     : 'pass';
CONTINUE : 'continue';
BREAK    : 'break';
ASYNC    : 'async';
AWAIT    : 'await';
PRINT    : 'print';
EXEC     : 'exec';
TRUE     : 'True';
FALSE    : 'False';

// Operators

DOT                : '.';
ELLIPSIS           : '...';
REVERSE_QUOTE      : '`';
STAR               : '*';
COMMA              : ',';
COLON              : ':';
SEMI_COLON         : ';';
POWER              : '**';
ASSIGN             : '=';
OR_OP              : '|';
XOR                : '^';
AND_OP             : '&';
LEFT_SHIFT         : '<<';
RIGHT_SHIFT        : '>>';
ADD                : '+';
MINUS              : '-';
DIV                : '/';
MOD                : '%';
IDIV               : '//';
NOT_OP             : '~';
LESS_THAN          : '<';
GREATER_THAN       : '>';
EQUALS             : '==';
GT_EQ              : '>=';
LT_EQ              : '<=';
NOT_EQ_1           : '<>';
NOT_EQ_2           : '!=';
AT                 : '@';
ARROW              : '->';
ADD_ASSIGN         : '+=';
SUB_ASSIGN         : '-=';
MULT_ASSIGN        : '*=';
AT_ASSIGN          : '@=';
DIV_ASSIGN         : '/=';
MOD_ASSIGN         : '%=';
AND_ASSIGN         : '&=';
OR_ASSIGN          : '|=';
XOR_ASSIGN         : '^=';
LEFT_SHIFT_ASSIGN  : '<<=';
RIGHT_SHIFT_ASSIGN : '>>=';
POWER_ASSIGN       : '**=';
IDIV_ASSIGN        : '//=';
COLONEQUAL         : ':=';

OPEN_BRACK         : '[' {this.openBrace();};
CLOSE_BRACK        : ']' {this.closeBrace();};



//Kieu du lieu
STRING:
    ([uU] | [fF] [rR]? | [rR] [fF]?)? (SHORT_STRING | LONG_STRING)
    | ([bB] [rR]? | [rR] [bB]) (SHORT_BYTES | LONG_BYTES)
;

DECIMAL_INTEGER : [1-9] [0-9]* | '0'+;
OCT_INTEGER     : '0' [oO] [0-7]+;
HEX_INTEGER     : '0' [xX] [0-9a-fA-F]+;
BIN_INTEGER     : '0' [bB] [01]+;
FLOAT_NUMBER : EXPONENT_OR_POINT_FLOAT;


//Khai bao comment
LINE_JOIN : '\\' [ \t]* RN -> channel(HIDDEN);
NEWLINE: ({this.atStartOfInput()}? SPACES | ( '\r'? '\n' | '\r' | '\f') SPACES?) {this.onNewLine();};
WS : [ \t\r\n]+ -> skip;
COMMENT   : '#' ~[\r\n\f]* -> channel(HIDDEN);
IDENTIFIER: BACKTICK_STRING ;

// Fragments

fragment BACKTICK_STRING: '`' (~'`')+ '`';
fragment SHORT_STRING:
    '\'' ('\\' (RN | .) | ~[\\\r\n'])* '\''
    | '"' ('\\' (RN | .) | ~[\\\r\n"])* '"'
;

fragment LONG_STRING: '\'\'\'' LONG_STRING_ITEM*? '\'\'\'' | '"""' LONG_STRING_ITEM*? '"""';

fragment LONG_STRING_ITEM: ~'\\' | '\\' (RN | .);

fragment RN: '\r'? '\n';

fragment EXPONENT_OR_POINT_FLOAT: ([0-9]+ | POINT_FLOAT) [eE] [+-]? [0-9]+ | POINT_FLOAT;

fragment POINT_FLOAT: [0-9]* '.' [0-9]+ | [0-9]+ '.';

fragment SHORT_BYTES:
    '\'' (SHORT_BYTES_CHAR_NO_SINGLE_QUOTE | BYTES_ESCAPE_SEQ)* '\''
    | '"' (SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE | BYTES_ESCAPE_SEQ)* '"'
;

fragment LONG_BYTES: '\'\'\'' LONG_BYTES_ITEM*? '\'\'\'' | '"""' LONG_BYTES_ITEM*? '"""';

fragment LONG_BYTES_ITEM: LONG_BYTES_CHAR | BYTES_ESCAPE_SEQ;
fragment SPACES: [ \t]+;


fragment SHORT_BYTES_CHAR_NO_SINGLE_QUOTE:
    [\u0000-\u0009]
    | [\u000B-\u000C]
    | [\u000E-\u0026]
    | [\u0028-\u005B]
    | [\u005D-\u007F]
;

fragment SHORT_BYTES_CHAR_NO_DOUBLE_QUOTE:
    [\u0000-\u0009]
    | [\u000B-\u000C]
    | [\u000E-\u0021]
    | [\u0023-\u005B]
    | [\u005D-\u007F]
;

/// Any ASCII character except "\"
fragment LONG_BYTES_CHAR: [\u0000-\u005B] | [\u005D-\u007F];

/// "\" <any ASCII character>
fragment BYTES_ESCAPE_SEQ: '\\' [\u0000-\u007F];

LEFT_PAREN  : '('; // Đây là token cho dấu ngoặc mở
RIGHT_PAREN : ')'; // Đây là token cho dấu ngoặc đóng
