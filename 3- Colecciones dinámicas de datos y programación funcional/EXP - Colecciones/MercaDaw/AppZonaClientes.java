package Colecciones.MercaDaw;

import java.util.*;

/**
 * @author Jose
 * Clase principal que gestiona la interacción con el usuario.
 */
public class AppZonaClientes {

    static Cliente cliente;
    static Scanner teclado = new Scanner(System.in);

    /**
     * Método principal de ejecución.
     */
    static void main() {
        Mercadaw mercadaw = new Mercadaw();
        mercadaw.generarClientes();
        autenticacion(mercadaw.getClientes());
    }

    /**
     * Gestiona la autenticación del cliente.
     * @param clientes conjunto de clientes
     */
    public static void autenticacion(Set<Cliente> clientes){
        System.out.println("\n=== COMPRA ONLINE EN MERCADAW ===");

        int contador = 3;
        boolean condicion = true;
        while (condicion){
            System.out.println("Usuario: ");
            String usuario = teclado.next();
            System.out.println("Contraseña: ");
            String contrasenya = teclado.next();
            Cliente cliente1 = new Cliente(usuario, contrasenya);

            if (clientes.contains(cliente1)){
                cliente = cliente1;
                System.out.println("\nBIENVENID@ " + cliente.getUsuario() + "!");
                iniciarCompra();
                condicion = false;
            }else {
                contador--;
                System.out.println("Credenciales no válidas. Intentos: " + contador);
            }

            if (contador==0){
                System.out.println("\nERROR DE AUTENTICACIÓN.");
                return;
            }
        }
    }

    /**
     * Inicia el proceso de compra.
     */
    public static void iniciarCompra(){
        cliente.crearPedido();
        imprimirProductos();
    }

    /**
     * Muestra el menú de productos y permite añadirlos al pedido.
     */
    public static void imprimirProductos(){
        System.out.println("\nAñade productos a tu lista de la compra ...");

        for (Producto producto : Producto.values()){
            System.out.println(producto + ": " + producto.getPrecio() + "€");
        }

        try{

            System.out.println("\n===============================================================");

            System.out.print("\nElige un producto: ");
            Producto producto = Producto.valueOf(teclado.next().toUpperCase());

            System.out.println("\n===============================================================\n");

            cliente.insertarProducto(producto);
            System.out.println("Has añadidio " + producto + " con un precio de " + producto.getPrecio() + "€");
            System.out.println("Importe total del pedido: " + cliente.getPedido().getImporte_total() + "€");

            System.out.println("¿Quieres añadir mas productos a la lista (S/N)?");
            char opcion = teclado.next().toUpperCase().charAt(0);

            switch (opcion){
                case 'S':
                  imprimirProductos();
                  break;
                case 'N':
                    imprimirResumen();
                    break;
                default:
                    System.out.println("ERROR. Opcion incorrecta.");
            }

        }catch (IllegalArgumentException er){
            System.out.println("Producto no reconocido. Elige otro ...");
            imprimirProductos();
        }

    }

    /**
     * Muestra el resumen del pedido.
     */
    public static void imprimirResumen(){

        System.out.println("\n === RESUMEN DE TU CARRITO DE LA COMPRA === ");
        System.out.println("Productos:");

        for (Map.Entry<Producto, Integer> mapita : cliente.getPedido().getPedido().entrySet()){
            System.out.println(mapita.getValue() + " | " + mapita.getKey() + " " + mapita.getKey().getPrecio());
        }

        System.out.println("\nIMPORTE TOTAL: " + cliente.getPedido().getImporte_total() + "€.");

        mostrarOpciones();

    }

    /**
     * Muestra un mensaje de despedida.
     */
    public static void imprimirDespedida(){
        System.out.println("\n === GRACIAS POR SU PEDIDO ===");
        System.out.println("Lo recibirá en unos días en la dirección " + cliente.getDireccion());
    }

    /**
     * Muestra las opciones finales al usuario.
     */
    public static void mostrarOpciones(){
        System.out.println("\n=====================================");
        System.out.println("¿Qué desea hacer?");
        System.out.println("[1]. Aplicar promos.");
        System.out.println("[2]. Mostrar resumen ordenador por uds.");
        System.out.println("[3]. Terminar pedidos.");

        System.out.print("\n-> ");
        int opcion = teclado.nextInt();

        switch (opcion){

            case 1:
                if (!cliente.isPromociones()){
                    cliente.getPedido().aplicarPromo3x2();
                    cliente.getPedido().aplicarPromo10();
                    cliente.setPromociones(true);

                    System.out.println("\n=====================================");
                    System.out.println("  PROMO 3x2 Y 10% DESC. APLICADAS    ");
                    System.out.println("=====================================");
                    mostrarOpciones();
                }else {
                    System.out.println("Las promociones ya han sido aplicadas.");
                    mostrarOpciones();
                }
                break;
            case 2:
                imprimirResumen();
                break;
            case 3:
                imprimirDespedida();
                break;
            default:
                System.out.println("ERROR. Opción no válida.");
                mostrarOpciones();
                break;
        }

    }
}
