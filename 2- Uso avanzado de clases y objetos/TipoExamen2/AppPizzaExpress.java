package TipoExamen2;

import java.util.Scanner;

public class AppPizzaExpress {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        Empleado empleado1 = new Empleado("EMP001", "Jose");
        Empleado empleado2 = new Empleado("EMP002", "Pablo");

        System.out.println("=== PIZZAEXPRESS ===");
        System.out.println();

        System.out.print("| Introduzca el nombre de su pedido -> ");
        String nombre_pedido = teclado.next().toUpperCase();

        Cliente cliente = new Cliente(nombre_pedido, 20);
        Pedido pedido = new Pedido(cliente, Estado.CREANDO);

        System.out.println("| ¿Que le apetece hoy al cliente " + cliente.getNombre() + "?");
        System.out.println();

        System.out.println("=== CARTA ===");
        for (CartaPizzas pizza : CartaPizzas.values()){
            System.out.println(pizza + ": " + pizza.getPrecio() + "€");
        }
        System.out.println("=============");

        System.out.println();

        System.out.print("| Seleccione una pizza -> ");
        CartaPizzas opcion_pizza = CartaPizzas.valueOf(teclado.next().toUpperCase());

        for (CartaPizzas pizza : CartaPizzas.values()){
            if (opcion_pizza == pizza){
                pedido.getListaPizzas().add(opcion_pizza);
                System.out.println("| Pizza añadida al pedido.");
            }
        }

        System.out.println("| Precio: " + opcion_pizza.getPrecio() + "€");
        System.out.println();

        System.out.print("| ¿Quieren añadir otra pizza al pedido? -> ");
        String opcion = teclado.next().toUpperCase();

        if (opcion.equals("NO")){
            System.out.println("| Pedido RECIBIDO");
            System.out.println("| ESTADO: " + pedido.getEstadoPedido());
            // Sumar varios
            System.out.println("| TOTAL PEDIDO: " + opcion_pizza.getPrecio());
            System.out.println("| DESCUENTO: " + cliente.getDescuento() + "€");
            System.out.println("| TOTAL A PAGAR: " + pedido.aplicarDescuento(opcion_pizza, pedido.getEstadoPedido()));
        }

        pedido.pagar();

        pedido.setEstadoPedido(Estado.MONTANDO_PIZZA);
        System.out.println(pedido.getEstadoPedido());

        pedido.setEstadoPedido(Estado.HORNEANDO);
        System.out.println(pedido.getEstadoPedido());

        // Intento entrega pedido





    }
}
