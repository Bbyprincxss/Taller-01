package Program.Service;

import Program.Model.Boleta;
import Program.Model.Personal;
import Program.Model.ResumenPedido;

public interface SistemaRestaurante {

    /**
     * metodo que permite revisar y seleccionar el estado de las mesas
     * @return devuelve
     */
    String administrarMesa();

    /**
     * metodo para gestionar contratos de trabajadores
     */
    void administrarPersonal();

    /**
     * metodo para agregar, actualizar o eliminar productos del inventario
     */
    void administrarPlato();

    /**
     * metodo que procesa el pedido
     */
    ResumenPedido procesarPedido();

    /**
     * metodo que permite registrar clientes a las mesas
     */
    Boolean registrarCliente(int numero);

    /**
     * metodo que despliega mensaje de error en caso de ingresar valor erroneo
     */
    void mensajeError();

    /**
     * Metodo que entrega una boleta de la orden
     */
    void entregarBoleta();
}
