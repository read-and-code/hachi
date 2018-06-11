package hachi.lang.domain.node.statement

import hachi.lang.bytecode.generator.statement.StatementGenerator
import hachi.lang.domain.node.Node

interface Statement : Node {
    fun accept(statementGenerator: StatementGenerator)
}