package TipoExamen1;

public class Premio extends MutxaAwards{

    private Categoria categoria;
    private Artista ganador;

    public Premio(int edicion, Categoria categoria, Artista ganador) {
        super(edicion);
        this.categoria = categoria;
        this.ganador = ganador;
    }

    public Premio(int edicion, Categoria categoria){
        super(edicion);
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Artista getGanador() {
        return ganador;
    }

    public void setGanador(Artista ganador) {
        this.ganador = ganador;
    }

    @Override
    void obtenerDetalles() {
        System.out.println("PREMIO (DETALLES)");
        System.out.println("Edición: " + edicion);
        System.out.println("Categoría: " + categoria);
        System.out.println("Ganador: " + ganador);
    }

    @Override
    public String toString() {
        return "Premio{" +
                "categoria=" + categoria +
                ", ganador=" + ganador.getNombre() +
                ", edicion=" + edicion +
                '}';
    }
}
