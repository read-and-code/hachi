package hachi.lang.util

import hachi.antlr.HachiParser
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type

object TypeResolver {
    fun getFromTypeContext(typeContext: HachiParser.TypeContext?): Type {
        return when (typeContext) {
            null -> BuiltInType.VOID
            else -> this.getFromTypeName(typeContext.text)
        }
    }

    fun getFromTypeName(typeName: String): Type {
        return when (typeName) {
            "java.lang.String" -> BuiltInType.STRING
            else -> this.getBuiltInType(typeName) ?: ClassType(typeName)
        }
    }

    fun getFromValue(value: String): Type {
        return if (value.isEmpty()) {
            BuiltInType.VOID
        } else if (value.toIntOrNull() != null) {
            BuiltInType.INT
        } else if (value.toFloatOrNull() != null) {
            BuiltInType.FLOAT
        } else if (value.toDoubleOrNull() != null) {
            BuiltInType.DOUBLE
        } else if (value.toBoolean()) {
            BuiltInType.BOOLEAN
        } else {
            BuiltInType.STRING
        }
    }

    fun getValueFromString(value: String, type: Type): Any {
        return if (TypeChecker.isInt(type)) {
            value.toInt()
        } else if (TypeChecker.isBoolean(type)) {
            value.toBoolean()
        } else if (TypeChecker.isFloat(type)) {
            value.toFloat()
        } else if (TypeChecker.isDouble(type)) {
            value.toDouble()
        } else if (TypeChecker.isString(type)) {
            value.removePrefix("\"").removeSuffix("\"")
        } else {
            throw UnsupportedOperationException()
        }
    }

    private fun getBuiltInType(typeName: String): BuiltInType? {
        return BuiltInType.values()
                .firstOrNull { it.getName() == typeName }
    }
}