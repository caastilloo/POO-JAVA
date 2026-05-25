package CopaDelRey;

/**
 * Clase abstracta que representa a un integrante del Mutxamel FC.
 * Contiene los datos comunes como nombre y edad.
 *
 * @author Jose
 * @version 1.0
 */
public abstract class MutxamelFC implements FuncionesIntegrantes{

    private String nombre;
    private int edad;

    /**
     * Constructor de la clase.
     *
     * @param nombre nombre del integrante
     * @param edad edad del integrante
     */
    public MutxamelFC(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * @return nombre del integrante
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "MutxamielFC{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
