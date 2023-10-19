package Program.Model;

public class Mesa {
    private int numero;
    private boolean estado;
    private Cliente[] cliente;
    private String posicion;
    private Personal personal;
    private Plato[] platosPedidos;
    private int cantidadPlatosMesa;


    public Mesa(int numero, Cliente[] cliente, String posicion, Personal personal) {
        this.numero = numero;
        this.estado = false;
        this.cliente = cliente;
        this.posicion = posicion;
        this.personal = personal;
        this.platosPedidos = new Plato[100];
        this.cantidadPlatosMesa = 100;
    }

    public Plato[] getPlatosPedidos() {
        return platosPedidos;
    }

    public int getCantidadPlatosMesa() {
        return this.cantidadPlatosMesa;
    }
    public void setCantidadPlatosMesa(int nuevo){
        this.cantidadPlatosMesa = nuevo;
    }

    public void setPlatosPedidos(Plato[] platosPedidos) {
        this.platosPedidos = platosPedidos;
    }

    public int getNumero() {
        return numero;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public Personal getPersonal() {
        return personal;
    }
}
