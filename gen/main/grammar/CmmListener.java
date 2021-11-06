// Generated from /home/fateme/fatemes/1400/compiler/ca/c--/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CmmParser}.
 */
public interface CmmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void enterCmm(CmmParser.CmmContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 */
	void exitCmm(CmmParser.CmmContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(CmmParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(CmmParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(CmmParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void enterStruct(CmmParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 */
	void exitStruct(CmmParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structScope}.
	 * @param ctx the parse tree
	 */
	void enterStructScope(CmmParser.StructScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structScope}.
	 * @param ctx the parse tree
	 */
	void exitStructScope(CmmParser.StructScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structFunc}.
	 * @param ctx the parse tree
	 */
	void enterStructFunc(CmmParser.StructFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structFunc}.
	 * @param ctx the parse tree
	 */
	void exitStructFunc(CmmParser.StructFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#setGetFuncs}.
	 * @param ctx the parse tree
	 */
	void enterSetGetFuncs(CmmParser.SetGetFuncsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#setGetFuncs}.
	 * @param ctx the parse tree
	 */
	void exitSetGetFuncs(CmmParser.SetGetFuncsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#callArgsDef}.
	 * @param ctx the parse tree
	 */
	void enterCallArgsDef(CmmParser.CallArgsDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#callArgsDef}.
	 * @param ctx the parse tree
	 */
	void exitCallArgsDef(CmmParser.CallArgsDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CmmParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CmmParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignStatement(CmmParser.AssignStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignStatement(CmmParser.AssignStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(CmmParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(CmmParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#doWhileStatementScope}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatementScope(CmmParser.DoWhileStatementScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#doWhileStatementScope}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatementScope(CmmParser.DoWhileStatementScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#statementScope}.
	 * @param ctx the parse tree
	 */
	void enterStatementScope(CmmParser.StatementScopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#statementScope}.
	 * @param ctx the parse tree
	 */
	void exitStatementScope(CmmParser.StatementScopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpression(CmmParser.AssignExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#assignExpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpression(CmmParser.AssignExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOrExpression(CmmParser.LogicalOrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOrExpression(CmmParser.LogicalOrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAndExpression(CmmParser.LogicalAndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAndExpression(CmmParser.LogicalAndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpression(CmmParser.ComparisonExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#comparisonExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpression(CmmParser.ComparisonExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void enterPlusMinusExpression(CmmParser.PlusMinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 */
	void exitPlusMinusExpression(CmmParser.PlusMinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyDivideExpression(CmmParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyDivideExpression(CmmParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 */
	void enterRetrieveListExpression(CmmParser.RetrieveListExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 */
	void exitRetrieveListExpression(CmmParser.RetrieveListExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#accessMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterAccessMemberExpression(CmmParser.AccessMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#accessMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitAccessMemberExpression(CmmParser.AccessMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#parantheseExpression}.
	 * @param ctx the parse tree
	 */
	void enterParantheseExpression(CmmParser.ParantheseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#parantheseExpression}.
	 * @param ctx the parse tree
	 */
	void exitParantheseExpression(CmmParser.ParantheseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void enterCallArgs(CmmParser.CallArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#callArgs}.
	 * @param ctx the parse tree
	 */
	void exitCallArgs(CmmParser.CallArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpression(CmmParser.ValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpression(CmmParser.ValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CmmParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CmmParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void enterBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 */
	void exitBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CmmParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CmmParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 */
	void enterListType(CmmParser.ListTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 */
	void exitListType(CmmParser.ListTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CmmParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CmmParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void enterFptrType(CmmParser.FptrTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 */
	void exitFptrType(CmmParser.FptrTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(CmmParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(CmmParser.StructTypeContext ctx);
}