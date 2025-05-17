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
                   'origem:' localizacao
                   'destino:' localizacao
                   'distancia:' NUM 'km'
                   'altitude:' NUM 'm'
                   'peso:' NUM 'kg'
                 '}';


localizacao     : '{'
                   'latitude:' coordenada
                   'longitude:' coordenada
                   'nome:' STRING
                 '}';
estado_missao  : 'planeada' | 'em_curso' | 'concluida';

coordenada     : NUM | '-' NUM;

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
HORA           : ([0-1][0-9]|[2][0-3]) ':' [0-5][0-9] ;
NUM            : [0-9]+ ('.' [0-9]+)? ;

WS             : [ \t\r\n]+ -> skip ;
