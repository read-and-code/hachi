package hachi.lang.domain.statement

import hachi.lang.bytecode.generator.StatementGenerator
import hachi.lang.domain.scope.Scope

class BlockStatement(val scope: Scope, val statements: List<Statement>) : Statement {
    constructor(scope: Scope) : this(scope, emptyList())

    override fun accept(statementGenerator: StatementGenerator) {
        statementGenerator.generate(this)
    }
}