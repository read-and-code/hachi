package corgi.lang.utils

import corgi.antlr.CorgiParser
import corgi.lang.domain.type.BuiltInType
import corgi.lang.domain.type.ClassType
import corgi.lang.domain.type.Type

object TypeResolver {
    fun getFromTypeName(typeContext: CorgiParser.TypeContext?): Type {
        if (typeContext == null) {
            return BuiltInType.VOID
        }

        val typeName = typeContext.text

        if (typeName == "java.lang.String") {
            return BuiltInType.STRING
        }

        val builtInType = this.getBuiltInType(typeName)

        if (builtInType != null) {
            return builtInType
        }

        return ClassType(typeName)
    }

    fun getFromValue(value: String): Type {
        if (value.isEmpty()) {
            return BuiltInType.VOID
        }

        val intValue = value.toIntOrNull()

        if (intValue != null) {
            return BuiltInType.INT
        }

        return BuiltInType.STRING
    }

    private fun getBuiltInType(typeName: String): BuiltInType? {
        return BuiltInType.values()
                .filter { it -> it.getName() == typeName }
                .firstOrNull()
    }
}