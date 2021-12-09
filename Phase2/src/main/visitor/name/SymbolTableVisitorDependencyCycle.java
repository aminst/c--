package main.visitor.name;

import main.CmmErrors;
import main.ast.nodes.Program;
import main.ast.nodes.declaration.struct.StructDeclaration;
import main.ast.nodes.expression.Identifier;
import main.symbolTable.SymbolTable;
import main.symbolTable.exceptions.ItemAlreadyExistsException;
import main.symbolTable.exceptions.ItemNotFoundException;
import main.symbolTable.items.StructSymbolTableItem;
import main.symbolTable.items.SymbolTableItem;
import main.visitor.Visitor;

public class SymbolTableVisitorDependencyCycle extends Visitor<Void> {

    @Override
    public Void visit(Program program) {
        SymbolTable root = SymbolTable.root;



        return null;
    }
}
