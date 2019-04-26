lexer grammar CalculatorLexRules;


NOT: '!';
AND: '&&';
OR: '||';

GT: '>';
GE: '>=';
LT: '<';
LE: '<=';
EQ: '==';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
DEFINE: 'define';
RETURN: 'return';

SQRT: 'sqrt';
READ: 'read';
PRINT: 'print';
SINE: 's';
COSINE: 'c';

LOG: 'l';
EXP: 'e';

COMMA: ',';
ID: [A-Za-z]+;

LPAREN: '(';
RPAREN: ')';
LCUR: '{';
RCUR: '}';
SEMI: ';';

PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';

PP: '++';
MM: '--';

ASS: '=';
ASSADD: '+=';
ASSMIN: '-=';
ASSPROD: '*=';
ASSDIV: '/=';
ASSMOD: '%=';

INTEGER_NUM: DIGIT;
DOUBLE_NUM: DIGIT'.'DIGIT;
fragment DIGIT: [0-9]+;

NEWLINE :   '\r'? '\n'  ; 
WS: [ \t]+ -> skip ;

BlockComment :  '/*' .*? '*/'   ->  skip ;
LineComment :   '//' ~ [\r\n]*  ->  skip ;