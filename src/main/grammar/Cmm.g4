grammar Cmm;

cmm:
    (struct | NEWLINE)* (function | NEWLINE)* main NEWLINE* EOF
    ;

main:
    MAIN
     { System.out.print("Main\n");}
     LPAR RPAR mainStatementScope
    ;

mainStatementScope:
    BEGIN NEWLINE+ (statement | oneLineStatement)+ NEWLINE+ END
    ;

function:
    (type | VOID) func_dec=IDENTIFIER
    { System.out.print("FunctionDec : "+$func_dec.text+"\n");}
    LPAR callArgsDef RPAR statementScope
    ;

struct:
    STRUCT struct_dec=IDENTIFIER
    { System.out.print("StructDec : "+$struct_dec.text +"\n");}
    structScope
    ;

structScope:
    BEGIN
    NEWLINE+
    (varDeclaration |  structFunc  | oneLineVarDeclaration)+
    NEWLINE+
    END
    ;

structFunc:
    NEWLINE*
    (type | VOID) var_dec=IDENTIFIER
    { System.out.print("VarDec : "+$var_dec.text+"\n");}
    LPAR callArgsDef RPAR BEGIN
    NEWLINE+
    setGetFuncs
    NEWLINE+
    END
    NEWLINE*
    ;

setGetStatementScope:
    BEGIN NEWLINE+ (statement | oneLineStatement)* NEWLINE+ END
    | (statement | oneLineStatement)
    ;

setGetFuncs:
    SET
    { System.out.print("Setter\n");}
    setGetStatementScope
    NEWLINE+
    GET
    { System.out.print("Getter\n");}
    setGetStatementScope
    ;

callArgsDef:
    (funcArgs (COMMA funcArgs)*)?
    ;

funcArgs:
    type arg_dec=IDENTIFIER
    { System.out.print("ArgumentDec : "+$arg_dec.text+"\n");}
;

statement:
    NEWLINE*
    (varDeclaration
    | ifStatement
    | assignStatement
    | whileStatement
    | doWhileStatement
    | returnStatement
    | callStatement
    | displayStatement
    | sizeStatement
    | appendStatement)
    NEWLINE*
    ;

returnStatement:
    RETURN
    { System.out.print("Return\n");}
    expression?
    ;

assignStatement:
    logicalOrExpression ASSIGN expression
    ;

ifStatement:
    IF
     { System.out.print("Conditional : if\n");}
    ((LPAR expression RPAR) | expression) statementScope NEWLINE*
    (ELSE
     { System.out.print("Conditional : else\n");}
     statementScope)?
    ;

callStatement:
    parantheseExpression
    ;

whileStatement:
    WHILE
    { System.out.print("Loop : while\n");}
    ((LPAR expression RPAR) | expression) statementScope
    ;

doWhileStatement:
    DO
    { System.out.print("Loop : do...while\n");}
    doWhileStatementScope
    ;

doWhileStatementScope:
    (
    BEGIN NEWLINE (statement | oneLineStatement | NEWLINE)* NEWLINE END NEWLINE*
    | NEWLINE+ (statement | oneLineStatement) NEWLINE*
    )
    WHILE ((LPAR expression RPAR) | expression)
    ;

displayStatement:
    DISPLAY
    { System.out.print("Build-in : display\n");}
    LPAR logicalOrExpression RPAR
;

sizeStatement:
    SIZE
    { System.out.print("Size\n");}
    LPAR IDENTIFIER RPAR
;

appendStatement:
    APPEND
    { System.out.print("Append\n");}
    LPAR expression COMMA expression RPAR
;

statementScope:
    BEGIN NEWLINE+ (statement | oneLineStatement)* NEWLINE+ END
    | NEWLINE+ (statement | oneLineStatement)
    ;

oneLineStatement:
    NEWLINE*
    (statement SEMICOLON)+
    NEWLINE*
;

expression:
    assignExpression
    ;

assignExpression:
    logicalOrExpression ASSIGN assignExpression
    | logicalOrExpression
    ;

