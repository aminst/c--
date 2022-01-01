// Generated from /home/fateme/fatemes/1400/compiler/ca/c--/src/main/grammar/Cmm.g4 by ANTLR 4.9.2
package main.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CmmParser#cmm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmm(CmmParser.CmmContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(CmmParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#mainStatementScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatementScope(CmmParser.MainStatementScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(CmmParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#struct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(CmmParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructScope(CmmParser.StructScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructFunc(CmmParser.StructFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#setGetStatementScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetGetStatementScope(CmmParser.SetGetStatementScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#setGetFuncs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetGetFuncs(CmmParser.SetGetFuncsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#callArgsDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgsDef(CmmParser.CallArgsDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(CmmParser.FuncArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(CmmParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignStatement(CmmParser.AssignStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(CmmParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(CmmParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(CmmParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(CmmParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#doWhileStatementScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatementScope(CmmParser.DoWhileStatementScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#displayStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStatement(CmmParser.DisplayStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#sizeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSizeStatement(CmmParser.SizeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#appendStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppendStatement(CmmParser.AppendStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#functionCallStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(CmmParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#statementScope}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementScope(CmmParser.StatementScopeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#oneLineStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneLineStatement(CmmParser.OneLineStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#assignExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpression(CmmParser.AssignExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#logicalOrExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOrExpression(CmmParser.LogicalOrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#logicalAndExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalAndExpression(CmmParser.LogicalAndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#equalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualExpression(CmmParser.EqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#comparisonExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpression(CmmParser.ComparisonExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#plusMinusExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusMinusExpression(CmmParser.PlusMinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#multiplyDivideExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyDivideExpression(CmmParser.MultiplyDivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#unaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpression(CmmParser.UnaryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#retrieveListExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetrieveListExpression(CmmParser.RetrieveListExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#accessMemberExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccessMemberExpression(CmmParser.AccessMemberExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#parantheseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantheseExpression(CmmParser.ParantheseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#callArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArgs(CmmParser.CallArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(CmmParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(CmmParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#oneLineVarDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneLineVarDeclaration(CmmParser.OneLineVarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#varDecName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDecName(CmmParser.VarDecNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(CmmParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#boolValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolValue(CmmParser.BoolValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(CmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#listType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListType(CmmParser.ListTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CmmParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#fptrType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFptrType(CmmParser.FptrTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CmmParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(CmmParser.StructTypeContext ctx);
}