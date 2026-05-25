package Colecciones.Listas;

import java.util.Stack;

public class EJ1 {

    static void main() {

        // Crear pila de letras
        Stack<Character> pilaLetras = new Stack<>();

        // Insertar letras
        pilaLetras.push('a');
        pilaLetras.push('b');
        pilaLetras.push('c');
        pilaLetras.push('d');
        pilaLetras.push('e');

        // Esta vacia la pila?
        System.out.println("¿La pila esta vacia?: " + pilaLetras.isEmpty());

        // Tamaño de la pila
        System.out.println("Tamaño de la pila: " + pilaLetras.size());

        // Ultima letra de la pila
        System.out.println("La última letra de la pila es: " + pilaLetras.peek());

//        for (Character character : pilaLetras){
//            System.out.println(pilaLetras.pop());
//        }

//        for (int i = 0; i < pilaLetras.size(); i++) {
//            System.out.println(pilaLetras.pop());
//        }

        // Extrae y muestra las letras una por una
        while (!pilaLetras.isEmpty()){
            System.out.println(pilaLetras.pop());
        }




    }




}
