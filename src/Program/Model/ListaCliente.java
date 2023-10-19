package Program.Model;

import ucn.StdOut;

public class ListaCliente {
    /**
     * Atributos
     */
    private int cantidadMaxima;
    private int cantidadActual;
    private Cliente listaClientes[];

    /**
     * Constructor
     * @param cantidadMaxima de la lista
     */
    public ListaCliente(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaClientes= new Cliente[cantidadMaxima];
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     * Metodo que agrega clientes a la lista
     * @param cliente cliente
     * @return false si no se agrega y true si lo es posible
     */
    public boolean agregarCliente (Cliente cliente){
        if (this.cantidadActual == this.cantidadMaxima){
            StdOut.println("la lista esta llena!");
            return false;
        }else {
            this.listaClientes[this.cantidadActual] = cliente;
            this.cantidadActual++;
            return true;
        }
    }

}
