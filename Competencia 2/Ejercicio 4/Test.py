from antlr4 import *
from ExprLexer import ExprLexer
import sys

#leer archivos
input_stream = FileStream(sys.argv[1])
lexer = ExprLexer(input_stream)

#por terminal
#lexer = ExprLexer(InputStream(input("? ")))


tokens = CommonTokenStream(lexer)
tokens.fill()

for token in tokens.tokens:
    print("Texto:", token.text)
    print("Línea:", token.line)
    print("Columna:", token.column)

    nombre_token = lexer.symbolicNames[token.type]
    print("Tipo:", nombre_token)

    print("-------------------------------")