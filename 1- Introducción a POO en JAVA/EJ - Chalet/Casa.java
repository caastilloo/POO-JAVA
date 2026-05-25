package Chalet;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner teclado = new Scanner(System.in);

    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;

    public Casa (String direccion){
        this.direccion = direccion;
        listaHabitaciones = new ArrayList<>();
        setPropietario();
        listaElectrodomesticos = new ArrayList<>();
    }

    public void crearHabitacion(String nombre, double metros){

        for (Habitacion habitacion : listaHabitaciones){
            if (habitacion.getNombre().equals(nombre)){
                System.out.println("La habitación " + nombre + " ya existe.");
                return;
            }
        }

        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
    }

    public void borrarHabitacion(String nombre){

        for (Habitacion habitacion : listaHabitaciones){

            if (habitacion.getNombre().equals(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitacion " + nombre + " borrada con éxito.");
                return;
            }
        }

    }

    public void mostarHabitaciones(){
        System.out.println("Hay " + listaHabitaciones.size() + " habitaciones en la casa de " + propietario.getNombre() + ", en la dirección " + direccion);
        for (Habitacion habitacion : listaHabitaciones){
            System.out.println("-> " + habitacion.getNombre() + " con " + habitacion.getMetros() + "m2");
        }
    }

    public Habitacion getHabitacionGrande(){
        Habitacion maximo = listaHabitaciones.get(0); // Puedes poner el que sea teniendo en cuenta el tamaño de la lista

        for (Habitacion habitacion : listaHabitaciones){
            if (maximo.getMetros() < habitacion.getMetros()){
                maximo = habitacion;
            }
        }

        return maximo;
    }

    public Electrodomesticos getHabitacionMasConsumo(){
        Electrodomesticos maximo = listaElectrodomesticos.get(0);

        for (Electrodomesticos electrodomesticos : listaElectrodomesticos){
            if (maximo.getConsumo() < electrodomesticos.getConsumo()){
                maximo = electrodomesticos;
            }
        }

        return maximo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {

        System.out.println("Introduce el nombre del propietario de la casa, en la dirección " + direccion + ".");
        String nombre = teclado.next();
        System.out.println("Completa la informacion con la edad de " + nombre + ":");
        int edad = teclado.nextInt();
        teclado.nextLine();
        propietario = new Propietario(nombre, edad);

        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                "propietario=" + propietario +
                '}';
    }


}
