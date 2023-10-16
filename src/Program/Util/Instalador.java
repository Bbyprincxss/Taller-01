package Program.Util;

import Program.Service.SistemaRestaurante;
import Program.Service.SistemaRestauranteImpl;

public class Instalador {

    private final SistemaRestaurante sistemaRestaurante;
    private final SistemaRestauranteImpl sistema;

    public Instalador(SistemaRestaurante sistemaRestaurante, SistemaRestauranteImpl nuevo) {
        this.sistemaRestaurante = sistemaRestaurante;
        this.sistema = nuevo;
    }
    public SistemaRestaurante iniciarSesion(){
         return this.sistemaRestaurante;
    }
}

