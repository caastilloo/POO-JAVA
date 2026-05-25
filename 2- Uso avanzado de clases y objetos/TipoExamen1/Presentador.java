package TipoExamen1;

public class Presentador extends MutxaAwards implements AccionesAsistentes{

    private String nombre;

    public Presentador(int edicion, String nombre) {
        super(edicion);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void presentar(){
        System.out.println("El presentador " + nombre + " está presentado los premios.");
    }

    public void entregarPremio(Premio premio){
        System.out.println("El presentador " + nombre + " entrega el premio " + premio);
    }

    @Override
    void obtenerDetalles() {
        System.out.println("PRESENTADOR (DETALLES)");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edicion: " + edicion);
    }

    @Override
    public void aplaudir() {
        System.out.println("El presentador " + nombre + " está aplaudiendo.");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El presentador " + nombre + " pasa por la alfombra roja");
    }

    @Override
    public void darDiscursos(String tematica) {
        System.out.println("El presentador " + nombre + " está dando un discurso " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador" + nombre + " está celebrando el premio " + premio);
    }

    @Override
    public String toString() {
        return "Presentador{" +
                "nombre='" + nombre + '\'' +
                ", edicion=" + edicion +
                '}';
    }
}
