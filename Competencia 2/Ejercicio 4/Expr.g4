// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

COND : 'if';
ID : [a-zA-Z][a-zA-Z0-9_]*;
COM : '>';
NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;