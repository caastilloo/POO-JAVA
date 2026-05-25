package Colecciones.Conjuntos.EJS;

import java.util.Scanner;
import java.util.TreeSet;

public class EJ2 {

    static Scanner teclado = new Scanner(System.in);
    static TreeSet<String> contactos = new TreeSet<>();

    static void main() {

        menu();

    }

    static public void menu(){
        System.out.println("----- AGENDA -----");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("X. Salir");

        System.out.println();

        System.out.print("Elige una opción -> ");
        char opcion = teclado.next().toUpperCase().charAt(0);

        System.out.println();

        System.out.println("------------------");

        System.out.println();

        validarMenu(opcion);
    }

    static public void validarMenu(char opcion){

        switch (opcion){

            case '1':
                System.out.print("Nombre del nuevo contacto: ");
                String contactoNuevo = teclado.next();

                contactos.add(contactoNuevo);
                System.out.println("Contacto añadido correctamente.");

                System.out.println();
                menu();
                break;
            case '2':
                System.out.println("Contactos: " + contactos);

                System.out.println();
                menu();
                break;
            case '3':
                System.out.println("Nombre del contacto a buscar: ");
                String contactoBuscar = teclado.next();

                if (contactos.contains(contactoBuscar)){
                    System.out.println("El contacto " + contactoBuscar + " se encuentra entre tu lista de contactos.");
                }else {
                    System.out.println("El contacto " + contactoBuscar + " NO se encuentra entre tu lista de contactos.");
                }

                System.out.println();
                menu();
                break;
            case '4':
                System.out.println("Nombre del contacto a eliminar: ");
                String contactoEliminar = teclado.next();

                if (contactos.contains(contactoEliminar)){
                    contactos.remove(contactoEliminar);
                    System.out.println("El contacto " + contactoEliminar + " ha sido borrado con éxito.");
                }else {
                    System.out.println("El contacto " + contactoEliminar + " NO se encuentra entre tu lista de contactos.");
                }

                System.out.println();
                menu();
                break;
            case 'X':
                System.out.println("Saliendo ...");
                break;
            default:
                System.out.println("Seleccione una opción válida.");

                System.out.println();
                menu();
                break;
        }

    }
}
