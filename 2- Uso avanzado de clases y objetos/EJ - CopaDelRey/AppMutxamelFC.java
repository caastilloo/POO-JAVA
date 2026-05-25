package CopaDelRey;

import java.util.ArrayList;

public class AppMutxamelFC {

    static void main() {

        // Lista jugadores (SENIOR)
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        // Jugadores (SENIOR)
        Jugador jugador1 = new Jugador("Jose", 19, Equipos.SENIOR, 20, Posiciones.CENTROCAMPISTA);
        Jugador jugador2 = new Jugador("Pablo", 18, Equipos.SENIOR, 7, Posiciones.DELANTERO );
        Jugador jugador3 = new Jugador("Izan", 21, Equipos.SENIOR, 4, Posiciones.DEFENSA );
        Jugador jugador4 = new Jugador("Ivan", 25, Equipos.SENIOR, 5, Posiciones.DEFENSA );
        Jugador jugador5 = new Jugador("Jose Luis", 19, Equipos.SENIOR, 12, Posiciones.CENTROCAMPISTA );
        Jugador jugador6 = new Jugador("Alejandro", 26, Equipos.SENIOR, 25, Posiciones.CENTROCAMPISTA );
        Jugador jugador7 = new Jugador("Ismael", 21, Equipos.SENIOR, 11, Posiciones.DELANTERO );

        // Añadir jugadores en la lista
        listaJugadores.add(jugador1);
        listaJugadores.add(jugador2);
        listaJugadores.add(jugador3);
        listaJugadores.add(jugador4);
        listaJugadores.add(jugador5);
        listaJugadores.add(jugador6);
        listaJugadores.add(jugador7);

        // Imprimir lista
        for (Jugador jugador : listaJugadores){
            System.out.println(jugador);
        }

        System.out.println();

        // Entrenador (SENIOR)
        Entrenador entrenador;

        try{
            entrenador = new Entrenador("Pepe", 59, Equipos.SENIOR, "4-3-3");
        }catch (FormatoFormacionException er){
            System.out.println("Error. La formación no es válida.");
            return;
        }

        System.out.println();

        // Masajistas (SENIOR)
        Masajista masajista1 = new Masajista("Pedro", 30, "Universitaria", 8);
        Masajista masajista2 = new Masajista("Paco", 28, "Formación profesional", 5);

        // Acompañantes (SENIOR)
        Acompanyante acompanyante1 = new Acompanyante("Elena", 19, jugador1, "Pareja");
        Acompanyante acompanyante2 = new Acompanyante("Pilar", 50, jugador2, "Madre");

        ArrayList<FuncionesIntegrantes> listaIntegrantes = new ArrayList<>();
        ArrayList<AccionesDeportivas> listaDeportivos = new ArrayList<>();

        for (Jugador jugador : listaJugadores){
            listaIntegrantes.add(jugador);
            listaDeportivos.add(jugador);
        }

        listaIntegrantes.add(entrenador);
        listaDeportivos.add(entrenador);

        listaIntegrantes.add(masajista1);
        listaIntegrantes.add(masajista2);

        listaIntegrantes.add(acompanyante1);
        listaIntegrantes.add(acompanyante2);

        // Concentrarse
        System.out.println("=== CONCENTRARSE ===");
        for (FuncionesIntegrantes integrantes : listaIntegrantes){
            integrantes.concentrarse();
        }

        System.out.println();

        // Entrenar
        System.out.println("=== ENTRENAR ===");
        for (AccionesDeportivas deportivo : listaDeportivos){
            deportivo.entrenar();
        }

        // Dar masaje algun jugador
        System.out.println();
        System.out.println("=== DAR MASAJE ===");
        masajista1.darMasaje(jugador1);
        masajista2.darMasaje(jugador2);

        // Viajar a Madrid
        System.out.println();
        System.out.println("=== VIAJAR A MADRID ===");
        for (FuncionesIntegrantes integrantes : listaIntegrantes){
            integrantes.viajar("Madrid");
        }

        // Planificar entrenamiento
        System.out.println();
        System.out.println("=== PLANIFICAR ENTRENAMIENTO ===");
        entrenador.planificarEntrenamiento();

        // Entrenar
//        System.out.println("=== ENTRENAR ===");
//        jugador1.entrenar();
//        entrenador.entrenar();

        System.out.println();

        // Descansar
        System.out.println();
        System.out.println("=== DESCANSAR ===");
        for (Jugador jugador : listaJugadores){
            jugador.descansar();
        }



        // Calentar
        System.out.println();
        System.out.println("=== CALENTAR ===");
        for (Jugador jugador : listaJugadores){
            jugador.calentar();
        }



        // Jugar partido
        System.out.println();
        System.out.println("=== JUGAR PARTIDO ===");
        for (AccionesDeportivas deportivo : listaDeportivos){
            deportivo.jugarPartido("Real Madrid");
        }



        // Animar equipo
        System.out.println();
        System.out.println("=== ANIMAR EQUIPO ===");
        acompanyante2.animarEquipo();
        acompanyante1.animarEquipo();



        // Hacer cambios
        System.out.println();
        System.out.println("=== HACER CAMBIOS ===");
        entrenador.hacerCambios();



        // Marcar gol
        System.out.println();
        System.out.println("=== MARCAR GOL ===");
        jugador1.marcarGol();
        jugador2.marcarGol();



        // Celbrar gol
        System.out.println();
        System.out.println("=== CELEBRAR GOL ===");
        for (FuncionesIntegrantes integrantes : listaIntegrantes){
            integrantes.celebrarGol();
        }



        // Dar masaje a varios jugadores
        System.out.println();
        System.out.println("=== DAR MASAJE A VARIOS JUGADORES ===");
        masajista1.darMasaje(jugador3);
        masajista2.darMasaje(jugador4);



        // Viajar a Mutxamel
        System.out.println();
        System.out.println("=== VIAJAR A MUTXAMEL ===");
        for (FuncionesIntegrantes integrantes : listaIntegrantes){
            integrantes.viajar("Mutxamel");
        }

        // Descansar
        System.out.println();
        System.out.println("=== DESCANSAR ===");
        for (Jugador jugador : listaJugadores){
            jugador.descansar();
        }

    }
}
