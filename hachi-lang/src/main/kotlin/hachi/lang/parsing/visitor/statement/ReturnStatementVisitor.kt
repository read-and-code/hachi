package hachi.lang.parsing.visitor.statement

import hachi.antlr.HachiBaseVisitor
import hachi.antlr.HachiParser
import hachi.lang.domain.node.expression.EmptyExpression
import hachi.lang.domain.node.statement.ReturnStatement
import hachi.lang.domain.type.BuiltInType
import hachi.lang.parsing.visitor.expression.ExpressionVisitor

class ReturnStatementVisitor(val expressionVisitor: ExpressionVisitor) : HachiBaseVisitor<ReturnStatement>() {
    override fun visitReturnVoid(returnVoidContext: HachiParser.ReturnVoidContext): ReturnStatement {
        return ReturnStatement(EmptyExpression(BuiltInType.VOID))
    }

    override fun visitReturnWithValue(returnWithValueContext: HachiParser.ReturnWithValueContext): ReturnStatement {
        val expression = returnWithValueContext.accept(this.expressionVisitor)

        return ReturnStatement(expression)
    }
}