package Colecciones.hasEquals.INTRO;

import java.util.Objects;

public class Refresco {

    private String marca;
    private double precio;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Refresco refresco = (Refresco) o;
        return Double.compare(precio, refresco.precio) == 0 && Objects.equals(marca, refresco.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, precio);
    }

    public Refresco(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Refresco{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
