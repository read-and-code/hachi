package corgi.lang.bytecode.generators

import corgi.lang.domain.`class`.Function
import corgi.lang.utils.DescriptorFactory
import jdk.internal.org.objectweb.asm.ClassWriter
import jdk.internal.org.objectweb.asm.Opcodes

class MethodGenerator(val classWriter: ClassWriter) {
    fun generate(function: Function) {
        val scope = function.scope
        val functionName = function.name
        val descriptor = DescriptorFactory.getMethodDescriptor(function)
        val statements = function.statements
        val access = Opcodes.ACC_PUBLIC + Opcodes.ACC_STATIC

        val methodVisitor = this.classWriter.visitMethod(access, functionName, descriptor, null, null)
        methodVisitor.visitCode()

        val statementGenerator = StatementGenerator(methodVisitor, scope)
        statements.forEach { it -> it.accept(statementGenerator) }

        methodVisitor.visitInsn(Opcodes.RETURN)
        methodVisitor.visitMaxs(-1, -1)
        methodVisitor.visitEnd()
    }
}