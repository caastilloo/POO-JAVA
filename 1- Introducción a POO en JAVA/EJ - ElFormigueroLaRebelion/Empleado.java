package ElFormigueroLaRebelion;

/**
 * Clase que representa a un empleado de un programa de televisión.
 * Cada empleado tiene un identificador, un nombre y un cargo.
 * Opcionalmente, puede tener asignado un director.
 *
 * @author José
 * @version 1.0
 */
public class Empleado {

    private static final String SIGLAS_ID = "EP";
    private static int cantidadLibros = 0;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director; // Por hacer

    /**
     * Constructor de la clase Empleado.
     * Genera automáticamente un identificador para el empleado.
     *
     * @param nombre nombre del empleado
     * @param cargo cargo que desempeña el empleado
     */
    public Empleado(String nombre, String cargo){
        cantidadLibros++;
        id = generarId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
//        this.director = director;
    }

    /**
     * Genera un identificador único para el empleado.
     *
     * @return identificador del empleado
     */
    public String generarId(){
        return SIGLAS_ID + cantidadLibros;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public String setCargo(String cargo) {
        if (cargo.equals("director") || cargo.equals("técnico") || cargo.equals("presentador") || cargo.equals("colaborador")){
            return cargo;
        }else {
            return "pte";
        }
    }

    public Empleado getDirector() {
        return director;
    }

    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", director=" + director +
                '}';
    }
}
