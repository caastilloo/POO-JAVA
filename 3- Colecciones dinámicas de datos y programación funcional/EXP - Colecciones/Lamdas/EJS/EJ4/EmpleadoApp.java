package Colecciones.Lamdas.EJS.EJ4;

import java.util.*;

public class EmpleadoApp {

    static List<Empleado> listaEmpleados = new ArrayList<>();

    static void main() {

        Empleado jose = new Empleado("Jose", 2.500, "20/07/2006");
        listaEmpleados.add(jose);

        Empleado pablo = new Empleado("Pablo", 2.000, "15/04/2000");
        listaEmpleados.add(pablo);

        Empleado alvaro = new Empleado("Alvaro", 1.800, "02/01/2006");
        listaEmpleados.add(alvaro);

        Empleado pascual = new Empleado("Pascual", 2.800, "03/06/2006");
        listaEmpleados.add(pascual);

        Collections.sort(listaEmpleados, (p1, p2) -> p1.getUsuario().compareTo(p2.getUsuario()));

        listaEmpleados.sort(Comparator.comparing(p -> p.getUsuario()));

        Collections.sort(listaEmpleados, (p1, p2) -> p1.getUsuario().compareTo(p2.getUsuario()));

        listaEmpleados.sort(Comparator.comparing(p -> p.getSalario()));

    }
}
