import Program.Model.ListaPersonal;
import Program.Model.ListaPlato;
import Program.Model.Plato;
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
        Instalador instalador = new Instalador();

        return instalador.iniciarSesion();
    }

    public static void menuDelSistema(SistemaRestaurante sistemaRestaurante){
        SistemaRestauranteImpl sistema = new SistemaRestauranteImpl();
        boolean menuActivo = true;

        while (menuActivo){

            StdOut.println("*-*-*-*-Bienvenido usuario-*-*-*-*");
            StdOut.println("[1] Coordinar disponibilidad de las mesas");
            StdOut.println("[2] Gestionar inventario");
            StdOut.println("[3] Administrar trabajadores");
            StdOut.println("[4] Procesar ordenes de clientes");
            StdOut.println("[5] Cerrar programa");
            StdOut.println("------------------------------------");
            StdOut.println("*Ingrese una opcion : ");
            int opcion = StdIn.readInt();

            switch (opcion){
                case 1 :
                    sistema.administrarMesa();

                    break;
                case 2 :
                    sistema.administrarPlato();

                    break;
                case 3 :
                    sistema.administrarPersonal();
                    break;
                case 4 :
                    sistema.entregarBoleta();
                    break;
                case 5:
                    StdOut.println("Cerrando programa...");
                    menuActivo = false;
                    break;
                default:
                    sistema.mensajeError();
            }
            break;
        }
    }
}

