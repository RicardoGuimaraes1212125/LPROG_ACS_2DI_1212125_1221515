grammar Modelos;

modelo         : 'modelo' STRING '{'
                   'capacidade:' NUM 'kg'
                   'autonomia:' NUM 'min'
                   'velocidade:' '{'
                     'cruzeiro:' NUM 'km/h'
                     'subida:' NUM 'km/h'
                     'descida:' NUM 'km/h'
                   '}'
                   'sensores:' sensores
                   'certificacoes:' certificacao (',' certificacao)*
                   'limites:' limites_operacionais
                   'restricoes:' restricoes
                 '}';

certificacao   : ID ;

sensores       : sensor (',' sensor)* ;
sensor         : ID ;

limites_operacionais : limite (',' limite)* ;
limite         : 'max_horas_voo=' NUM
               | 'max_altitude=' NUM
               | 'min_bateria=' NUM
               | 'max_peso=' NUM ;

restricoes     : restricao (',' restricao)* ;
restricao      : 'voo_diurno' | 'voo_noturno' ;

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
ID             : [a-zA-Z_][a-zA-Z_0-9]* ;
NUM            : [0-9]+ ('.' [0-9]+)? ;
WS             : [ \t\r\n]+ -> skip ;
