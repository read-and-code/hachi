package hachi.lang.bytecode.generator

import hachi.lang.domain.`class`.Function
import hachi.lang.domain.expression.EmptyExpression
import hachi.lang.domain.statement.BlockStatement
import hachi.lang.domain.statement.ReturnStatement
import hachi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class MethodGenerator(private val classWriter: ClassWriter) {
    fun generate(function: Function) {
        val functionName = function.getName()
        val descriptor = DescriptorFactory.getMethodDescriptor(function)
        val functionBody = function.functionBody as BlockStatement
        val access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC

        val methodVisitor = this.classWriter.visitMethod(access, functionName, descriptor, null, null)
        methodVisitor.visitCode()

        val scope = functionBody.scope
        val statementGenerator = StatementGenerator(methodVisitor, scope)

        functionBody.accept(statementGenerator)

        this.appendReturnIfNotExists(function, functionBody, statementGenerator)

        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }

    private fun appendReturnIfNotExists(function: Function, functionBody: BlockStatement, statementGenerator: StatementGenerator) {
        if (functionBody.statements.isEmpty()) {
            return
        }

        val lastStatement = functionBody.statements.last()

        if (lastStatement !is ReturnStatement) {
            val emptyExpression = EmptyExpression(function.getReturnType())
            val returnStatement = ReturnStatement(emptyExpression)

            returnStatement.accept(statementGenerator)
        }
    }
}