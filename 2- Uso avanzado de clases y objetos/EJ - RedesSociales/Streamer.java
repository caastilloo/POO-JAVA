package RedesSociales;

public class Streamer extends Usuario{

    private int numero_retrasmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombre_usuario, int seguidores, int numero_retrasmisiones, int horas_directo) {
        super(nombre, edad, nombre_usuario, seguidores);
        this.numero_retrasmisiones = numero_retrasmisiones;
        this.horas_directo = horas_directo;
    }

    public int getNumero_retrasmisiones() {
        return numero_retrasmisiones;
    }

    public void setNumero_retrasmisiones(int numero_retrasmisiones) {
        this.numero_retrasmisiones = numero_retrasmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfoUsuario(){
        System.out.println("Información del Streamer:");
        super.mostrarInfoUsuario();
        System.out.println("Retrasmisiones realizadas: " + numero_retrasmisiones);
        System.out.println("Horas de directo: " + horas_directo);
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numero_retrasmisiones=" + numero_retrasmisiones +
                ", horas_directo=" + horas_directo +
                '}';
    }
}
