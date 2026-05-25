package Colecciones.MetodosManipulacion.Comparadores.INTRO.Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CompraAppComparator {

    static void main() {

        List<PortatilComparator> portatiles = new LinkedList<>();
        portatiles.add(new PortatilComparator("MacBook Air", 64, 1.2));
        portatiles.add(new PortatilComparator("MacBook PRO", 128, 1.7));
        portatiles.add(new PortatilComparator("HP Pavilion", 64, 4.0));

        // ORDENAR
        Collections.sort(portatiles, new CompararPorRAMPesoNombre());

        // ORDENAR AL REVÉS
        Collections.sort(portatiles, new CompararPorRAMPesoNombre().reversed());

        System.out.println(portatiles);

    }
}
