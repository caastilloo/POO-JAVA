package SistemaPagoEcommerce;

/**
 * Clase abstracta que representa un método de pago genérico.
 *
 * Todas las formas de pago del sistema deben heredar de esta clase
 * e implementar su propia versión del método procesarPago().
 */
public abstract class MetodoPago {

    /**
     * Procesa el pago con el importe indicado.
     *
     * Cada subclase implementará este método según su tipo de pago.
     *
     * @param importe cantidad de dinero que se desea pagar
     */
    public abstract void procesarPago(double importe);
}
