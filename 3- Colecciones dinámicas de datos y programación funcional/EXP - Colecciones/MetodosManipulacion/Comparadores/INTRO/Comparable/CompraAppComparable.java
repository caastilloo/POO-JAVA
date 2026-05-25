package Colecciones.MetodosManipulacion.Comparadores.INTRO.Comparable;

import java.util.*;

public class CompraAppComparable {

    static void main() {

        // Siempre para TreeSet y para TreeMap

        List<PortatilComparable> portatiles = new LinkedList<>();
        portatiles.add(new PortatilComparable("MacBook Air", 64, 1.2));
        portatiles.add(new PortatilComparable("MacBook PRO", 128, 1.7));
        portatiles.add(new PortatilComparable("HP Pavilion", 64, 4.0));

        // ORDENAR
        Collections.sort(portatiles);

        // ORDENAR AL REVÉS
        Collections.sort(portatiles, Collections.reverseOrder());

        System.out.println(portatiles);

        // CON MAPAS
        TreeMap<PortatilComparable, String> mapa = new TreeMap<>(Comparator.reverseOrder());
        List<Map.Entry<PortatilComparable, String>> listaMapa = new ArrayList<>(mapa.entrySet());

        // ORDENAR POR VALOR
        listaMapa.sort(Map.Entry.comparingByValue());

        // ODENAR POR VALOR (REVERSE)
        listaMapa.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        // PRUEBA
        Prueba prueba = new Prueba(Arrays.asList("Adios", "Paco"));
        prueba.getListaIndestructible().add("Juan");

    }
}
