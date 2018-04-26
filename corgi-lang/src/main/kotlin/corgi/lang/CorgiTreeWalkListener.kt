package corgi.lang

import corgi.antlr.CorgiBaseListener
import corgi.antlr.CorgiParser
import corgi.lang.bytecode.Instruction
import corgi.lang.bytecode.PrintVariable
import corgi.lang.bytecode.VariableDeclaration
import org.antlr.v4.runtime.tree.TerminalNode
import java.util.*
import kotlin.collections.HashMap

class CorgiTreeWalkListener : CorgiBaseListener() {
    val instructions = ArrayDeque<Instruction>()

    val variables = HashMap<String, Variable>()

    override fun exitVariable(variableContext: CorgiParser.VariableContext) {
        val variableName = variableContext.ID()
        val valueContext = variableContext.value()
        val variableType = valueContext.start.type
        val variableText = valueContext.text
        val variableIndex = this.variables.size
        val variable = Variable(variableIndex, variableType, variableText)

        this.variables[variableName.text] = variable
        this.instructions.add(VariableDeclaration(variable))
        this.logVariableDeclarationStatementFound(variableName, valueContext)
    }

    override fun exitPrint(printContext: CorgiParser.PrintContext) {
        val variableName = printContext.ID()
        val isPrintedVariableDeclared = this.variables.containsKey(variableName.text)

        when (isPrintedVariableDeclared) {
            true -> {
                val variable = this.variables[variableName.text]

                this.instructions.add(PrintVariable(variable!!))
                this.logPrintStatementFound(variableName, variable)
            }
            false -> {
                val message = "ERROR: WTF? You are trying to print var '%s' which has not been declared!!!."

                println(message.format(variableName.text))
            }
        }
    }

    private fun logVariableDeclarationStatementFound(variableName: TerminalNode, valueContext: CorgiParser.ValueContext) {
        val line = variableName.symbol.line
        val message = "OK: You declared variable named '%s' with value of '%s' at line '%s'."

        println(message.format(variableName, valueContext.text, line))
    }

    private fun logPrintStatementFound(variableName: TerminalNode, variable: Variable) {
        val line = variableName.symbol.line
        val message = "OK: You instructed to print variable '%s' which has value of '%s' at line '%s'."

        println(message.format(variable.id, variable.value, line))
    }
}