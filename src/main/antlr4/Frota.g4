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
                   'certificacoes:' certificacao (',' certificacao)*
                   'limites:' limites_operacionais
                   'restricoes:' restricoes
                 '}';

certificacao   : ID ;


drone          : 'drone' STRING '{'
                   'numero_serie:' NUM
                   'modelo:' STRING
                   'peso_base:' NUM 'kg'
                   'bateria_atual:' NUM '%'
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
DATA           : [0-9][0-9][0-9][0-9] '-' ([1][0-2]|[0][1-9]) '-' ([0][1-9]|[12][0-9]|[30]|[31]) ;
WS             : [ \t\r\n]+ -> skip ;
