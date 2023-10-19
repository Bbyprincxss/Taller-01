package Program.Model;
import ucn.*;
public class ResumenPedido {

    /**
     * Atributos
     */
    private int precioUnitario;
    private int totalAcumulado;
    private Plato listadoProductos[];
    private int numeroMesa;

    /**
     * Constructor
     * @param totalAcumulado total del pedido
     * @param listadoProductos todos los platos
     */
    public ResumenPedido( int totalAcumulado, Plato[] listadoProductos) {
        this.precioUnitario = precioUnitario;
        this.totalAcumulado = 0;
        this.listadoProductos = listadoProductos;
        this.numeroMesa = numeroMesa;
    }

    public void desplearProductos (){

        for (int i = 0; i < listadoProductos.length ; i++) {
            StdOut.println("|Plato| " + listadoProductos[i].getNombre() +" |PRECIO UNITARIO| $" + listadoProductos[i].getPrecio());
        }
        StdOut.println("|El total acumulado es $" + totalAcumulado +"|");
    }

    public int getNumeroMesa(){
        return this.numeroMesa;
    }

}
