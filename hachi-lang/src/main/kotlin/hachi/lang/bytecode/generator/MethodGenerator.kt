package hachi.lang.bytecode.generator

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.Constructor
import hachi.lang.domain.Function
import hachi.lang.domain.node.expression.EmptyExpression
import hachi.lang.domain.node.expression.SuperCall
import hachi.lang.domain.node.statement.BlockStatement
import hachi.lang.domain.node.statement.ReturnStatement
import hachi.lang.util.DescriptorFactory
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class MethodGenerator(private val classWriter: ClassWriter) {
    fun generate(function: Function) {
        val functionName = function.getName()
        val isMain = functionName == "main"
        val descriptor = DescriptorFactory.getMethodDescriptor(function)
        val functionBody = function.functionBody as BlockStatement
        val access = Opcodes.ACC_PUBLIC + (if (isMain) Opcodes.ACC_STATIC else 0)
        val scope = functionBody.scope

        val methodVisitor = this.classWriter.visitMethod(access, functionName, descriptor, null, null)
        methodVisitor.visitCode()

        val statementGenerator = StatementGenerator(methodVisitor, scope)

        functionBody.accept(statementGenerator)

        this.appendReturnIfNotExists(function, functionBody, statementGenerator)

        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }

    fun generate(constructor: Constructor) {
        val constructorBody = constructor.functionBody as BlockStatement
        val scope = constructorBody.scope
        val access = Opcodes.ACC_PUBLIC
        val descriptor = DescriptorFactory.getMethodDescriptor(constructor)
        val methodVisitor = this.classWriter.visitMethod(access, "<init>", descriptor, null, null)

        methodVisitor.visitCode()

        val statementGenerator = StatementGenerator(methodVisitor, scope)

        SuperCall().accept(statementGenerator)

        constructorBody.accept(statementGenerator)

        this.appendReturnIfNotExists(constructor, constructorBody, statementGenerator)

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