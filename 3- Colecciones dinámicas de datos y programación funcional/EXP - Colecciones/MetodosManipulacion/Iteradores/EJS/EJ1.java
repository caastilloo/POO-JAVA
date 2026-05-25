package Colecciones.MetodosManipulacion.Iteradores.EJS;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class EJ1 {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.print("Entrada: ");
        String palabra = teclado.nextLine();

        ArrayList<Character> listaCaracteres = new ArrayList<>();
        ListIterator<Character> listIt = listaCaracteres.listIterator();

        for (Character caracter : palabra.toCharArray()){

            switch (caracter){

                case '<':
                    if (listIt.hasPrevious()){
                        listIt.previous();
                    }
                    break;
                case '>':
                    if (listIt.hasNext()){
                        listIt.next();
                    }
                    break;
                case '#':
                    if (listIt.hasPrevious()){
                        listIt.previous();
                        listIt.remove();
                    }
                    break;
                default:
                    listIt.add(caracter);
                    break;
            }

        }

        System.out.print("Salida: ");
        for (Character caracter : listaCaracteres){
            System.out.print(caracter);
        }

        System.out.println();


    }
}
