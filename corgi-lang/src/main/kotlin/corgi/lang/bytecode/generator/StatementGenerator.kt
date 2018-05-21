package corgi.lang.bytecode.generator

import corgi.lang.domain.expression.FunctionCall
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.Block
import corgi.lang.domain.statement.PrintStatement
import corgi.lang.domain.statement.ReturnStatement
import corgi.lang.domain.statement.VariableDeclarationStatement
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.ClassType
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class StatementGenerator(private val methodVisitor: MethodVisitor, val scope: Scope) {
    private val expressionGenerator = ExpressionGenerator(methodVisitor, scope)

    fun generate(printStatement: PrintStatement) {
        this.methodVisitor.visitFieldInsn(Opcodes.GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;")

        val expression = printStatement.expression
        expression.accept(expressionGenerator)

        val type = expression.type
        val descriptor = "(" + type.getDescriptor() + ")V"
        val owner = ClassType("java.io.PrintStream")
        val fieldDescriptor = owner.getDescriptor()

        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, fieldDescriptor, "println", descriptor, false)
    }

    fun generate(variableDeclarationStatement: VariableDeclarationStatement) {
        val expression = variableDeclarationStatement.expression
        val name = variableDeclarationStatement.name
        val index = this.scope.getLocalVariableIndex(name)
        val type = expression.type

        expression.accept(this.expressionGenerator)

        when (type) {
            BuiltInType.INT -> this.methodVisitor.visitVarInsn(Opcodes.ISTORE, index)
            else -> this.methodVisitor.visitVarInsn(Opcodes.ASTORE, index)
        }
    }

    fun generate(functionCall: FunctionCall) {
        functionCall.accept(this.expressionGenerator)
    }

    fun generate(returnStatement: ReturnStatement) {
        val expression = returnStatement.expression

        expression.accept(this.expressionGenerator)

        when (expression.type) {
            BuiltInType.VOID -> this.methodVisitor.visitInsn(Opcodes.RETURN)
            BuiltInType.INT -> this.methodVisitor.visitInsn(Opcodes.IRETURN)
        }
    }

    fun generate(block: Block) {
        val scope = block.scope
        val statements = block.statements
        val statementGenerator = StatementGenerator(this.methodVisitor, scope)

        statements.forEach { it.accept(statementGenerator) }
    }
}