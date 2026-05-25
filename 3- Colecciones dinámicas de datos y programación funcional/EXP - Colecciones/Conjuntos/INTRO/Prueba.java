package Colecciones.Conjuntos.INTRO;

import java.util.*;

public class Prueba {

    static void main() {

        String peces[] = {"Boquerones", "Sardinas", "Anchoas", "Anchoas", "Tiburón", "Merluza", "Merluza", "Anguila"};

        HashSet<String> desordenado = new HashSet<>(Arrays.asList(peces));
        LinkedHashSet<String> respeta_orden = new LinkedHashSet<>(Arrays.asList(peces));
        TreeSet<String> ordenado = new TreeSet<>(Arrays.asList(peces));

        System.out.println(desordenado);
        System.out.println(respeta_orden);
        System.out.println(ordenado);

    }
}
