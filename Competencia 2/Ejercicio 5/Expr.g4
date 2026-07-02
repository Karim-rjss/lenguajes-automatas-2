// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

PRINT : 'print';
CADENA : '"' ~["\r\n]* '"';

WS : [ \t\r\n]+ -> skip;