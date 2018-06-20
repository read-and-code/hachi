package hachi.lang.domain

import jdk.internal.org.objectweb.asm.Opcodes

enum class CompareSign(private val sign: String, val opcode: Int) {
    EQUAL("==", Opcodes.IFEQ),
    NOT_EQUAL("!=", Opcodes.IFNE),
    LESS_THAN("<", Opcodes.IFLT),
    GREATER_THAN(">", Opcodes.IFGT),
    LESS_THAN_OR_EQUAL("<=", Opcodes.IFLE),
    GREATER_THAN_OR_EQUAL(">=", Opcodes.IFGE);

    companion object {
        fun fromString(sign: String): CompareSign {
            return values().first { it.sign == sign }
        }
    }
}