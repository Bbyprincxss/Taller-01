package Program.Model;

public class Boleta {
    private int totalPedido;
    private int numeroMesa;
    private  String trabajadorQueAtendio;
    private ResumenPedido resumenPedido;

    public Boleta(int totalPedido, int numeroMesa, String trabajadorQueAtendio, ResumenPedido resumenPedido) {
        this.totalPedido = totalPedido;
        this.numeroMesa = numeroMesa;
        this.trabajadorQueAtendio = trabajadorQueAtendio;
        this.resumenPedido = resumenPedido;
    }
    public String toString(){
        return null;
    }

}
