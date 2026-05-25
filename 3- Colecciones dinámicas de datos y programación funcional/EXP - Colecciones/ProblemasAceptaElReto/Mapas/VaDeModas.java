package Colecciones.ProblemasAceptaElReto.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VaDeModas {

    static Scanner teclado = new Scanner(System.in);
    static HashMap<String, Integer> mapa = new HashMap<>();

    public static boolean casoDePrueba() {

        int num = teclado.nextInt();
        teclado.nextLine();

        if (num == 0){
            return false;
        } else {

            String cadena = teclado.nextLine();

            for (String numero : cadena.split(" ")){

                if (mapa.containsKey(numero)){
                    mapa.put(numero, mapa.get(numero)+1);
                }else {
                    mapa.put(numero, 1);
                }

            }

            int valorMax = 0;
            String valorMaxImpr = "";
            for (Map.Entry<String, Integer> mapita : mapa.entrySet()){
                System.out.println(mapita.getKey() + " " + mapita.getValue());

                if (mapita.getValue()>valorMax){
                    valorMaxImpr = mapita.getKey();
                }
            }

            System.out.println(valorMaxImpr);

//            int valorMax = 0;
//            for (Map.Entry<String, Integer> mapita : mapa.entrySet()){
//                if (mapita.getValue()>valorMax){
//                    valorMax += mapita.getValue();
//                }
//            }



//            for (int i = 0; i < mapa.size(); i++) {
//
//                for (Map.Entry<String, Integer> mapita : mapa.entrySet()){
//                    if (mapita.getValue()>valorMax){
//                        valorMax += mapita.getValue();
//                    }
//                }
//
//            }

            return true;
        }
    }

    public static void main(String[] args) {

        while (casoDePrueba()) {

        }
    }
}
