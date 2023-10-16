package Program.Model;

public class ResumenPedido {
    private int precioUnitario;
    private int totalAcumulado;
    private Plato listadoProductos[];

    public ResumenPedido(int precioUnitario, int totalAcumulado, Plato[] listadoProductos) {
        this.precioUnitario = precioUnitario;
        this.totalAcumulado = 0;
        this.listadoProductos = listadoProductos;
    }
    public String toString(){
        return null;
    }

}
