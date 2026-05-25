package StringBuilder.EJS;

import java.util.Random;

public class CarreraAutobuses {

    public static final int TAM = 97;
    static Random aleatorio = new Random();

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int contadorBus1 = 0;
        int contadorBus2 = 0;

        System.out.println("\n<<<<<<<<<< AUTOBUSITO >>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM) {

            int autobusRandom = aleatorio.nextInt(2);

            a++; // avanzamos

            limpiarPantalla();

            if (a < TAM) {

//                if (autobusRandom == 1){
//                    System.out.println(dibujarAutobus1(a));
//                    Thread.sleep(70);
//                }else {
//                    System.out.println(dibujarAutobus2(a));
//                    Thread.sleep(70);
//                }

                if (autobusRandom == 1){
                    System.out.println(dibujarAutobus1(a));
                    System.out.println(dibujarAutobus2(a-1));
                    Thread.sleep(70);
                    contadorBus1++;
                }else {
                    System.out.println(dibujarAutobus1(a-1));
                    System.out.println(dibujarAutobus2(a));
                    Thread.sleep(70);
                    contadorBus2++;
                }

//                if (autobusRandom == 0){
//                    System.out.println(dibujarAutobus1(a-1));
//                    System.out.println(dibujarAutobus2(a));
//                    Thread.sleep(70);
//                    contadorBus2++;
//                }

                System.out.println();

            }

        }

        if (contadorBus1 > contadorBus2){
            System.out.println("\033[32m" + "GANADOR: MONNEGRE FC!!" + "\033[0m");
        }else{
            System.out.println("\033[32m" + "GANADOR: MUTXAMEL FC!!" + "\033[0m");
        }

    }

    public static String dibujarAutobus1(int n1) {

        StringBuilder sb = new StringBuilder();

        sb.append("-".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|   MONNEGRE FC  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static String dibujarAutobus2(int n1) {

        StringBuilder sb2 = new StringBuilder();

        sb2.append("-".repeat(117)).append("\n");
        sb2.append(" ".repeat(n1)).append("________________    ").append(" ".repeat(TAM - n1)).append("|\n");
        sb2.append(" ".repeat(n1)).append("|__|__|__|__|__|___ ").append(" ".repeat(TAM - n1)).append("|\n");
        sb2.append(" ".repeat(n1)).append("|   MUTXAMEL FC  |)").append(" ".repeat(TAM - n1)).append("|\n");
        sb2.append(" ".repeat(n1)).append("|~~~@~~~~~~~~~@~~~|)").append(" ".repeat(TAM - n1)).append("|\n");
        sb2.append("_".repeat(117));

        return sb2.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }


}
