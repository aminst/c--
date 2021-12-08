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

singleVarWithGetAndSet returns [SetGetVarDeclaration singleVarWithGetAndSetRet]:
    {$singleVarWithGetAndSetRet = new SetGetVarDeclaration();}
    type {$singleVarWithGetAndSetRet.setVarType($type.typeRet);}
    identifier {$singleVarWithGetAndSetRet.setVarName($identifier.identifierRet);}
    functionArgsDec {$singleVarWithGetAndSetRet.setArgs($functionArgsDec.functionArgsDecRet);}
    BEGIN NEWLINE+
    setBody {$singleVarWithGetAndSetRet.setSetterBody($setBody.setBodyRet);}
    getBody {$singleVarWithGetAndSetRet.setGetterBody($getBody.getBodyRet);}
    END;

singleStatementStructBody returns [Statement singleStatementStructBodyRet]:
    varDecStatement {$singleStatementStructBodyRet = $varDecStatement.varDecStatementRet;}
    |
    singleVarWithGetAndSet {$singleStatementStructBodyRet = $singleVarWithGetAndSet.singleVarWithGetAndSetRet;}
    ;

structBody returns [BlockStmt structBodyRet]:
    (
        NEWLINE+
        (singleStatementStructBody SEMICOLON {$structBodyRet.addStatement($singleStatementStructBody.singleStatementStructBodyRet);})*
        singleStatementStructBody {$structBodyRet.addStatement($singleStatementStructBody.singleStatementStructBodyRet);} SEMICOLON?
    )+
    ;

getBody returns [Statement getBodyRet]:
    GET body {$getBodyRet = $body.bodyRet;} NEWLINE+;

setBody returns [Statement setBodyRet]:
    SET body {$setBodyRet = $body.bodyRet;} NEWLINE+;

functionDeclaration returns[FunctionDeclaration functionDeclarationRet]:
    (
        type {$functionDeclarationRet.setReturnType($type.typeRet);}
        |
        VOID {$functionDeclarationRet.setReturnType(new VoidType());}
    )
    identifier
    {$functionDeclarationRet.setFunctionName($identifier.identifierRet);
    $functionDeclarationRet.setLine($identifier.identifierRet.getLine());}
    functionArgsDec {$functionDeclarationRet.setArgs($functionArgsDec.functionArgsDecRet);}
    body {$functionDeclarationRet.setBody($body.bodyRet);}
    NEWLINE+;

functionArgsDec returns [ArrayList<VariableDeclaration> functionArgsDecRet] locals [VariableDeclaration var]:
    LPAR
    (
        fType = type fIdentifier = identifier
        {$var = new VariableDeclaration($fIdentifier.identifierRet, $fType.typeRet);
        $var.setLine($fIdentifier.identifierRet.getLine());
        $functionArgsDecRet.add($var);}
        (
            COMMA adType = type adIdentifier = identifier
            {
                $var = new VariableDeclaration($adIdentifier.identifierRet, $adType.typeRet);
                $var.setLine($adIdentifier.identifierRet.getLine());
                $functionArgsDecRet.add($var);
            }
        )*
    )?
    RPAR ;

functionArguments returns [ArrayList<Expression> functionArgumentsRet]:
    (
        expression {$functionArgumentsRet.add($expression.expressionRet);}
        (
            COMMA expression {$functionArgumentsRet.add($expression.expressionRet);}
        )*
    )?;

body returns [Statement bodyRet]:
     (
        blockStatement {$bodyRet = $blockStatement.blockStatementRet;}
        |
        (
            NEWLINE+
            singleStatement {$bodyRet = $singleStatement.singleStatementRet;}
            (SEMICOLON)?
        )
    );

loopCondBody returns [Statement loopCondBodyRet]:
     (
        blockStatement {$loopCondBodyRet = $blockStatement.blockStatementRet;}
        |
        (NEWLINE+ singleStatement {$loopCondBodyRet = $singleStatement.singleStatementRet;})
     );

blockStatement returns [BlockStmt blockStatementRet]:
    BEGIN {$blockStatementRet.setLine($BEGIN.getLine());}
    (
        NEWLINE+
        (singleStatement SEMICOLON {$blockStatementRet.addStatement($singleStatement.singleStatementRet);})*
        singleStatement {$blockStatementRet.addStatement($singleStatement.singleStatementRet);} (SEMICOLON)?
    )+
    NEWLINE+ END;

varDecStatement returns [VarDecStmt varDecStatementRet] locals [VariableDeclaration var]:
    {$varDecStatementRet = new VarDecStmt();}
    type
    identifier
    {$var = new VariableDeclaration($identifier.identifierRet, $type.typeRet);
     $var.setLine($identifier.identifierRet.getLine());
    }
    (
        ASSIGN orExpression
        {$var.setDefaultValue($orExpression.orExpressionRet);}
    )?
    {$varDecStatementRet.addVar($var);}
    (
        COMMA
        identifier
        {$var = new VariableDeclaration($identifier.identifierRet, $type.typeRet);
        $var.setLine($identifier.identifierRet.getLine());
        }
        (
            ASSIGN orExpression
            {$var.setDefaultValue($orExpression.orExpressionRet);}
        )?
        {$varDecStatementRet.addVar($var);}
    )*
    ;

//todo
functionCallStmt returns [FunctionCallStmt functionCallStmtRet]:
     otherExpression ((LPAR functionArguments RPAR) | (DOT identifier))* (LPAR functionArguments RPAR);

returnStatement returns [ReturnStmt returnStatementRet] locals [Expression returnedExpr]:
    RETURN (expression {$returnedExpr = $expression.expressionRet;})?
    {$returnStatementRet = new ReturnStmt(); $returnStatementRet.setLine($RETURN.getLine());
     $returnStatementRet.setReturnedExpr($returnedExpr);}
    ;

