package Insti;

public class InstiApp {

    public static void main(String[] args) {

        Instituto instituto = new Instituto("IES MUTXAMEL");

        Curso cursoJava = new Curso("Java", 100);
        Curso cursoPython = new Curso("Python", 70);

        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoPython);

        try {
            Estudiante e1 = new Estudiante("Carlos", 20, cursoJava);
            Estudiante e2 = new Estudiante("Ana", 22, cursoPython);

            instituto.agregarEstudiante(e1);
            instituto.agregarEstudiante(e2);

            Estudiante error = new Estudiante(null);

        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }

        instituto.agregarEstudiante(null);
        instituto.agregarCurso(null);

        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());

        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
    }
}
