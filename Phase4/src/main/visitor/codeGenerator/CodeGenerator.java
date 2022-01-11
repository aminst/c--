package main.visitor.codeGenerator;

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
import main.symbolTable.*;
import main.symbolTable.exceptions.*;
import main.symbolTable.items.FunctionSymbolTableItem;
import main.symbolTable.items.StructSymbolTableItem;
import main.visitor.Visitor;
import main.visitor.type.ExpressionTypeChecker;
import java.io.*;
import java.util.*;

public class  CodeGenerator extends Visitor<String> {
    ExpressionTypeChecker expressionTypeChecker = new ExpressionTypeChecker();
    private String outputPath;
    private FileWriter currentFile;
    private FunctionDeclaration currentFunction;
    private MainDeclaration currMain;
    private StructDeclaration currStruct;
    private int lastSlot = 0;
    private int lastLabel = 0;
    private boolean isMain = false;
    private boolean isStruct = false;
    private Map<String, Integer> slot = new HashMap<String, Integer>();

    private void copyFile(String toBeCopied, String toBePasted) {
        try {
            File readingFile = new File(toBeCopied);
            File writingFile = new File(toBePasted);
            InputStream readingFileStream = new FileInputStream(readingFile);
            OutputStream writingFileStream = new FileOutputStream(writingFile);
            byte[] buffer = new byte[1024];
            int readLength;
            while ((readLength = readingFileStream.read(buffer)) > 0)
                writingFileStream.write(buffer, 0, readLength);
            readingFileStream.close();
            writingFileStream.close();
        } catch (IOException e) {//unreachable
        }
    }

    private void prepareOutputFolder() {
        this.outputPath = "output/";
        String jasminPath = "utilities/jarFiles/jasmin.jar";
        String listClassPath = "utilities/codeGenerationUtilityClasses/List.j";
        String fptrClassPath = "utilities/codeGenerationUtilityClasses/Fptr.j";
        try{
            File directory = new File(this.outputPath);
            File[] files = directory.listFiles();
            if(files != null)
                for (File file : files)
                    file.delete();
            directory.mkdir();
        }
        catch(SecurityException e) {//unreachable

        }
        copyFile(jasminPath, this.outputPath + "jasmin.jar");
        copyFile(listClassPath, this.outputPath + "List.j");
        copyFile(fptrClassPath, this.outputPath + "Fptr.j");
    }

    private void createFile(String name) {
        try {
            String path = this.outputPath + name + ".j";
            File file = new File(path);
            file.createNewFile();
            this.currentFile = new FileWriter(path);
        } catch (IOException e) {//never reached
        }
    }

    private void addCommand(String command) {
        try {
            command = String.join("\n\t\t", command.split("\n"));
            if(command.startsWith("Label_"))
                this.currentFile.write("\t" + command + "\n");
            else if(command.startsWith("."))
                this.currentFile.write(command + "\n");
            else
                this.currentFile.write("\t\t" + command + "\n");
            this.currentFile.flush();
        } catch (IOException e) {//unreachable

        }
    }

