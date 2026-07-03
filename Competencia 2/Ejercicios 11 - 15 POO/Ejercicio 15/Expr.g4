// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161
grammar Expr;

root: expr EOF;

expr: EOF;

NMAP : 'nmap';
SS : 'ss';
SUDO : 'sudo';
TCPDUMP : 'tcpdump';
CURL : 'curl';
DIG : 'dig';
JOURNALCTL : 'journalctl';
GREP : 'grep';
UFW : 'ufw';
DENY : 'deny';
FROM : 'from';
SINCE : '--since';
MX : 'MX';
FLAG : '-' [a-zA-Z]+;
IP : NUM PUNTO NUM PUNTO NUM PUNTO NUM;
CIDR : IP '/' NUM;
RUTA : ('/' [a-zA-Z0-9_.]+)+;
CADENA : '"' ~["\r\n]* '"';
DOMINIO : ID (PUNTO ID)+;
NUM : [0-9]+;
ID : [a-zA-Z_][a-zA-Z0-9_-]*;
PUNTO : '.';
WS : [ \t\r\n]+ -> skip;