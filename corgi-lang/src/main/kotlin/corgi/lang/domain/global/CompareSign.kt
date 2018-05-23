package corgi.lang.domain.global

import jdk.internal.org.objectweb.asm.Opcodes

enum class CompareSign(private val sign: String, val opcode: Int) {
    EQUAL("==", Opcodes.IF_ICMPEQ),
    NOT_EQUAL("!=", Opcodes.IF_ICMPNE),
    LESS_THAN("<", Opcodes.IF_ICMPLT),
    GREATER_THAN(">", Opcodes.IF_ICMPGT),
    LESS_THAN_OR_EQUAL("<=", Opcodes.IF_ICMPLE),
    GREATER_THAN_OR_EQUAL(">=", Opcodes.IF_ICMPGE);

    companion object {
        fun fromString(sign: String): CompareSign {
            return values().first { it.sign == sign }
        }
    }
}