ifStatement returns [ConditionalStmt ifStatementRet] locals [Statement thenBody, Statement elseBody]:
    IF expression
    (
        loopCondBody {$thenBody = $loopCondBody.loopCondBodyRet;}
        |
        body elseStatement {$thenBody = $body.bodyRet; $elseBody = $elseStatement.elseStatementRet;}
    )
    {$ifStatementRet = new ConditionalStmt($expression.expressionRet);
     $ifStatementRet.setLine($IF.getLine());
     $ifStatementRet.setThenBody($thenBody);
     $ifStatementRet.setElseBody($elseBody);}
    ;

elseStatement returns [Statement elseStatementRet]:
     NEWLINE* ELSE loopCondBody
     {$elseStatementRet = $loopCondBody.loopCondBodyRet;}
     ;

loopStatement returns [Statement loopStatementRet]:
    whileLoopStatement {$loopStatementRet = $whileLoopStatement.whileLoopStatementRet;}
    |
    doWhileLoopStatement {$loopStatementRet = $doWhileLoopStatement.doWhileLoopStatementRet;}
    ;

whileLoopStatement returns [LoopStmt whileLoopStatementRet]:
    WHILE expression loopCondBody
    {$whileLoopStatementRet = new LoopStmt();
     $whileLoopStatementRet.setLine($WHILE.getLine());
     $whileLoopStatementRet.setCondition($expression.expressionRet);
     $whileLoopStatementRet.setBody($loopCondBody.loopCondBodyRet);}
    ;

doWhileLoopStatement returns [LoopStmt doWhileLoopStatementRet]:
    DO body NEWLINE* WHILE expression
    {$doWhileLoopStatementRet = new LoopStmt();
     $doWhileLoopStatementRet.setBody($body.bodyRet);
     $doWhileLoopStatementRet.setCondition($expression.expressionRet);
     $doWhileLoopStatementRet.setLine($DO.getLine());}
    ;

displayStatement returns [DisplayStmt displayStatementRet]:
  DISPLAY LPAR expression RPAR {$displayStatementRet = new DisplayStmt($expression.expressionRet);
                                $displayStatementRet.setLine($DISPLAY.getLine());}
  ;

assignmentStatement returns [AssignmentStmt assignStatementRet]:
    lvalue = orExpression ASSIGN rvalue = expression
    {$assignStatementRet = new AssignmentStmt($lvalue.orExpressionRet, $rvalue.expressionRet);
     $assignStatementRet.setLine($ASSIGN.getLine());};

singleStatement returns [Statement singleStatementRet]:
    ifStatement {$singleStatementRet = $ifStatement.ifStatementRet;}
    |
    displayStatement {$singleStatementRet = $displayStatement.displayStatementRet;}
    |
    functionCallStmt {$singleStatementRet = $functionCallStmt.functionCallStmtRet;}
    |
    returnStatement {$singleStatementRet = $returnStatement.returnStatementRet;}
    |
    assignmentStatement {$singleStatementRet = $assignmentStatement.assignStatementRet;}
    |
    varDecStatement {$singleStatementRet = $varDecStatement.varDecStatementRet;}
    |
    loopStatement {$singleStatementRet = $loopStatement.loopStatementRet;}
    |
    append {$singleStatementRet = $append.appendRet;}
    |
    size {$singleStatementRet = $size.sizeRet;}
    ;

//todo
expression returns [Expression expressionRet]:
    orExpression (op = ASSIGN expression )? ;

//todo
orExpression returns [BinaryExpression orExpressionRet]:
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

otherExpression returns [Expression otherExpressionRet] locals [ExprInPar exprInPar]:
    value {$otherExpressionRet = $value.valueRet;}
    |
    identifier {$otherExpressionRet = $identifier.identifierRet;}
    |
    LPAR (functionArguments) RPAR
        {$exprInPar = new ExprInPar($functionArguments.functionArgumentsRet);
        $exprInPar.setLine($LPAR.getLine());
        $otherExpressionRet = $exprInPar;}
    |
    size {$otherExpressionRet = $size.sizeRet.getListSizeExpr();}
    |
    append {$otherExpressionRet = $append.appendRet.getListAppendExpr();}
    ;

size returns [ListSizeStmt sizeRet] locals [ListSize ls]:
    SIZE LPAR expression RPAR
    {
    $ls = new ListSize($expression.expressionRet);
    $ls.setLine($SIZE.getLine());
    $sizeRet = new ListSizeStmt($ls);
    $sizeRet.setLine($ls.getLine());
    };

append returns [ListAppendStmt appendRet] locals [ListAppend la]:
    APPEND LPAR listArg = expression COMMA elementArg = expression RPAR
    {
    $la = new ListAppend($listArg.expressionRet, $elementArg.expressionRet);
    $la.setLine($APPEND.getLine());
    $appendRet = new ListAppendStmt($la);
    $appendRet.setLine($la.getLine());
    }
    ;

value returns [Value valueRet]:
    boolValue {$valueRet = $boolValue.boolValueRet;}
    |
    INT_VALUE {$valueRet = new IntValue($INT_VALUE.int); $valueRet.setLine($INT_VALUE.getLine());}
    ;

boolValue returns [BoolValue boolValueRet]:
    (
        TRUE {$boolValueRet = new BoolValue(true); $boolValueRet.setLine($TRUE.getLine());}
        |
        FALSE {$boolValueRet = new BoolValue(false); $boolValueRet.setLine($FALSE.getLine());}
    )
    ;

identifier returns [Identifier identifierRet]:
    IDENTIFIER {$identifierRet = new Identifier($IDENTIFIER.getText());
        $identifierRet.setLine($IDENTIFIER.getLine());
    };

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