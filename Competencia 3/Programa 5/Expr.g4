// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// print "Hola"

grammar Expr;

root : expr EOF;

expr : PRINT CADENA;
    
//expr EOF;
PRINT : 'print';
CADENA : '"' ~["\r\n]* '"';

WS : [ \t\r\n]+ -> skip;

