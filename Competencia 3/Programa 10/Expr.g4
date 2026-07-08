// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// print("Wenn ich das als Erste verstehe, übersetze und dem Lehrer vorlese, verdiene ich 10 Extrapunkte, zusätzlich zur Abgabe meiner Regeln und meiner Token-Tabelle.");

grammar Expr;

root : expr EOF;

expr : PRINT PAR_IZQ CADENA PAR_DER PUNTO_COMA;
    
//expr EOF;
PRINT : 'print';
CADENA : '"' ~["\r\n]* '"';
PAR_IZQ : '(';
PAR_DER : ')';
PUNTO_COMA : ';';

WS : [ \t\r\n]+ -> skip;

