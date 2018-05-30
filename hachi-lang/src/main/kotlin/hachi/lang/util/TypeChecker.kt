package hachi.lang.util

import hachi.lang.domain.type.BuiltInType
import hachi.lang.domain.type.Type

object TypeChecker {
    fun isInt(type: Type): Boolean {
        return type == BuiltInType.INT
    }

    fun isBoolean(type: Type): Boolean {
        return type == BuiltInType.BOOLEAN
    }

    fun isFloat(type: Type): Boolean {
        return type == BuiltInType.FLOAT
    }

    fun isDouble(type: Type): Boolean {
        return type == BuiltInType.DOUBLE
    }

    fun isString(type: Type): Boolean {
        return type == BuiltInType.STRING
    }
}