package hachi.lang.bytecode.generator.expression

import hachi.lang.domain.node.expression.Value
import hachi.lang.util.TypeResolver
import jdk.internal.org.objectweb.asm.MethodVisitor

class ValueExpressionGenerator(private val methodVisitor: MethodVisitor) {
    fun generate(value: Value) {
        val type = value.getType()
        val stringValue = value.value
        val transformedValue = TypeResolver.getValueFromString(stringValue, type)

        this.methodVisitor.visitLdcInsn(transformedValue)
    }
}