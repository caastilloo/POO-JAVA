package DispositivosInteligentes;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo(String nombre){
        this.nombre = nombre;
        estado = false;
    }

    public abstract void enceder();
    public void apagar(){

        if (estado){
            estado=false;
            System.out.println("El dispositivo " + nombre + " está apagado.");
        }else {
            System.out.println("El dispositivo " + nombre + " ya está apagado.");
        }

    }
    public void mostrarEstado(){
        if (estado){
            System.out.println("El dispositivo " + nombre + " está encendido.");
        }else {
            System.out.println("El dispositivo " + nombre + " está apagado.");
        }
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
