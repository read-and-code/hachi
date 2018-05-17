grammar Corgi;

@header {
    package corgi.antlr;
}

// RULES
compilationUnit : classDeclaration EOF;
classDeclaration : className '{' classBody '}';
className : ID;
classBody : function*;
function : functionDeclaration '{' (blockStatement)* '}';
functionDeclaration : (type)? functionName '('(functionArgument)*')';
functionName : ID;
functionArgument : type ID functionParameterDefaultValue?;
functionParameterDefaultValue : '=' expression;
type : primitiveType | classType;
primitiveType : 'boolean' ('[' ']')*
              | 'string' ('[' ']')*
              | 'char' ('[' ']')*
              | 'byte' ('[' ']')*
              | 'short' ('[' ']')*
              | 'int' ('[' ']')*
              | 'long' ('[' ']')*
              | 'float' ('[' ']')*
              | 'double' ('[' ']')*
              | 'void' ('[' ']')*;
classType : QUALIFIED_NAME ('[' ']')*;
blockStatement : variableDeclaration
               | printStatement
               | functionCall;
variableDeclaration : VARIABLE name EQUALS expression;
printStatement : PRINT expression;
functionCall : functionName '('expressionList ')';
name : ID;
expressionList : expression (',' expression)*;
expression : variableReference #variableReference1
           | value #value1
           | functionCall #functionCall1
           | '('expression '*' expression')' #Multiply
           | expression '*' expression #Multiply
           | '(' expression '/' expression ')' #Divide
           | expression '/' expression #Divide
           | '(' expression '+' expression ')' #Add
           | expression '+' expression #Add
           | '(' expression '-' expression ')' #Subtract
           | expression '-' expression #Subtract;
variableReference : ID;
value : op=NUMBER
      | op=STRING;

// TOKENS
VARIABLE : 'var';
PRINT : 'print';
EQUALS : '=';
NUMBER : [0-9]+;
STRING : '"'.*?'"';
ID : [a-zA-Z0-9]+;
QUALIFIED_NAME : ID ('.' ID)+;
WHITE_SPACE: [ \t\n\r]+ -> skip;