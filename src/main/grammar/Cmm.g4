grammar Cmm;


statement:
    ifStatement
    | assignStatement
    ;

assignStatement:
    logicalOrExpression ASSIGN expression
    ;

ifStatement:
    IF LPAR expression RPAR statementScope NEWLINE* (ELSE statementScope)?
    ;

statementScope:
    BEGIN NEWLINE+ (statement)+ NEWLINE+ END
    | NEWLINE+ statement
    ;

expression:
    assignExpression
    ;

assignExpression:
    logicalOrExpression ASSIGN assignExpression
    | logicalOrExpression
    ;

logicalOrExpression:
    logicalAndExpression (OR logicalAndExpression)*
    ;

logicalAndExpression:
    equalExpression (AND equalExpression)*
    ;

equalExpression:
    comparisonExpression (EQUAL comparisonExpression)*
    ;

comparisonExpression:
    plusMinusExpression ((GT | LT) plusMinusExpression)*
    ;

plusMinusExpression:
    multiplyDivideExpression ((PLUS | MINUS) multiplyDivideExpression)*
    ;

multiplyDivideExpression:
    unaryExpression ((AESTRIK | DIVIDE) unaryExpression)*
    ;

unaryExpression:
    (MINUS | TILDE) unaryExpression
    | retrieveListExpression
    ;

retrieveListExpression:
    accessMemberExpression
    (LBRACKET expression RBRACKET)*
    ;

accessMemberExpression:
    parantheseExpression
    (DOT IDENTIFIER)*
    ;

parantheseExpression:
    valueExpression (LPAR callArgs RPAR)*
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
    type (IDENTIFIER (ASSIGN value)?) (COMMA (IDENTIFIER (ASSIGN value)?))*
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