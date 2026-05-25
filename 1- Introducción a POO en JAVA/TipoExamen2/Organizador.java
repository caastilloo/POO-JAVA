package TipoExamen2;

import java.util.ArrayList;

public class Organizador {

    private static final String NOMBRE_DEF = "IES MUTXAMEL";

    private String nombre;
    private String edicion;
    private ArrayList<Corredor> listaCorredores;

    public Organizador(String edicion){
        this.nombre = NOMBRE_DEF;
        this.edicion = edicion;
        listaCorredores = new ArrayList<>();
    }

    public void inscribirCorredor(Corredor corredor){
        if (listaCorredores.size() < 700){
            listaCorredores.add(corredor);
            System.out.println("* Nueva incorporación realizada. Corredor: " + corredor.getNombre() + " con dorsal " + corredor.getDorsal());
        }else {
            System.out.println("Se ha alacanzado el máximo numero de corredores posibles.");
        }

    }

    public void mostrarCorredores(){
        int contador = 1;
        System.out.println("Corredores inscritos: " + listaCorredores.size());
        for (Corredor corredor : listaCorredores){
            System.out.println("[" + contador +  "]. " + corredor.getNombre());
            contador++;
        }
    }

    public void calcularDonacion(Corredor corredor){
        double donacion = corredor.getImporte_vuelta() * corredor.getVueltas_completadas();
        System.out.println("El corredor " + corredor.getNombre() + " ha conseguido una donación de " + donacion + "€");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public String toString() {
        return "Organizador [" +
                "Nombre ='" + nombre + '\'' +
                ", Edicion ='" + edicion + '\'' +
                ", Corredores =" + listaCorredores +
                ']';
    }
}
