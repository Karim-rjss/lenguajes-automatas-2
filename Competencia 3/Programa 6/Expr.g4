// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// 15 + 3 * 2

grammar Expr;

root : expr EOF;

expr : NUM SUM NUM MUL NUM;
    
//expr EOF;

NUM : [0-9]+;
SUM : '+';
MUL : '*';

WS : [ \t\r\n]+ -> skip;

