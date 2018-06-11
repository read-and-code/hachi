package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.expression.ConditionalExpression
import hachi.lang.domain.node.expression.ConstructorCall
import hachi.lang.domain.node.expression.EmptyExpression
import hachi.lang.domain.node.expression.FunctionCall
import hachi.lang.domain.node.expression.FunctionParameter
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.node.expression.Value
import hachi.lang.domain.node.expression.VariableReference
import hachi.lang.domain.node.expression.arithmetic.Addition
import hachi.lang.domain.node.expression.arithmetic.Division
import hachi.lang.domain.node.expression.arithmetic.Multiplication
import hachi.lang.domain.node.expression.arithmetic.Subtraction
import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.domain.node.statement.BlockStatement
import hachi.lang.domain.node.statement.IfStatement
import hachi.lang.domain.node.statement.PrintStatement
import hachi.lang.domain.node.statement.RangedForStatement
import hachi.lang.domain.node.statement.ReturnStatement
import hachi.lang.domain.node.statement.VariableDeclarationStatement
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor

class StatementGenerator(private val methodVisitor: MethodVisitor, val scope: Scope) {
    private val expressionGenerator = ExpressionGenerator(methodVisitor, scope)

    private val printStatementGenerator = PrintStatementGenerator(this.expressionGenerator, this.methodVisitor)

    private val variableDeclarationStatementGenerator = VariableDeclarationStatementGenerator(this, this.expressionGenerator)

    private val forStatementGenerator = ForStatementGenerator(this.methodVisitor)

    private val blockStatementGenerator = BlockStatementGenerator(this.methodVisitor)

    private val ifStatementGenerator = IfStatementGenerator(this, this.expressionGenerator, this.methodVisitor)

    private val returnStatementGenerator = ReturnStatementGenerator(this.expressionGenerator, this.methodVisitor)

    private val assignmentStatementGenerator = AssignmentStatementGenerator(this.methodVisitor, this.scope)

    fun generate(printStatement: PrintStatement) {
        this.printStatementGenerator.generate(printStatement)
    }

    fun generate(variableDeclarationStatement: VariableDeclarationStatement) {
        this.variableDeclarationStatementGenerator.generate(variableDeclarationStatement)
    }

    fun generate(returnStatement: ReturnStatement) {
        this.returnStatementGenerator.generate(returnStatement)
    }

    fun generate(ifStatement: IfStatement) {
        this.ifStatementGenerator.generate(ifStatement)
    }

    fun generate(blockStatement: BlockStatement) {
        this.blockStatementGenerator.generate(blockStatement)
    }

    fun generate(rangedForStatement: RangedForStatement) {
        this.forStatementGenerator.generate(rangedForStatement)
    }

    fun generate(assignmentStatement: AssignmentStatement) {
        this.assignmentStatementGenerator.generate(assignmentStatement)
    }

    fun generate(functionCall: FunctionCall) {
        functionCall.accept(this.expressionGenerator)
    }

    fun generate(superCall: SuperCall) {
        this.expressionGenerator.generate(superCall)
    }

    fun generate(constructorCall: ConstructorCall) {
        this.expressionGenerator.generate(constructorCall)
    }

    fun generate(addition: Addition) {
        this.expressionGenerator.generate(addition)
    }

    fun generate(subtraction: Subtraction) {
        this.expressionGenerator.generate(subtraction)
    }

    fun generate(multiplication: Multiplication) {
        this.expressionGenerator.generate(multiplication)
    }

    fun generate(division: Division) {
        this.expressionGenerator.generate(division)
    }

    fun generate(functionParameter: FunctionParameter) {
        this.expressionGenerator.generate(functionParameter)
    }

    fun generate(conditionalExpression: ConditionalExpression) {
        this.expressionGenerator.generate(conditionalExpression)
    }

    fun generate(value: Value) {
        this.expressionGenerator.generate(value)
    }

    fun generate(variableReference: VariableReference) {
        this.expressionGenerator.generate(variableReference)
    }

    fun generate(emptyExpression: EmptyExpression) {
        this.expressionGenerator.generate(emptyExpression)
    }
}