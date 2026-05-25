package Colecciones.MercaDaw;

/**
 * @author Jose
 * Enum que representa los productos disponibles en el supermercado
 * junto con su precio.
 */
public enum Producto {

    MANZANAS(2.30), PAN(1.00), ARROZ(3.50), POLLO(4.30), LECHE(1.30),
    ACEITE(8.30), HUEVOS(3.30), TOMATES(4.00), PASTA(0.89);

    public final double precio;

    /**
     * Constructor del producto.
     * @param precio precio del producto
     */
    Producto(double precio){
        this.precio = precio;
    }

    /**
     * Devuelve el precio del producto.
     * @return precio
     */
    public double getPrecio() {
        return precio;
    }
}
