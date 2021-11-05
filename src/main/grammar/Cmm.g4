grammar Cmm;

type:
    primitiveType | listType | fptrType
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
STR: '"' ~('"')* '"';
NEWLINE: '\n';
WS: [ \t\r] -> skip;