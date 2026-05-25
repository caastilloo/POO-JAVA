package CopaDelRey;

/**
 * Clase que representa a un masajista del club.
 * Se encarga de atender a los jugadores.
 *
 * @author Jose
 * @version 1.0
 */
public class Masajista extends MutxamelFC {

    private String titulacion;
    private int anosExperiencia;

    /**
     * Constructor del masajista.
     *
     * @param nombre nombre del masajista
     * @param edad edad del masajista
     * @param titulacion titulación obtenida
     * @param anosExperiencia años de experiencia profesional
     */
    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public void concentrarse() {
        System.out.printf("El masajista " + getNombre() + " está concentrandose");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.printf("El masajista " + getNombre() + " está celebrando el GOL");
    }

    /**
     * Simula que el masajista da un masaje a un jugador.
     *
     * @param jugador jugador que recibe el masaje
     */
    public void darMasaje(Jugador jugador){
        System.out.println("El masajista " + getNombre() + " le está dando un masaje al jugador " + jugador.getNombre() + ".");
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }
}
