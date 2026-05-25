package Colecciones.Mapas.EJS.DiccionarioJuego;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class DiccionarioApp {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        Diccionario diccionario = new Diccionario();
        int preguntas = 0;
        int aciertos = 0;
        int errores = 0;

        diccionario.cargarPalabras();


        while (true) {

            String palabra = diccionario.palabraAleatoria();
            char pista = diccionario.primeraLetraTraduccion(palabra);

            System.out.println(palabra.toUpperCase() + ": " + pista + "...");
            System.out.print("Indique la respuesta: ");
            String respuesta = teclado.nextLine().toLowerCase();

            if (respuesta.equals("fin")) {
                break;
            }

            preguntas++;

            String correcta = diccionario.traduce(palabra).toLowerCase();

            if (respuesta.equals(correcta)) {
                System.out.println("¡CORRECTO!");
                aciertos++;
            } else {
                System.out.println("¡NO! La respuesta correcta es " + correcta);
                errores++;
            }

            System.out.println();
        }

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + preguntas);
        System.out.println("Total aciertos: " + aciertos);
        System.out.println("Total errores: " + errores);

        if (preguntas > 0) {
            System.out.println("Aciertos: " + (aciertos * 100 / preguntas) + "%");
        }

    }

}
