// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// if x > 10

grammar Expr;

root : expr EOF;

//expr : expr MIN expr | NUM;
expr : IF ID COM NUM;
    
//expr EOF;

IF : 'if';
ID : [a-zA-Z][a-zA-Z0-9_]*;
COM : '>';
NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;