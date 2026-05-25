package Colecciones.MetodosManipulacion.Comparadores.INTRO.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prueba {

    private final List<String> listaIndestructible = Collections.unmodifiableList(new ArrayList<>());

    public Prueba(List<String> lista) {
        listaIndestructible.add("Hola");
    }

    public List<String> getListaIndestructible(){
        return listaIndestructible;
    }
}
