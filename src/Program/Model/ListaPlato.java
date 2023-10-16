package Program.Model;

import ucn.StdOut;

public class ListaPlato {
    private int cantidadMaxima;
    private int cantidadActual;
    private Plato listaPlato[];

    public ListaPlato(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public boolean agregarPlato(Plato nombre) {
        if (this.cantidadActual == this.cantidadMaxima) {
            StdOut.println("la lista esta llena!");
            return false;
        } else {
            this.listaPlato[this.cantidadActual] = nombre;
            this.cantidadActual++;
            return true;
        }
    }

    public boolean eliminar(Plato plato){
        if (this.cantidadActual > 0){
            for (int i = 0; i <= cantidadActual ; i++) {
                if (listaPlato[i].getNombre().equalsIgnoreCase(Plato) && listaPlato[i] != null) {
                    listaPlato[i] = null;
                    return  true;
                }
            }
        }
        return false;
    }

    public Plato obtenerPlato(String nombre) {

        if (this.cantidadActual > 0) {
            for (int i = 0; i < this.cantidadActual; i++) {
                if (this.listaPlato[i] != null) {
                    if (this.listaPlato[i].getNombre().equalsIgnoreCase(nombre)) {
                        return listaPlato[i];
                    }
                }
            }
        }
        return null;
    }
}

