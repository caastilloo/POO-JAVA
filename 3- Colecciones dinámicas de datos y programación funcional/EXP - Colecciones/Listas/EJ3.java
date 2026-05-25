package Colecciones.Listas;

import java.util.Stack;

public class EJ3 {

    static void main() {

        String expresion = "((2+3)*(5-1))";

        if (esBalanceado(expresion)){
            System.out.println("Es correcto");
        }else {
            System.out.println("Es incorrecto");
        }

    }

    public static boolean esBalanceado(String expresion){

        Stack<Character> pila = new Stack<>();
        for (int i = 0; i < expresion.length(); i++) {

            if (expresion.charAt(i) == '('){
                pila.push(expresion.charAt(i));
            } else if (expresion.charAt(i) == ')') {
                if (pila.contains('(')){
                    pila.pop();
                }else{
                    return false;
                }

            }

        }

        if (pila.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
