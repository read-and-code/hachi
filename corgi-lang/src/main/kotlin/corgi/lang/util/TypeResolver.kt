package corgi.lang.util

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

        return when (typeName) {
            "java.lang.String" -> BuiltInType.STRING
            else -> this.getBuiltInType(typeName) ?: ClassType(typeName)
        }
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
                .firstOrNull { it.getName() == typeName }
    }
}