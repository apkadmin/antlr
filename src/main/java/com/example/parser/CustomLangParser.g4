parser grammar CustomLangParser;
options { tokenVocab=CustomLangLexer; }
// --- Chỉ định các Parser Rules tối thiểu để grammar hợp lệ, nhưng không dùng chúng ---
// A module or sequence of commands read from an input file
program
: (NEWLINE | statement)+
;

statements: statement+;
statement
:  simple_stmts
|  compound_stmt
;

simple_stmts
: simple_stmt (SEMI_COLON simple_stmt)* SEMI_COLON? (NEWLINE | EOF)
;

//Cac dieu kien co ban
simple_stmt
: assignment
;

// Logical OR (lowest precedence of logical ops)
or_expression
    : or_expression OR and_expression
    | and_expression
    ;

// Logical AND
and_expression
    : and_expression AND not_expression
    | not_expression
    ;

// Logical NOT
not_expression
    : NOT not_expression // `not a`
    | comparison
    ;
//Cac dieu kien nang cao if, else,fore,while...

compound_stmt
    : if_stmt
    | for_stmt
    | while_stmt
  ;
conditional_expression
    : comparison // The base case (if no 'if...else' part)
      (IF comparison ELSE conditional_expression)? // The conditional part
    ;
assignment//Phep gan
:testlist_star_expr      // Left-hand side (e.g., x, or a,b)
(
 ASSIGN                  // The '=' operator
 (
     testlist_star_expr  // Right-hand side (e.g., 10, or 1,2)
     (ASSIGN testlist_star_expr)* // For chained assignments like = b = 10
 )
)
| op = (
  ADD_ASSIGN
  | SUB_ASSIGN
  | MULT_ASSIGN
  | AT_ASSIGN
  | DIV_ASSIGN
  | MOD_ASSIGN
  | AND_ASSIGN
  | OR_ASSIGN
  | XOR_ASSIGN
  | LEFT_SHIFT_ASSIGN
  | RIGHT_SHIFT_ASSIGN
  | POWER_ASSIGN
  | IDIV_ASSIGN
  ) (testlist)
;

testlist_star_expr
: ((test | star_expr) COMMA)+ (test | star_expr)?
| testlist
;

test
:   IDENTIFIER
|   value
;

expressions
:  expression (',' expression )* ','?
;


expression
: logical_test (IF logical_test ELSE expression)?
;


logical_test
: comparison
| NOT logical_test
| logical_test op = AND logical_test
| logical_test op = OR logical_test
;
// Comparison operators
// --------------------

comparison
: comparison (
LESS_THAN
| GREATER_THAN
| EQUALS
| GT_EQ
| LT_EQ
| NOT_EQ_1
| NOT_EQ_2
| optional = NOT? IN
| IS optional = NOT?
) comparison
| expr
;


// Arithmetic operators
// --------------------

sum
: sum (ADD | MINUS) term
| term
;

// Term (Multiplication/Division/Modulo/Matrix Mult/Floor Div) Operators (`*`, `/`, `//`, `%`, `@`)
term
    : term (STAR | DIV | MOD | IDIV | AT) factor
    | factor // Connects term ops to factor
    ;


factor
: ADD factor
| MINUS factor
| NOT_OP factor
| power;

power
: await_primary (POWER factor)?
;
// Primary elements
// ----------------

// Primary elements are things like "obj.something.something", "obj[something]", "obj(something)", "obj" ...

await_primary
: primary
;

primary
: primary ( IDENTIFIER)
| value
|OPEN_BRACK slices CLOSE_BRACK

;
slices
    : slice
    | (slice | starred_expression) (',' (slice | starred_expression))* ','?;
starred_expression
    : '*' expression;
slice
    : expression? ':' expression? (':' expression? )?
    | named_expression;

// Ca gia tri chap nhan
value: STRING |DECIMAL_INTEGER|OCT_INTEGER|HEX_INTEGER|BIN_INTEGER|FLOAT_NUMBER| OPEN_BRACK testlist_comp? CLOSE_BRACK;


// If statement
// ------------

if_stmt
    : IF named_expression COLON block (elif_stmt | else_block?)
    ;
elif_stmt
    : ELIF named_expression COLON block (elif_stmt | else_block?)
    ;
else_block
    : ELSE COLON block;


guard: IF named_expression;



named_expression
    : expression;


block
    : NEWLINE INDENT statements DEDENT
    | simple_stmts;


expr
    : value
    | op = (ADD | MINUS | NOT_OP) expr
    | expr op = (STAR | DIV | MOD | IDIV | AT) expr
    | expr op = (ADD | MINUS) expr
    | expr op = (LEFT_SHIFT | RIGHT_SHIFT) expr
    | expr op = AND_OP expr
    | expr op = XOR expr
    | expr op = OR_OP expr
    | IDENTIFIER
    ;


for_stmt
    : FOR exprlist IN testlist COLON block (ELSE COLON block)?
    ;

// While statement
// ---------------

while_stmt
    : WHILE named_expression COLON block else_block?;

 exprlist
     : expr (COMMA expr)* COMMA?
     ;

 testlist
     : test (COMMA test)* COMMA?
     ;


testlist_comp
    :(test | star_expr) (for_stmt | (COMMA (test | star_expr))* COMMA?)
    ;

star_expr
    : STAR expr
    ;


