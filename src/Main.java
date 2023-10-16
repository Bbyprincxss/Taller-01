import Program.Service.SistemaRestaurante;
import Program.Service.SistemaRestauranteImpl;
import Program.Util.Instalador;
import ucn.StdIn;
import ucn.StdOut;

import java.io.PrintStream;

//instalador
public class Main {
    public static void main(String[] args) {
        SistemaRestaurante sistemaRestaurante = instalarSistema();
        menuDelSistema(sistemaRestaurante);
    }

    public static SistemaRestaurante instalarSistema() {
        Instalador instalador = new Instalador(instalarSistema(),new SistemaRestauranteImpl());
        return instalador.iniciarSesion();
    }

    public static void menuDelSistema(SistemaRestaurante sistemaRestaurante){
        boolean menuActivo = true;

        while (menuActivo){

            StdOut.println("*-*-*-*-Bienvenido usuario-*-*-*-*");
            StdOut.println("[1] Coordinar disponibilidad de las mesas");
            StdOut.println("[2] Gestionar inventario");
            StdOut.println("[3] Administrar trabajadores");
            StdOut.println("[4] Procesar ordenes de clientes");
            StdOut.println("*Ingrese una opcion :*");
            int opcion = StdIn.readInt();

            switch (opcion){
                case 1 :
                    administrarMesa(sistemaRestaurante);
                    break;
                case 2 :
                    administrarPersonal(sistemaRestaurante);
                    break;
                case 3 :
                    StdOut.println("*-*-*-*-Rellene los datos-*-*-*-*");
                    StdOut.println("Nombre");
                    String nombreTrabajador = StdIn.readString();
                    StdOut.println("Edad");
                    int edadTrabajador = StdIn.readInt();
                    StdOut.println("Tipo de Contrato");
                    String tipoDeContrato = StdIn.readString();
                    StdOut.println("Fecha de Contratacion");
                    int fechaDeContratacion = StdIn.readInt();


                    break;
                case 4 :
                    administrarPlato (sistemaRestaurante);
                    break;
                default:
                    mensajeError();
            }
        }
    }

    private static void mensajeError(){
        StdOut.println("Se ingreso una opcion invalida...intente nuevamente");
    }

    private static void administrarMesa (SistemaRestaurante sistemaNuevo){


    }

    private static void administrarPlato (SistemaRestaurante sistemaNuevo){

    }

    private static void administrarPersonal (SistemaRestaurante sistemaNuevo){
        StdOut.println("Ingrese el nombre del trabajador a gestionar: ");
        String nombre = StdIn.readString();





    }
    private static void procesarPedido (SistemaRestaurante sistemaNuevo){

    }


}

