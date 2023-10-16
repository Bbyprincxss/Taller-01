package Program.Model;

public class Cliente {

    private String nombre;
    private  int edad;
    private Plato[] platoDeseado;

    public Cliente(String nombre, int edad, Plato[] platoDeseado) {
        this.nombre = nombre;
        this.edad = edad;
        this.platoDeseado = platoDeseado;
    }

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

