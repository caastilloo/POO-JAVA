package TipoExamen1;

import java.time.LocalDate;
import java.util.ArrayList;

public class Concurso {

    private static final String NOMB_SEDE = "MUTXAMIEL";

    private String sede; // TIENE QUE SER SIEMPRE MUTXAMIEL
    private LocalDate fecha;
    private ArrayList<Equipo> listaEquipo;
    private Equipo equipo;

    public Concurso(String sede, LocalDate fecha){
        this.sede = NOMB_SEDE;
        this.fecha = fecha;
        listaEquipo = new ArrayList<>();
    }

    public Concurso(){
        listaEquipo = new ArrayList<>();
    }

    public void insertarEquipo(Equipo equipo){
        listaEquipo.add(equipo);
    }

    public void añadirEquipo(Equipo equipo){

        if (listaEquipo.size() < 20){
            listaEquipo.add(equipo);
        }else {
            System.out.println("No se pueden añadir mas de 20 equipos al concurso.");
        }

    }

    public void equipoGanador(int puntacion, int puntuacion2) {



    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Equipo> getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(ArrayList<Equipo> listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    @Override
    public String toString() {
        return "Concurso{" +
                "sede='" + sede + '\'' +
                ", fecha=" + fecha +
                ", listaEquipo=" + listaEquipo +
                '}';
    }

}
