package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;

public class EJ1 {

    static void main() {

        // LinkedList
        LinkedList<String> cola = new LinkedList<>();

        cola.offer("Manolito");
        cola.offer("Pocoyo");
        cola.offer("Bart Simpson");
        cola.offer("Stewie");

        cola.poll();
        System.out.println(cola.peek());

        cola.offerFirst("Kevin McCalister");
        cola.peek();

        System.out.println(cola);

        // Queue/Deque
        Deque<String> cola2 = new LinkedList<>();

        cola2.poll(); // No falla aunque este vacia, a diferencia de las Pilas

        cola2.offer("Manolito");
        cola2.offer("Pocoyo");
        cola2.offer("Bart Simpson");
        cola2.offer("Stewie");

        cola2.poll();
        System.out.println(cola2.peek());

        cola2.offerFirst("Kevin McCalister"); // En una queue normal no puedes poner First ni Last
        cola2.peek();

        System.out.println(cola2);

        // LinkedBlockingQueue
        LinkedBlockingQueue<String> cola_limitada = new LinkedBlockingQueue<>(3);

        cola_limitada.offer("Manolito");
        cola_limitada.offer("Juanito");
        cola_limitada.offer("Jaimito");
        cola_limitada.offer("Joselito");
        System.out.println(cola_limitada);


    }
}
