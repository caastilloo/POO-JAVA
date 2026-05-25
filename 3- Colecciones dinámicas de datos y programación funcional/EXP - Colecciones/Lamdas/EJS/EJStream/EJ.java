package Colecciones.Lamdas.EJS.EJStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EJ {

    static void main() {

        List<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "Pedro", "Antonio"));
        nombres.stream()
                .filter(nombre -> nombre.length() > 4)
                .forEach(System.out::println);

        List<String> nombresMinusculas = nombres.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(nombresMinusculas);

        long cantidad = nombres.stream()
                .filter(nombre -> nombre.startsWith("A"))
                .count();

        System.out.println("Nombres que empiezan con 'A': " + cantidad);




    }
}
