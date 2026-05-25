package CopaDelRey;

/**
 * Clase que representa al entrenador del equipo.
 * Puede entrenar, dirigir partidos y planificar la formación.
 *
 * @author Jose
 * @version 1.0
 */
public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida;

    /**
     * Constructor del entrenador.
     *
     * @param nombre nombre del entrenador
     * @param edad edad del entrenador
     * @param equipo equipo al que pertenece
     * @param formacionPreferida formación táctica (formato N-N-N)
     * @throws FormatoFormacionException si la formación no tiene el formato correcto
     */
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) throws FormatoFormacionException {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) throws FormatoFormacionException{

        if (!formacionPreferida.matches("\\d+-\\d+-\\d+")){
            throw new FormatoFormacionException("La formación debe tener formato N-N-N");
        }

        this.formacionPreferida = formacionPreferida;
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + " concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.printf("El entrenador " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El entrenador " + getNombre() + " está celebrando el GOL");
    }

    @Override
    public void entrenar() {
        System.out.printf("El entrenador " + getNombre() + " está entrenando a su equipo (" + equipo +  ")");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.printf("El entrenador " + getNombre() + " del equipo " + equipo + " está jugando contra " + rival);
    }

    /**
     * Planifica el entrenamiento del equipo.
     */
    public void planificarEntrenamiento(){
        System.out.printf(getNombre() + " está planificando el entrenamiento.");
    }

    /**
     * Realiza cambios durante el partido.
     */
    public void hacerCambios(){
        System.out.printf(getNombre() + " está haciendo cambios.");
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }
}
