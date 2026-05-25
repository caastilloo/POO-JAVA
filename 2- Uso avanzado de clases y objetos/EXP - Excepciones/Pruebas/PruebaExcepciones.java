package Excepciones.Pruebas;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    static void main() {

        int cuenta = -5;

        if (cuenta <= 0){
            try {
                throw new CuentaSaldoNegativo("El saldo tiene que ser positivo");
            }catch (CuentaSaldoNegativo e){
                System.out.println(e.getMessage());
            }

            // OPCION 1
            // throw new CuentaSaldoNegativo("El saldo tiene que ser positivo");

            // OPCION 2
            // throw new CuentaSaldoNegativo();
        }
    }
}
