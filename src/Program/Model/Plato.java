package Program.Model;

public class Plato {
    private String nombre;
    private int precio;
    private String categoria;
    private int stock;

    public Plato(String nombre, int precio, String categoria, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }
}
