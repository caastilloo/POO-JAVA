package Restaurante;

import java.util.ArrayList;

public class BarPacoApp {

    static void main() {

        Camarero pepe = new Camarero("Pepe", "78238912L", 1234.89);
        pepe.mostrarInfoPersonas();

        System.out.println();

        Cliente jose = new Cliente("Jose", "45782345K", 3, 2);
        jose.mostrarInfoPersonas();

        System.out.println();

        Encargado nicolas = new Encargado("Nicolas", "43892376P", 3000);
        nicolas.mostrarInfoPersonas();

        Persona patri = new Encargado("Patri", "12431234I", 60000);

        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(patri);
//        System.out.println(listaPersonas);

        System.out.println("VA LA INFO DE LA HIJA:");
        patri.mostrarInfoPersonas();

        entrarBar(nicolas);
        entrarBar(patri);
        entrarBar(jose);

        pepe.accederBanyo();
        jose.accederBanyo();
        nicolas.accederBanyo();
    }

    public static void entrarBar(Persona persona){
        System.out.println("Holaa");
    }
}
