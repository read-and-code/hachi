package corgi.lang.bytecode.generator

import corgi.lang.domain.`class`.Function
import corgi.lang.domain.expression.EmptyExpression
import corgi.lang.domain.statement.BlockStatement
import corgi.lang.domain.statement.ReturnStatement
import corgi.lang.util.DescriptorFactory
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
        val lastStatement = functionBody.statements.last()

        if (lastStatement !is ReturnStatement) {
            val emptyExpression = EmptyExpression(function.getReturnType())
            val returnStatement = ReturnStatement(emptyExpression)

            returnStatement.accept(statementGenerator)
        }
    }
}