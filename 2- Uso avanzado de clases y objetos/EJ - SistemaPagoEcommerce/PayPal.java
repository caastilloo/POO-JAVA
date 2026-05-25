package SistemaPagoEcommerce;

import java.util.Scanner;

/**
 * Representa el método de pago mediante PayPal.
 *
 * Comprueba que el correo tenga un formato válido y que el
 * saldo disponible sea suficiente para realizar el pago.
 */
public class PayPal extends MetodoPago{

    static Scanner teclado = new Scanner(System.in);

    private String cuenta;
    private double saldo = 23;

    /**
     * Constructor que recibe la cuenta de PayPal.
     *
     * @param cuenta correo electrónico asociado a la cuenta
     */
    public PayPal(String cuenta){
        this.cuenta = cuenta;
    }

    /**
     * Procesa el pago mostrando un mensaje de confirmación.
     *
     * @param importe cantidad a pagar
     */
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesado pago de " + importe + " con PayPal");
        System.out.println("Pago aceptado. Muchas gracias.");
    }

    /**
     * Valida el formato del correo y comprueba si hay saldo suficiente.
     *
     * @param importe cantidad que se desea pagar
     * @return true si la validación es correcta, false en caso contrario
     */
    public boolean validarPayPal(double importe){
        System.out.println("Validando PayPal ...");

        if (!cuenta.matches("^[A-Za-z0-9+_.-]+@alu.edu.gva.com$")){
            System.out.println("Los datos de tu PayPal no son correctos.");
            return false;
        }

        if (importe > saldo) {
            System.out.println("NO tiene saldo suficiente.");
            return false;
        }

        return true;

//        else {
//            System.out.println("Intoduce el importe a pagar:");
//            int importe = teclado.nextInt();
//            if (importe < saldo){
//                procesarPago(importe);
//            }else {
//                System.out.println("No tiene saldo suficiente para pagar.");
//            }
//        }
    }


    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
