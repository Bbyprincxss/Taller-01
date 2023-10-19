package Program.Util;

import Program.Service.SistemaRestaurante;
import Program.Service.SistemaRestauranteImpl;

public class Instalador {

    private final SistemaRestaurante sistemaRestaurante;

    public Instalador() {
        this.sistemaRestaurante = new SistemaRestauranteImpl();
    }
    public SistemaRestaurante iniciarSesion(){
         return this.sistemaRestaurante;
    }
}

