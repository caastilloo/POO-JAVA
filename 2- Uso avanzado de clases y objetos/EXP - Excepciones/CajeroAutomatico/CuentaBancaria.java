package Excepciones.CajeroAutomatico;

import java.util.Scanner;

public class CuentaBancaria {

    static Scanner teclado = new Scanner(System.in);

    private double saldo = 500;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void menu(){

        System.out.println("=== Cajero Automático ===");
        System.out.println("[1]- Consultar Saldo:");
        System.out.println("[2]- Ingresar dinero:");
        System.out.println("[3]- Retirar dinero");
        System.out.println("[X]- Salir:");

        System.out.print("-> Introduce una opción: ");
        char opcion = teclado.next().charAt(0);

        validarOpcion(opcion);

    }

    public void validarOpcion(char opcion){

        switch (opcion){
            case '1':
                consultarSaldo();
                break;
            case '2':
                ingresarDinero();
                break;
            case '3':
                retirarDinero();
                break;
            case 'X':
                return;
            default:
                System.out.println("Introduce una opción válida");
                break;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo disponible: " + saldo + "€");
    }

    public void ingresarDinero(){
        System.out.print("Introduce el importe a ingresar: ");
        double ingreso = teclado.nextDouble();

        if (ingreso > 3000){
            throw new DepositoMaximoException("No se puede ingresar mas de 3000€");
        }else {
            saldo = saldo+ingreso;
            System.out.println("Dinero ingresado con éxito. Saldo actual: " + saldo + "€");
        }
    }

    public void retirarDinero(){
        System.out.println("Introduce el importe a retirar: ");
        double retiro = teclado.nextDouble();

        if (retiro > saldo){
            throw new SaldoInsuficienteException("El retiro que quiere hacer supera a su saldo actual.");
        } else if (retiro > 600) {
            throw new LimiteDiarioException("No puedes retirar mas de 600€ en un día");
        }else {
            saldo = saldo-retiro;
            System.out.println("Dinero retirado con éxito. Saldo actual: " + saldo + "€");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