logicalOrExpression:
    logicalAndExpression (OR logicalAndExpression { System.out.print("Operator : |\n");})*
    ;

logicalAndExpression:
    equalExpression (AND equalExpression { System.out.print("Operator : &\n");} )*
    ;

equalExpression:
    comparisonExpression (EQUAL comparisonExpression { System.out.print("Operator : ==\n");})*
    ;

comparisonExpression:
    plusMinusExpression ((GT) plusMinusExpression
        { System.out.print("Operator : >\n");}
        | (LT) plusMinusExpression
        { System.out.print("Operator : <\n");})*
        ;

plusMinusExpression:
    multiplyDivideExpression ((PLUS) multiplyDivideExpression
    { System.out.print("Operator : +\n");}
    | (MINUS) multiplyDivideExpression
    { System.out.print("Operator : -\n");})*
    ;

multiplyDivideExpression:
    unaryExpression ((AESTRIK) unaryExpression
        { System.out.print("Operator : *\n");}
        | (DIVIDE) unaryExpression
        { System.out.print("Operator : /\n");})*
    ;

unaryExpression:
    ((MINUS) unaryExpression
    { System.out.print("Operator : -\n");}
    | (TILDE) unaryExpression
    { System.out.print("Operator : ~\n");})*
    | retrieveListExpression
    ;

retrieveListExpression:
    (accessMemberExpression
    (LBRACKET expression RBRACKET)*) (DOT retrieveListExpression)*
    ;

accessMemberExpression:
    parantheseExpression
    (DOT IDENTIFIER)*
    ;

parantheseExpression:
    (valueExpression (LPAR callArgs RPAR
    { System.out.print("FunctionCall\n");}
    )* )
    | LPAR expression RPAR
    ;

callArgs:
    (expression (COMMA expression)*)?
    ;

valueExpression:
    boolValue
    | NUM
    | IDENTIFIER
    | sizeStatement
    | appendStatement
    ;

varDeclaration:
    NEWLINE*
    type (varDecName (ASSIGN expression)?) (COMMA (varDecName (ASSIGN expression)?))* SEMICOLON?
    NEWLINE*
    ;

oneLineVarDeclaration:
    NEWLINE*
    (type (varDecName (ASSIGN expression)?) (COMMA (varDecName (ASSIGN expression)?))* SEMICOLON)+
    NEWLINE*
;

varDecName:
    var_dec=IDENTIFIER
    { System.out.print("VarDec : "+$var_dec.text+"\n");}
;

value:
    boolValue | NUM
    ;

boolValue:
    TRUE | FALSE
    ;

type:
    primitiveType | listType | fptrType | structType
    ;

listType:
    LIST SHARP (primitiveType | structType | listType)
    ;

primitiveType:
    INT | BOOL
    ;

fptrType:
    FPTR LT (type (COMMA type)* | VOID) ARROW (type | VOID) GT
    ;

structType:
    STRUCT IDENTIFIER
    ;

STRUCT: 'struct';
MAIN: 'main';
INT: 'int';
BOOL: 'bool';
LIST: 'list';
VOID: 'void';
WHILE: 'while';
DO: 'do';
IF: 'if';
ELSE: 'else';
RETURN: 'return';
GET: 'get';
SET: 'set';
BEGIN: 'begin';
END: 'end';
DISPLAY: 'display';
APPEND: 'append';
SIZE: 'size';
TRUE: 'true';
FALSE: 'false';
FPTR: 'fptr';
NULL: 'null';

LPAR: '(';
RPAR: ')';
LBRACKET: '[';
RBRACKET: ']';

SEMICOLON: ';';
DOT: '.';
COMMA: ',';
SHARP: '#';

GT: '>';
LT: '<';
ASSIGN: '=';
EQUAL: '==';

AESTRIK: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';

AND: '&';
OR: '|';
TILDE: '~';

ARROW: '->';

IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
NUM: '0' | [1-9][0-9]*;
COMMENT: '/*' .*? '*/' -> skip;
NEWLINE: '\n';
WS: [ \t\r] -> skip;