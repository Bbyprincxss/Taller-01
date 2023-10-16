package Program.Model;

import ucn.StdOut;

public class ListaPersonal {
    private int cantidadMaxima;
    private int cantidadActual;
    private Personal listaPersonal[];

    public ListaPersonal(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
    }
    public boolean agregarPersonal (Personal personal){
        if (this.cantidadActual == this.cantidadMaxima){
            StdOut.println("la lista esta llena!");
            return false;
        }else {
            this.listaPersonal[this.cantidadActual] = personal;
            this.cantidadActual++;
            return true;
        }
    }
    public boolean eliminarPersonal (Personal personal){
        int personal1 = obtenerPersonal(personal.getNombre());
        if (personal1 == -1) {
            for (int i = personal1; i < cantidadActual - 1; i++) {
                listaPersonal[i] = listaPersonal[i + 1];
            }
            cantidadActual--;
            return true;
        }
        return false;
    }
    public int obtenerPersonal (String nombre){
        if (this.cantidadActual>0){
            for (int i = 0; i < this.cantidadMaxima; i++) {
                if (this.listaPersonal[i] != null){
                    if (this.listaPersonal[i].getNombre().equalsIgnoreCase(nombre)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

}
