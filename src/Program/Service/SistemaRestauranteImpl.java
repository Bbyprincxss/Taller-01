package Program.Service;

import Program.Model.*;
import ucn.StdIn;
import ucn.StdOut;

public class SistemaRestauranteImpl implements SistemaRestaurante {

    /**
     * Atributos
     */
    private ListaPlato listaPlato;
    private ListaCliente listaCliente;
    private ListaPersonal listaPersonal;
    private ListaMesa listaMesa;

    /**
     * Constructor
     */
    public SistemaRestauranteImpl() {
        this.listaPlato = new ListaPlato(90);
        this.listaPersonal = new ListaPersonal(90);
        this.listaCliente = new ListaCliente(90);
        this.listaMesa = new ListaMesa(18);
    }

    @Override
    public String administrarMesa() {

        //lista que guarda los datos de la mesa, si esta ocupada y su numero
        int[] listaNueva = listaMesa.mesaDisponible();

        //si la mesa está discponible
        if (listaNueva[0] == 1) {
            //registrar clientes
            if (registrarCliente(listaNueva[1])) {
                StdOut.println("Se ha registrado correctamente.");
            } else {
                StdOut.println("No se ha podido registrar.");

            }

            //si la mesa hay que desocuparla
        } else if (listaNueva[0] == 2 && listaNueva[1] >= 0 && listaNueva[1] <= 17) {
            //liberar mesa
            if (listaMesa.obtenerMesa(listaNueva[1]).getCliente()[0] != null) {
                System.out.println(listaMesa.obtenerMesa(listaNueva[1]).getCliente()[0].getNombre());
            }
            if (listaMesa.obtenerMesa(listaNueva[1]).getPersonal() != null) {
                StdOut.println(listaMesa.obtenerMesa(listaNueva[1]).getPersonal().getNombre());

            }
            System.out.println(listaMesa.obtenerMesa(listaNueva[1]).getEstado());
            StdOut.println("\nMesa" + listaNueva[1] + "desocupada");

        } else if (listaNueva[0] == 3) {
            return null;
        }

        return "Volviendo al menu...";
    }

    @Override
    public void administrarPersonal() {

        boolean menuAdministrarPersonal = true;

        while (menuAdministrarPersonal) {
            StdOut.println("\nIngrese que accion desea utilizar: ");
            StdOut.println("[1] Renovar Contrato");
            StdOut.println("[2] Finalizar Contrato");
            StdOut.println("[3] Otorgar Contrato indefinido");
            StdOut.println("[4] Volver atras...");
            StdOut.println("-------*-------*-------*-------*-------");
            int opcionAdministrarPersonal = StdIn.readInt();

            switch (opcionAdministrarPersonal) {
                case 1:
                    StdOut.println("*-*-*-*-*-*-*Rellene los datos*-*-*-*-*-*-*");
                    StdOut.println("Nombre del trabajador a renovar contrato: ");
                    String nombreTrabajador = StdIn.readString();
                    int nuevaFechaTerminoInt;

                    //validacion
                    while (true) {
                        try {
                            StdOut.println("Ingrese la nueva fecha de termino: ");
                            String nuevaFechaTerminoString = StdIn.readString();
                            nuevaFechaTerminoInt = Integer.parseInt(nuevaFechaTerminoString);
                        } catch (Exception e) {
                            StdOut.println("Ingrese una fecha de tipo numérica");
                            continue;
                        }
                        break;
                    }

                    listaPersonal.renovarContrato(nombreTrabajador, nuevaFechaTerminoInt);

                    break;
                case 2:
                    StdOut.println("Ingrese el nombre del trabajador");
                    nombreTrabajador = StdIn.readString();

                    listaPersonal.eliminarPersonal(nombreTrabajador);


                    if (listaPersonal.eliminarPersonal(nombreTrabajador)) {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("Se finalizo el contrato de " + nombreTrabajador + " correctamente");
                        StdOut.println("-------------------*-------------------");
                    } else {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("No se pudo realizar el proceso...");
                        StdOut.println("-------------------*-------------------");
                    }
                    break;
                case 3:
                    // no esta listo
                    StdOut.println("*-*-*-*-*-*-*Rellene los datos*-*-*-*-*-*-*");
                    StdOut.println("Nombre");
                    nombreTrabajador = StdIn.readString();
                    while (true) {
                        try {
                            StdOut.println("Edad de " + nombreTrabajador);
                            String edadTrabajadorString = StdIn.readString();
                            int edadTrabajadorInt = Integer.parseInt(edadTrabajadorString);
                        } catch (Exception e) {
                            StdOut.println("Ingrese un edad valido");
                            continue;
                        }
                        break;
                    }
                    StdOut.println("Tipo de Contrato de " + nombreTrabajador + "(indefinido o plazo fijo");
                    String tipoDeContrato = StdIn.readString();

                    while (true) {
                        try {
                            StdOut.println("Fecha de Contratacion de " + nombreTrabajador);
                            String fechaDeContratacionString = StdIn.readString();
                            int fechaContratacionInt = Integer.parseInt(fechaDeContratacionString);
                        } catch (Exception e) {
                            StdOut.println("Ingrese una fecha  valido");
                            continue;
                        }
                        break;
                    }

                case 4:
                    menuAdministrarPersonal = false;
                    break;
                default:
                    mensajeError();
            }
        }

    }

