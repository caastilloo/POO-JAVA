package Tenis;

import java.util.ArrayList;

public class Partido {

    private Jugador jugador1;
    private Jugador jugador2;
    private ArrayList<Set> listaSets;

    public Partido(Jugador jugador1, Jugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        listaSets = new ArrayList<>();
    }

    public void insertarSet(int puntosj1, int puntosj2){
        Set set = new Set(puntosj1, puntosj2);
        listaSets.add(set);
    }

    public void mostrarInfoPartido(){
        System.out.println("Partido creado entre " + jugador1 + " y " + jugador2);
        int cont = 1;
        for(Set set : listaSets){
            System.out.println("-> Set "+ cont + ": " + set.getPuntosj1() + " - " + set.getPuntosj2());
            cont++;
        }

    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public void setJugador1(Jugador jugador1) {
        this.jugador1 = jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }

    public void setJugador2(Jugador jugador2) {
        this.jugador2 = jugador2;
    }

    public ArrayList<Set> getSets() {
        return listaSets;
    }

    public void setSets(ArrayList<Set> listaSets) {
        this.listaSets = listaSets;
    }

    @Override
    public String toString() {
        return "PARTIDO{" +
                "JUGADOR 1 =" + jugador1 +
                ", JUGADOR 2 =" + jugador2 +
                ", SETS =" + listaSets +
                '}';
    }



}
