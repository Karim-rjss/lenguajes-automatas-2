// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// if (edad > 17)

grammar Expr;

root : expr EOF;

expr : IF PAR_IZQ ID MAY NUM PAR_DER;
    
//expr EOF;
IF : 'if';
PAR_IZQ : '(';
PAR_DER : ')';
ID : [a-zA-Z][a-zA-Z0-9_]*;
MAY : '>';
NUM : [0-9]+;

WS : [ \t\r\n]+ -> skip;

