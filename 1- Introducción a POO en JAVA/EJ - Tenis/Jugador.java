package Tenis;

public class Jugador {

    private String nombre;
    private int ranking;

    public Jugador(String nombre, int ranking){
        this.nombre = nombre;
        this.ranking = ranking;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "NOMBRE ='" + nombre + '\'' +
                ", RANKING =" + ranking +
                '}';
    }
}
