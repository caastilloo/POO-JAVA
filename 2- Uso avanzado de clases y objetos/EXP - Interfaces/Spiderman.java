package Interfaces;

public class Spiderman extends Superheroe implements Voladores{

    @Override
    public void volar() {
        System.out.println("Trepando edificios y volando con telarañas");
    }
}
