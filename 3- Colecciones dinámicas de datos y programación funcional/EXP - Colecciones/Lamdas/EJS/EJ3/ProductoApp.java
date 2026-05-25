package Colecciones.Lamdas.EJS.EJ3;

import java.util.ArrayList;
import java.util.List;

public class ProductoApp {

    static List<Producto> productosLista = new ArrayList<>();
    static List<Producto> filtroProductosLista = new ArrayList<>();

    static void main() {

        Producto axe = new Producto("AXE Dark", 7.99, "Higiene");
        productosLista.add(axe);

        Producto pringles = new Producto("Pringles", 4.99, "Snacks");
        productosLista.add(pringles);

        Producto colgate = new Producto("Colgate 3x1", 2.75, "Higiene");
        productosLista.add(colgate);

        Producto cargador = new Producto("Cargador Apple", 50.00, "Electrónica");
        productosLista.add(cargador);

        Producto mouse = new Producto("Logitech Wireless Mouse", 120.95, "Electrónica");
        productosLista.add(mouse);

        Producto teclado = new Producto("Razer Wireless Keyboard", 105.99, "Electrónica");
        productosLista.add(teclado);

        FiltroProducto filtro = (producto) -> {

            if (producto.getCategoria().equals("Electrónica") && producto.getPrecio() > 100){
                filtroProductosLista.add(producto);

            }

            return false;
        };

        filtro.filtrarProducto(axe);
        filtro.filtrarProducto(pringles);
        filtro.filtrarProducto(colgate);
        filtro.filtrarProducto(cargador);
        filtro.filtrarProducto(mouse);
        filtro.filtrarProducto(teclado);

        System.out.println("Productos filtrados (Electrónica y precio > 100)");
        for (Producto producto : filtroProductosLista){
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }

    }
}
