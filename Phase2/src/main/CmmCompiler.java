package main;

import main.grammar.CmmLexer;
import main.grammar.CmmParser;
import main.visitor.name.ASTTreePrinter;
import main.visitor.name.SymbolTableVisitor;
import main.ast.nodes.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class CmmCompiler {
    public void compile(CharStream textStream) {
        CmmLexer cmmLexer = new CmmLexer(textStream);
        CommonTokenStream tokenStream = new CommonTokenStream(cmmLexer);
        CmmParser cmmParser = new CmmParser(tokenStream);

        Program program = cmmParser.cmm().cmmProgram;

        CmmErrors cmmErrors = new CmmErrors();
        program.accept(new SymbolTableVisitor());

        if(cmmErrors.hasErrors())
            cmmErrors.printErrors();
        else
            program.accept(new ASTTreePrinter());
    }
}
