package hachi.lang.bytecode.generator.statement

import hachi.lang.bytecode.generator.expression.ExpressionGenerator
import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor
import jdk.internal.org.objectweb.asm.Opcodes

class AssignmentStatementGenerator(private val methodVisitor: MethodVisitor, private val expressionGenerator: ExpressionGenerator, private val scope: Scope) {
    fun generate(assignmentStatement: AssignmentStatement) {
        val variableName = assignmentStatement.variableName
        val expression = assignmentStatement.expression
        val type = expression.getType()

        if (this.scope.localVariableExists(variableName)) {
            val index = this.scope.getLocalVariableIndex(variableName)

            this.methodVisitor.visitVarInsn(type.getStoreOpcode(), index)
        } else {
            val field = this.scope.getField(variableName)
            val descriptor = field.getType().getDescriptor()

            this.methodVisitor.visitVarInsn(Opcodes.ALOAD, 0)

            expression.accept(this.expressionGenerator)

            this.methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, field.getOwnerInternalName(), field.getName(), descriptor)
        }
    }
}