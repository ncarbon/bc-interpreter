grammar Calculator;
import CalculatorLexRules;

prog: stat*;  

stat: expr NEWLINE                                                 #printExpr   
    | assign NEWLINE                                                #assignStat
    | ifStatement NEWLINE                                           #ifStat
    | whileStatement NEWLINE                                        #whileStat
    | forStatement NEWLINE                                          #statFor
    | funcDeclaration NEWLINE                                       #funcDec
    | returnStatement NEWLINE                                       #statReturn
    | NEWLINE                                               #blank
    ;

assign: ID op=(ASS|ASSADD|ASSMIN|ASSPROD|ASSDIV|ASSMOD) expr (NEWLINE)*
      ;

ifStatement: IF conditionBlock (ELSE IF conditionBlock)* (ELSE block)?
            ;

block: LCUR stat* RCUR
    ;

conditionBlock: LPAREN expr RPAREN block
              ;

returnStatement: RETURN expr;

whileStatement: WHILE expr LCUR stat* RCUR
         ;

forStatement: FOR LPAREN assign SEMI expr SEMI assign RPAREN (NEWLINE)? LCUR stat* RCUR
            ;

funcDeclaration: DEFINE ID LPAREN params RPAREN (NEWLINE)? LCUR stat* RCUR
            ;

params: (param (',' param)*)?
      ;

param: ID
    ;

funcCall: ID LPAREN arguments RPAREN
    ;

arguments: (expr (',' expr)*)?
         ;

expr: (MINUS|PLUS) expr                                       #unary
    | LPAREN expr RPAREN                                    #exprParen  
    | <assoc=right> expr '^' expr                           #exprExpo
    | expr (MUL|DIV|MOD) expr                               #mulDiv
    | expr (PLUS|MINUS) expr                                #plusMinus
    | expr (GT|GE|LT|LE|EQ) expr                            #relExpr
    | expr (AND|OR) expr                                    #boolExpr
    | NOT expr                                              #notExpr
    | specialExpr                                           #exprSpecial
    | mathExpr                                              #exprMath
    | PRINT listExpr                                        #exprPrint
    | funcCall                                              #funcC
    | postFixUnaryExpr                                      #postFixExpr
    | preFixUnaryExpr                                       #preFixVar 
     | atom                                                  #exprAtom
    ;

postFixUnaryExpr: ID (PP|MM)
                ;

preFixUnaryExpr: (PP|MM) ID 
                ;

specialExpr: SQRT LPAREN expr RPAREN                        #specialSqrt
           | READ LPAREN RPAREN NEWLINE number              #specialRead
           ;

mathExpr: SINE LPAREN expr RPAREN                            #mathSine
        | COSINE LPAREN expr RPAREN                          #mathCosine
        | LOG LPAREN expr RPAREN                             #mathLog
        | EXP LPAREN expr RPAREN                             #mathExp
        ;

listExpr: expr (COMMA expr)*                       
        ;

atom: number                                                #atomNum
    | ID                                                    #atomId
    ;

number: DOUBLE_NUM
      | INTEGER_NUM
      ;
