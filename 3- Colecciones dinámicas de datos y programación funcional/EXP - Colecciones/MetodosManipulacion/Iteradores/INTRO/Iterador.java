package Colecciones.MetodosManipulacion.Iteradores.INTRO;

import java.util.Iterator;
import java.util.TreeSet;

public class Iterador {

    static TreeSet<String> peliculas = new TreeSet<>();

    static void main() {

        peliculas.add("SCREAM");
        peliculas.add("CARS");
        peliculas.add("TOY STORY");
        peliculas.add("BOLT");

        Iterator<String> it = peliculas.iterator();

        while (it.hasNext()){ // Si iterador tiene algo a la derecha

            String peli = it.next();

            if (peli.equals("BOLT")){
                it.remove();
            }

        }

        System.out.println(peliculas);


    }
}
