package ElFormigueroLaRebelion;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * Clase que representa a un invitado de un programa de televisión.
 * Un invitado tiene un nombre, una profesión, una fecha de visita
 * y la temporada en la que ha acudido al programa.
 *
 * @author José
 * @version 1.0
 */
public class Invitado {

    static Scanner teclado = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    /**
     * Constructor de la clase Invitado.
     * Solicita por teclado la fecha de la visita.
     *
     * @param nombre nombre del invitado
     * @param profesion profesión del invitado
     * @param temporada temporada en la que acude
     */
    public Invitado(String nombre, String profesion, int temporada){
        this.nombre = nombre;
        this.profesion = profesion;
        setFecha_visita();
        this.temporada = temporada;
    }

    /**
     * Constructor de la clase Invitado utilizado para pruebas.
     * Permite indicar directamente la fecha de la visita.
     *
     * @param nombre nombre del invitado
     * @param profesion profesión del invitado
     * @param temporada temporada en la que acude
     * @param fecha fecha de la visita
     */
    public Invitado(String nombre, String profesion, int temporada, LocalDate fecha) { //para pruebas
        this.nombre = nombre;
        this.profesion = profesion;
        this.temporada = temporada;
        this.fecha_visita = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public LocalDate getFecha_visita() {
        return fecha_visita;
    }

    public void setFecha_visita() {

        System.out.println("Introduce el año de la visita:");
        int anyo = teclado.nextInt();
        System.out.println("Introduce el mes:");
        int mes = teclado.nextInt();
        System.out.println("Introduce el día:");
        int dia = teclado.nextInt();

        fecha_visita = LocalDate.of(anyo, mes, dia);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }



    @Override
    public String toString() {
        return "Invitado{" +
                "nombre='" + nombre + '\'' +
                ", profesion='" + profesion + '\'' +
                ", fecha_visita=" + fecha_visita +
                ", temporada=" + temporada +
                '}';
    }
}
