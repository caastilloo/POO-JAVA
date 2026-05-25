package TipoExamen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IllegalFormatCodePointException;

public class Corredor {

    private static final double IMPORTE_MIN = 0.5;
    private static int contadorDorsal = 1;

    private String nombre;
    private int dorsal;
    private ArrayList<String> listaPatrocinadores;
    private double importe_vuelta = IMPORTE_MIN;
    private int vueltas_completadas = 0;

    public Corredor(String nombre, double importe_vuelta){
        this.nombre = nombre;
        this.dorsal = contadorDorsal++;
        listaPatrocinadores = new ArrayList<>();
        setImporte_vuelta(importe_vuelta);
        this.vueltas_completadas = 0;
    }

    public void insertarPatrocinadores(String ... patrocionadores){
        listaPatrocinadores.addAll(Arrays.asList(patrocionadores));
        System.out.println("* Nuevos patrocinadores añadidos para el corredor " + getNombre());
    }

    public Corredor(){
        listaPatrocinadores = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVueltas_completadas() {
        return vueltas_completadas;
    }

    public void setVueltas_completadas(int vueltas_completadas) {
        this.vueltas_completadas = vueltas_completadas;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal() {
        this.dorsal = 1;
    }

    public ArrayList<String> getListaPatrocinadores() {
        return listaPatrocinadores;
    }

    public void setListaPatrocinadores(ArrayList<String> listaPatrocinadores) {
        this.listaPatrocinadores = listaPatrocinadores;
    }

    public double getImporte_vuelta() {
        return importe_vuelta;
    }

    public void setImporte_vuelta(double importe_vuelta) {

        if (importe_vuelta < IMPORTE_MIN){
            this.importe_vuelta = IMPORTE_MIN;
        }else {
            this.importe_vuelta = importe_vuelta;
        }

    }

    @Override
    public String toString() {
        return "Corredor [" +
                "Nombre ='" + nombre + '\'' +
                ", Dorsal =" + dorsal +
                ", Patrocinadores =" + listaPatrocinadores +
                ", Importe x Vuelta =" + importe_vuelta +
                ", Vueltas =" + vueltas_completadas +
                ']';
    }
}
