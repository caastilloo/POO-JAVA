package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class EJ4 {

    static Scanner teclado = new Scanner(System.in);
    static LinkedList<String> cola = new LinkedList<>();

    static void main() {

        cola.offer("LECHE");
        cola.offer("POLLO");
        cola.offer("PAN");
        cola.offer("HUEVOS");

        menu();


    }

    public static void menu(){
        System.out.println();

        System.out.println("--- LISTA DE LA COMPRA ---");
        System.out.println("1. Añadir producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista actual");
        System.out.println("X. Salir");

        System.out.println();

        System.out.print("| Seleccione una opción -> ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        System.out.println();

        validarMenu(opcion);
    }

    public static void validarMenu(char opcion){

        switch (opcion){
            case '1':
                System.out.print("| Producto a añadir al final: ");
                String productoAnyadir = teclado.next().toUpperCase();

                cola.offerLast(productoAnyadir);

                System.out.println("-> Producto añadido con exito.");

                menu();
                break;
            case '2':
                if (cola.isEmpty()){
                    System.out.println("-> ERROR. La lista está vacía.");
                }else {
                    System.out.println("| Eliminando el primer producto (" + cola.pollFirst() + ").");
                }

                menu();
                break;
            case '3':
                System.out.print("| Producto a eliminar: ");
                String productoEliminar = teclado.next().toUpperCase();

                if (cola.contains(productoEliminar)){
                    cola.remove(productoEliminar);
                    System.out.println("-> Producto eliminado con exito.");
                }else {
                    System.out.println("-> ERROR. Producto no encontrado en la lista.");
                }

                menu();
                break;
            case '4':
                if (cola.isEmpty()){
                    System.out.println("-> ERROR. La lista está vacía.");
                }else {
                    System.out.println("| Primer producto en la lista: " + cola.peekFirst());
                }

                menu();
                break;
            case '5':
                System.out.print("| Producto a buscar: ");
                String productoBuscar = teclado.next().toUpperCase();

                if (cola.contains(productoBuscar)){
                    System.out.println("El producto " + productoBuscar + " se encuentra en la lista.");
                }else {
                    System.out.println("ERROR. El producto " + productoBuscar + " no se encuentra en la lista");
                }

                menu();
                break;
            case '6':
                if (cola.isEmpty()){
                    System.out.println("-> La lista está vacía.");
                }else{
                    System.out.println("| Lista actual:");

                    for (String producto : cola){
                        System.out.println((cola.indexOf(producto) + 1) + ". " + producto);
                    }
                }

//                System.out.println("| Lista actual -> " + cola);

                menu();
                break;
            case 'X':
                System.out.println("| Saliendo ...");

                break;
            default:
                System.out.println("| Selecciona una opción válida.");

                menu();
                break;
        }
    }
}
