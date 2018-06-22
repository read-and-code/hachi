grammar Hachi;

@header {
    package hachi.antlr;
}

// RULES
compilationUnit: classDeclaration EOF;
classDeclaration: 'class' className '{' classBody '}';
className: qualifiedName;
classBody: field* constructor* function*;
constructor: constructorDeclaration functionBody;
field: type name;
function: functionDeclaration functionBody;
functionDeclaration: (type)? functionName '('? functionParameterList? ')'?;
constructorDeclaration: 'constructor' '('? functionParameterList? ')'?;
functionName: ID;
functionParameterList: functionParameter (',' functionParameter)*
          |  functionParameter (',' functionParameterWithDefaultValue)*
          |  functionParameterWithDefaultValue (',' functionParameterWithDefaultValue)*;
functionParameter: type ID;
functionParameterWithDefaultValue: type ID '=' defaultValue=expression;
functionBody: blockStatement;
type: primitiveType | classType;
primitiveType: 'boolean' ('[' ']')*
              | 'string' ('[' ']')*
              | 'char' ('[' ']')*
              | 'byte' ('[' ']')*
              | 'short' ('[' ']')*
              | 'int' ('[' ']')*
              | 'long' ('[' ']')*
              | 'float' ('[' ']')*
              | 'double' ('[' ']')*
              | 'void' ('[' ']')*;
classType: qualifiedName ('[' ']')*;
statement: blockStatement
            | variableDeclaration
            | assignmentStatement
            | printStatement
            | forStatement
            | returnStatement
            | ifStatement
            | expression;
blockStatement: '{' statement* '}';
variableDeclaration: VARIABLE name EQUALS expression;
assignmentStatement: name EQUALS expression;
printStatement: PRINT '('expression')';
forStatement: 'for' ('(')? forCondition (')')? statement;
forCondition: iterator=variableReference 'from' startExpression=expression range='to' endExpression=expression;
returnStatement: 'return' expression #returnWithValue
            | 'return' #returnVoid;
ifStatement: 'if' ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;
name: ID;
functionArgument: expression;
functionArgumentList: functionArgument? (',' functionArgument)* #unnamedFunctionArgumentList
            | namedFunctionArgument? (',' namedFunctionArgument)* #namedFunctionArgumentList;
namedFunctionArgument: name '->' expression;
expression: variableReference #variableReferenceLabel
           | owner=expression '.' functionName '(' functionArgumentList ')' #functionCall
           | functionName '(' functionArgumentList ')' #functionCall
           | superCall='super' '('functionArgumentList ')' #supercall
           | newCall='new' className '('functionArgumentList ')' #constructorCall
           | value #valueLabel
           | '('expression '*' expression')' #multiply
           | expression '*' expression #multiply
           | '(' expression '/' expression ')' #divide
           | expression '/' expression #divide
           | '(' expression '+' expression ')' #add
           | expression '+' expression #add
           | '(' expression '-' expression ')' #subtract
           | expression '-' expression #subtract
           | expression cmp='>' expression #conditionalExpression
           | expression cmp='<' expression #conditionalExpression
           | expression cmp='==' expression #conditionalExpression
           | expression cmp='!=' expression #conditionalExpression
           | expression cmp='>=' expression #conditionalExpression
           | expression cmp='<=' expression #conditionalExpression;
variableReference: ID;
value: NUMBER
      | STRING
      | BOOLEAN;
qualifiedName: ID ('.' ID)*;

// TOKENS
VARIABLE: 'var';
PRINT: 'print';
EQUALS: '=';
NUMBER: '-'?[0-9.]+;
STRING: '"'~('\r' | '\n' | '"')*'"';
BOOLEAN: 'true' | 'false';
ID: [a-zA-Z0-9]+;
WHITE_SPACE: [ \t\n\r]+ -> skip;