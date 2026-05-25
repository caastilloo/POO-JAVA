package Restaurante;

import java.util.ArrayList;

public class Camarero extends Persona{

    private double salario;
    private ArrayList<Integer> listaMesas;

    public Camarero(String nombre, String dni, double salario) {
        super(nombre, dni);
        this.salario = salario;
        listaMesas = new ArrayList<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public ArrayList<Integer> getListaMesas() {
        return listaMesas;
    }

    public void setListaMesas(ArrayList<Integer> listaMesas) {
        this.listaMesas = listaMesas;
    }

    @Override //Añado al toString
    public void mostrarInfoPersonas(){
        super.mostrarInfoPersonas();
        System.out.println("Salario: " + salario);
        System.out.println("Mesas: " + listaMesas);
    }

    @Override
    public void accederBanyo() {
        System.out.println("El camarero ha dejado de atender para ir al baño. Cubrir.");
    }

    @Override
    public String toString() {
        return "Camarero{" +
                "salario=" + salario +
                ", listaMesas=" + listaMesas +
                '}';
    }
}
