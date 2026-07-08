// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// x = 10

grammar Expr;

root : expr EOF;

//expr : expr MIN expr | NUM;
expr : ID IGUAL NUM;
    
//expr EOF;

ID : [a-zA-Z_][a-zA-Z0-9_]*;
NUM : [0-9]+;
IGUAL : '=';
WS : [ \t\r\n]+ -> skip;

