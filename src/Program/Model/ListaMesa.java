package Program.Model;

import ucn.StdIn;
import ucn.StdOut;

import java.util.InputMismatchException;

/**
 * Atributos
 */
public class ListaMesa {
    private int cantidadMaxima;
    private int cantidadActual;
    private Mesa[] listaMesa;

    /**
     * Constructor
     * @param cantidadMaxima cantidad maxima de la lista
     */
    public ListaMesa(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 18;
        this.listaMesa= new Mesa[cantidadMaxima];
        crearMesas();

        //agregar las mesas a la lista llamando a un metodo
    }

    //Metodo que crea mesas y las guarda en la lista de mesas

    /**
     * Metodo que crea las mesas
     */
    public void crearMesas (){

        //recorre 17 veces para crear las 17 mesas
        for (int i = 0; i < cantidadActual; i++) {
            //se crean las mesas y se guardan en la lista
            Mesa mesa = new Mesa((i+1), null,null,null);
            listaMesa[i] = mesa;
        }
    }

    /**
     * Metodo que obtiene una mesa
     * @param numero de la mesa
     * @return lista de la mesa en la posicion i si se obtiene y si no, null
     */
    public Mesa obtenerMesa (int numero) {
        if (this.cantidadActual > 0) {
            for (int i = 0; i < this.cantidadMaxima; i++) {
                if (this.listaMesa[i] != null) {

                    if (this.listaMesa[i].getEstado()) {
                        return listaMesa[i];
                    }
                }
            }
        }
        return null;
    }
    /*
    Devolver un vector con 2 posiciones, la primera indica que opcion se escogió, la segunda indica el numero de la mesa.
     */

    /**
     * Metodo de mesas disponibles
     * @return una mesa disponible y su posicion en una lista
     */
    public int[] mesaDisponible () {

        int[] lista = new int[2];
        lista[0] = 1; //hace referencia a si la mesa se ocupo o no (1 si se ocupo, 2 si no)
        lista[1] =9;   //aqui se guarda el numero de la mesa

        while (true) {
            StdOut.println("¿Desea ocupar o desocupar una mesa?");
            String opcion = StdIn.readString();

            switch (opcion) {
                case "ocupar" -> {

                    boolean noDispo = false;

                    for (int i = 0; i < this.cantidadMaxima; i++) {
                        //si la mesa en esa posicion está disponible
                        if (!this.listaMesa[i].getEstado()) {
                            StdOut.println("|+| La mesa numero " + (i + 1) + " esta disponible");
                            noDispo = true;
                        }
                    }
                    //si no hay mesas para ocupar
                    if (!noDispo) {
                        StdOut.println("No hay mesas disponibles");
                        lista[0] = 3;
                        break;
                    }

                    lista[0] = 1;
                    int numeroMesaInt = 0;
                    while (true) {
                        try {
                            StdOut.println("\nIngrese el numero de mesa a gestionar: ");
                            String numeroMesaString = StdIn.readString();
                            numeroMesaInt = Integer.parseInt(numeroMesaString);
                        } catch (NumberFormatException e) {
                            StdOut.println("Ingrese un numero valido");
                            continue;
                        }
                        break;
                    }

                    this.listaMesa[numeroMesaInt - 1].setEstado(true);
                    StdOut.println("-------------------*-------------------");
                    StdOut.println("Se ha ocupado la mesa");
                    lista[1] = numeroMesaInt - 1;


                }
                case "desocupar" -> {

                    boolean noDispo = false;

                    for (int i = 0; i < this.cantidadMaxima; i++) {
                        //si la mesa en esa posicion está disponible
                        if (this.listaMesa[i].getEstado()) {
                            StdOut.println("|-| La mesa numero " + (i + 1) + " se puede desocupar");
                            noDispo = true;
                        }
                    }
                    //si no hay mesas disponibles
                    if(!noDispo) {
                        StdOut.println("No hay mesas para desocupar");
                        lista[0] = 3;
                        break;
                    }

                    lista[0] = 2;
                    StdOut.println("-------------------*-------------------");
                    int numeroMesaInt = 0;
                    while (true){
                        try{
                            StdOut.println("\nIngrese el numero de mesa a gestionar: ");
                            String numeroMesa = StdIn.readString();
                            numeroMesaInt = Integer.parseInt(numeroMesa);

                        }catch(NumberFormatException e){
                            StdOut.println("Ingrese un numero valido");
                            continue;
                        }
                        break;
                    }

                    this.listaMesa[numeroMesaInt - 1].setEstado(false);
                    StdOut.println("-------------------*-------------------");
                    StdOut.println("\nSe ha desocupado la mesa");


                    lista[1] = numeroMesaInt - 1;
                }
                default -> {
                    StdOut.println("-------------------*-------------------");
                    StdOut.println("\nIngrese una opcion valida");
                    continue;
                }
            }
            break;
        }
        return lista;
    }

}



