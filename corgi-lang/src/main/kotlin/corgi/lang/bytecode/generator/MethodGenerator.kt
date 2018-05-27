package corgi.lang.bytecode.generator

import corgi.lang.domain.`class`.Function
import corgi.lang.domain.expression.EmptyExpression
import corgi.lang.domain.statement.Block
import corgi.lang.domain.statement.ReturnStatement
import corgi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class MethodGenerator(private val classWriter: ClassWriter) {
    fun generate(function: Function) {
        val functionName = function.getName()
        val descriptor = DescriptorFactory.getMethodDescriptor(function)
        val block = function.block as Block
        val access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC

        val methodVisitor = this.classWriter.visitMethod(access, functionName, descriptor, null, null)
        methodVisitor.visitCode()

        val scope = block.scope
        val statementGenerator = StatementGenerator(methodVisitor, scope)

        block.accept(statementGenerator)

        this.appendReturnIfNotExists(function, block, statementGenerator)

        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }

    private fun appendReturnIfNotExists(function: Function, block: Block, statementGenerator: StatementGenerator) {
        val lastStatement = block.statements.last()

        if (lastStatement !is ReturnStatement) {
            val emptyExpression = EmptyExpression(function.getReturnType())
            val returnStatement = ReturnStatement(emptyExpression)

            returnStatement.accept(statementGenerator)
        }
    }
}