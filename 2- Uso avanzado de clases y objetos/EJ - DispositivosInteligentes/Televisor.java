package DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando con control remoto...");
    }

    @Override
    public void enceder() {

        // OPCION 1
        if (super.estado){
            System.out.println("El televisor ya está encendido.");
        }else {
            System.out.println("Encendiendo televisor");
            super.estado = true;
        }

        // OPCION 2
//        if (isEstado()){
//            System.out.println("El televisor ya está encendido.");
//        }else {
//            System.out.println("Encendiendo televisor");
//            setEstado(true);
//        }

    }
}
