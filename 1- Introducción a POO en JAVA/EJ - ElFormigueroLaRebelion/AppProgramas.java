package ElFormigueroLaRebelion;

public class AppProgramas {

    public static void main(String[] args) {

        Cadena antena3 = new Cadena("Antena 3");
        System.out.println(antena3);

        System.out.println("--------------------------------");

        Empleado director = new Empleado("Director 1", "director");
        Programa elHormiguero = new Programa("El Hormiguero", antena3, 10, director);
        System.out.println(elHormiguero);
        System.out.println(antena3);

        System.out.println("--------------------------------");

        elHormiguero.anadirEmpleado("Pablo Motos", "presentador");
        elHormiguero.anadirEmpleado("Juan", "técnico");
        System.out.println(elHormiguero.getListaEmpleados());

        System.out.println("--------------------------------");

        elHormiguero.anadirInvitado("Aitana", "cantante", 1);
        elHormiguero.anadirInvitado("Aitana", "cantante", 2);
        elHormiguero.anadirInvitado("Mario Casas", "actor", 2);

        System.out.println(elHormiguero.getListaInvitados());

        System.out.println("--------------------------------");

        System.out.println("¿Ha venido Aitana? " + elHormiguero.buscarInvitado("Aitana"));

        System.out.println("Aitana ha acudido " + elHormiguero.vecesInvitado("Aitana") + " veces.");

        System.out.println("--------------------------------");

        System.out.println("Invitados de la temporada 2:");
        elHormiguero.invitadosTemporada(2);

        System.out.println("--------------------------------");

        elHormiguero.rastrearInvitado("Aitana");

        System.out.println("--------------------------------");

        Empleado director2 = new Empleado("Director 2", "director");
        Programa laRebelion = new Programa("La Rebelión", antena3, 5, director2);

        laRebelion.anadirInvitado("Aitana", "cantante", 1);

        elHormiguero.invitadoAntes("Aitana", laRebelion);

        System.out.println("--------------------------------");

        elHormiguero.eliminarInvitado("Mario Casas");

        elHormiguero.eliminarEmpleado("Juan");

        System.out.println(elHormiguero);
    }
}
