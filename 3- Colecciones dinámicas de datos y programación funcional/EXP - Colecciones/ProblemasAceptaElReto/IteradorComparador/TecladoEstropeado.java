package Colecciones.ProblemasAceptaElReto.IteradorComparador;

import java.util.ArrayList;
import java.util.ListIterator;

public class TecladoEstropeado {

    static java.util.Scanner teclado;

    public static boolean casoDePrueba() {
        if (!teclado.hasNext())
            return false;
        else {

            String palabra = teclado.nextLine();

            ArrayList<Character> listaCaracteres = new ArrayList<>();
            ListIterator<Character> listIt = listaCaracteres.listIterator();

            for (Character caracter : palabra.toCharArray()){

                switch (caracter){

                    case '-':
                        if (listIt.hasPrevious()){
                            listIt.previous();
                        }
                        break;
                    case '+':
                        if (listIt.hasNext()){
                            listIt.next();
                        }
                        break;
                    case '*':
                        listIt.next();
                        break;
                    case '3':
                        if (listIt.hasNext()){
                            listIt.next();
                            listIt.remove();
                        }
                        break;
                    default:
                        listIt.add(caracter);
                        break;
                }

            }

            for (Character caracter : listaCaracteres){
                System.out.print(caracter);
            }

            System.out.println();

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        teclado = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main


}
