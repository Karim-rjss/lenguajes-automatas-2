// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// edad >= 18

grammar Expr;

root : expr EOF;

expr : ID MA_IGUAL NUM;
    
//expr EOF;
ID : [a-zA-Z][a-zA-Z0-9_]*;
MA_IGUAL : '>=';
NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;

