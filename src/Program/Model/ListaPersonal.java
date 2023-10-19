package Program.Model;

import ucn.StdOut;

public class ListaPersonal {

    /**
     * Atributos
     */
    private int cantidadMaxima;
    private int cantidadActual;
    private Personal listaPersonal[];

    /**
     * Constructor
     * @param cantidadMaxima cantidad maxima de la lista
     */
    public ListaPersonal(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = 0;
        this.listaPersonal = new Personal[cantidadMaxima];
    }

    /**
     * Metodo que agrega un personal a la lista
     * @param personal persona a agregar
     * @return true si se agregó, false si no
     */
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

    /**
     * Metodo que busca un personal por su nombre
     * @param nombre nombre de la persona a buscar
     * @return posicion de la persona en la lista
     */
    public  int buscarPersonal(String nombre){
        if (this.cantidadActual==0){
            StdOut.println("No hay platos en el inventario");
        }else{
            for (int i = 0; i < this.cantidadActual; i++) {
                if (this.listaPersonal != null){
                    if (this.listaPersonal[i].getNombre().equalsIgnoreCase(nombre)){
                        return i;
                    }
                }
            }
        }
        return -1;
    }

    /**
     * Metodo que retorna una persona de la lista mediante su nombre
     * @param nombre nombre persona a obtener
     * @return la persona, si no se retorna null
     */
    public Personal obtenerPersonal (String nombre){
        return listaPersonal[buscarPersonal(nombre)];

    }

    /**
     * Metodo que elimina una persona de la lista mediante el nombre
     * @param nombre nombre persona a eliminar
     * @return true si se elimino, false si no
     */
    public boolean eliminarPersonal (String nombre){
        if (this.cantidadActual == 0){
            StdOut.println("No hay platos en el inventario");
        }else{
            if (buscarPersonal(nombre) != -1) {
                this.listaPersonal[buscarPersonal(nombre)] = null;
                cantidadActual--;
                return true;
            }
        }
        return false;
    }

    /**
     * Metodo que renueva un contrato emdiante un personal y la nueva fecha
     * @param personal personal a cambiar su contrato
     * @param nuevaFechaTermino la fecha de termino
     */
     public  void  renovarContrato (String personal, int nuevaFechaTermino){
         //recorre toda la lista
      for (int i = 0; i < cantidadActual; i++) {

          //pregunta si la lista está vacia en la posicion y si el nombre es igual al que busco
             if (listaPersonal[i] != null && listaPersonal[i].getNombre().equalsIgnoreCase(personal)) {

                 if (listaPersonal[i].getContrato().equalsIgnoreCase("Plazo Fijo")){
                    listaPersonal[i].setFechaTermino(nuevaFechaTermino);
                    StdOut.println("\nContrato renovado con exito.");

                } else {
                    StdOut.println("\nNo se puede renovar contrato, no es contrato de plazo fijo");
                 }
          }
        }
    }

    /**
     * Metodo que retorna la lista de personal
     * @return lista de personal
     */
    public Personal[] getListaPersonal() {
        return listaPersonal;
    }

    /**
     * Metodo que devuelve la cantidad actual de la lsita
     * @return cantidad actual de la lista
     */
    public int getCantidadActual() {
        return cantidadActual;
    }

    /**
     * Metodo que cambia la cantidad actual de la lista
     * @param cantidadActual cantidad actual de la lista
     */
    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    /**
     * metodo que cambia el tipo de contrato
     * @param personal personal a cambiar su contrato
     */
    public void otorgarContratoIndefinido(Personal personal){
      personal.setFechaTermino(-1);
    }


}
