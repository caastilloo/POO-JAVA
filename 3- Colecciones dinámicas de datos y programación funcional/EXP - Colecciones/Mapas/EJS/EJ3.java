package Colecciones.Mapas.EJS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EJ3 {

    static HashMap<String, Double> mapa = new HashMap<>();
    static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while (true){

            System.out.println("Elige una opción [insertar | actualizar | consultar | mostrar | salir]: ");
            String opcion = teclado.next().toLowerCase();
            teclado.nextLine();

            switch (opcion){

                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "mostrar":
                    verTodas();
                    break;
                case "salir":
                    System.out.println("Saliendo ...");
                    return;
                default:
                    System.out.println("ERROR. Opción no válida.");

            }
        }
    }

    public static void insertar(){

        System.out.println("Introduce los nuevos datos (ciudad/temperatura): ");
        String datos[] = teclado.nextLine().split("/");

        mapa.put(datos[0], Double.valueOf(datos[1]));

    }

    public static void actualizar(){

        System.out.print("Introduce la ciudad a actualizar: ");
        String ciudad = teclado.nextLine();


        if (mapa.containsKey(ciudad)){

            System.out.print("Introduce la nueva temperatura para " + ciudad + ":");
            double temp = teclado.nextDouble();

            mapa.put(ciudad, temp);

        }else {
            System.out.println("La ciudad no existe. Actualización cancelada.");
        }

    }

    public static void consultar(){

        System.out.print("Introduce la ciudad a consultar: ");
        String ciudad = teclado.nextLine();

        if (mapa.containsKey(ciudad)){

            for (Map.Entry<String, Double> mapita : mapa.entrySet()){
                if (mapita.getKey().equals(ciudad)){
                    System.out.println("Temperatura en " + ciudad + ": " + mapita.getValue());
                }
            }

        }else {
            System.out.println("La ciudad que has introducido no se encuentra registrada.");
        }

    }

    public static void verTodas(){

        System.out.println("Registro de TEMPERATURAS: ");
        for (Map.Entry<String,Double> mapita : mapa.entrySet()){
            System.out.println(mapita.getKey() + ": " + mapita.getValue() + "º");
        }

    }
}
