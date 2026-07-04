// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

PUBLIC : 'public';
CLASS : 'class';
STATIC : 'static';
VOID : 'void';
STRING : 'String';
INT : 'int';
CADENA : '"' ~["\r\n]* '"';
NUM : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
IGUAL : '=';
PAR_IZQ : '(';
PAR_DER : ')';
CORCH_IZQ : '[';
CORCH_DER : ']';
LLAVE_IZQ : '{';
LLAVE_DER : '}';
PUNTO_COMA : ';';
MAS : '+';
PUNTO : '.';
WS : [ \t\r\n]+ -> skip;