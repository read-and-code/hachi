grammar Corgi;

@header {
    package corgi.antlr;
}

// RULES
compilationUnit : classDeclaration EOF;
classDeclaration : className '{' classBody '}';
className : ID;
classBody : function*;
function : functionDeclaration block;
functionDeclaration : (type)? functionName '('? (functionParameter (',' functionParameter)*)? ')'?;
functionName : ID;
functionParameter : type ID functionParameterDefaultValue?;
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
block: '{' statement* '}';
statement : block
            | variableDeclaration
            | printStatement
            | functionCall
            | returnStatement
            | ifStatement;
variableDeclaration : VARIABLE name EQUALS expression;
printStatement : PRINT '('expression')';
functionCall : functionName '('expressionList')';
returnStatement: 'return' #returnVoid
            | ('return')? expression #returnWithValue;
ifStatement: 'if' ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;
name : ID;
expressionList : expression? (',' expression)*;
expression : variableReference #variableReferenceLabel
           | value #valueLabel
           | functionCall #functionCallLabel
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
variableReference : ID;
value : NUMBER
      | STRING;

// TOKENS
VARIABLE : 'var';
PRINT : 'print';
EQUALS : '=';
NUMBER : [0-9]+;
STRING : '"'~('\r' | '\n' | '"')*'"';
ID : [a-zA-Z0-9]+;
QUALIFIED_NAME : ID ('.' ID)+;
WHITE_SPACE: [ \t\n\r]+ -> skip;