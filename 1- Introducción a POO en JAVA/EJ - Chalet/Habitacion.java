package Chalet;

import java.util.ArrayList;

public class Habitacion {

    private String nombre;
    private double metros;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;

    public Habitacion (String nombre, double metros){
        this.nombre = nombre;
        this.metros = metros;
        listaElectrodomesticos = new ArrayList<>();
    }

    public void crearElectrodomesticos(String nombre, int consumo){
        for (Electrodomesticos electrodomesticos : listaElectrodomesticos){
            if (electrodomesticos.getNombre().equals(nombre)){
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }
        }

        Electrodomesticos electrodomesticos = new Electrodomesticos(nombre, consumo);
        listaElectrodomesticos.add(electrodomesticos);
    }

    public void mostrarElectrodomesticos(){
        System.out.println("Hay " + listaElectrodomesticos.size() + " electrodomésticos en la habitación " + nombre);
        for (Electrodomesticos electrodomesticos : listaElectrodomesticos){
            System.out.println("-> " + electrodomesticos.getNombre() + ", con un consumo de " + electrodomesticos.getConsumo());
        }
    }

    public double calcularConsumo(int consumo){
        double consumoTotal = 0;

        for (Electrodomesticos electrodomesticos : listaElectrodomesticos){
            consumoTotal += consumo;
        }

        return consumoTotal;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }


}
