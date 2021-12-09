package main.visitor.name;

import main.CmmErrors;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.MainDeclaration;
import main.ast.nodes.declaration.VariableDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.nodes.statement.*;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.VariableSymbolTableItem;
import main.visitor.Visitor;

public class SymbolTableVisitor extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable root = new SymbolTable();
        SymbolTable.root = root;
        SymbolTable.push(root);

        for (StructDeclaration structDeclaration: program.getStructs()) {
            StructSymbolTableItem s = new StructSymbolTableItem(structDeclaration);

            try {
                root.put(s);
            }
            catch (ItemAlreadyExistsException e)
            {
                CmmErrors.addError("Line " + structDeclaration.getLine()+": Duplicate struct " + structDeclaration.getStructName().getName());
                structDeclaration.setStructName(new Identifier("#"+structDeclaration.getStructName().getName()));
                s = new StructSymbolTableItem(structDeclaration);
                boolean endLoop = false;
                while (!endLoop){
                    try {
                        root.put(s);
                        endLoop = true;
                    } catch (ItemAlreadyExistsException e1) {
                        structDeclaration.setStructName(new Identifier("#"+structDeclaration.getStructName().getName()));
                        s = new StructSymbolTableItem(structDeclaration);
                    }
                }
            }
            SymbolTable sst = new SymbolTable(root);
            s.setStructSymbolTable(sst);
            SymbolTable.push(sst);
            structDeclaration.accept(this);
            SymbolTable.pop();
        }

        for (FunctionDeclaration functionDeclaration:program.getFunctions()) {
            FunctionSymbolTableItem f = new FunctionSymbolTableItem(functionDeclaration);
            try {
                root.put(f);
            }
            catch (ItemAlreadyExistsException e)
            {
                CmmErrors.addError("Line " + functionDeclaration.getLine()+": Duplicate function " + functionDeclaration.getFunctionName().getName());
                functionDeclaration.setFunctionName(new Identifier("#"+functionDeclaration.getFunctionName().getName()));
                f = new FunctionSymbolTableItem(functionDeclaration);
                boolean endLoop = false;
                while (!endLoop){
                    try {
                        root.put(f);
                        endLoop = true;
                    } catch (ItemAlreadyExistsException e1) {
                        functionDeclaration.setFunctionName(new Identifier("#"+functionDeclaration.getFunctionName().getName()));
                        f = new FunctionSymbolTableItem(functionDeclaration);
                    }
                }
            }
            try {
                root.getItem(StructSymbolTableItem.START_KEY + f.getName(), true);
                CmmErrors.addError("Line " + functionDeclaration.getLine()+": Name of function " + f.getName() + " conflicts with a struct's name");

            }
            catch (ItemNotFoundException e1) {}

            SymbolTable fst = new SymbolTable(root);
            f.setFunctionSymbolTable(fst);
            SymbolTable.push(fst);
            functionDeclaration.accept(this);
            SymbolTable.pop();
        }

        program.getMain().accept(this);
        return null;
    }

    @Override
    public Void visit(FunctionDeclaration functionDec) {
        SymbolTable symbolTable = SymbolTable.top;
        for (VariableDeclaration arg: functionDec.getArgs()) {
            VariableSymbolTableItem vst = new VariableSymbolTableItem(arg.getVarName());

            try {
                symbolTable.put(vst);
            }
            catch (ItemAlreadyExistsException e) {
                CmmErrors.addError("Line " + arg.getLine()+": Variable " + arg.getVarName().getName() + " is already declared");
            }
        }
        functionDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(MainDeclaration mainDec) {
        mainDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration var : varDecStmt.getVars())
            var.accept(this);
        return null;
    }

    @Override
    public Void visit(StructDeclaration structDec) {
        structDec.getBody().accept(this);
        return null;
    }

    @Override
    public Void visit(VariableDeclaration variableDec) {
        SymbolTable symbolTable = SymbolTable.top;
        VariableSymbolTableItem vst = new VariableSymbolTableItem(variableDec.getVarName());
        try {
            symbolTable.put(vst);
        }
        catch (ItemAlreadyExistsException e) {
            CmmErrors.addError("Line " + variableDec.getLine()+": Variable " + variableDec.getVarName().getName() + " is already declared");
        }
        try {
            symbolTable.getItem(StructSymbolTableItem.START_KEY + variableDec.getVarName().getName(), true);
            CmmErrors.addError("Line " + variableDec.getLine()+": Name of Variable " + variableDec.getVarName().getName() + " conflicts with a struct's name");
        }
        catch (ItemNotFoundException e1) {}
        try {
            symbolTable.getItem(FunctionSymbolTableItem.START_KEY + variableDec.getVarName().getName(), true);
            CmmErrors.addError("Line " + variableDec.getLine()+": Name of Variable " + variableDec.getVarName().getName() + " conflicts with a functions's name");
        }
        catch (ItemNotFoundException e2) {}
        try {
            if (symbolTable.pre != null) {
                symbolTable.pre.getItem(VariableSymbolTableItem.START_KEY + variableDec.getVarName().getName(), true);
                CmmErrors.addError("Line " + variableDec.getLine() + ": Variable " + variableDec.getVarName().getName() + " is already declared");
            }
        }
        catch (ItemNotFoundException e3) {}

        return null;
    }

    @Override
    public Void visit(SetGetVarDeclaration setGetVarDec) {

        SymbolTable symbolTable = SymbolTable.top;
        setGetVarDec.getVarName().accept(this);
        VariableSymbolTableItem sgvst = new VariableSymbolTableItem(setGetVarDec.getVarName());
        try {
            symbolTable.put(sgvst);
        }
        catch (ItemAlreadyExistsException e) {
            CmmErrors.addError("Line " + setGetVarDec.getLine()+": Variable " + setGetVarDec.getVarName().getName() + " is already declared");
        }
        try {
            symbolTable.getItem(StructSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName(), true);
            CmmErrors.addError("Line " + setGetVarDec.getLine()+": Name of Variable " + setGetVarDec.getVarName().getName() + " conflicts with a struct's name");
        }
        catch (ItemNotFoundException e1) {}
        try {
            symbolTable.getItem(FunctionSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName(), true);
            CmmErrors.addError("Line " + setGetVarDec.getLine()+": Name of Variable " + setGetVarDec.getVarName().getName() + " conflicts with a functions's name");
        }
        catch (ItemNotFoundException e2) {}
        try {
            if (symbolTable.pre != null) {
                symbolTable.pre.getItem(VariableSymbolTableItem.START_KEY + setGetVarDec.getVarName().getName(), true);
                CmmErrors.addError("Line " + setGetVarDec.getLine() + ": Variable " + setGetVarDec.getVarName().getName() + " is already declared");
            }
        }
        catch (ItemNotFoundException e3) {}


        for (VariableDeclaration var : setGetVarDec.getArgs())
            var.accept(this);
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
        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(symbolTable);
        conditionalStmt.getCondition().accept(this);
        conditionalStmt.getThenBody().accept(this);
        SymbolTable.pop();
        SymbolTable symbolTable1 = SymbolTable.top;
        if (conditionalStmt.getElseBody() != null)
            SymbolTable.push(symbolTable1);
            conditionalStmt.getElseBody().accept(this);
            SymbolTable.pop();
        return null;
    }

    @Override
    public Void visit(LoopStmt loopStmt) {
        SymbolTable symbolTable = new SymbolTable(SymbolTable.top);
        SymbolTable.push(symbolTable);
        loopStmt.getCondition().accept(this);
        loopStmt.getBody().accept(this);
        SymbolTable.pop();
        return null;
    }


}