    @Override
    public void administrarPlato() {

        boolean menuAdministrarPlato = true;
        while (menuAdministrarPlato) {
            StdOut.println("Ingrese que accion que desea utilizar: ");
            StdOut.println("[1] Ingresar nuevos productos");
            StdOut.println("[2] Modificar productos");
            StdOut.println("[3] Eliminar productos");
            StdOut.println("[4] Volver atras...");
            StdOut.println("----------------------------------");
            int opcionAdministrarPlato = StdIn.readInt();

            int precioInt = 0;

            switch (opcionAdministrarPlato) {
                case 1:

                    StdOut.println("\nIngrese el nombre de producto para agregar");
                    String nombre = StdIn.readString();

                    //Validacion
                    while (true) {

                        try {
                            StdOut.println("Ingrese precio de " + nombre);
                            String precio = StdIn.readString();
                            precioInt = Integer.parseInt(precio);

                        } catch (NumberFormatException e) {
                            StdOut.println("Ingrese un valor valido");
                            continue;
                        }
                        break;
                    }
                    StdOut.println("Ingrese categoria de " + nombre);
                    String categoria = StdIn.readString();

                    int stockInt = 0;
                    while (true) {
                        try {
                            StdOut.println("Ingrese stock de producto " + nombre);
                            String stock = StdIn.readString();
                            stockInt = Integer.parseInt(stock);
                        } catch (NumberFormatException e) {
                            StdOut.println("Ingrese un numero valido");
                            continue;
                        }
                        break;

                    }
                    //agregar plato nuevo
                    Plato nuevoPlato = new Plato(nombre, precioInt, categoria, stockInt);

                    if (this.listaPlato.agregarPlato(nuevoPlato)) {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("El producto se agrego correctamente");
                    } else {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("No se pudo agregar el producto...");
                    }
                    break;

                case 2:

                    StdOut.println("\nIngrese nombre de producto a actualizar");
                    nombre = StdIn.readString();


                    while (true) {
                        try {
                            StdOut.println("Ingrese precio de producto");
                            String precio = StdIn.readString();
                            precioInt = Integer.parseInt(precio);
                        } catch (NumberFormatException e) {
                            StdOut.println("Ingrese un valor valido");
                            continue;
                        }
                        break;
                    }

                    StdOut.println("Ingrese categoria de producto para agregar");
                    categoria = StdIn.readString();

                    listaPlato.buscarPlato(nombre);

                    if (listaPlato.buscarPlato(nombre) != -1) {
                        StdOut.println("Ingrese la nueva cantidad de productos de " + nombre);
                        stockInt = StdIn.readInt();
                        Plato nuevoStock = new Plato(nombre, precioInt, categoria, stockInt);
                        listaPlato.agregarPlato(nuevoStock);
                    }

                    break;
                case 3:
                    StdOut.println("\nIngrese nombre de producto para eliminar");
                    nombre = StdIn.readString();

                    listaPlato.eliminarPlato(nombre);

                    if (listaPlato.eliminarPlato(nombre)) {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("Se elimino correctamente");
                    } else {
                        StdOut.println("-------------------*-------------------");
                        StdOut.println("No se pudo eliminar...");
                    }

                    break;
                case 4:
                    menuAdministrarPlato = false;
                    break;

                default:
                    mensajeError();
            }
        }
    }

