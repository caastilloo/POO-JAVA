package Colecciones.TipoExamen.Problema2;

import java.util.Scanner;

public class AppExcursiones {

    static Scanner teclado = new Scanner(System.in);

    static void main() {

        System.out.println("******* APP EXCURSIONES *******");

        Excursion terra_mitica = new Excursion("Terra Mítica", "Benidorm", 30.0);

        System.out.println("Intoduce el nombre del profesor/a para la excursión en Benidorm");
        String profesor = teclado.nextLine();
        terra_mitica.insertarProfesor(profesor);

        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();
        terra_mitica.inscribirAsistente();

        terra_mitica.verAsistentes();

        terra_mitica.eliminarAsistentesPorEdad(16);
        System.out.println("\nDespués de eliminar a los menores de 16 años: ");
        terra_mitica.verAsistentes();

        System.out.println("\nImporte a ingresar para la actividad " + terra_mitica.getNombre_actividad() + " ene " +
                terra_mitica.getLocalidad() + ": " + terra_mitica.calcularImporteIngreso() + " €.");
    }
}
