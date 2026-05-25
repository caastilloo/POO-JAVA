package Enums.Dificultad;

import Enums.Semaforo.Semaforo;

import java.util.Random;
import java.util.Scanner;

public class DificultadApp {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();

        System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]");
        Dificultad dificultad = Dificultad.valueOf(teclado.next().toUpperCase());

        int num_aleatorio = aleatorio.nextInt(4800)+1;

        System.out.println("Puntación Obtenida: " + num_aleatorio);
        System.out.println("Puntación final: " + num_aleatorio*dificultad.multi_puntuacion);

    }
}
