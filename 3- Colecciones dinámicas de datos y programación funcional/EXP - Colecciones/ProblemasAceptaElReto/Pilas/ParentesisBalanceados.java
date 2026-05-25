package Colecciones.ProblemasAceptaElReto.Pilas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ParentesisBalanceados {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        while (casoDePrueba()) {
        }

    }

    public static boolean casoDePrueba() {

        if (!teclado.hasNext())
            return false;
        else {

            ArrayList<Character> listaAbiertos = new ArrayList<>(Arrays.asList('(','{','['));
            ArrayList<Character> listaCerrados = new ArrayList<>(Arrays.asList(')','}',']'));

            Stack<Character> pila = new Stack<>();

            String expresion = teclado.next();

            for (int i = 0; i < expresion.length(); i++) {

                if (listaAbiertos.contains(expresion.charAt(i))){
                    pila.push(expresion.charAt(i));
                } else if (listaCerrados.contains(expresion.charAt(i))) {

                    int pos = listaCerrados.indexOf(expresion.charAt(i));
                    if (pila.contains(listaAbiertos.get(pos)) && pila.peek() == listaAbiertos.get(pos)){
                        pila.pop();
                    }else {
                        System.out.println("NO");
                        return true;
                    }
                }
            }

            if (pila.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
                teclado.nextLine();
            }

            return true;
        }
    }
}
