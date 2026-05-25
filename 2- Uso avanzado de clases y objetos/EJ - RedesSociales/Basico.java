package RedesSociales;

public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nombre_usuario, int seguidores) {
        super(nombre, edad, nombre_usuario, seguidores);
    }

    @Override
    public void mostrarInfoUsuario(){
        System.out.println("Información de la Persona Normal:");
        super.mostrarInfoUsuario();
    }
}
