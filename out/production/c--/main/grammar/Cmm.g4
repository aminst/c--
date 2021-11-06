grammar Cmm;

cmm:
    (struct | NEWLINE)* (function | NEWLINE)* main NEWLINE* EOF
    ;

main:
    MAIN
     { System.out.print("MAIN\n");}
     LPAR RPAR statementScope
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
    ((((varDeclaration | structFunc | oneLineVarDeclaration)  NEWLINE+)+ NEWLINE*) | NEWLINE*)
    END
    NEWLINE
    ;

structFunc:
    (type | VOID) IDENTIFIER LPAR callArgsDef RPAR BEGIN
    NEWLINE
    setGetFuncs
    NEWLINE*
    END
    NEWLINE
    ;

setGetFuncs:
    SET
    { System.out.print("Setter\n");}
    statementScope
    GET
    { System.out.print("Getter\n");}
    statementScope
    ;

callArgsDef:
    (funcArgs (COMMA funcArgs)*)?
    ;

funcArgs:
    type arg_dec=IDENTIFIER
    { System.out.print("ArgumentDec : "+$arg_dec.text+"\n");}
;

statement:
    varDeclaration
    | ifStatement
    | assignStatement
    | whileStatement
    | doWhileStatement
    | returnStatement
    | callStatement
    | displayStatement
    | sizeStatement
    | appendStatement
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
    BEGIN NEWLINE+ (((statement | oneLineStatement) NEWLINE+)+  | NEWLINE*)
    END WHILE ((LPAR expression RPAR) | expression)
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
    BEGIN NEWLINE+ (((statement | oneLineStatement) NEWLINE+)+  | NEWLINE*) END NEWLINE+
    | NEWLINE+ (statement | oneLineStatement) NEWLINE+
    ;

oneLineStatement:
    (statement SEMICOLON)*
;

expression:
    assignExpression
    ;

assignExpression:
    logicalOrExpression ASSIGN assignExpression
    | logicalOrExpression
    ;

logicalOrExpression:
    logicalAndExpression (OR
    { System.out.print("Operator : |\n");}
    logicalAndExpression)*
    ;

logicalAndExpression:
    equalExpression (AND
     { System.out.print("Operator : &\n");}
     equalExpression)*
    ;

equalExpression:
    comparisonExpression (EQUAL
     { System.out.print("Operator : ==\n");}
     comparisonExpression)*
    ;

comparisonExpression:
    plusMinusExpression ((GT
    { System.out.print("Operator : >\n");}
    | LT
    { System.out.print("Operator : <\n");}
    ) plusMinusExpression)*
    ;

plusMinusExpression:
    multiplyDivideExpression ((PLUS
     { System.out.print("Operator : +\n");}
     | MINUS
     { System.out.print("Operator : -\n");}
     ) multiplyDivideExpression)*
    ;

multiplyDivideExpression:
    unaryExpression ((AESTRIK
    { System.out.print("Operator : *\n");}
    | DIVIDE
    { System.out.print("Operator : /\n");}
    ) unaryExpression)*
    ;

unaryExpression:
    (MINUS
    { System.out.print("Operator : -\n");}
    | TILDE
    { System.out.print("Operator : ~\n");}
    ) unaryExpression
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
    (valueExpression (LPAR callArgs RPAR)* )
    | LPAR expression RPAR
    ;

callArgs:
    (expression (COMMA expression)*)?
    ;

valueExpression:
    boolValue
    | NUM
    | IDENTIFIER
    ;

varDeclaration:
    type (varDecName (ASSIGN (value | varDecName))?) (COMMA (varDecName (ASSIGN (value | varDecName))?))* SEMICOLON?
    ;

oneLineVarDeclaration:
    (type (varDecName (ASSIGN (value | varDecName))?) (COMMA (varDecName (ASSIGN (value | varDecName))?))* SEMICOLON)+
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