    private void addStaticMainMethod() {
        addCommand(".method public static main([Ljava/lang/String;)V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("new Main");
        addCommand("invokespecial Main/<init>()V");
        addCommand("return");
        addCommand(".end method");
    }

    private int slotOf(String identifier) {
        if(isMain || isStruct) {
            if (identifier.equals("")) {
                lastSlot++;
                return lastSlot;
            }
            if (!slot.containsKey(identifier)) {
                lastSlot++;
                slot.put(identifier,lastSlot);
            }
            return slot.get(identifier);
        }
        if (identifier.equals("")) {
            if (lastSlot == 0)
                lastSlot = currentFunction.getArgs().size();
            lastSlot++;
            return lastSlot;
        }

        if (!slot.containsKey(identifier)) {
            lastSlot++;
            slot.put(identifier,lastSlot);
        }
        return slot.get(identifier);
    }

    private String castToNonPrimitive(Type type) {
        if (type instanceof IntType) {
            return  "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
        }
        else if (type instanceof BoolType) {
            return "invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;";
        }

        return null;
    }

    private String castToPrimitive(Type type) {
        if (type instanceof IntType) {
            return  "invokevirtual java/lang/Integer/intValue()I";
        }
        else if (type instanceof BoolType) {
            return "invokevirtual java/lang/Boolean/booleanValue()Z";
        }
        return null;
    }

    private String newLabel() {
        String label = "Label_" + lastLabel;
        lastLabel++;
        return label;
    }

    private String makeTypeSignature(Type t) {
        if (t instanceof IntType)
            return  "Ljava/lang/Integer;";
        else if (t instanceof BoolType)
            return "Ljava/lang/Boolean;";
        else if (t instanceof ListType)
            return "LList;";
        else if (t instanceof FptrType)
            return "LFptr;";
        else if (t instanceof VoidType)
            return "V";
        return null;
    }

    private String checkcastType(Type t) {
        if (t instanceof IntType)
            return  "java/lang/Integer";
        else if (t instanceof BoolType)
            return "java/lang/Boolean";
        else if (t instanceof ListType)
            return "List";
        else if (t instanceof FptrType)
            return "Fptr";
        else if (t instanceof VoidType)
            return "V";
        return null;
    }

    @Override
    public String visit(Program program) {
        prepareOutputFolder();
        for(StructDeclaration structDeclaration : program.getStructs()){
            structDeclaration.accept(this);
        }
        createFile("Main");
        program.getMain().accept(this);
        for (FunctionDeclaration functionDeclaration: program.getFunctions()){
            functionDeclaration.accept(this);
        }
        return null;
    }

    @Override
    public String visit(StructDeclaration structDeclaration) {
        lastSlot = 0;
        lastLabel = 0;
        slot.clear();
        isStruct = true;
        currStruct = structDeclaration;
        try{
            String structKey = StructSymbolTableItem.START_KEY + structDeclaration.getStructName().getName();
            StructSymbolTableItem structSymbolTableItem = (StructSymbolTableItem)SymbolTable.root.getItem(structKey);
            SymbolTable.push(structSymbolTableItem.getStructSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
        createFile(structDeclaration.getStructName().getName());
        String commands = ".class public ";
        commands += structDeclaration.getStructName().getName();
        addCommand(commands);
        addCommand(".super java/lang/Object");
        structDeclaration.getBody().accept(this);
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        addCommand("return");
        addCommand(".end method");
        isStruct = false;
        return null;
    }

    @Override
    public String visit(FunctionDeclaration functionDeclaration) {
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + functionDeclaration.getFunctionName().getName();
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
        lastSlot = 0;
        lastLabel = 0;
        slot.clear();
        currentFunction = functionDeclaration;
        String commands = ".method public ";
        commands += functionDeclaration.getFunctionName().getName() + "(";
        for (VariableDeclaration arg : functionDeclaration.getArgs()){
            commands += makeTypeSignature(arg.getVarType());
        }
        commands += ")";
        commands += makeTypeSignature(functionDeclaration.getReturnType());
        addCommand(commands);
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        functionDeclaration.getBody().accept(this);
        addCommand(".end method");
        return null;
    }

    @Override
    public String visit(MainDeclaration mainDeclaration) {
        lastSlot = 0;
        lastLabel = 0;
        slot.clear();
        try{
            String functionKey = FunctionSymbolTableItem.START_KEY + "main";
            FunctionSymbolTableItem functionSymbolTableItem = (FunctionSymbolTableItem)SymbolTable.root.getItem(functionKey);
            SymbolTable.push(functionSymbolTableItem.getFunctionSymbolTable());
        }catch (ItemNotFoundException e){//unreachable
        }
        currMain = mainDeclaration;
        isMain = true;
        addCommand(".class public Main");
        addCommand(".super java/lang/Object");
        addCommand(".method public <init>()V");
        addCommand(".limit stack 128");
        addCommand(".limit locals 128");
        addCommand("aload_0");
        addCommand("invokespecial java/lang/Object/<init>()V");
        mainDeclaration.getBody().accept(this);
        addCommand("return");
        addCommand(".end method");
        addStaticMainMethod();
        isMain = false;
        return null;
    }

    private void varDecHelper(Type type) {
        if (type instanceof IntType) {
            addCommand("ldc 0");
            addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
        }
        else if (type instanceof BoolType) {
            addCommand("ldc 0");
            addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
        }
        else if (type instanceof ListType) {
            ListType listType = (ListType) type;
            addCommand("new List");
            addCommand("dup");
            addCommand("new java/util/ArrayList");
            addCommand("dup");
            addCommand("invokespecial java/util/ArrayList/<init>()V");
            addCommand("invokespecial List/<init>(Ljava/util/ArrayList;)V");
        }
        else if (type instanceof FptrType) {
            addCommand("aconst_null");
        }
        else if (type instanceof StructType) {
            StructType structType = (StructType) type;
            addCommand("new " + structType.getStructName());
            addCommand("dup");
            addCommand("invokespecial " + structType.getStructName() + "/<init>()V");
        }
    }

    @Override
    public String visit(VariableDeclaration variableDeclaration) {
        int slot = slotOf(variableDeclaration.getVarName().getName());
        Type varType = variableDeclaration.getVarType();
        if(isStruct) {
            addCommand(".field " + variableDeclaration.getVarName().getName() + " " + makeTypeSignature(varType));
            return null;
        }
        varDecHelper(varType);
        addCommand("astore " + slot);
        return null;
    }

    @Override
    public String visit(SetGetVarDeclaration setGetVarDeclaration) {
        return null;
    }

    @Override
    public String visit(AssignmentStmt assignmentStmt) {
        BinaryExpression assignmentExp = new BinaryExpression(assignmentStmt.getLValue(),
                assignmentStmt.getRValue(), BinaryOperator.assign);
        addCommand(";Assign Statement");
        addCommand(assignmentExp.accept(this));
        addCommand("pop");
        return "";
    }

    @Override
    public String visit(BlockStmt blockStmt) {
        for(Statement statement : blockStmt.getStatements())
            statement.accept(this);
        return null;
    }

    @Override
    public String visit(ConditionalStmt conditionalStmt) {
        String elseLabel = newLabel();
        String afterLabel = newLabel();
        addCommand("; If statement " + conditionalStmt.getLine());
        addCommand(conditionalStmt.getCondition().accept(this));
        addCommand("ifeq " + elseLabel);
        conditionalStmt.getThenBody().accept(this);
        addCommand("goto " + afterLabel);
        addCommand(elseLabel + ":");
        if (conditionalStmt.getElseBody() != null)
            conditionalStmt.getElseBody().accept(this);
        addCommand(afterLabel + ":");
        return null;
    }

    @Override
    public String visit(FunctionCallStmt functionCallStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        addCommand(functionCallStmt.getFunctionCall().accept(this));
        expressionTypeChecker.setInFunctionCallStmt(false);
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(DisplayStmt displayStmt) {
        addCommand("getstatic java/lang/System/out Ljava/io/PrintStream;");
        Type argType = displayStmt.getArg().accept(expressionTypeChecker);
        String commandsOfArg = displayStmt.getArg().accept(this);

        addCommand(commandsOfArg);
        if (argType instanceof IntType)
            addCommand("invokevirtual java/io/PrintStream/println(I)V");
        if (argType instanceof BoolType)
            addCommand("invokevirtual java/io/PrintStream/println(Z)V");

        return null;
    }

    @Override
    public String visit(ReturnStmt returnStmt) {
        Type type = returnStmt.getReturnedExpr().accept(expressionTypeChecker);
        if(type instanceof VoidType) {
            addCommand("return");
        }
        else {
            addCommand(returnStmt.getReturnedExpr().accept(this));
            if (type instanceof IntType) {
                addCommand("invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;");
            }
            else if (type instanceof BoolType) {
                addCommand("invokestatic java/lang/Boolean/valueOf(Z)Ljava/lang/Boolean;");
            }
            addCommand("areturn");
        }
        return null;
    }

    @Override
    public String visit(LoopStmt loopStmt) {
        if (!loopStmt.getIsDoWhile()) {
            String startLabel = newLabel();
            String endLabel = newLabel();
            addCommand(startLabel + ":");
            addCommand(loopStmt.getCondition().accept(this));
            addCommand("ifeq " + endLabel);
            loopStmt.getBody().accept(this);
            addCommand("goto " + startLabel);
            addCommand(endLabel + ":");
        }
        else {
            String startLabel = newLabel();
            String endLabel = newLabel();
            addCommand(startLabel + ":");
            loopStmt.getBody().accept(this);
            addCommand(loopStmt.getCondition().accept(this));
            addCommand("ifne " + startLabel);
            addCommand(endLabel + ":");
        }
        return null;
    }

    @Override
    public String visit(VarDecStmt varDecStmt) {
        for (VariableDeclaration varDec: varDecStmt.getVars())
            varDec.accept(this);
        return null;
    }

    @Override
    public String visit(ListAppendStmt listAppendStmt) {
        expressionTypeChecker.setInFunctionCallStmt(true);
        addCommand(listAppendStmt.getListAppendExpr().accept(this));
        expressionTypeChecker.setInFunctionCallStmt(false);
        return null;
    }

    @Override
    public String visit(ListSizeStmt listSizeStmt) {
        addCommand(listSizeStmt.getListSizeExpr().accept(this));
        addCommand("pop");
        return null;
    }

    @Override
    public String visit(BinaryExpression binaryExpression) {
        BinaryOperator operator = binaryExpression.getBinaryOperator();
        String commands = "";

        commands += binaryExpression.getFirstOperand().accept(this);
        commands += "\n" + binaryExpression.getSecondOperand().accept(this);
        if (operator == BinaryOperator.add) {
            commands += "\niadd";
        }
        else if (operator == BinaryOperator.sub) {
            commands += "\nisub";
        }
        else if (operator == BinaryOperator.mult) {
            commands += "\nimul";
        }
        else if (operator == BinaryOperator.div) {
            commands += "\nidiv";
        }
        else if((operator == BinaryOperator.gt) || (operator == BinaryOperator.lt)) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            if (operator == BinaryOperator.gt)
                commands += "\nif_icmpgt " + trueLabel + " ; binary gt";
            else
                commands += "\nif_icmplt " + trueLabel + " ; binary lt";
            commands += "\nldc 0"; // cond was false
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1"; // cond was true
            commands += "\n" + afterLabel + ":";
        }
        else if((operator == BinaryOperator.eq) ) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();
            String cmpCommand = "if_a";
            Type type = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            if (type instanceof IntType || type instanceof BoolType)
                cmpCommand = "if_i";

            commands += "\n" + cmpCommand + "cmpeq "  + trueLabel + " ; binary eq";
            commands += "\nldc 0"; // cond was false
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1"; // cond was true
            commands += "\n" + afterLabel + ":";

        }
        else if(operator == BinaryOperator.and) {
            String shortCircuitLabel = newLabel();
            String trueLabel = newLabel();
            String afterLabel = newLabel();

            commands = "; logical AND\n";
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += "\nifeq " + shortCircuitLabel;
            commands += "\n" + binaryExpression.getSecondOperand().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\n" + shortCircuitLabel + ":";
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";

        }
        else if(operator == BinaryOperator.or) {
            String trueLabel = newLabel();
            String afterLabel = newLabel();

            commands = "; logical OR\n";
            commands += binaryExpression.getFirstOperand().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\n" + binaryExpression.getSecondOperand().accept(this);
            commands += "\nifne " + trueLabel;
            commands += "\nldc 0";
            commands += "\ngoto " + afterLabel;
            commands += "\n" + trueLabel + ":";
            commands += "\nldc 1";
            commands += "\n" + afterLabel + ":";
        }
        else if(operator == BinaryOperator.assign) {
            commands = "";
            Type firstType = binaryExpression.getFirstOperand().accept(expressionTypeChecker);
            Type secondType = binaryExpression.getSecondOperand().accept(expressionTypeChecker);
            String secondOperandCommands = binaryExpression.getSecondOperand().accept(this);
            if(firstType instanceof ListType) {
                secondOperandCommands = "new List\ndup\n" + secondOperandCommands;
                secondOperandCommands += "\ninvokespecial List/<init>(LList;)V";
            }
            if(binaryExpression.getFirstOperand() instanceof Identifier) {
                String name = ((Identifier) binaryExpression.getFirstOperand()).getName();
                commands += secondOperandCommands;
                commands += "\ndup ; keep value on stack"; // value must stay on stack
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\nastore " + slotOf(name);
            }
            else if(binaryExpression.getFirstOperand() instanceof ListAccessByIndex) {
                int tempSlot = slotOf("");
                ListAccessByIndex listAccessByIndex = (ListAccessByIndex) binaryExpression.getFirstOperand();
                commands += listAccessByIndex.getInstance().accept(this);
                commands += "\ndup ; dup list for retrieving from list to put value on stack after assign";
                commands += "\n" + listAccessByIndex.getIndex().accept(this);
                commands += "\ndup ; keeping index so we can retrieve value from list";
                commands += "\nistore " + tempSlot;
                commands += "\n" + secondOperandCommands;
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\n" + "invokevirtual List/setElement(ILjava/lang/Object;)V";
                commands += "\niload " + tempSlot;
                commands += "\n" + "invokevirtual List/getElement(I)Ljava/lang/Object;";
                commands += "\ncheckcast " + checkcastType(secondType);
                castCmd = castToPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;

            }
            else if(binaryExpression.getFirstOperand() instanceof StructAccess) {
                Expression instance = ((StructAccess) binaryExpression.getFirstOperand()).getInstance();
                String memberName = ((StructAccess) binaryExpression.getFirstOperand()).getInstance().toString();
                Type instanceType = instance.accept(expressionTypeChecker);
                commands += instance.accept(this);
                commands += "\ndup ; to getfield for putting back on stack";
                commands += "\n" + secondOperandCommands;
                String castCmd = castToNonPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
                commands += "\nputfield " + ((StructType) instanceType).getStructName().getName()
                        + "/" + memberName + " " + makeTypeSignature(secondType);
                commands += "\ngetfield " + ((StructType) instanceType).getStructName().getName()
                        + "/" + memberName + " " + makeTypeSignature(secondType) + " ; for putting assign on stack ";
                castCmd = castToPrimitive(secondType);
                if (castCmd != null)
                    commands += "\n" + castCmd;
            }
        }
        return commands;
    }

    @Override
    public String visit(UnaryExpression unaryExpression){
        return null;
    }

    @Override
    public String visit(StructAccess structAccess){
        //todo
        return null;
    }

    @Override
    public String visit(Identifier identifier){
        try {
            SymbolTable.root.getItem(FunctionSymbolTableItem.START_KEY+identifier.getName());
            addCommand("new Fptr");
            addCommand("dup");
            addCommand("aload_0");
            addCommand("ldc \"" + identifier.getName() + "\"");
            addCommand("invokespecial Fptr/<init>(Ljava/lang/Object;Ljava/lang/String;)V");
            return null;
        } catch (ItemNotFoundException ex) {}
        String commands = "";
        int slot = slotOf(identifier.getName());
        commands += "aload " + String.valueOf(slot);
        Type type = identifier.accept(expressionTypeChecker);
        String castCmd = castToPrimitive(type);
        if (castCmd != null)
            commands += "\n" + castCmd;
        return commands;
    }

    @Override
    public String visit(ListAccessByIndex listAccessByIndex){
        String commands = "";
        commands += listAccessByIndex.getInstance().accept(this);
        commands += "\n" + listAccessByIndex.getIndex().accept(this);
        commands += "\n" + "invokevirtual List/getElement(I)Ljava/lang/Object;";
        Type type = listAccessByIndex.getInstance().accept(expressionTypeChecker);
        ListType listType = (ListType) type;
        Type memberType = listType.getType();
        commands += "\n" + "checkcast " + checkcastType(memberType);
        String castCmd = castToPrimitive(memberType);
        if (castCmd != null)
            commands += "\n" + castCmd;
        return commands;
    }

    @Override
    public String visit(FunctionCall functionCall){
        String commands = "";
        functionCall.getInstance().accept(this);
        commands += "\n" + "new java/util/ArrayList";
        commands += "\n" + "dup";
        commands += "\n" + "invokespecial java/util/ArrayList/<init>()V";
        for (Expression expression : functionCall.getArgs()) {
            commands += "\n" + "dup";
            commands += "\n" + expression.accept(this);
            String castCmd = castToNonPrimitive(expression.accept(expressionTypeChecker));
            if (castCmd != null)
                commands += "\n" + castCmd;
            commands += "\n" + "invokevirtual java/util/ArrayList/add(Ljava/lang/Object;)Z";
            commands += "\n" + "pop";
        }
        commands += "\n" + "invokevirtual Fptr/invoke(Ljava/util/ArrayList;)Ljava/lang/Object;";
        Type type = functionCall.accept(expressionTypeChecker);
        commands += "\n" + "checkcast " + checkcastType(type);
        String castCmd = castToPrimitive(type);
        if (castCmd != null)
            commands += "\n" + castCmd;
        return commands;
    }

    @Override
    public String visit(ListSize listSize){
        String commands = "";
        commands += listSize.getArg().accept(this);
        commands += "\n" + "invokevirtual List/getSize()I";
        return commands;
    }

    @Override
    public String visit(ListAppend listAppend) {
        String commands = "";
        commands += listAppend.getListArg().accept(this);
        commands += "\n" + listAppend.getElementArg().accept(this);
        commands += "\n" + "invokestatic java/lang/Integer/valueOf(I)Ljava/lang/Integer;";
        commands += "\n" + "invokevirtual List/addElement(Ljava/lang/Object;)V";
        return commands;
    }

    @Override
    public String visit(IntValue intValue) {
        String commands = "";
        commands += "ldc " + String.valueOf(intValue.getConstant());
        return commands;
    }

    @Override
    public String visit(BoolValue boolValue) {
        if (boolValue.getConstant())
            return  "ldc 1";
        else
            return "ldc 0";
    }

    @Override
    public String visit(ExprInPar exprInPar) {
        return exprInPar.getInputs().get(0).accept(this);
    }
}
