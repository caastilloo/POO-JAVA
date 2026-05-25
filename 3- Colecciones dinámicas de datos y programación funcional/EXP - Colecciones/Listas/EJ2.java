package Colecciones.Listas;

import java.util.Stack;

public class EJ2 {

    static void main() {

        Stack<Integer> pila = new Stack<>();

        pila.push(5);
        pila.push(8);
        pila.push(10);

        while (!pila.isEmpty()){
            System.out.println(pila.pop());
        }

//        for (int i = 0; i < pila.size(); i++) {
//            System.out.println(pila.pop());
//        }

//        for (Integer num : pila){
//            System.out.println(pila.pop());
//        }




    }
}
