grammar Frota;

frota          : (modelo | drone)* EOF;

modelo         : 'modelo' STRING '{'
                   'capacidade:' NUM 'kg'
                   'autonomia:' NUM 'min'
                   'velocidade:' NUM 'km/h'
                   'sensores:' sensores
                   'limites:' limite_operacional
                   'restricoes:' restricoes
                 '}';

drone          : 'drone' STRING '{'
                   'numero_serie:' NUM
                   'modelo:' STRING
                   'estado:' estado
                   'horas_voo:' NUM
                 '}';

sensores       : sensor (',' sensor)* ;
sensor         : ID ;

limite_operacional : 'max_horas_voo=' NUM ;

restricoes     : restricao (',' restricao)* ;
restricao      : 'voo_diurno' | 'voo_noturno' ;

estado         : 'ativo' | 'manutencao' | 'inativo' ;

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
ID             : [a-zA-Z_][a-zA-Z_0-9]* ;
NUM            : [0-9]+ ;

WS             : [ \t\r\n]+ -> skip ;
