package DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }

    @Override
    public void enceder() {

        // OPCION 1
//        if (isEstado()){
//            System.out.println("El aire acondicionado ya está encendido.");
//        }else {
//            System.out.println("Encendiendo aire acondicionado...");
//            setEstado(true);
//        }

        // OPCION 2
        if (super.estado){
            System.out.println("El aire acondicionado ya está encendido.");
        }else {
            System.out.println("Encendiendo aire acondicionado...");
            super.estado = true;
        }


    }
}
