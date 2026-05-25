package DispositivosInteligentes;

import java.util.ArrayList;

public class DispositivosApp {

    static void main() {

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        listaDispositivos.add(new Televisor("LG Smart"));
        listaDispositivos.add(new ParlanteInteligente("Alexa"));
        listaDispositivos.add(new AireAcondicionado("ACO 2000"));

        Dispositivo proyector = new Dispositivo("Optoma") {

            @Override
            public void enceder() {

                if (estado){
                    System.out.println("El proyector ya está encendido.");
                }else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    estado = true;
                }
            }
        };

        proyector.enceder();

        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto de presentación...");
            }
        };

        proyector_sinc.sincronizar();

        Dispositivo horno_ia = new Dispositivo("Horno ChatGPT") {
            @Override
            public void enceder() {
                if (estado){
                    System.out.println("El horno ya está encendido.");
                }else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    estado = true;
                }
            }
        };

        horno_ia.enceder();

        listaDispositivos.add(proyector);
        listaDispositivos.add(horno_ia);


        for (Dispositivo dispositivo : listaDispositivos){

            dispositivo.enceder();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.nombre.equals("Optoma")) {
                proyector_sinc.sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

        }
    }
}
