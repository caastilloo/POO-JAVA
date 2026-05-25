package TipoExamen2;

public class Empleado extends PizzaExpress implements AccionesPedido{

    private String id_empleado; //EMP001
    private String nombre;

    public Empleado(String id_empleado, String nombre) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(String id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void siguienteEstado(Pedido pedido){

    }

    public void entregarPedido(Pedido pedido){

    }

    @Override
    public void cancelar(Pedido pedido) {

    }

    @Override
    void obtenerDetalles() {

    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado='" + id_empleado + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
