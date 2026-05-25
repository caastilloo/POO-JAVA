package ElFormigueroLaRebelion;

import java.util.ArrayList;

/**
 * Clase que representa una cadena de televisión.
 * Una cadena contiene una lista de programas que se emiten en ella
 * y permite gestionar la incorporación y eliminación de programas.
 *
 * @author José
 * @version 1.0
 */
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;

    /**
     * Constructor de la clase Cadena.
     *
     * @param nombre nombre de la cadena de televisión
     */
    public Cadena(String nombre){
        this.nombre = nombre;
        listaProgramas = new ArrayList<>();
    }

    /**
     * Añade un programa a la cadena.
     *
     * @param programa programa que se desea añadir
     */
    public void anadirPrograma(Programa programa){
        listaProgramas.add(programa);
        System.out.println("Programa añadido a la cadena: " + programa.getNombre());
    }

    /**
     * Elimina un programa de la cadena a partir de su nombre.
     *
     * @param nombre nombre del programa a eliminar
     */
    public void eliminarPrograma(String nombre){
        for (Programa prog : listaProgramas){
            if (prog.getNombre().equals(nombre)){
                listaProgramas.remove(prog);
                System.out.println("Programa eliminado de la cadena: " + nombre);
                return;
            }
        }
        System.out.println("No se ha encontrado el programa: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaProgramas() {
        return listaProgramas;
    }

    public void setListaProgramas(ArrayList<Programa> listaProgramas) {
        this.listaProgramas = listaProgramas;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "nombre='" + nombre + '\'' +
                ", listaProgramas=" + listaProgramas +
                '}';
    }
}
