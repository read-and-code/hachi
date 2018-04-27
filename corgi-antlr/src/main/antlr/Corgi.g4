grammar Corgi;

@header {
    package corgi.antlr;
}

// RULES
compilationUnit : classDeclaration EOF;
classDeclaration : className '{' classBody '}';
className : ID;
classBody : ( variable | print )*;
variable : VARIABLE ID EQUALS value;
print : PRINT ID;
value : op=NUMBER
      | op=STRING;

// TOKENS
VARIABLE : 'var';
PRINT : 'print';
EQUALS : '=';
NUMBER : [0-9]+;
STRING : '"'.*?'"';
ID : [a-zA-Z0-9]+;
WHITE_SPACE: [ \t\n\r]+ -> skip;