package Colecciones.Lamdas.EJS.EJ1;

public class EjecutorApp {

    static void main() {

        Ejecutor lambda = (numero) ->{

            System.out.println("Comprobando para " + numero + ":");

            if (numero > 10){
                return true;
            }else {
                return false;
            }

        };

        System.out.println(lambda.ejecutar(15));
        System.out.println(lambda.ejecutar(5));



    }
}
