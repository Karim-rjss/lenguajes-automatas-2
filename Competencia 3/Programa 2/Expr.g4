// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

grammar Expr;

root : expr EOF;

//expr : expr MIN expr | NUM;
expr : NUM MIN NUM;

//expr EOF;

MIN : '-';
NUM : [0-9]+;
WS : [ \t\r\n]+ -> skip;