    @Override
    public ResumenPedido procesarPedido() {

        int numeroMesaInt = 0;

        //preguntar numero de mesa validando
        while (true) {
            try {
                StdOut.println("Ingrese el numero de mesa para realizar resumen");
                String numeroProcesarPedido = StdIn.readString();
                numeroMesaInt = Integer.parseInt(numeroProcesarPedido);

            } catch (NumberFormatException e) {
                StdOut.println("Ingrese un numero valido");
                continue;
            }
            break;
        }

        String nombreTrabajador = "";

        //validar nombre del personal
        while (true) {

            StdOut.println("Ingrese el nombre del trabajador que atendera la mesa" + numeroMesaInt);
            nombreTrabajador = StdIn.readString();

            try {
                if (listaPersonal.buscarPersonal(nombreTrabajador) == -1) {
                    throw new IllegalArgumentException();
                }

            } catch (IllegalArgumentException e) {
                StdOut.println("El trabajador no existe");
                continue;
            }
            break;
        }

        if (listaPlato.getCantidadActual() == 0) {
            StdOut.println("No hay productos en el inventario");

        } else {
            //muestra todos los platos disponibles
            for (int i = 0; i < listaPlato.getCantidadActual(); i++) {
                StdOut.println("[-] " + listaPlato.getListaPlato()[i].getNombre());
            }

            boolean menuPedirComida = true;

            Plato[] pidiendo = new Plato[100];
            int i = 0;
            int totalAcumuladoPlatos = 0;

            while (menuPedirComida) {

                //menu para agregar comida
                StdOut.println("Ingrese el nombre del plato N°" + (i + 1) + " que desee el cliente: ");
                StdOut.println("(Ingrese 0 para finalizar)");
                String platoParaAgregar = StdIn.readString();

                i++;

                //salir
                if (platoParaAgregar.equalsIgnoreCase("0")) {
                    menuPedirComida = false;
                    break;
                }

                //se busca el plato pedido
                if (listaPlato.buscarPlato(platoParaAgregar) != -1) {

                    //se agregan los platos en una lista por mientras para despues agregarlo en la lista de la mesa.
                    pidiendo[i] = listaPlato.obtenerPlato(platoParaAgregar);
                    totalAcumuladoPlatos += listaPlato.obtenerPlato(platoParaAgregar).getPrecio();


                } else {
                    StdOut.println("Plato no encontrado en la lista...");
                }

            }
            //se agrega a la mesa todos los pedidos
            listaMesa.obtenerMesa(numeroMesaInt).setPlatosPedidos(pidiendo);

            //se crea el resumen del pedido
            ResumenPedido resumen = new ResumenPedido(totalAcumuladoPlatos, pidiendo);
            resumen.desplearProductos();
            return resumen;
        }

        return null;
    }

    @Override
    public Boolean registrarCliente(int numero) {

        int cantidadClientesInt = 0;

        //validacion
        while (true) {

            try {
                StdOut.println("Ingrese la cantidad de clientes: ");
                String cantidadClientesString = StdIn.readString();
                cantidadClientesInt = Integer.parseInt(cantidadClientesString);

            } catch (NumberFormatException e) {
                StdOut.println("Ingrese una cantidad numérica");
                continue;
            }
            break;
        }

        //lista de clientes ingresados en una mesa
        Cliente[] nuevoArreglo = new Cliente[cantidadClientesInt];

        int edadClienteInt = 0;
        for (int i = 0; i < cantidadClientesInt; i++) {

            StdOut.println("\nIngrese el nombre de cliente " + i++);
            String nombreCliente = StdIn.readString();

            //validacion
            while (true) {
                try {
                    StdOut.println("\nIngrese su edad de " + nombreCliente);
                    String edadClienteString = StdIn.readString();
                    edadClienteInt = Integer.parseInt(edadClienteString);

                } catch (NumberFormatException e) {
                    StdOut.println("Ingrese una edad valida");
                    continue;
                }
                break;

            }

            //agregar a cliente en la lista
            Cliente cliente = new Cliente(nombreCliente, edadClienteInt, null);
            nuevoArreglo[i] = cliente;

        }
        listaMesa.obtenerMesa(numero).setCliente(nuevoArreglo);

        return true;
    }

    @Override
    public void mensajeError() {
        StdOut.println("Se ingreso una opcion invalida...intente nuevamente");
    }

    @Override
    public void entregarBoleta() {

        StdOut.print("|Trabajador que Atendio a la mesa " + procesarPedido().getNumeroMesa() + "es: " + listaMesa.obtenerMesa(procesarPedido().getNumeroMesa()).getPersonal().getNombre() +"|");
        procesarPedido().desplearProductos();
    }


}

