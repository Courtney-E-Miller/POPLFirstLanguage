grammar prefixLang;

/*
* Prefix language, starting with and, or, and not
*/

/*
* Parser Rules
*/

start: r EOF;
r : INTVAL | BOOLVAL | orExp | andExp | notExp | ifExp | letExp | addExp | VARIABLE;
// r : VALUE | orRule | notRule;
// notRule : 'Not' r;
orExp : '(' 'Or' r r ')';
notExp : '(' 'Not' r ')';
andExp : '(' 'And' r r ')';
ifExp : '(' 'If' r r r ')';
letExp: '(' 'Let' VARIABLE r r ')';
addExp: '(' 'Add' r r ')';


/*
* Lexer Rules
*/
VARIABLE : STR (STR | INTVAL)*;
INTVAL: [0-9]+;
STR : [a-z]+;
BOOLVAL : 'True' | 'False';
WS  : [ \t\r\n]+ -> skip ;