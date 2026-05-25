package Colecciones.Mapas.EJS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ2 {

    static Scanner teclado = new Scanner(System.in);
    static HashMap<Character, Integer> mapa = new HashMap<>();

    static void main() {

        System.out.println("Introduce una palabra: ");
        String palabra = teclado.next();

        for (Character caracter : palabra.toCharArray()){

//            if (mapa.containsKey(caracter)){
//                mapa.put(caracter, mapa.get(caracter)+1);
//            }else {
//                mapa.put(caracter, 1);
//            }

            // Otra forma más simple (versiones mas nuevas)
            mapa.put(caracter, mapa.getOrDefault(caracter,0)+1);

        }

        for (Map.Entry<Character, Integer> mapita : mapa.entrySet()){
            System.out.println(mapita.getKey() + ": " + mapita.getValue());
        }


    }
}
