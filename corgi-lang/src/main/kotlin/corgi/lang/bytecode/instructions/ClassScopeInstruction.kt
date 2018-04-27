package corgi.lang.bytecode.instructions

import jdk.internal.org.objectweb.asm.MethodVisitor

interface ClassScopeInstruction {
    fun apply(methodVisitor: MethodVisitor)
}