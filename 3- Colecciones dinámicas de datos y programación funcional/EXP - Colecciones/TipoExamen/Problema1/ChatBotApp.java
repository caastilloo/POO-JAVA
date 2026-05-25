package Colecciones.TipoExamen.Problema1;

import java.util.HashMap;
import java.util.Scanner;

public class ChatBotApp {

    static Scanner teclado = new Scanner(System.in);

    static HashMap<String, String> respuestas = new HashMap<>();
    static final String CHATBOT = "ChatBot: ";
    static final String USUARIO = "Tú: ";

    static void main() {

        crearRespuestas();

        System.out.println(CHATBOT + "Bienvenido! Escribe <salir> cuando quieras acabar la conversación ...");

        String opcion = "";

        while (!opcion.equalsIgnoreCase("salir")){
            System.out.print(USUARIO);
            opcion = teclado.nextLine().toLowerCase();

            if (opcion.equalsIgnoreCase("salir")){
                System.out.println(CHATBOT + "¡Adiós!");
                break;
            }

            if (respuestas.containsKey(opcion)){
                System.out.println(CHATBOT + respuestas.get(opcion));
            }else {
                System.out.println("No te entiendo :(");
            }

        }


    }

    public static void crearRespuestas(){
        respuestas.put("hola", "Hola, ¿En que puedo ayudarte?");
        respuestas.put("¿como estás?", "¡Estoy listo para ayudarte!");
        respuestas.put("adiós", "¡Hasta luego!");
        respuestas.put("gracias", "¡De nada! Que tengas un buen día.");
    }
}
