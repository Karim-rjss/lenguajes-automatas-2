// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

UPDATE : 'UPDATE' ;
SET : 'SET' ;
WHERE : 'WHERE' ;
COMA : ',' ;
NUM : [0-9]+ ;
CADENA : '\'' ~['\r\n]* '\'';
PUNTO_COMA : ';' ;
IGUAL : '=' ;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
WS : [ \t\r\n]+->skip;