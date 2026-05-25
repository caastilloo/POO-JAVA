package Colecciones.Lamdas.EJS.EJ4;

public class Empleado {

    private String usuario;
    private double salario;
    private String fecha;

    public Empleado(String usuario, double salario, String fecha) {
        this.usuario = usuario;
        this.salario = salario;
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "usuario='" + usuario + '\'' +
                ", salario=" + salario +
                ", fecha=" + fecha +
                '}';
    }
}
