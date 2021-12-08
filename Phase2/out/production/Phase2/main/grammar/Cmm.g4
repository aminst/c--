grammar Cmm;

@header{
     import main.ast.nodes.*;
     import main.ast.nodes.declaration.*;
     import main.ast.nodes.declaration.struct.*;
     import main.ast.nodes.expression.*;
     import main.ast.nodes.expression.operators.*;
     import main.ast.nodes.expression.values.*;
     import main.ast.nodes.expression.values.primitive.*;
     import main.ast.nodes.statement.*;
     import main.ast.types.*;
     import main.ast.types.primitives.*;
     import java.util.*;
 }

cmm returns[Program cmmProgram]:
    NEWLINE* p = program {$cmmProgram = $p.programRet;} NEWLINE* EOF;

program returns[Program programRet]:
    {$programRet = new Program();
     int line = 1;
     $programRet.setLine(line);}
    (s = structDeclaration {$programRet.addStruct($s.structDeclarationRet);})*
    (f = functionDeclaration {$programRet.addFunction($f.functionDeclarationRet);})*
    m = main {$programRet.setMain($m.mainRet);};

main returns[MainDeclaration mainRet]:
    {$mainRet = new MainDeclaration();}
    MAIN {$mainRet.setLine($MAIN.getLine());}
    LPAR RPAR body
    {$mainRet.setBody($body.bodyRet);}
    ;

structDeclaration returns[StructDeclaration structDeclarationRet]:
    {$structDeclarationRet = new StructDeclaration();}
    STRUCT {$structDeclarationRet.setLine($STRUCT.getLine());}
    identifier {$structDeclarationRet.setStructName($identifier.identifierRet);}
    (
        (BEGIN structBody NEWLINE+ END) {$structDeclarationRet.setBody($structBody.structBodyRet);}
        |
        (NEWLINE+ singleStatementStructBody SEMICOLON?) {$structDeclarationRet.setBody($singleStatementStructBody.singleStatementStructBodyRet);}
    )
    NEWLINE+;

//todo
singleVarWithGetAndSet :
    type identifier functionArgsDec BEGIN NEWLINE+ setBody getBody END;

//todo
singleStatementStructBody returns [Statement singleStatementStructBodyRet]:
    varDecStatement | singleVarWithGetAndSet;

//todo
structBody returns [Statement structBodyRet]:
    (NEWLINE+ (singleStatementStructBody SEMICOLON)* singleStatementStructBody SEMICOLON?)+;

//todo
getBody :
    GET body NEWLINE+;

//todo
setBody :
    SET body NEWLINE+;

//todo
functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    (type | VOID ) identifier functionArgsDec body NEWLINE+;

//todo
functionArgsDec :
    LPAR (type identifier (COMMA type identifier)*)? RPAR ;

//todo
functionArguments :
    (expression (COMMA expression)*)?;

//todo
body returns [Statement bodyRet]:
     (blockStatement | (NEWLINE+ singleStatement (SEMICOLON)?));

//todo
loopCondBody :
     (blockStatement | (NEWLINE+ singleStatement ));

//todo
blockStatement :
    BEGIN (NEWLINE+ (singleStatement SEMICOLON)* singleStatement (SEMICOLON)?)+ NEWLINE+ END;

//todo
varDecStatement :
    type identifier (ASSIGN orExpression )? (COMMA identifier (ASSIGN orExpression)? )*;

//todo
functionCallStmt :
     otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))* (LPAR functionArguments RPAR);

//todo
returnStatement :
    RETURN (expression)?;

//todo
ifStatement :
    IF expression (loopCondBody | body elseStatement);

//todo
elseStatement :
     NEWLINE* ELSE loopCondBody;

//todo
loopStatement :
    whileLoopStatement | doWhileLoopStatement;

//todo
whileLoopStatement :
    WHILE expression loopCondBody;

//todo
doWhileLoopStatement :
    DO body NEWLINE* WHILE expression;

