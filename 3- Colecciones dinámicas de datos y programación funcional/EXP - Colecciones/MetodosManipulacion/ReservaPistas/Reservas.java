package Colecciones.MetodosManipulacion.ReservaPistas;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reservas {

    private Usuario usuario;
    private Pista pistaReservada;
    private LocalDateTime fecha;

    public Reservas(Usuario usuario, Pista pistaReservada) {
        this.usuario = usuario;
        this.pistaReservada = pistaReservada;
        //this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pista getPistaReservada() {
        return pistaReservada;
    }

    public void setPistaReservada(Pista pistaReservada) {
        this.pistaReservada = pistaReservada;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Reservas reservas = (Reservas) o;
        return Objects.equals(usuario, reservas.usuario) && Objects.equals(pistaReservada, reservas.pistaReservada) && Objects.equals(fecha, reservas.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, pistaReservada, fecha);
    }

    @Override
    public String toString() {
        return "Reservas{" +
                "usuario=" + usuario +
                ", pistaReservada=" + pistaReservada +
                ", fecha=" + fecha +
                '}';
    }
}
