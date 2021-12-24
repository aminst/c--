package main.visitor.type;

import main.ast.nodes.Node;
import main.ast.nodes.expression.*;
import main.ast.nodes.expression.operators.BinaryOperator;
import main.ast.nodes.expression.values.primitive.BoolValue;
import main.ast.nodes.expression.values.primitive.IntValue;
import main.ast.types.FptrType;
import main.ast.types.ListType;
import main.ast.types.NoType;
import main.ast.types.Type;
import main.ast.types.primitives.BoolType;
import main.ast.types.primitives.IntType;
import main.ast.types.primitives.VoidType;
import main.compileError.typeError.LeftSideNotLvalue;
import main.compileError.typeError.UnsupportedOperandType;
import main.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class ExpressionTypeChecker extends Visitor<Type> {

    public boolean isLVal = false;

    public boolean isSubType(Type first, Type second) {
        if (first instanceof NoType)
            return true;
        if (first instanceof BoolType && second instanceof BoolType)
            return true;
        if (first instanceof IntType && second instanceof IntType)
            return true;
        if (first instanceof ListType && second instanceof ListType) {
            Type t1 = ((ListType) first).getType();
            Type t2 = ((ListType) first).getType();
            if(!isSubType(t1,t2))
                return false;
            return true;
        }
        if (first instanceof FptrType && second instanceof FptrType) {
            Type t1 = ((FptrType) first).getReturnType();
            Type t2 = ((FptrType) second).getReturnType();
            if (!isSubType(t1, t2))
                return false;
            ArrayList<Type> firstArgsTypes = ((FptrType) first).getArgsType();
            ArrayList<Type> secondArgsTypes = ((FptrType) second).getArgsType();
            if (firstArgsTypes.size() != secondArgsTypes.size())
                return false;
            for(int i = 0; i < firstArgsTypes.size(); i++) {
                if(!isSubType(firstArgsTypes.get(i), secondArgsTypes.get(i)))
                    return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public Type visit(BinaryExpression binaryExpression) {
        this.isLVal = true;
        Type lType = binaryExpression.getFirstOperand().accept(this);
        boolean isFirstLVal = this.isLVal;
        this.isLVal = false;
        Type rType = binaryExpression.getSecondOperand().accept(this);
        BinaryOperator binaryOperator = binaryExpression.getBinaryOperator();
        if(binaryOperator == BinaryOperator.eq) {
            if(lType instanceof ListType || rType instanceof ListType) {
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryOperator.toString()));
                return new NoType();
            }
            else if(lType instanceof NoType || rType instanceof NoType)
                return new NoType();

            else if(isSubType(lType, rType) || isSubType(rType, lType))
                return new BoolType();
        }
        if(binaryOperator == BinaryOperator.gt || binaryOperator == BinaryOperator.lt)
        {
            if(lType instanceof IntType && rType instanceof IntType)
                return new BoolType();

            if((lType instanceof NoType && rType instanceof NoType) || (lType instanceof IntType && rType instanceof NoType) ||
                    (lType instanceof NoType && rType instanceof IntType))
                return new NoType();

            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryOperator.toString()));
            return new NoType();
        }
        if (binaryOperator == BinaryOperator.add || binaryOperator == BinaryOperator.sub || binaryOperator == BinaryOperator.mult ||
                binaryOperator == BinaryOperator.div) {
            if(lType instanceof IntType && rType instanceof IntType)
                return new IntType();

            if((lType instanceof NoType && rType instanceof NoType) || (lType instanceof IntType && rType instanceof NoType) ||
                    (lType instanceof NoType && rType instanceof IntType))
                return new NoType();

            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryOperator.toString()));
            return new NoType();
        }
        if (binaryOperator == BinaryOperator.or || binaryOperator == BinaryOperator.and) {
            if(lType instanceof IntType && rType instanceof IntType)
                return new BoolType();

            if((lType instanceof NoType && rType instanceof NoType) || (lType instanceof IntType && rType instanceof NoType) ||
                    (lType instanceof NoType && rType instanceof IntType))
                return new NoType();

            binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryOperator.toString()));
            return new NoType();
        }
        if (binaryOperator == BinaryOperator.assign) {
            boolean hasError = false;
            if (!isFirstLVal) {
                binaryExpression.addError(new LeftSideNotLvalue(binaryExpression.getLine()));
                hasError = true;
            }
            if (lType instanceof NoType || rType instanceof NoType)
                return new NoType();
            else if (!isSubType(rType, lType)) {
                binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), BinaryOperator.assign.toString()));
                return new NoType();
            }
            if (hasError)
                return new NoType();
            else
                return rType;
        }
        binaryExpression.addError(new UnsupportedOperandType(binaryExpression.getLine(), binaryOperator.name()));
        return new NoType();
    }

    @Override
    public Type visit(UnaryExpression unaryExpression) {
        //Todo
        return null;
    }

    @Override
    public Type visit(FunctionCall funcCall) {
        //Todo
        return null;
    }

    @Override
    public Type visit(Identifier identifier) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListAccessByIndex listAccessByIndex) {
        //Todo
        return null;
    }

    @Override
    public Type visit(StructAccess structAccess) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListSize listSize) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ListAppend listAppend) {
        //Todo
        return null;
    }

    @Override
    public Type visit(ExprInPar exprInPar) {
        //Todo
        return null;
    }

    @Override
    public Type visit(IntValue intValue) {
        this.isLVal = true;
        return new IntType();
    }

    @Override
    public Type visit(BoolValue boolValue) {
        this.isLVal = true;
        return new BoolType();
    }
}
