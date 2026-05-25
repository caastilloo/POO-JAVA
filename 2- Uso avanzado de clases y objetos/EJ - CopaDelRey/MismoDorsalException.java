package CopaDelRey;

/**
 * Excepción que se lanza cuando se intenta asignar
 * un dorsal que ya está ocupado en el mismo equipo.
 *
 * @author Jose
 * @version 1.0
 */
public class MismoDorsalException extends Exception {

    public MismoDorsalException(String message) {
        super(message);
    }

}
