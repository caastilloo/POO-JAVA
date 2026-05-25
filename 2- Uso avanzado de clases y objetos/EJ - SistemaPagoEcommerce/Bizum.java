package SistemaPagoEcommerce;

import java.util.Random;
import java.util.Scanner;

/**
 * Representa el método de pago mediante Bizum.
 *
 * Genera un PIN aleatorio y valida tanto el teléfono como el PIN
 * antes de permitir el pago.
 */
public class Bizum extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);

    private String telefono;
    private int pin;

    /**
     * Constructor que recibe el número de teléfono.
     * Genera automáticamente un PIN aleatorio.
     *
     * @param telefono número de teléfono asociado a Bizum
     */
    public Bizum(String telefono){
        this.telefono = telefono;
        generarPin();
    }

    /**
     * Procesa el pago mostrando un mensaje de confirmación.
     *
     * @param importe cantidad a pagar
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + " € con Bizum" );
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    /**
     * Comprueba que el teléfono tenga 9 dígitos y que el PIN
     * introducido coincida con el generado.
     *
     * @param pin PIN introducido por el usuario
     * @return true si la validación es correcta, false en caso contrario
     */
    public boolean validarBizum(int pin){
        System.out.println("Validando Bizum ...");

        if (telefono.length()!=9){
            System.out.println("Los datos de tu Bizum no son correctos.");
            return false;
        }

        if (this.pin != pin){
            System.out.println("El PIN no es el correcto.");
            return false;
        }

        return true;

//        else {
//            System.out.println("Introduce el importe a pagar:");
//            int importe = teclado.nextInt();
//            procesarPago(importe);
//        }
    }

    /**
     * Genera un PIN aleatorio de 6 cifras.
     * Se muestra por pantalla para facilitar las pruebas.
     */
    private void generarPin(){
        Random aleatorio = new Random();

        pin = aleatorio.nextInt(900000) + 100000;
        System.out.println("[PIN GENERADO]: " + pin);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
