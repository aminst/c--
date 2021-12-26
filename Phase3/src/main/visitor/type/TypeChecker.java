package main.visitor.type;

import main.ast.nodes.Program;
import main.ast.nodes.declaration.*;
import main.ast.nodes.declaration.struct.*;
import main.ast.nodes.expression.Identifier;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.statement.*;
import main.ast.types.*;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.compileError.CompileError;
import main.compileError.typeError.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class TypeChecker extends Visitor<Void> {
    ExpressionTypeChecker expressionTypeChecker;
    private FunctionDeclaration currentFunction;
    static boolean inFuncCallSt = false;
    private boolean insideMainOrSetter = false;
    private boolean insideGetterOrSetter = false;

    public TypeChecker(){
        this.expressionTypeChecker = new ExpressionTypeChecker();
    }

    @Override
    public Void visit(Program program) {
        for (FunctionDeclaration functionDec : program.getFunctions())
            functionDec.accept(this);
        for (StructDeclaration structDec : program.getStructs())
            structDec.accept(this);
        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        FunctionSymbolTableItem functionSymbolTableItem;
        try {
            functionSymbolTableItem = (FunctionSymbolTableItem) SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY+functionDec.getFunctionName().getName());
            functionSymbolTableItem.setFunctionSymbolTable(new SymbolTable());
            functionSymbolTableItem.setReturnType(functionDec.getReturnType());
        } catch (ItemNotFoundException e) {
            functionSymbolTableItem = new FunctionSymbolTableItem(functionDec);
            functionSymbolTableItem.setFunctionSymbolTable(new SymbolTable());

            try {
                SymbolTable.root.put(functionSymbolTableItem);
            } catch (ItemAlreadyExistsException e1) {
            }
        }
        SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());

        currentFunction = functionDec;

        Type returnType = functionDec.getReturnType();
        VariableDeclaration test = new VariableDeclaration(new Identifier("fort_test"), returnType);
        test.setLine(functionDec.getLine());
        test.accept(this);
        for (CompileError error : test.flushErrors()) {
            functionDec.addError(error);
            functionSymbolTableItem.setReturnType(new NoType());
        }

        for (VariableDeclaration varDec : functionDec.getArgs())
            varDec.accept(this);

        functionDec.getBody().accept(this);

        // TODO: emtiazi checking for missing return for non void functions
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        insideMainOrSetter = true;
        mainDec.getBody().accept(this);
        insideMainOrSetter = false;
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        Type varType = variableDec.getVarType();
        if (varType instanceof StructType) {
            StructType structType = (StructType) varType;
            try {
                SymbolTable.root.getItem(StructSymbolTableItem.START_KEY + structType.getStructName().getName());
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(structType);
                } catch (ItemNotFoundException e) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(structType);
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e1) {

                    }
                }
            }
            catch (ItemNotFoundException e) {
                variableDec.addError(new StructNotDeclared(variableDec.getLine(), structType.getStructName().getName()));
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(new NoType());
                } catch (ItemNotFoundException e1) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(new NoType());
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e2) {
                    }
                }
            }
        }
        if (varType instanceof FptrType) {
            FptrType fptrType = (FptrType) varType;
            boolean hasError = false;
            for (Type type : fptrType.getArgsType()) {
                VariableDeclaration test = new VariableDeclaration(new Identifier("for_test"), type);
                test.setLine(variableDec.getLine());
                test.accept(this);
                for (CompileError error : test.flushErrors()) {
                    hasError = true;
                    variableDec.addError(error);
                }
            }
            Type type = fptrType.getReturnType();
            VariableDeclaration test = new VariableDeclaration(new Identifier("for_test"), type);
            test.setLine(variableDec.getLine());
            test.accept(this);
            for (CompileError error : test.flushErrors()) {
                hasError = true;
                variableDec.addError(error);
            }
            if (hasError) {
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(new NoType());
                } catch (ItemNotFoundException e1) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(new NoType());
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e2) {
                    }
                }
            } else {
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(fptrType);
                } catch (ItemNotFoundException e1) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(fptrType);
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e2) {
                    }
                }
            }
        }
        if (varType instanceof ListType) {
            ListType listType = (ListType) varType;
            Type type = listType.getType();
            VariableDeclaration test = new VariableDeclaration(new Identifier("for_test"), type);
            test.setLine(variableDec.getLine());
            test.accept(this);
            boolean hasError = false;
            for (CompileError error : test.flushErrors()) {
                variableDec.addError(error);
                hasError = true;
            }

            if (hasError) {
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(new NoType());
                } catch (ItemNotFoundException e1) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(new NoType());
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e2) {

                    }
                }
            }
            else {
                try {
                    VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                    variableSymbolTableItem.setType(listType);
                } catch (ItemNotFoundException e1) {
                    VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                    variableSymbolTableItem.setType(listType);
                    try {
                        SymbolTable.top.put(variableSymbolTableItem);
                    } catch (ItemAlreadyExistsException e2) {

                    }
                }
            }
        }
        if (varType instanceof IntType) {
            IntType intType = (IntType) varType;
            try {
                VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                variableSymbolTableItem.setType(intType);
            } catch (ItemNotFoundException e1) {
                VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                variableSymbolTableItem.setType(intType);
                try {
                    SymbolTable.top.put(variableSymbolTableItem);
                } catch (ItemAlreadyExistsException e2) {
                }
            }
        }
        if (varType instanceof BoolType) {
            BoolType boolType = (BoolType) varType;
            try {
                VariableSymbolTableItem variableSymbolTableItem = (VariableSymbolTableItem) SymbolTable.top.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName());
                variableSymbolTableItem.setType(boolType);
            } catch (ItemNotFoundException e1) {
                VariableSymbolTableItem variableSymbolTableItem = new VariableSymbolTableItem(variableDec.getVarName());
                variableSymbolTableItem.setType(boolType);
                try {
                    SymbolTable.top.put(variableSymbolTableItem);
                } catch (ItemAlreadyExistsException e2) {
                }
            }
        }
        if (insideGetterOrSetter)
            variableDec.addError(new CannotUseDefineVar(variableDec.getLine()));
        if (variableDec.getDefaultValue() != null) {
            variableDec.getDefaultValue().accept(this.expressionTypeChecker);
        }
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        structDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {
        setGetVarDec.getVarDec().accept(this);

        insideGetterOrSetter = true;

        setGetVarDec.getGetterBody().accept(this);

        insideGetterOrSetter = false;
        for (VariableDeclaration arg : setGetVarDec.getArgs()) {
            arg.accept(this);
        }
        insideGetterOrSetter = true;

        insideMainOrSetter = true;
        setGetVarDec.getSetterBody().accept(this);
        insideMainOrSetter = false;
        insideGetterOrSetter = false;
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
        if (insideMainOrSetter)
        {
            returnStmt.addError(new CannotUseReturn(returnStmt.getLine()));
            return null;
        }
        Type return_type_value = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        Type func_return_type = currentFunction.getReturnType();
        if (!(expressionTypeChecker.isSubType(return_type_value, func_return_type)))
            returnStmt.addError(new ReturnValueNotMatchFunctionReturnType(returnStmt.getLine()));
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        Type loopConditionType = loopStmt.getCondition().accept(expressionTypeChecker);
        if (!(loopConditionType instanceof NoType || loopConditionType instanceof BoolType))
            loopStmt.addError(new ConditionNotBool(loopStmt.getLine()));
        loopStmt.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        List<VariableDeclaration> varDecs = varDecStmt.getVars();
        for (VariableDeclaration varDec : varDecs)
            varDec.accept(this);
        return null;
    }

    @Override
    public Void visit(ListAppendStmt listAppendStmt) {
        listAppendStmt.getListAppendExpr().accept(expressionTypeChecker);
        return null;
    }

    @Override
    public Void visit(ListSizeStmt listSizeStmt) {
        listSizeStmt.getListSizeExpr().accept(expressionTypeChecker);
        return null;
    }
}
