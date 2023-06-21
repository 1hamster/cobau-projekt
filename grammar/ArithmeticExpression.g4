grammar ArithmeticExpression;

TRUE : 'true';
FALSE : 'false';
AND : 'and';
OR : 'or';
VAR : 'var';
PRINT : 'print';
IF : 'if';
ELSE : 'else';
WHILE : 'while';

SEMICOLON : ';';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';

STRING : '"'[^"]*'"';
NUMBER : [0-9]+('.'[0-9]+)?;
IDENTIFIER: [A-Za-z][A-Za-z0-9]*;

PLUS : '+';
MINUS : '-';
ASTERIKS : '*';
FSLASH : '/';
ASSIGN : '=';
EQUAL : '==';
NOTEQUAL : '!=';
GREATER : '>';
LESSER : '<';
GEQUAL : '>=';
LEQUAL : '<=';
NOT : '!';

COMMENT : '//'.*?;


