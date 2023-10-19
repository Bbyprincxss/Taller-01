package Program.Model;

import ucn.StdOut;

public class ListaPlato {
    /**
     * Atributos
     */
    private int cantidadMaxima;
    private int cantidadActual;
    private Plato listaPlato[];

    /**
     * Constructor
     *
     * @param cantidadMaxima cantidad maxima de la lista
     */

    public ListaPlato(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaPlato = new Plato[cantidadMaxima];
    }

    /**
     * Metodo que retorna la cantidad acAtual
     *
     * @return cantidad actual
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Metodo que retorna la lista plato
     *
     * @return lista plato
     */
    public Plato[] getListaPlato() {
        return listaPlato;
    }

    /**
     * Metodo que agrega un plato
     *
     * @param plato el plato a agregar
     * @return true si se agrego, false si no
     */
    public boolean agregarPlato(Plato plato) {
        if (this.cantidadActual == this.cantidadMaxima) {
            StdOut.println("la lista esta llena!");
            return false;
        } else {
            this.listaPlato[cantidadActual] = plato;
            this.cantidadActual++;
            return true;
        }
    }


    /**
     * Metodo que elimina un plato de la lista
     * @param plato de la lista
     * @return true si el plato se elimino y false si es que no
     */
    public boolean eliminarPlato(String plato) {
        if (this.cantidadActual == 0) {
            StdOut.println("No hay platos registrados");
        } else {
            if (buscarPlato(plato) != -1) {

                this.listaPlato[buscarPlato(plato)] = null;
                cantidadActual--;
                return true;
            }
        }
        return false;
    }


    /**
     * Metodo que obtiene un plato
     *
     * @param nombre nonbre del plato aobtener
     * @return lista plato en la posicion i, si no null
     */
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

    /**
     * Metodo que busca un plato mediante el nombre
     *
     * @param platoParaBuscar plato a buscar
     * @return posicion del plato o -1
     */
    public int buscarPlato(String platoParaBuscar) {

        for (int i = 0; i < this.cantidadActual; i++) {
            if (listaPlato[i].getNombre().equals(platoParaBuscar)) {
                return i;
            }
        }
        return -1;
    }
}


