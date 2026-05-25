package Chalet;

public class ChaletApp {

    static void main() {

        Casa pisito = new Casa("Calle Falsa 123");

        System.out.println();

        System.out.println(pisito.getPropietario());

        pisito.crearHabitacion("Cocina", 12.5);
        pisito.crearHabitacion("Terraza", 4);
        pisito.crearHabitacion("Despacho", 13);
        pisito.crearHabitacion("Despacho", 13);

        pisito.borrarHabitacion("Despacho");
        pisito.crearHabitacion("Despacho", 5);

        System.out.println();

//        Habitacion cocina = new Habitacion("Cocina", 7);

//        cocina.crearElectrodomesticos("Nevera", 120);
//        cocina.crearElectrodomesticos("Nevera", 14);
//        cocina.crearElectrodomesticos("Microondas", 180);
//        cocina.crearElectrodomesticos("Batidora", 100);

//        cocina.mostrarElectrodomesticos();

        pisito.getListaHabitaciones().get(0).crearElectrodomesticos("Nevera", 180);
        pisito.getListaHabitaciones().get(0).crearElectrodomesticos("Microondas", 120);

        pisito.getListaHabitaciones().get(0).mostrarElectrodomesticos();

        System.out.println();

        pisito.mostarHabitaciones();

        System.out.println("La habitación más grande es: " + pisito.getHabitacionGrande().getNombre());
//        System.out.println("La habitación que más consume es: " + pisito.getHabitacionMasConsumo().getNombre());

    }
}
