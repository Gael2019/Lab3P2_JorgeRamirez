/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jorgeramirez;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Jorge Ramirez
 */
public class Autobus extends Vehiculo{
    private int capacidadPasajeros;
    private int numeroEjes;
    private double longitud;

    public Autobus(String numeroPlaca, String marca, String modelo, String tipo, String color, Date anio,
                   int capacidadPasajeros, int numeroEjes, double longitud) {
        super(numeroPlaca, marca, modelo, tipo, color, anio);
        this.capacidadPasajeros = capacidadPasajeros;
        this.numeroEjes = numeroEjes;
        this.longitud = longitud;
    }
    //getter y setters con insert code

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    @Override
    public String toString() {
        return super.toString() + ", Pasajeros: " + capacidadPasajeros + ", Ejes: " + numeroEjes +
                ", Longitud: " + longitud + " m";
    }
    
     // Metodo auxiliar para obtener el año como int a partir de un objeto Date
    private int obtenerAnioInt(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar.get(Calendar.YEAR);
    }
    
}
