package TipoExamen2;

public class Cliente extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private int descuento = 20; // 20%

    public Cliente(String nombre, int descuento) {
        this.nombre = nombre;
        this.descuento = descuento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    void obtenerDetalles() {

    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                '}';
    }


}
