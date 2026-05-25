package Colecciones;

import java.util.ArrayList;
import java.util.Stack;

public class IntroColecciones {

    static void main() {

        // ArrayList
        ArrayList<String> coches = new ArrayList<>();

        // Pila
        Stack<String> pila = new Stack<>();

        // Añade
        pila.push("caniche");
        pila.push("chiuaua");
        pila.push("husky");

        // Quita último
        pila.pop();

        // Devuelve primero
        System.out.println(pila.peek());



    }
}
