package Colecciones.Conjuntos.EJS;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class EJ1 {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.print("Escribe una frase: ");
        String frase = teclado.nextLine().toLowerCase();

        String vector [] = frase.split(" ");

        HashSet<String> eliminar_duplicados = new HashSet<>(Arrays.asList(vector));

        System.out.print("Palabras únicas: " + eliminar_duplicados);


    }
}
