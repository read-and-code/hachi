package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.CompareSign
import hachi.lang.domain.node.expression.ConditionalExpression
import hachi.lang.domain.node.expression.LocalVariableReference
import hachi.lang.domain.node.statement.RangedForStatement
import hachi.lang.domain.scope.LocalVariable
import jdk.internal.org.objectweb.asm.Label
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class ForStatementGenerator(private val methodVisitor: MethodVisitor) {
    fun generate(rangedForStatement: RangedForStatement) {
        val newScope = rangedForStatement.scope
        val statementGenerator = StatementGenerator(this.methodVisitor, newScope)
        val expressionGenerator = ExpressionGenerator(this.methodVisitor, newScope)
        val iterator = rangedForStatement.iteratorVariable
        val incrementSection = Label()
        val decrementSection = Label()
        val endLoopSection = Label()
        val iteratorVariableName = rangedForStatement.iteratorVariableName
        val endExpression = rangedForStatement.endExpression
        val variable = LocalVariable(iteratorVariableName, rangedForStatement.getType())
        val iteratorVariable = LocalVariableReference(variable)
        val iteratorGreaterThanEndCondition = ConditionalExpression(iteratorVariable, endExpression, CompareSign.GREATER_THAN)
        val iteratorLessThanEndCondition = ConditionalExpression(iteratorVariable, endExpression, CompareSign.LESS_THAN)

        iterator.accept(statementGenerator)

        iteratorLessThanEndCondition.accept(expressionGenerator)
        this.methodVisitor.visitJumpInsn(Opcodes.IFNE, incrementSection)

        iteratorGreaterThanEndCondition.accept(expressionGenerator)
        this.methodVisitor.visitJumpInsn(Opcodes.IFNE, decrementSection)

        this.methodVisitor.visitLabel(incrementSection)
        rangedForStatement.statement.accept(statementGenerator)
        this.methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVariableName), 1)
        iteratorGreaterThanEndCondition.accept(expressionGenerator)
        this.methodVisitor.visitJumpInsn(Opcodes.IFEQ, incrementSection)
        this.methodVisitor.visitJumpInsn(Opcodes.GOTO, endLoopSection)

        this.methodVisitor.visitLabel(decrementSection)
        rangedForStatement.statement.accept(statementGenerator)
        this.methodVisitor.visitIincInsn(newScope.getLocalVariableIndex(iteratorVariableName), -1)
        iteratorLessThanEndCondition.accept(expressionGenerator)
        this.methodVisitor.visitJumpInsn(Opcodes.IFEQ, decrementSection)

        this.methodVisitor.visitLabel(endLoopSection)
    }
}