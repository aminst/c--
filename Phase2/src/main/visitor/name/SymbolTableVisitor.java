package main.visitor.name;

import main.CmmErrors;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.FunctionDeclaration;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.Identifier;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.visitor.Visitor;

public class SymbolTableVisitor extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable root = new SymbolTable();
        SymbolTable.root = root;
        SymbolTable.push(root);

        for (StructDeclaration structDeclaration: program.getStructs()) {
            System.out.println(0);
            System.out.println(structDeclaration.getStructName().getName());
            System.out.println(1);
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
//            SymbolTable sst = new SymbolTable(root);
//            s.setStructSymbolTable(sst);
//            SymbolTable.push(sst);
//            structDeclaration.accept(this);
//            SymbolTable.pop();
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
//            SymbolTable fst = new SymbolTable(root);
//            f.setFunctionSymbolTable(fst);
//            SymbolTable.push(fst);
//            functionDeclaration.accept(this);
//            SymbolTable.pop();
        }
        program.getMain().accept(this);
        return null;
    }
}
