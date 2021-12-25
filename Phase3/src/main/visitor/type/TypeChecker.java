package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.ListType;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.compileError.typeError.*;
import main.visitor.Visitor;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker;
    private FunctionDeclaration currentFunction;
    static boolean inFuncCallSt = false;

    public void TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        //Todo
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        //Todo
        return null;
    }

    @Override
    public Void visit(AssignmentStmt assignmentStmt) {
        Type tr = assignmentStmt.getRValue().accept(expressionTypeChecker);
        expressionTypeChecker.isLVal = true;
        Type tl = assignmentStmt.getLValue().accept(expressionTypeChecker);
        if (!expressionTypeChecker.isLVal)
            assignmentStmt.addError(new LeftSideNotLvalue(assignmentStmt.getLine()));
        if (tl instanceof NoType)
            return null;
        if (!expressionTypeChecker.isSubType(tr, tl))
            assignmentStmt.addError(new UnsupportedOperandType(assignmentStmt.getLine(), BinaryOperator.assign.toString()));
        return null;
    }

    @Override
    public Void visit(BlockStmt blockStmt) {
        for (Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public Void visit(ConditionalStmt conditionalStmt) {
        Type condition_type = conditionalStmt.getCondition().accept(expressionTypeChecker);
        if (!(condition_type instanceof NoType || condition_type instanceof BoolType))
            conditionalStmt.addError(new ConditionNotBool(conditionalStmt.getLine()));
        conditionalStmt.getThenBody().accept(this);
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionCallStmt functionCallStmt) {
        inFuncCallSt = true;
        functionCallStmt.getFunctionCall().accept(expressionTypeChecker);
        inFuncCallSt = false;
        return null;
    }

    @Override
    public Void visit(DisplayStmt displayStmt) {
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        if (!(argType instanceof IntType || argType instanceof ListType || argType instanceof BoolType || argType instanceof NoType))
            displayStmt.addError(new UnsupportedTypeForDisplay(displayStmt.getLine()));
        return null;
    }

    @Override
    public Void visit(ReturnStmt returnStmt) {
        Type return_type_value = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type func_return_type = currentFunction.getReturnType();
        if (!(expressionTypeChecker.isSubType(return_type_value, func_return_type)))
            returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        //Todo
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        Type argType = listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}
