package Restaurante;

public class Cliente extends Persona{

    private Integer mesa;
    private int num_personas;

    public Cliente(String nombre, String dni, Integer mesa, int num_personas) {
        super(nombre, dni);
        this.mesa = mesa;
        this.num_personas = num_personas;
    }

    public Integer getMesa() {
        return mesa;
    }

    public void setMesa(Integer mesa) {
        this.mesa = mesa;
    }

    public int getNum_personas() {
        return num_personas;
    }

    public void setNum_personas(int num_personas) {
        this.num_personas = num_personas;
    }

    @Override
    public void mostrarInfoPersonas(){
        super.mostrarInfoPersonas();
        System.out.println("Mesa: " + mesa);
        System.out.println("Nº de personas: " + num_personas);
    }

    @Override
    public void accederBanyo() {
        System.out.println("El cliente s dirige al baño");
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "mesa=" + mesa +
                ", num_personas=" + num_personas +
                '}';
    }
}
