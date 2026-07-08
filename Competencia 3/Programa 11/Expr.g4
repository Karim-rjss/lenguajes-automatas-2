// Nombre: Gadiel Karim Rios Rojas
// No. Control: 22030161

// public class Main {
//     public static void main(String[] args) {
//         int numero1 = 15;
//         int numero2 = 3;

//         int resultado = numero1 + numero2;

//         System.out.println("El resultado es: " + resultado);
//     }
// }

grammar Expr;

root : expr EOF;

expr : PUBLIC CLASS ID LLAVE_IZQ
PUBLIC STATIC VOID ID PAR_IZQ STRING CORCH_IZQ CORCH_DER ID PAR_DER LLAVE_IZQ
INT ID IGUAL NUM PUNTO_COMA
INT ID IGUAL NUM PUNTO_COMA
INT ID IGUAL ID MAS ID PUNTO_COMA
ID PUNTO ID PUNTO ID PAR_IZQ CADENA MAS ID PAR_DER PUNTO_COMA
LLAVE_DER
LLAVE_DER;

//expr EOF;
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