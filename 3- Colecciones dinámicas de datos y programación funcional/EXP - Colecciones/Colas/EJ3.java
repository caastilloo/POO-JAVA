package Colecciones.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class EJ3 {

    static Queue<String> playlist = new LinkedList<>();

    static void main() {

        playlist.offer("Let It Be - The Beatles");
        playlist.offer("Bohemian Rapsody - Queen");
        playlist.offer("Shape of You - Ed Sheeran");
        playlist.offer("Blinding Lights- The Weeknd");
        playlist.offer("Stay - Justin Bieber");

        System.out.println("Estado inicial de la PLAYLIST -> " + playlist);

        System.out.println();

        while (!playlist.isEmpty()){
            System.out.println("| Reproduciendo -> " + playlist.poll());
            System.out.println("Estado de la PLAYLIST depues de reproducir una canción -> " + playlist);
        }

        System.out.println("La PLAYLIST ha terminado.");


    }
}
