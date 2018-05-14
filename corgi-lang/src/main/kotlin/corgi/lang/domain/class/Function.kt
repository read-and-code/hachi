package corgi.lang.domain.`class`

import corgi.lang.domain.expressions.FunctionParameter
import corgi.lang.domain.scope.Scope
import corgi.lang.domain.statement.Statement
import corgi.lang.domain.type.Type

class Function(val name: String, val arguments: List<FunctionParameter>, val statements: Collection<Statement>, val returnType: Type, val scope: Scope)