grammar Missoes;

missoes        : (missao)* EOF;

missao         : 'missao' STRING '{'
                   'inicio:' HORA
                   'drone:' STRING
                   'rota:' '[' entregas ']'
                 '}';

entregas       : entrega (',' entrega)* ;
entrega        : '{'
                   'origem:' STRING
                   'destino:' STRING
                   'distancia:' NUM 'km'
                   'altitude:' NUM 'm'
                 '}';

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
HORA           : [0-2][0-9] ':' [0-5][0-9] ;
NUM            : [0-9]+ ;

WS             : [ \t\r\n]+ -> skip ;
