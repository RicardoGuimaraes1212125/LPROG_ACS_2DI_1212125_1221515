grammar Drones;

import Modelos;


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

estado         : 'ativo' | 'manutencao' | 'inativo' | 'em_missao' ;

drones : drone* EOF;


// Tokens herdados de Modelos.g4:
// STRING, NUM, WS
DATA : [0-9][0-9][0-9][0-9] '-' ('0'[1-9] | '1'[0-2]) '-' ('0'[1-9] | [12][0-9] | '30' | '31') ;

