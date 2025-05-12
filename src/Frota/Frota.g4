grammar Frota;

frota          : (modelo | drone)* EOF;

modelo         : 'modelo' STRING '{'
                   'capacidade:' NUM 'kg'
                   'autonomia:' NUM 'min'
                   'velocidade:' '{'
                     'cruzeiro:' NUM 'km/h'
                     'subida:' NUM 'km/h'
                     'descida:' NUM 'km/h'
                   '}'
                   'sensores:' sensores
                   'limites:' limites_operacionais
                   'restricoes:' restricoes
                 '}';

drone          : 'drone' STRING '{'
                   'numero_serie:' NUM
                   'modelo:' STRING
                   'estado:' estado
                   'horas_voo:' NUM
                   'ultima_manutencao:' DATA
                   'proxima_manutencao:' DATA
                 '}';

sensores       : sensor (',' sensor)* ;
sensor         : ID ;

limites_operacionais : limite (',' limite)* ;
limite         : 'max_horas_voo=' NUM
               | 'max_altitude=' NUM
               | 'min_bateria=' NUM
               | 'max_peso=' NUM ;

restricoes     : restricao (',' restricao)* ;
restricao      : 'voo_diurno' | 'voo_noturno' ;

estado         : 'ativo' | 'manutencao' | 'inativo' | 'em_missao' ;

// Tokens
STRING         : '"' (~["\r\n])* '"' ;
ID             : [a-zA-Z_][a-zA-Z_0-9]* ;
NUM            : [0-9]+ ('.' [0-9]+)? ; //Permitir numeros decimais
DATA           : [0-9][0-9][0-9][0-9] '-' ([1][0-2]|[0][1-9]) '-' [0-3][0-9] ;

WS             : [ \t\r\n]+ -> skip ;
