package hachi.lang.bytecode.generator.statement

import hachi.lang.domain.node.statement.AssignmentStatement
import hachi.lang.domain.scope.Scope
import jdk.internal.org.objectweb.asm.MethodVisitor

class AssignmentStatementGenerator(val methodVisitor: MethodVisitor, val scope: Scope) {
    fun generate(assignmentStatement: AssignmentStatement) {
        val variableName = assignmentStatement.variableName
        val type = assignmentStatement.expression.getType()
        val index = this.scope.getLocalVariableIndex(variableName)

        this.methodVisitor.visitVarInsn(type.getStoreOpcode(), index)
    }
}