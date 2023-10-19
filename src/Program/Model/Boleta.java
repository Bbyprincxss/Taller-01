package Program.Model;

import Program.Service.SistemaRestauranteImpl;

public class Boleta {

    /**
     * Atributos
     */
    private int totalPedido;
    private int numeroMesa;
    private  String trabajadorQueAtendio;
    private ResumenPedido resumenPedido;

    /**
     * Constructor
     * @param totalPedido cantidad total del pedido
     * @param numeroMesa numero de mesa
     * @param trabajadorQueAtendio personal que atendió
     * @param resumenPedido el resumen del pedido
     */
    public Boleta(int totalPedido, int numeroMesa, String trabajadorQueAtendio, ResumenPedido resumenPedido) {
        this.totalPedido = totalPedido;
        this.numeroMesa = numeroMesa;
        this.trabajadorQueAtendio = trabajadorQueAtendio;
        this.resumenPedido = resumenPedido;
    }


}
