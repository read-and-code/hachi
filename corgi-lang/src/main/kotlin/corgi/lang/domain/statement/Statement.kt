package corgi.lang.domain.statement

import corgi.lang.bytecode.generator.StatementGenerator

interface Statement : Node {
    fun accept(statementGenerator: StatementGenerator)
}