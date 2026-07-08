// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

grammar Expr;

root : expr EOF;

expr : expr MAS expr | NUM;

//expr EOF;

MAS : '+';
NUM : [0-9]+;
WS : [ \t\r\n]+ -> skip;

