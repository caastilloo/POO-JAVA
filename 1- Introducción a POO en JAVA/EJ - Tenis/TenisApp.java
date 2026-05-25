package Tenis;

public class TenisApp {

    static void main() {

        Jugador j1 = new Jugador("Nadal", 1);
        Jugador j2 = new Jugador("Djokovic", 2);

        System.out.println(j1);
        System.out.println(j2);

        Partido partido = new Partido(j1, j2);
        partido.insertarSet(6, 4);
        partido.insertarSet(7, 6);

        System.out.println(partido);
        partido.mostrarInfoPartido();

    }
}
