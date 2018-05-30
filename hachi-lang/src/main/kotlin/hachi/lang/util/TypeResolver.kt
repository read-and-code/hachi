package hachi.lang.util

import hachi.antlr.HachiParser
import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.ClassType
import hachi.lang.domain.type.Type

object TypeResolver {
    fun getFromTypeName(typeContext: HachiParser.TypeContext?): Type {
        if (typeContext == null) {
            return BuiltInType.VOID
        }

        val typeName = typeContext.text

        return when (typeName) {
            "java.lang.String" -> BuiltInType.STRING
            else -> this.getBuiltInType(typeName) ?: ClassType(typeName)
        }
    }

    fun getFromValue(value: String): Type {
        if (value.isEmpty()) {
            return BuiltInType.VOID
        } else if (value.toIntOrNull() != null) {
            return BuiltInType.INT
        } else if (value.toFloatOrNull() != null) {
            return BuiltInType.FLOAT
        } else if (value.toDoubleOrNull() != null) {
            return BuiltInType.DOUBLE
        } else if (value.toBoolean()) {
            return BuiltInType.BOOLEAN
        } else {
            return BuiltInType.STRING
        }
    }

    fun getValueFromString(value: String, type: Type): Any {
        if (TypeChecker.isInt(type)) {
            return value.toInt()
        } else if (TypeChecker.isBoolean(type)) {
            return value.toBoolean()
        } else if (TypeChecker.isFloat(type)) {
            return value.toFloat()
        } else if (TypeChecker.isDouble(type)) {
            return value.toDouble()
        } else if (TypeChecker.isString(type)) {
            return value.removePrefix("\"").removeSuffix("\"")
        } else {
            throw UnsupportedOperationException()
        }
    }

    private fun getBuiltInType(typeName: String): BuiltInType? {
        return BuiltInType.values()
                .firstOrNull { it.getName() == typeName }
    }
}