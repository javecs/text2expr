grammar Text2Expr;

text2expr: text+ NEWLINE expr+ ;
text: word NEWLINE                  # WordDefine
    | ID '=' word NEWLINE           # WordAssign
    ;
word: field '|' field               # FieldOr
    | field '&' field               # FieldAnd
    | field                         # FieldSingular
    ;
field: PREFIX ':' JAPANESE ;
expr: '^' | '+' | '-' | '*' | '/' | '%' | '(' | ')' | '=' | ',' | NUMBER | ID
    | NEWLINE
    ;

// SF : Source form
// PS : Part-of-Speech
// BF : Base form
// RD : Reading
// PR : Pronunciation
PREFIX: 'SF' | 'P'LEVEL | 'BF' | 'RD' | 'PR' ;
LEVEL: [1234] ;

// Hiragana : 3040–309F
// Katakana : 30A0–30FF
// Knaji : 4E00–9FCF
JAPANESE: ('\u3040'..'\u309F'|'\u30A0'..'\u30FF'|'\u4E00'..'\u9FFF')+ ;

NUMBER: [0-9]+('.'[0-9]+)? ;
ID: [a-zA-Z][a-zA-Z0-9]* ;
NEWLINE: '\r'? '\n' ;
WS: [ \t]+ -> skip ;
