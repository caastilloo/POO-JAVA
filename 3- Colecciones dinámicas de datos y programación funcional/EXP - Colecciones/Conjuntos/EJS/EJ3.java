package Colecciones.Conjuntos.EJS;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class EJ3 {

    static Scanner teclado = new Scanner(System.in);
    static LinkedHashSet<String> urlVisitadas = new LinkedHashSet<>();

    static void main() {

        String opcion = "";

        while (!opcion.equals("salir")){
            System.out.print("Escribe una URL visitada (o 'salir' para terminar): ");
            opcion = teclado.next();

            if (!opcion.equals("salir")){
                urlVisitadas.add(opcion);
            }

        }

        System.out.println();

        int contador = 1;
        System.out.println("Historial de navegación:");
        for (String url : urlVisitadas){
            System.out.println(contador + ". " + url);
            contador++;
        }



    }
}
