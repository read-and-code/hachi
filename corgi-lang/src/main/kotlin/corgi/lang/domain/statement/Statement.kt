package corgi.lang.domain.statement

import corgi.lang.bytecode.generators.StatementGenerator

interface Statement : Node {
    fun accept(statementGenerator: StatementGenerator)
}