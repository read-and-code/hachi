package corgi.lang.domain.scope

import corgi.lang.domain.expression.FunctionParameter
import corgi.lang.domain.type.Type

class FunctionSignature(val functionName: String, val arguments: List<FunctionParameter>, val returnType: Type)