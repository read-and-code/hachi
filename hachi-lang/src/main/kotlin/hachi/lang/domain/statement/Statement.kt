package hachi.lang.domain.statement

import hachi.lang.bytecode.generator.StatementGenerator

interface Statement : Node {
    fun accept(statementGenerator: StatementGenerator)
}