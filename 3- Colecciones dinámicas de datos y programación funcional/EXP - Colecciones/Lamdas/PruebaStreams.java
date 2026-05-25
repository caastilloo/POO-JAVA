package Colecciones.Lamdas;

import java.util.List;
import java.util.stream.Stream;

public class PruebaStreams {

    static void main() {

        // Inicializamos el Stream
        Stream<String> pruebaStream = Stream.of("Gatos", "Leones", "Tigre", "Guepardo")
                // Filtramos con Lamda
                .filter(felino -> felino.endsWith("s"))
                .filter(felinos -> felinos.contains("e"))
                .map(String::toUpperCase)
                //.count() Tiene que ser long
                // .anyMatch(felinos -> felinos.equals("LEONES")) Tiene que ser boolean
                ;



        // Guardar el stream
        List<String> felinos = pruebaStream.toList();
        // Imprimo la lista felinos
        System.out.println(felinos);


    }
}
