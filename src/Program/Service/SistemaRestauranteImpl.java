package Program.Service;

import Program.Model.*;

public class SistemaRestauranteImpl implements SistemaRestaurante {


    public SistemaRestauranteImpl(){
        ListaPlato listaPlato = new ListaPlato(90);
        ListaPersonal listaPersonal = new ListaPersonal(90);
        ListaCliente listaCliente = new ListaCliente(90);
        ListaMesa listaMesa = new ListaMesa(17);
    }



    @Override
    public String administrarMesa() {
        return null;
    }

    @Override
    public Personal administrarPersonal() {
        return null;
    }

    @Override
    public Plato administrarPlato() {
        return null;
    }

    @Override
    public ResumenPedido procesarPedido() {
        return null;
    }
}
