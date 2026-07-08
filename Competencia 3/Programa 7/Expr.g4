// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// int total = 100

grammar Expr;

root : expr EOF;

expr : INT ID IGUAL NUM;
    
//expr EOF;
INT : 'int';
ID : [a-zA-Z][a-zA-Z0-9_]*;
IGUAL : '=';
NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;

