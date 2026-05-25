package Imserso;

public class ImsersoApp {

    static void main() {

        Abuelo pepe = new Abuelo("Pepe", 83);
        Abuelo marisa = new Abuelo("Marisa", 68);
        Abuelo juan = new Abuelo("Juan", 75);
        Abuelo josefina = new Abuelo("Josefina", 100);

        Autobus alsa = new Autobus("1234DFC", "Murcia");

        alsa.insertarAbuelo(pepe);
        alsa.insertarAbuelo(marisa, juan, josefina);

        System.out.println("Lista abuelos: ");
        System.out.println(alsa.getListaAbuelos());

        alsa.borrarAbuelo(juan);

        System.out.println(alsa.getListaAbuelos());

        System.out.println();

        alsa.mostrarPasajeros();

        System.out.println();

        alsa.mostrarMayores(80);



    }
}
