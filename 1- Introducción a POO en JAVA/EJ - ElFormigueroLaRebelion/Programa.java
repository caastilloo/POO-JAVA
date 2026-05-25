package ElFormigueroLaRebelion;

import java.util.ArrayList;

/**
 * Clase que representa un programa de televisión.
 * Un programa pertenece a una cadena y cuenta con empleados e invitados.
 * Permite gestionar la información de invitados y empleados,
 * así como consultar datos relacionados con sus visitas.
 *
 * @author José
 * @version 1.0
 */

public class Programa {

    private String nombre;
    private Cadena cadena;
    private int temporadas = 0;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    /**
     * Constructor de la clase Programa.
     *
     * @param nombre nombre del programa
     * @param cadena cadena a la que pertenece el programa
     * @param temporadas número de temporadas del programa
     * @param director empleado que actúa como director
     */
    public Programa(String nombre, Cadena cadena, int temporadas, Empleado director){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = temporadas;
        this.director = director;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
        listaEmpleados.add(director);
        cadena.anadirPrograma(this);

    }

    public Programa(String nombre, Cadena cadena){
        this.nombre = nombre;
        this.cadena = cadena;
        listaEmpleados = new ArrayList<>();
        listaInvitados = new ArrayList<>();
    }

    /**
     * Muestra por pantalla los invitados que han acudido en una temporada concreta.
     *
     * @param temporada temporada que se desea consultar
     */
    public void invitadosTemporada(int temporada){ //REVISAR
        int contador = 0;
        for (Invitado inv : listaInvitados){
            if (inv.getTemporada() == temporada){
                contador++;
                System.out.println(inv.getNombre() + " - " + inv.getProfesion());
            }
        }
        System.out.println("Han acudido un total de " + contador + " invitados");
    }

    /**
     * Comprueba si un invitado ha acudido al programa.
     *
     * @param nombre nombre del invitado
     * @return true si el invitado ha acudido, false en caso contrario
     */
    public boolean buscarInvitado(String nombre){
        for (Invitado inv : listaInvitados){
            if (inv.getNombre().equals(nombre)){
                return true;
            }
        }
        return false;
    }

    /**
     * Devuelve el número de veces que un invitado ha acudido al programa.
     *
     * @param nombre nombre del invitado
     * @return número de apariciones del invitado
     */
    public int vecesInvitado(String nombre) {
        int contador = 0;
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * Añade un invitado al programa.
     *
     * @param nombre nombre del invitado
     * @param profesion profesión del invitado
     * @param temporada temporada en la que acude
     */
    public void anadirInvitado(String nombre, String profesion, int temporada){
        Invitado invitado = new Invitado(nombre, profesion, temporada);
        listaInvitados.add(invitado);
        System.out.println("Invitado añadido correctamente: " + nombre);
    }

    /**
     * Muestra información detallada sobre las visitas de un invitado al programa.
     *
     * @param nombre nombre del invitado
     */
    public void rastrearInvitado(String nombre){
        System.out.println(nombre + " ha acudido " + vecesInvitado(nombre) + " veces.");

        for (Invitado inv : listaInvitados){
            if (inv.getNombre().equals(nombre)){
                System.out.println(
                        "Fecha: " + inv.getFecha_visita() +
                                " | Temporada: " + inv.getTemporada()
                );
            }
        }
    }

    /**
     * Elimina un invitado del programa a partir de su nombre.
     *
     * @param nombre nombre del invitado
     */
    public void eliminarInvitado(String nombre){
        for (Invitado inv : listaInvitados){
            if (inv.getNombre().equals(nombre)){
                listaInvitados.remove(inv);
                System.out.println("Invitado eliminado correctamente: " + nombre);
                return;
            }
        }
        System.out.println("No se ha encontrado el invitado: " + nombre);
    }

    /**
     * Añade un empleado al programa.
     *
     * @param nombre nombre del empleado
     * @param cargo cargo del empleado
     */
    public void anadirEmpleado(String nombre, String cargo){
        Empleado empl = new Empleado(nombre, cargo);
        listaEmpleados.add(empl);
        System.out.println("Empleado añadido: " + nombre + " (" + empl.getCargo() + ")");
    }

    /**
     * Elimina un empleado del programa a partir de su nombre.
     *
     * @param nombre nombre del empleado
     */
    public void eliminarEmpleado(String nombre){
        for (Empleado empl : listaEmpleados){
            if (empl.getNombre().equals(nombre)){
                listaEmpleados.remove(empl);
                System.out.println("Empleado eliminado correctamente: " + nombre);
                return;
            }
        }
        System.out.println("No se ha encontrado el empleado: " + nombre);
    }


    /**
     * Compara dos programas y muestra en cuál de ellos
     * un invitado acudió antes.
     *
     * @param nombre nombre del invitado
     * @param otroPrograma programa con el que se compara
     */
    public void invitadoAntes(String nombre, Programa otroPrograma) { // HECHO CON IA - Lo inserto para tener completo el proyecto, hacer pruebas y generar el JavaDoc
        Invitado invitadoEstePrograma = null;
        Invitado invitadoOtroPrograma = null;

        // Buscar invitado en este programa
        for (Invitado inv : listaInvitados) {
            if (inv.getNombre().equals(nombre)) {
                invitadoEstePrograma = inv;
                break;
            }
        }

        // Buscar invitado en el otro programa
        for (Invitado inv : otroPrograma.getListaInvitados()) {
            if (inv.getNombre().equals(nombre)) {
                invitadoOtroPrograma = inv;
                break;
            }
        }

        // Comparar fechas si ha estado en ambos programas
        if (invitadoEstePrograma != null && invitadoOtroPrograma != null) {
            if (invitadoEstePrograma.getFecha_visita()
                    .isBefore(invitadoOtroPrograma.getFecha_visita())) {

                System.out.println(nombre + " estuvo antes en " + this.nombre);

            } else {
                System.out.println(nombre + " estuvo antes en " + otroPrograma.getNombre());
            }
        } else {
            System.out.println("El invitado no ha estado en ambos programas");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Cadena getCadena() {
        return cadena;
    }

    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }

    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", cadena='" + cadena.getNombre() + '\'' +
                ", temporadas=" + temporadas +
                ", emleados=" + listaEmpleados +
                ", invitados=" + listaInvitados +
                '}';
    }
}
