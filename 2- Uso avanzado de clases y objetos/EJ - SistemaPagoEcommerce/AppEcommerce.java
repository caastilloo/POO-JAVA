package SistemaPagoEcommerce;

/**
 * Clase principal de la aplicación.
 *
 * Se encarga de iniciar el sistema de pago del e-commerce.
 * Desde aquí se lanza el proceso que permite al usuario
 * seleccionar un método de pago y realizar la operación.
 */
public class AppEcommerce {

    /**
     * Método principal del programa.
     *
     * Inicia la ejecución llamando al método iniciarPago()
     * de la clase Tienda.
     */
    static void main() {

        Tienda.iniciarPago();

    }
}
