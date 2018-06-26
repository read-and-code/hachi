grammar Hachi;

@header {
    package hachi.antlr;
}

// RULES
compilationUnit: classDeclaration EOF;
classDeclaration: 'class' className '{' classBody '}';
className: qualifiedName;
classBody: field* constructor* function*;
field: type name;
constructor: constructorDeclaration functionBody;
constructorDeclaration: 'constructor' '('? functionParameterList? ')'?;
function: functionDeclaration functionBody;
functionDeclaration: (type)? functionName '('? functionParameterList? ')'?;
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
statement: variableDeclaration
            | assignmentStatement
            | forStatement
            | ifStatement
            | returnStatement
            | printStatement
            | blockStatement
            | expression;
variableDeclaration: VARIABLE name EQUALS expression;
assignmentStatement: name EQUALS expression;
forStatement: 'for' ('(')? forCondition (')')? statement;
forCondition: iterator=variableReference 'from' startExpression=expression range='to' endExpression=expression;
ifStatement: 'if' ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;
returnStatement: 'return' expression #returnWithValue
            | 'return' #returnVoid;
printStatement: PRINT '('expression')';
blockStatement: '{' statement* '}';
name: ID;
functionArgument: expression;
functionArgumentList: functionArgument? (',' functionArgument)* #unnamedFunctionArgumentList
            | namedFunctionArgument? (',' namedFunctionArgument)* #namedFunctionArgumentList;
namedFunctionArgument: name '->' expression;
expression: value #valueLabel
           | variableReference #variableReferenceLabel
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
           | expression cmp='<=' expression #conditionalExpression
           | owner=expression '.' functionName '(' functionArgumentList ')' #functionCall
           | functionName '(' functionArgumentList ')' #functionCall
           | superCall='super' '('functionArgumentList ')' #supercall
           | newCall='new' className '('functionArgumentList ')' #constructorCall;
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