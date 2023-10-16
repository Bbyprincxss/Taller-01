package Program.Model;

public class Mesa {
    private int numero;
    private String estado;
    private Cliente[] cliente;
    private String posicion1;
    private String posicion2;
    private Personal personal;

    public Mesa(int numero, String estado, Cliente[] cliente, String posicion1, String posicion2, Personal personal) {
        this.numero = numero;
        this.estado = estado;
        this.cliente = cliente;
        this.posicion1 = "x";  //duda  tenemos una idea sobre las mesas:)
        this.posicion2 = "y"; //duda
        this.personal = personal;
    }

    public int getNumero() {
        return numero;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente[] getCliente() {
        return cliente;
    }

    public void setCliente(Cliente[] cliente) {
        this.cliente = cliente;
    }

}
