package Colecciones.Lamdas.EJS.EJ2;

public class VerificadorVotoApp {

    static void main() {

        VerificadorVoto lambda = (nombre, edad) -> {

            System.out.print("Probando " + nombre + " con " + edad + " años ... ");
            if (edad >= 18){
                return true;
            }else {
                return false;
            }

        };

        System.out.println(lambda.puedeVotar("Maria", 14));


    }
}
