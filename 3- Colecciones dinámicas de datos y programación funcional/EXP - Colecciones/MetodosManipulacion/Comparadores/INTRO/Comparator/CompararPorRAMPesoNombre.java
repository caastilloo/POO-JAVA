package Colecciones.MetodosManipulacion.Comparadores.INTRO.Comparator;

import java.util.Comparator;

public class CompararPorRAMPesoNombre implements Comparator<PortatilComparator> {

    @Override
    public int compare(PortatilComparator portatil1, PortatilComparator portatil2) {

        int comparar = portatil1.getRam().compareTo(portatil2.getRam());

        if (comparar != 0){
            return comparar;
        }

        comparar = portatil1.getPeso().compareTo(portatil2.getPeso());

        if (comparar != 0){
            return comparar;
        }

        return portatil1.getNombre().compareTo(portatil2.getNombre());
    }
}
