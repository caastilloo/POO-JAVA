package Colecciones.Lamdas;

public class PruebaApp {

    static final String JOSE = "Jose";

    static void main() {

        Prueba anonima = new Prueba() {

            @Override
            public char saludar(String nombre) {
                System.out.println("Hola " + nombre + ", soy una anónima");
                return nombre.charAt(nombre.length()-1);
            }

        };

        System.out.println(anonima.saludar(JOSE));

        Prueba lambda = (nombre) -> {
            System.out.println("Hola " + nombre + ", soy una lambda");
            int num = (nombre.length()-1)/2;
            return nombre.charAt(num);
        };

        System.out.println(lambda.saludar(JOSE));

    }
}
