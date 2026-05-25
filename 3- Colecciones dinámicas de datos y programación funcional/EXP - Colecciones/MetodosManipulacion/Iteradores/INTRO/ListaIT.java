package Colecciones.MetodosManipulacion.Iteradores.INTRO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListaIT {

    static void main() {

        ArrayList<String> listaAlumnos = new ArrayList<>(Arrays.asList("Juan", "Ismael", "Paula", "Rajoy"));
        ListIterator<String> it = listaAlumnos.listIterator();

        while (it.hasNext()){

            System.out.println(it.nextIndex());

            String nombre = it.next();

            System.out.println(it.nextIndex());

            if (nombre.equals("Ismael")){
                it.add("Patri");
            }

            System.out.println(nombre);
        }

        while (it.hasPrevious()){

            System.out.println(it.previousIndex());

            String nombre = it.previous();

            System.out.println(it.previousIndex());

            System.out.println(nombre);
        }

    }
}
