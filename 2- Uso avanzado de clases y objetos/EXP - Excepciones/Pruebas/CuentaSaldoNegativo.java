package Excepciones.Pruebas;

public class CuentaSaldoNegativo extends RuntimeException {

    //  OPCION 1
    public CuentaSaldoNegativo(String message) {
        super(message);
    }

    //  OPCION 2
    //  public CuentaSaldoNegativo() {
    //      super("El saldo tiene que ser positivo");
    //  }
}
