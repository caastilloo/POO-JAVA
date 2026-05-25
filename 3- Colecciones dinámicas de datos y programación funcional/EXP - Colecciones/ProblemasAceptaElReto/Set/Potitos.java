package Colecciones.ProblemasAceptaElReto.Set;

import java.util.*;

public class Potitos {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numPotitos = teclado.nextInt();

        while (numPotitos != 0) {
            casoDePrueba(numPotitos);
            numPotitos = teclado.nextInt();
        }
    }

    public static void casoDePrueba(int numPotitos) {

        TreeSet<String> posiblesNoGustan = new TreeSet<>();
        HashSet<String> gustan = new HashSet<>();

        for (int i = 0; i < numPotitos; i++) {

            String tipo = teclado.next();
            String ingrediente = teclado.next();

            while (!ingrediente.equals("FIN")) {

                if (tipo.equals("NO:")) {
                    posiblesNoGustan.add(ingrediente);
                } else {
                    gustan.add(ingrediente);
                }

                ingrediente = teclado.next();
            }
        }

        posiblesNoGustan.removeAll(gustan);

        for (String ing : posiblesNoGustan) {
            System.out.print(ing + " ");
        }

        System.out.println();
    }
}