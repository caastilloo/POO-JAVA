package Colecciones.MercaDaw;

import java.util.Objects;

/**
 * @author Jose
 * Clase que representa a un cliente del sistema.
 */
public class Cliente {

    private String usuario;
    private String contrasenya;
    private String direccion;
    private Pedido pedido;
    private boolean promociones;

    /**
     * Constructor del cliente.
     * @param usuario nombre de usuario
     * @param contrasenya contraseña del usuario
     */
    public Cliente(String usuario, String contrasenya) {
        this.usuario = usuario;
        this.contrasenya = contrasenya;
        direccion = "Calle falsa, 123";
        pedido = null;
        promociones = false;
    }

    /**
     * Crea un nuevo pedido para el cliente.
     */
    public void crearPedido(){
        System.out.println("\nCreando nuevo pedido ...");
        this.pedido = new Pedido();
    }

    /**
     * Inserta un producto en el pedido del cliente.
     * @param producto producto a añadir
     */
    public void insertarProducto(Producto producto){

        if (pedido.getPedido().containsKey(producto)){
            int cantidad = pedido.getPedido().get(producto);
            pedido.getPedido().put(producto, cantidad + 1);
        }else {
            pedido.getPedido().put(producto, 1);
        }

        pedido.actualizarImporteTotal(producto.getPrecio());
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(String contraseña) {
        this.contrasenya = contrasenya;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public boolean isPromociones() {
        return promociones;
    }

    public void setPromociones(boolean promociones) {
        this.promociones = promociones;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(usuario, cliente.usuario) && Objects.equals(contrasenya, cliente.contrasenya);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, contrasenya);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "usuario='" + usuario + '\'' +
                ", contrasenya='" + contrasenya + '\'' +
                ", direccion='" + direccion + '\'' +
                ", pedido=" + pedido +
                ", promociones=" + promociones +
                '}';
    }
}