//todo
displayStatement :
  DISPLAY LPAR expression RPAR;

//todo
assignmentStatement :
    orExpression ASSIGN expression;

//todo
singleStatement :
    ifStatement | displayStatement | functionCallStmt | returnStatement | assignmentStatement
    | varDecStatement | loopStatement | append | size;

//todo
expression:
    orExpression (op = ASSIGN expression )? ;

//todo
orExpression:
    andExpression (op = OR andExpression )*;

//todo
andExpression:
    equalityExpression (op = AND equalityExpression )*;

//todo
equalityExpression:
    relationalExpression (op = EQUAL relationalExpression )*;

//todo
relationalExpression:
    additiveExpression ((op = GREATER_THAN | op = LESS_THAN) additiveExpression )*;

//todo
additiveExpression:
    multiplicativeExpression ((op = PLUS | op = MINUS) multiplicativeExpression )*;

//todo
multiplicativeExpression:
    preUnaryExpression ((op = MULT | op = DIVIDE) preUnaryExpression )*;

//todo
preUnaryExpression:
    ((op = NOT | op = MINUS) preUnaryExpression ) | accessExpression;

//todo
accessExpression:
    otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))*  ((LBRACK expression RBRACK) | (DOT identifier))*;

//todo
otherExpression:
    value | identifier | LPAR (functionArguments) RPAR | size | append ;

//todo
size :
    SIZE LPAR expression RPAR;

//todo
append :
    APPEND LPAR expression COMMA expression RPAR;

//todo
value :
    boolValue | INT_VALUE;

//todo
boolValue:
    TRUE | FALSE;

//todo
identifier returns [Identifier identifierRet]:
    IDENTIFIER;

//todo
type returns [Type typeRet]:
    (
        INT {$typeRet = new IntType();}
        |
        BOOL {$typeRet = new BoolType();}
        |
        LIST SHARP t = type {$typeRet = new ListType($t.typeRet);}
        |
        STRUCT i = identifier {$typeRet = new StructType($i.identifierRet);}
        |
        fptrType {$typeRet = $fptrType.fptrTypeRet;}
    );

//todo
fptrType returns [FptrType fptrTypeRet] locals [ArrayList<Type> argsType, Type returnType]:
    {$fptrTypeRet = new FptrType($argsType, $returnType);}
    FPTR LESS_THAN
    (
        VOID {$argsType.add(new VoidType());}
        |
        (
            fType = type {$argsType.add($fType.typeRet);}
            (COMMA adType = type {$argsType.add($adType.typeRet);})*
        )
    )
    {$fptrTypeRet.setArgsType($argsType);}
    ARROW
    (
        rtType = type {$returnType = $rtType.typeRet;}
        |
        VOID {$returnType = new VoidType();}
    )
    {$fptrTypeRet.setReturnType($returnType);}
    GREATER_THAN;

MAIN: 'main';
RETURN: 'return';
VOID: 'void';

SIZE: 'size';
DISPLAY: 'display';
APPEND: 'append';

IF: 'if';
ELSE: 'else';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIVIDE: '/';


EQUAL: '==';
ARROW: '->';
GREATER_THAN: '>';
LESS_THAN: '<';


AND: '&';
OR: '|';
NOT: '~';

TRUE: 'true';
FALSE: 'false';

BEGIN: 'begin';
END: 'end';

INT: 'int';
BOOL: 'bool';
LIST: 'list';
STRUCT: 'struct';
FPTR: 'fptr';
GET: 'get';
SET: 'set';
WHILE: 'while';
DO: 'do';

ASSIGN: '=';
SHARP: '#';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';

COMMA: ',';
DOT: '.';
SEMICOLON: ';';
NEWLINE: '\n';

INT_VALUE: '0' | [1-9][0-9]*;
IDENTIFIER: [a-zA-Z_][A-Za-z0-9_]*;


COMMENT: ('/*' .*? '*/') -> skip;
WS: ([ \t\r]) -> skip;