package TipoExamen2;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    static final double DESC_PRED = 0.20;

    private Cliente cliente;
    private ArrayList<CartaPizzas> listaPizzas;
    private Estado estadoPedido;

    public Pedido(Cliente cliente, Estado estadoPedido) {
        this.cliente = cliente;
        listaPizzas = new ArrayList<>();
        this.estadoPedido = estadoPedido;
    }

    public void pedir(){

    }

    public void pagar(){
        System.out.println("Pasa por caja para pagar y recoger tu pedido cuando este " + Estado.LISTO);
    }

    public void recoger(){

    }

    public double aplicarDescuento(CartaPizzas pizza, Estado estado){
        double total_pago = pizza.getPrecio()*(1-DESC_PRED);
        return total_pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<CartaPizzas> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<CartaPizzas> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    void obtenerDetalles() {

    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", listaPizzas=" + listaPizzas +
                ", estadoPedido=" + estadoPedido +
                '}';
    }
}
