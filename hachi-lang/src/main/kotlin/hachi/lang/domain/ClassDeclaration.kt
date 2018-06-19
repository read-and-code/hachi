package hachi.lang.domain

import hachi.lang.domain.scope.Field

class ClassDeclaration(val name: String, val fields: List<Field>, val methods: List<Function>)