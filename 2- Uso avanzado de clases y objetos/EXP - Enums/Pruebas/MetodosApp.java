package Enums.Pruebas;

import java.util.Scanner;

public class MetodosApp {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Metodo opcion = Metodo.PAYPAL;

        System.out.println("Opción: " + opcion);

        System.out.println();

        System.out.println("MÉTODOS VÁLIDOS:");
        for (Metodo metodo : Metodo.values()){
            System.out.println(metodo);
        }

        System.out.println();

        System.out.println("Datos METODO: ");
        System.out.println("Posición: " + opcion.ordinal());
        System.out.println("Nombre: " + opcion.name());
        System.out.println("Comisión: " + opcion.getComision());

        System.out.println("Elige un método de pago: ");
        Metodo respuesta = Metodo.valueOf(teclado.next().toUpperCase());
        System.out.println("Método elegido: " + respuesta);

    }
}
