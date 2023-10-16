package Program.Model;

import ucn.StdOut;

public class ListaCliente {
    private int cantidadMaxima;
    private int cantidadActual;
    private Cliente listaClientes[];

    public ListaCliente(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

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
