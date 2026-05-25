package Colecciones.MetodosManipulacion.ReservaPistas;

public class ReservaDupException extends RuntimeException {
    public ReservaDupException() {
        System.out.println("Esta reserva no esta disponible.");
    }
}
