package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;

public class EJ5 {

    static void main() {

        Deque<Character> caracteres = new LinkedList<>();

        String palabra = "RADAR";

        for (int i = 0; i < palabra.length(); i++) {
            caracteres.offer(palabra.charAt(i));
        }

//        caracteres.offer('R');
//        caracteres.offer('A');
//        caracteres.offer('D');
//        caracteres.offer('A');
//        caracteres.offer('R');

        System.out.println(caracteres);

        while (!caracteres.isEmpty()){

            if (!caracteres.peekFirst().equals(caracteres.peekLast())){
                System.out.println("La palabra introducida no es PALINDROMA.");
                return;
            }else {
                caracteres.pollFirst();
                caracteres.pollLast();
            }
        }

        System.out.println("La palabra introducida es PALINDORMA");


    }
}
