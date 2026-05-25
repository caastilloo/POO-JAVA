package CopaDelRey;

/**
 * Excepción que se lanza cuando la formación del entrenador
 * no tiene el formato correcto (N-N-N).
 *
 * @author Jose
 * @version 1.0
 */
public class FormatoFormacionException extends Exception {
    public FormatoFormacionException(String message) {
        super(message);
    }
}
