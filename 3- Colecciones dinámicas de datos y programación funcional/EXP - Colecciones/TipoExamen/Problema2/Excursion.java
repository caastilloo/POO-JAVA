package Colecciones.TipoExamen.Problema2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Excursion {

    static Scanner teclado = new Scanner(System.in);

    private String nombre_actividad;
    private String localidad;
    private double precio;
    private LinkedList<String> profesores = new LinkedList<>();
    private ArrayList<Estudiante> listaAsistentes = new ArrayList<>();

    public Excursion(String nombre_actividad, String localidad, double precio) {
        this.nombre_actividad = nombre_actividad;
        this.localidad = localidad;
        this.precio = precio;
        profesores = new LinkedList<>();
        listaAsistentes = new ArrayList<>();
    }

    public void insertarProfesor(String profesor){
        profesores.add(profesor);
        System.out.println("Profesor (" + profesor + ") añadido correctamente a la excursión " + nombre_actividad + "\n");
    }

    public void inscribirAsistente(){
        System.out.println("Creando estudiante ...");
        System.out.println("Inserta los apellidos:");
        String apellidos = teclado.nextLine();
        System.out.println("Inserta el nombre:");
        String nombre = teclado.nextLine();
        System.out.println("Inserta el curso:");
        String curso = teclado.nextLine();
        System.out.println("Inserta su edad:");
        int edad = teclado.nextInt();
        teclado.nextLine();

        Estudiante estudiante = new Estudiante(apellidos, nombre, curso, edad);

        if (listaAsistentes.contains(estudiante)){
            System.out.println("El estudiante ya existe en la lista de asistentes a la actividad " + nombre_actividad + "\n");
        }else {
            listaAsistentes.add(estudiante);
            System.out.println("Añadido correctamente el estudiante " + nombre + " " + apellidos + " del curso " + curso + "\n");
        }


    }

    public double calcularImporteIngreso(){
        double importeIng = listaAsistentes.size() * precio;

        return importeIng;
    }

    public void verAsistentes(){

        int auxiliar = 1;

        System.out.println("Lista de inscritos para la actividad " + nombre_actividad);
        for (Estudiante estudiante : listaAsistentes){
            System.out.println("[" + auxiliar + "]. " + estudiante.getCurso() + " - " + estudiante.getApellidos() + ", " + estudiante.getNombre() + "(" + estudiante.getEdad() + ").");
            auxiliar++;
        }
    }

    public void eliminarAsistentesPorEdad(int edad){ // solucion provisional

        Iterator<Estudiante> it = listaAsistentes.iterator();

        while (it.hasNext()){
            Estudiante estudiante = it.next();

            if (estudiante.getEdad() < edad){
                it.remove();
            }
        }
    }

    public String getNombre_actividad() {
        return nombre_actividad;
    }

    public void setNombre_actividad(String nombre_actividad) {
        this.nombre_actividad = nombre_actividad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public LinkedList<String> getProfesores() {
        return profesores;
    }

    public void setProfesores(LinkedList<String> profesores) {
        this.profesores = profesores;
    }

    public ArrayList<Estudiante> getListaAsistentes() {
        return listaAsistentes;
    }

    public void setListaAsistentes(ArrayList<Estudiante> listaAsistentes) {
        this.listaAsistentes = listaAsistentes;
    }
}
