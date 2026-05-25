package EmpleadosTareas;

import java.util.ArrayList;

public class EmpleadosTareasApp {

    static void main() {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        Empleado jose = new Desarrollador("Jose", 19);
        listaEmpleados.add(jose);
        Empleado pablo = new Diseñador("Pablo", 18);
        listaEmpleados.add(pablo);
        Empleado carlos = new Gerente("Carlos", 21);
        listaEmpleados.add(carlos);

        System.out.println("a)");
        System.out.println("===== USANDO EL ARRAY POLIMÓRFICO =====");
        for (Empleado empleado : listaEmpleados){
            empleado.realizarTarea();
        }

        System.out.println();

        System.out.println("b)");
        System.out.println("===== USANDO EL MÉTODO asignarTarea() =====");
        for (Empleado empleado : listaEmpleados){
            asignarTarea(empleado);
        }

        System.out.println();

        System.out.println("c)");
        System.out.println("===== SIN USAR ARRAY =====");
        asignarTarea(carlos);
        asignarTarea(jose);

    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("Asignando tarea al empleado...");
        empleado.realizarTarea();
    }


}
