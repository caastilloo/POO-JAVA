package Colecciones.hasEquals.EJS.Ejecicio2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CineApp {

    static Random aleatorio = new Random();
    static Queue<Espectador> cola = new LinkedList<>();

    static void main() {

        System.out.println("*** CINE AL POBLE ***");

        generarCola();
        System.out.println("Hay " + cola.size()+ " personas a la cola. " + cola);

        double recaudacion = 0;

        while (!cola.isEmpty()){

            if (cola.peek().getEdad()>=18){
                recaudacion += 3.5;
            } else if (cola.peek().getEdad()>=11) {
                recaudacion += 2.5;
            }else {
                recaudacion += 1;
            }

            cola.poll();
        }

        System.out.println("La reaudación ha sido de " + recaudacion + "€");

    }

    public static void generarCola(){

        int num_persona = aleatorio.nextInt(251);

        for (int i = 0; i < num_persona; i++) {
            cola.offer(new Espectador(aleatorio.nextInt(97)+1));
        }
    }
}
