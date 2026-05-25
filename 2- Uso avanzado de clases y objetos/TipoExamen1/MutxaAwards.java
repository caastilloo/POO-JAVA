package TipoExamen1;

public abstract class MutxaAwards {

    protected int edicion;

    public MutxaAwards(int edicion){
        this.edicion = edicion;
    }

    abstract void obtenerDetalles();

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "MutxaAwards{" +
                "edicion=" + edicion +
                '}';
    }
}
