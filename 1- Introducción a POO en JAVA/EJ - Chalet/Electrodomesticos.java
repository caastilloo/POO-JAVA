package Chalet;

public class Electrodomesticos {

    private String nombre;
    private int consumo; //(kWh)

    public Electrodomesticos(String nombre, int consumo){
        this.nombre = nombre;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Electrodomesticos{" +
                "nombre='" + nombre + '\'' +
                ", consumo=" + consumo +
                '}';
    }

}
