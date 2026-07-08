# Generated from Expr.g4 by ANTLR 4.13.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
import sys
if sys.version_info[1] > 5:
	from typing import TextIO
else:
	from typing.io import TextIO

def serializedATN():
    return [
        4,1,20,54,2,0,7,0,2,1,7,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
        1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,2,0,2,0,0,51,0,4,1,0,0,0,2,
        7,1,0,0,0,4,5,3,2,1,0,5,6,5,0,0,1,6,1,1,0,0,0,7,8,5,1,0,0,8,9,5,
        2,0,0,9,10,5,9,0,0,10,11,5,15,0,0,11,12,5,1,0,0,12,13,5,3,0,0,13,
        14,5,4,0,0,14,15,5,9,0,0,15,16,5,11,0,0,16,17,5,5,0,0,17,18,5,13,
        0,0,18,19,5,14,0,0,19,20,5,9,0,0,20,21,5,12,0,0,21,22,5,15,0,0,22,
        23,5,6,0,0,23,24,5,9,0,0,24,25,5,10,0,0,25,26,5,8,0,0,26,27,5,17,
        0,0,27,28,5,6,0,0,28,29,5,9,0,0,29,30,5,10,0,0,30,31,5,8,0,0,31,
        32,5,17,0,0,32,33,5,6,0,0,33,34,5,9,0,0,34,35,5,10,0,0,35,36,5,9,
        0,0,36,37,5,18,0,0,37,38,5,9,0,0,38,39,5,17,0,0,39,40,5,9,0,0,40,
        41,5,19,0,0,41,42,5,9,0,0,42,43,5,19,0,0,43,44,5,9,0,0,44,45,5,11,
        0,0,45,46,5,7,0,0,46,47,5,18,0,0,47,48,5,9,0,0,48,49,5,12,0,0,49,
        50,5,17,0,0,50,51,5,16,0,0,51,52,5,16,0,0,52,3,1,0,0,0,0
    ]

