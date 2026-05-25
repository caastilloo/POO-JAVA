package Colecciones.MetodosManipulacion.Comparadores.INTRO.Comparator;

import java.util.Objects;

public class PortatilComparator {

    private String nombre;
    private Integer ram;
    private Double peso;

    public PortatilComparator(String nombre, Integer ram, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.ram = ram;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        PortatilComparator portatil = (PortatilComparator) o;
        return ram == portatil.ram && Double.compare(peso, portatil.peso) == 0 && Objects.equals(nombre, portatil.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, ram, peso);
    }

//    @Override
//    public int compareTo(Portatil portatil) {
//
//        int comparar = ram.compareTo(portatil.getRam());
//
//        if (comparar != 0){
//            return comparar;
//        }
//
//        comparar = peso.compareTo(portatil.getPeso());
//
//        if (comparar != 0){
//            return comparar;
//        }
//
//        return nombre.compareTo(portatil.getNombre());
//    }

    @Override
    public String toString() {
        return "Portatil{" +
                "nombre='" + nombre + '\'' +
                ", ram=" + ram +
                ", peso=" + peso +
                '}';
    }
}
