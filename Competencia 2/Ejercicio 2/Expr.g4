// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

NUM : [0-9]+;
MEN : '-' ;
WS : [ \t\r\n]+ -> skip;