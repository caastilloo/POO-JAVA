package DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void enceder() {

        // OPCION 1
//        if (isEstado()){
//            System.out.println("El parlante ya está encendido.");
//        }else {
//            System.out.println("Activando parlante con comando de voz...");
//            setEstado(true);
//        }

        // OPCION 2
        if (super.estado){
            System.out.println("El parlante ya está encendido.");
        }else {
            System.out.println("Activando parlante con comando de voz...");
            super.estado=true;
        }


    }
}
