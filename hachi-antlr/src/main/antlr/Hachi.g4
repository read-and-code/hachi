grammar Hachi;

@header {
    package hachi.antlr;
}

// RULES
compilationUnit : classDeclaration EOF;
classDeclaration : 'class' className '{' classBody '}';
className : ID;
classBody : function*;
function : functionDeclaration functionBody;
functionDeclaration : (type)? functionName '('? (functionParameter (',' functionParameter)*)? ')'?;
functionName : ID;
functionParameter : type ID functionParameterDefaultValue?;
functionParameterDefaultValue : '=' expression;
functionBody : blockStatement;
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
statement : blockStatement
            | variableDeclaration
            | printStatement
            | forStatement
            | returnStatement
            | ifStatement
            | expression;
blockStatement : '{' statement* '}';
variableDeclaration : VARIABLE name EQUALS expression;
printStatement : PRINT '('expression')';
returnStatement: 'return' #returnVoid
            | 'return' expression #returnWithValue;
ifStatement: 'if' ('(')? expression (')')? trueStatement=statement ('else' falseStatement=statement)?;
forStatement : 'for' ('(')? forCondition (')')? statement;
forCondition : iterator=variableReference 'from' startExpression=expression range='to' endExpression=expression;
name : ID;
argument: expression | name '->' expression;
expression : variableReference #variableReferenceLabel
           | owner=expression '.' functionName '('argument? (',' argument)* ')' #functionCall
           | functionName '('argument? (',' argument)* ')' #functionCall
           | superCall='super' '('argument? (',' argument)* ')' #supercall
           | newCall='new' className '('argument? (',' argument)* ')' #constructorCall
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
variableReference : ID;
value : NUMBER
      | STRING
      | BOOLEAN;

// TOKENS
VARIABLE : 'var';
PRINT : 'print';
EQUALS : '=';
NUMBER : '-'?[0-9.]+;
STRING : '"'~('\r' | '\n' | '"')*'"';
BOOLEAN : 'true' | 'false';
ID : [a-zA-Z0-9]+;
QUALIFIED_NAME : ID ('.' ID)+;
WHITE_SPACE: [ \t\n\r]+ -> skip;