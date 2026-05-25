package CopaDelRey;

/**
 * Clase que representa a un acompañante de un jugador.
 * Solo puede asociarse a jugadores del equipo SENIOR.
 *
 * @author Jose
 * @version 1.0
 */
public class Acompanyante extends MutxamelFC {

    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor del acompañante.
     *
     * @param nombre nombre del acompañante
     * @param edad edad del acompañante
     * @param integrante jugador al que acompaña
     * @param parentesco relación con el jugador
     */
    public Acompanyante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + getNombre() + " está concentrandose para el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El acompañante " + getNombre() + " está celebrando el GOL");
    }

    /**
     * Simula que el acompañante anima al equipo durante el partido.
     */
    public void animarEquipo(){
        System.out.printf(getNombre() + " está animando a su equipo.");
    }

    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }
}
