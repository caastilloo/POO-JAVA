package Colecciones.MercaDaw;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jose
 * Clase que representa un pedido realizado por un cliente.
 */
public class Pedido {

    private HashMap<Producto, Integer> pedido;
    private double importe_total;

    /**
     * Constructor del pedido.
     */
    public Pedido() {
        this.pedido = new HashMap<>();
        this.importe_total = 0;
    }

    /**
     * Actualiza el importe total del pedido.
     * @param importe cantidad a añadir
     */
    public void actualizarImporteTotal(double importe){
        this.importe_total += importe;
    }

    /**
     * Aplica la promoción 3x2 al pedido.
     */
    public void aplicarPromo3x2(){
        double nuevoImporte = 0;

        for (Map.Entry<Producto, Integer> mapita : pedido.entrySet()){
            int cantidad = mapita.getValue();

            int gratis = cantidad / 3;
            int unidadesPagadas = cantidad - gratis;

            double subtotal = unidadesPagadas * mapita.getValue();

            nuevoImporte += subtotal;
        }

        this.importe_total = nuevoImporte;
    }

    /**
     * Aplica un descuento del 10% al importe total.
     */
    public void aplicarPromo10(){
        importe_total = importe_total * 0.9;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporte_total() {
        return importe_total;
    }

    public void setImporte_total(double importe_total) {
        this.importe_total = importe_total;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importe_total=" + importe_total +
                '}';
    }
}
