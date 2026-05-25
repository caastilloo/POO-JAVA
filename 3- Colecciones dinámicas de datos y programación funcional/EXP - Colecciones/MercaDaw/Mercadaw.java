package Colecciones.MercaDaw;

import java.util.*;

/**
 * @author Jose
 * Clase que representa el sistema del supermercado.
 */
public class Mercadaw {

    static Random aleatorio = new Random();
    private Set<Cliente> clientes;

    /**
     * Constructor de Mercadaw.
     */
    public Mercadaw() {
        this.clientes = new LinkedHashSet<>();
    }

    /**
     * Genera clientes aleatorios y los almacena en el sistema.
     */
    public void generarClientes(){

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int numClientes = aleatorio.nextInt(15);

        for (int i = 0; i < numClientes; i++) {

            String usuario = "";
            for (int j = 0; j < 8; j++) {
                int indice = aleatorio.nextInt(caracteres.length());
                usuario += caracteres.charAt(indice);
            }

            String contrasenya = "";
            for (int n = 0; n < 8; n++) {
                int indice = aleatorio.nextInt(caracteres.length());
                contrasenya += caracteres.charAt(indice);
            }

            Cliente cliente = new Cliente(usuario, contrasenya);
            clientes.add(cliente);
        }

        System.out.println(clientes.size() + " clientes generados: ");
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }

    }

    public Set<Cliente> getClientes() {
        return Collections.unmodifiableSet(clientes);
    }
}
