package corgi.lang.bytecode.instructions

import jdk.internal.org.objectweb.asm.MethodVisitor

interface Instruction {
    fun apply(methodVisitor: MethodVisitor)
}