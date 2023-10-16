package Program.Service;

import Program.Model.Personal;
import Program.Model.Plato;
import Program.Model.ResumenPedido;

public interface SistemaRestaurante {

    String administrarMesa();

    Personal administrarPersonal();

    Plato administrarPlato();

    ResumenPedido procesarPedido();

}
