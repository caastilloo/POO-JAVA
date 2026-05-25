package Colecciones.hasEquals.EJS.Ejercicio3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class FuncionarioApp {

    static Deque<Informe> pila = new ArrayDeque<>();
    static Set<Informe> informesUnicos = new HashSet<>();

    static void main() {

        Informe inf1 = new Informe(1,"Revisar documentos", TipoDescripcion.ADMINISTRATIVO);
        Informe inf2 = new Informe(2,"Informe financiero",TipoDescripcion.EMPRESARIAL);
        Informe inf3 = new Informe(3,"Organizar agenda",TipoDescripcion.PERSONAL);
        Informe inf4 = new Informe(1,"Revisar documentos",TipoDescripcion.ADMINISTRATIVO);
        Informe inf5 = new Informe(4,"Plan empresa",TipoDescripcion.EMPRESARIAL);

        anyadirInforme(inf1);
        anyadirInforme(inf2);
        anyadirInforme(inf3);
        anyadirInforme(inf4);
        anyadirInforme(inf5);

        mostrarContenido();
        System.out.println();

        despacharTodos();
        System.out.println();

        anyadirInforme(new Informe(5,"Correo interno", TipoDescripcion.ADMINISTRATIVO));
        anyadirInforme(new Informe(6,"Reunión socios", TipoDescripcion.EMPRESARIAL));
        anyadirInforme(new Informe(7,"Organizar agenda", TipoDescripcion.PERSONAL));

        System.out.println();
        System.out.println("--- ORDEN DE SALIDA ---");
        despacharTodos();

        System.out.println();
        System.out.println("Tipos distintos de tareas: " + informesUnicos.size());


    }

    public static void anyadirInforme(Informe informe) {
        pila.push(informe);
        informesUnicos.add(informe);
    }

    public static void mostrarContenido() {
        System.out.println("Contenido de la pila:");
        for (Informe informe : pila) {
            System.out.println(informe);
        }
    }

    public static void despacharTodos() {
        System.out.println("Despachando informes:");
        while (!pila.isEmpty()) {
            System.out.println(pila.pop());
        }
    }
}
