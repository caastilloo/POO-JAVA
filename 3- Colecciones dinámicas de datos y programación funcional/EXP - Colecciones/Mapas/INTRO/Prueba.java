package Colecciones.Mapas.INTRO;

import java.util.HashMap;
import java.util.Map;

public class Prueba {

    static void main() {

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "España");
        mapa.put(2, "Senegal");
        mapa.put(3, "Marruecos");
        mapa.put(100, "EEUU");

        // Muestra las keys (izquierda)
        System.out.println(mapa.keySet());

        // Muestra los valores (derecha)
        System.out.println(mapa.values());

        // Sobrescribe a EEUU
        mapa.put(100, "Israel");
        System.out.println(mapa.values());

        for (Map.Entry<Integer, String> mapita : mapa.entrySet()){
            System.out.println("#" + mapita.getKey() + ": " + mapita.getValue());
        }
    }
}
