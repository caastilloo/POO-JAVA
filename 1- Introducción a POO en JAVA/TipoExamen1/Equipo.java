package TipoExamen1;

import java.util.ArrayList;
import java.util.Arrays;

public class Equipo {

    private String nombre_equipo;
    private ArrayList<String> listaMiembros;
    private int problemas_resueltos = 0; // valor por defecto 0
    private int puntuacion = 0; // valor por defecto 0

    public Equipo(String nombre_equipo, int problemas_resueltos, int puntuacion){
        this.nombre_equipo = nombre_equipo;
        listaMiembros = new ArrayList<>();
        this.problemas_resueltos = problemas_resueltos;
        this.puntuacion = puntuacion;
    }

    public Equipo(String nombre_equipo){
        this.nombre_equipo = nombre_equipo;
        listaMiembros = new ArrayList<>();
    }

//    public void imprimirEquipos(){
//        System.out.println("Equipos inscritos: ");
//        System.out.println(nombre_equipo + listaMiembros);
//
////        for (Equipo equipo : listaMiembros){
////
////        }
//    }

    public void añadirMiembros(String ... miembros){

        if (listaMiembros.size() + miembros.length <= 4) {
            listaMiembros.addAll(Arrays.asList(miembros));
            System.out.println("Insertado/s con éxito, al equipo " + nombre_equipo);
        } else {
            System.out.println("Ya se ha alcanzado el número de inscripciones posible (4 máx).");
        }

    }

    public void calcularPuntuacion() {
        this.puntuacion = problemas_resueltos * 10;
        System.out.println("Puntuacion obtenida por el equipo " + nombre_equipo + ": " + puntuacion);
    }

    public String getNombre_equipo() {
        return nombre_equipo;
    }

    public void setNombre_equipo(String nombre_equipo) {
        this.nombre_equipo = nombre_equipo;
    }

    public ArrayList<String> getListaMiembros() {
        return listaMiembros;
    }

    public void setListaMiembros(ArrayList<String> listaMiembros) {
        this.listaMiembros = listaMiembros;
    }

    public int getProblemas_resueltos() {
        return problemas_resueltos;
    }

    public int setProblemas_resueltos(int problemas_resueltos) {
        return this.problemas_resueltos = problemas_resueltos;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre_equipo='" + nombre_equipo + '\'' +
                ", listaMiembros=" + listaMiembros +
                ", problemas_resueltos=" + problemas_resueltos +
                ", puntuacion=" + puntuacion +
                '}';
    }
}
