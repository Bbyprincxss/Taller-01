package Program.Model;

public class Cliente {

    /**
     * Atributos
     */
    private String nombre;
    private  int edad;
    private Plato[] platoDeseado;

    /**
     * Constructor
     * @param nombre del cliente
     * @param edad del cliente
     * @param platoDeseado que el cliente quiere
     */
    public Cliente(String nombre, int edad, Plato[] platoDeseado) {
        this.nombre = nombre;
        this.edad = edad;
        this.platoDeseado = platoDeseado;
    }

    /**
     * Metodo que devuelve un plato deseado
     * @return plato deseado
     */
    public Plato[] getPlatoDeseado() {
        return platoDeseado;
    }

    public void setPlatoDeseado(Plato[] platoDeseado) {
        this.platoDeseado = platoDeseado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

}

