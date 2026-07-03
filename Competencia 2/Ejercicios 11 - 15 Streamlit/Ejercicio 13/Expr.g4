// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

CREATE : 'CREATE';
TABLE : 'TABLE';
INSERT : 'INSERT';
INTO : 'INTO';
VALUES : 'VALUES';
SELECT : 'SELECT';
FROM : 'FROM';
WHERE : 'WHERE';
INNER : 'INNER';
JOIN : 'JOIN';
ON : 'ON';
PRIMARY : 'PRIMARY';
KEY : 'KEY';
NOT : 'NOT';
NULL : 'NULL';
SERIAL : 'SERIAL';
INTEGER : 'INTEGER';
VARCHAR : 'VARCHAR';
DATE : 'DATE';
PRIMARY_KEY : 'PRIMARY' [ \t\r\n]+ 'KEY';    
NOT_NULL : 'NOT' [ \t\r\n]+ 'NULL';
CADENA : '\'' ~['\r\n]* '\'';
NUM : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_]*;
IGUAL : '=';
COMA : ',';
PUNTO_COMA : ';';
PAR_IZQ : '(';
PAR_DER : ')';
MAS : '+';
ASTERISCO : '*';
PUNTO : '.';
WS : [ \t\r\n]+ -> skip;