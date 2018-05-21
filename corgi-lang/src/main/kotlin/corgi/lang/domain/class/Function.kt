package corgi.lang.domain.`class`

import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type

class Function(val name: String, val arguments: List<FunctionParameter>, val block: Statement, val returnType: Type)