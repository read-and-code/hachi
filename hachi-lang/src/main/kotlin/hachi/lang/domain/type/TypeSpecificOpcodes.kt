package hachi.lang.domain.type

import jdk.internal.org.objectweb.asm.Opcodes

enum class TypeSpecificOpcodes(val loadOpcode: Int, val storeOpcode: Int, val returnOpcode: Int, val addOpcode: Int, val subtractOpcode: Int, val multiplyOpcode: Int, val divideOpcode: Int) {
    INT(Opcodes.ILOAD, Opcodes.ISTORE, Opcodes.IRETURN, Opcodes.IADD, Opcodes.ISUB, Opcodes.IMUL, Opcodes.IDIV),
    LONG(Opcodes.LLOAD, Opcodes.LSTORE, Opcodes.LRETURN, Opcodes.LADD, Opcodes.LSUB, Opcodes.LMUL, Opcodes.LDIV),
    FLOAT(Opcodes.FLOAD, Opcodes.FSTORE, Opcodes.FRETURN, Opcodes.FADD, Opcodes.FSUB, Opcodes.FMUL, Opcodes.FDIV),
    DOUBLE(Opcodes.DLOAD, Opcodes.DSTORE, Opcodes.DRETURN, Opcodes.DADD, Opcodes.DSUB, Opcodes.DMUL, Opcodes.DDIV),
    VOID(Opcodes.ALOAD, Opcodes.ASTORE, Opcodes.RETURN, 0, 0, 0, 0),
    OBJECT(Opcodes.ALOAD, Opcodes.ASTORE, Opcodes.ARETURN, 0, 0, 0, 0);
}