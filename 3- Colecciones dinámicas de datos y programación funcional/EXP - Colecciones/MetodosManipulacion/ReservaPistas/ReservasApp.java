package Colecciones.MetodosManipulacion.ReservaPistas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ReservasApp {

    static Scanner teclado = new Scanner(System.in);
    static HashMap<Usuario, LinkedHashSet<Reservas>> mapa = new HashMap<>();

    static void main() {



    }

    public static void eliminarReserva(LinkedHashSet<Reservas> listaReservas){

        Iterator<Reservas> it = listaReservas.iterator();

        System.out.println("¿Que pista quieres borrar?");
        String opcion = teclado.next().toUpperCase();

        while (it.hasNext()){

            Reservas reserva = it.next();

            if (opcion.equals("PADEL") && reserva.getPistaReservada() instanceof Padel){
                it.remove();
            } else if (opcion.equals("TENIS") && reserva.getPistaReservada() instanceof Tenis) {
                it.remove();
            }

        }

    }

    public static LinkedHashSet<Reservas> obtenerReservas(Usuario usuario){

        return mapa.get(usuario);

    }

    public static void crearReserva(Usuario usuario, Pista pista){

        Reservas reserva = new Reservas(usuario, pista);

        LinkedHashSet<Reservas> listaReservas = obtenerReservas(usuario);

        if (listaReservas.contains(reserva)){
            throw new ReservaDupException();
        }else {
            listaReservas.add(reserva);
            mapa.put(usuario, listaReservas);
        }
    }

}
