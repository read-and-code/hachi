package hachi.lang.domain.scope

import hachi.lang.domain.type.Type

interface Variable {
    fun getType(): Type

    fun getName(): String
}