grammar Missoes;

missoes        : (missao)* EOF;

missao         : 'missao' STRING '{'
                   'inicio:' HORA
                   'drone:' STRING
                   'estado:' estado_missao
                   'rota:' '[' entregas ']'
                 '}';

entregas       : entrega (',' entrega)* ;
entrega        : '{'
                   'origem:' STRING
                   'destino:' STRING
                   'distancia:' NUM 'km'
                   'altitude:' NUM 'm'
                 '}';

estado_missao  : 'planeada' | 'em_curso' | 'concluida';

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
HORA           : ([0-1][0-9]|[2][0-3]) ':' [0-5][0-9] ;
NUM            : [0-9]+ ('.' [0-9]+)? ; //Permitir numeros decimais


WS             : [ \t\r\n]+ -> skip ;
