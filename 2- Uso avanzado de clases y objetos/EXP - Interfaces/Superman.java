package Interfaces;

public class Superman extends Superheroe implements Voladores, Ataques{

    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad vigilando a los malos ...");
    }

    @Override
    public void ojos_laser() {
        System.out.println("Saliendo laser de los ojos ...");
    }

    @Override
    public void saltar() {
        System.out.println("Saltando 10 metros ...");
    }

    @Override
    public void hielo() {
        System.out.println("Escupiendo hielo ...");
    }
}
