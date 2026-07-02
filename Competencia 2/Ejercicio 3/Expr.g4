// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

ID : [a-zA-Z][a-zA-Z0-9_]*;
IGUAL : '=';
NUM : [0-9]+;
WS : [ \t\r\n]+ -> skip;