package TipoExamen1;

import java.util.ArrayList;

public class Artista extends MutxaAwards implements AccionesAsistentes{

    private String nombre;
    private ArrayList<Premio> listaPremios;
    private ArrayList<Categoria> listaCategorias;

    public Artista(int edicion, String nombre) {
        super(edicion);
        this.nombre = nombre;
        listaPremios = new ArrayList<>();
        listaCategorias = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    public void setListaCategorias(ArrayList<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    public ArrayList<Premio> getListaPremios() {
        return listaPremios;
    }

    public void setListaPremios(ArrayList<Premio> listaPremios) {
        this.listaPremios = listaPremios;
    }

    public void esNominado(Categoria categoria){
        System.out.println("El artista " + nombre + " está nominado a la categoría " + categoria);
    }

    public void ganarPremio(Premio premio){
        System.out.println("El artista " + nombre + " ha ganado el premio " + premio);
    }

    public void recogerPremio(Premio premio){
        System.out.println("El artista " + nombre + " esta recogiendo el premmio " + premio);
    }

    @Override
    void obtenerDetalles() {
        System.out.println("ARTISTA (DETALLES)");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edicion: " + edicion);
        System.out.println("Premios: " + listaPremios);
        System.out.println("Categorías: " + listaCategorias);
    }

    @Override
    public void aplaudir() {
        System.out.println("El artista " + nombre + " está aplaudiendo.");
    }

    @Override
    public void alfombraRoja() {
        System.out.println("El artista " + nombre + " pasa por la alfombra roja.");
    }

    @Override
    public void darDiscursos(String tematica) {
        System.out.println("El presentador " + nombre + " está dando un discurso " + tematica);
    }

    @Override
    public void celebrarPremio(Premio premio) {
        System.out.println("El presentador" + nombre + " está celebrando el premio " + premio);
    }

    @Override
    public String toString() {
        return "Artista{" +
                "nombre='" + nombre + '\'' +
                ", numPremios=" + listaPremios.size() +
                ", listaCategorias=" + listaCategorias +
                ", edicion=" + edicion +
                '}';
    }
}