class ExprParser ( Parser ):

    grammarFileName = "Expr.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'public'", "'class'", "'static'", "'void'", 
                     "'String'", "'int'", "<INVALID>", "<INVALID>", "<INVALID>", 
                     "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "';'", 
                     "'+'", "'.'" ]

    symbolicNames = [ "<INVALID>", "PUBLIC", "CLASS", "STATIC", "VOID", 
                      "STRING", "INT", "CADENA", "NUM", "ID", "IGUAL", "PAR_IZQ", 
                      "PAR_DER", "CORCH_IZQ", "CORCH_DER", "LLAVE_IZQ", 
                      "LLAVE_DER", "PUNTO_COMA", "MAS", "PUNTO", "WS" ]

    RULE_root = 0
    RULE_expr = 1

    ruleNames =  [ "root", "expr" ]

    EOF = Token.EOF
    PUBLIC=1
    CLASS=2
    STATIC=3
    VOID=4
    STRING=5
    INT=6
    CADENA=7
    NUM=8
    ID=9
    IGUAL=10
    PAR_IZQ=11
    PAR_DER=12
    CORCH_IZQ=13
    CORCH_DER=14
    LLAVE_IZQ=15
    LLAVE_DER=16
    PUNTO_COMA=17
    MAS=18
    PUNTO=19
    WS=20

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.13.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None




    class RootContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expr(self):
            return self.getTypedRuleContext(ExprParser.ExprContext,0)


        def EOF(self):
            return self.getToken(ExprParser.EOF, 0)

        def getRuleIndex(self):
            return ExprParser.RULE_root




    def root(self):

        localctx = ExprParser.RootContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_root)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 4
            self.expr()
            self.state = 5
            self.match(ExprParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx


    class ExprContext(ParserRuleContext):
        __slots__ = 'parser'

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PUBLIC(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUBLIC)
            else:
                return self.getToken(ExprParser.PUBLIC, i)

        def CLASS(self):
            return self.getToken(ExprParser.CLASS, 0)

        def ID(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.ID)
            else:
                return self.getToken(ExprParser.ID, i)

        def LLAVE_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_IZQ)
            else:
                return self.getToken(ExprParser.LLAVE_IZQ, i)

        def STATIC(self):
            return self.getToken(ExprParser.STATIC, 0)

        def VOID(self):
            return self.getToken(ExprParser.VOID, 0)

        def PAR_IZQ(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PAR_IZQ)
            else:
                return self.getToken(ExprParser.PAR_IZQ, i)

        def STRING(self):
            return self.getToken(ExprParser.STRING, 0)

        def CORCH_IZQ(self):
            return self.getToken(ExprParser.CORCH_IZQ, 0)

        def CORCH_DER(self):
            return self.getToken(ExprParser.CORCH_DER, 0)

        def PAR_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PAR_DER)
            else:
                return self.getToken(ExprParser.PAR_DER, i)

        def INT(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.INT)
            else:
                return self.getToken(ExprParser.INT, i)

        def IGUAL(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.IGUAL)
            else:
                return self.getToken(ExprParser.IGUAL, i)

        def NUM(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.NUM)
            else:
                return self.getToken(ExprParser.NUM, i)

        def PUNTO_COMA(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO_COMA)
            else:
                return self.getToken(ExprParser.PUNTO_COMA, i)

        def MAS(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.MAS)
            else:
                return self.getToken(ExprParser.MAS, i)

        def PUNTO(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.PUNTO)
            else:
                return self.getToken(ExprParser.PUNTO, i)

        def CADENA(self):
            return self.getToken(ExprParser.CADENA, 0)

        def LLAVE_DER(self, i:int=None):
            if i is None:
                return self.getTokens(ExprParser.LLAVE_DER)
            else:
                return self.getToken(ExprParser.LLAVE_DER, i)

        def getRuleIndex(self):
            return ExprParser.RULE_expr




    def expr(self):

        localctx = ExprParser.ExprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_expr)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 7
            self.match(ExprParser.PUBLIC)
            self.state = 8
            self.match(ExprParser.CLASS)
            self.state = 9
            self.match(ExprParser.ID)
            self.state = 10
            self.match(ExprParser.LLAVE_IZQ)
            self.state = 11
            self.match(ExprParser.PUBLIC)
            self.state = 12
            self.match(ExprParser.STATIC)
            self.state = 13
            self.match(ExprParser.VOID)
            self.state = 14
            self.match(ExprParser.ID)
            self.state = 15
            self.match(ExprParser.PAR_IZQ)
            self.state = 16
            self.match(ExprParser.STRING)
            self.state = 17
            self.match(ExprParser.CORCH_IZQ)
            self.state = 18
            self.match(ExprParser.CORCH_DER)
            self.state = 19
            self.match(ExprParser.ID)
            self.state = 20
            self.match(ExprParser.PAR_DER)
            self.state = 21
            self.match(ExprParser.LLAVE_IZQ)
            self.state = 22
            self.match(ExprParser.INT)
            self.state = 23
            self.match(ExprParser.ID)
            self.state = 24
            self.match(ExprParser.IGUAL)
            self.state = 25
            self.match(ExprParser.NUM)
            self.state = 26
            self.match(ExprParser.PUNTO_COMA)
            self.state = 27
            self.match(ExprParser.INT)
            self.state = 28
            self.match(ExprParser.ID)
            self.state = 29
            self.match(ExprParser.IGUAL)
            self.state = 30
            self.match(ExprParser.NUM)
            self.state = 31
            self.match(ExprParser.PUNTO_COMA)
            self.state = 32
            self.match(ExprParser.INT)
            self.state = 33
            self.match(ExprParser.ID)
            self.state = 34
            self.match(ExprParser.IGUAL)
            self.state = 35
            self.match(ExprParser.ID)
            self.state = 36
            self.match(ExprParser.MAS)
            self.state = 37
            self.match(ExprParser.ID)
            self.state = 38
            self.match(ExprParser.PUNTO_COMA)
            self.state = 39
            self.match(ExprParser.ID)
            self.state = 40
            self.match(ExprParser.PUNTO)
            self.state = 41
            self.match(ExprParser.ID)
            self.state = 42
            self.match(ExprParser.PUNTO)
            self.state = 43
            self.match(ExprParser.ID)
            self.state = 44
            self.match(ExprParser.PAR_IZQ)
            self.state = 45
            self.match(ExprParser.CADENA)
            self.state = 46
            self.match(ExprParser.MAS)
            self.state = 47
            self.match(ExprParser.ID)
            self.state = 48
            self.match(ExprParser.PAR_DER)
            self.state = 49
            self.match(ExprParser.PUNTO_COMA)
            self.state = 50
            self.match(ExprParser.LLAVE_DER)
            self.state = 51
            self.match(ExprParser.LLAVE_DER)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





