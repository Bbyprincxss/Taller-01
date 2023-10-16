package Program.Model;

import ucn.StdIn;
import ucn.StdOut;

public class ListaMesa {
    private int cantidadMaxima;
    private int cantidadActual;
    private Mesa[] listaMesa;

    public ListaMesa(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 17;
        this.listaMesa= new Mesa[cantidadMaxima];

    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public Mesa obtenerMesa (int numero) {
        if (this.cantidadActual > 0) {
            for (int i = 0; i < this.cantidadMaxima; i++) {
                if (this.listaMesa[i] != null) {
                    if (this.listaMesa[i].getEstado().equalsIgnoreCase("Disponible")) {
                        return listaMesa[i];
                    }
                }
            }
        }
        return null;
    }

    public void mesaDisponible (){
        for (int i = 0; i < this.cantidadMaxima; i++) {
            if (this.listaMesa[i]==null){
                StdOut.println("La mesa numero "+(i+1)+" esta disponible");
            } else if (this.listaMesa[i] != null){
                StdOut.println("La mesa numero "+(i+1)+" esta ocupada");
            }
            return;
        }
    }

    public String gestionarMesa(int numero){
        StdOut.println("Ingrese el numero de mesa a ocupar: ");
        int numeroMesa = StdIn.readInt();
        for (int i = 0; i < this.cantidadMaxima; i++) {
            if (this.listaMesa[i] == numeroMesa){
                this.listaMesa[i] = ; aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
            }
        }
    }

}



