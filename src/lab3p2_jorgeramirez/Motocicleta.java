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
public class Motocicleta extends Vehiculo{
    private int velocidadMaxima;
    private int peso;
    private double consumoCombustible;

    public Motocicleta(String numeroPlaca, String marca, String modelo, String tipo, String color, Date anio,
                       int velocidadMaxima, int peso, double consumoCombustible) {
        super(numeroPlaca, marca, modelo, tipo, color, anio);
        this.velocidadMaxima = velocidadMaxima;
        this.peso = peso;
        this.consumoCombustible = consumoCombustible;
    }
    //getters y setters con insertcode
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }
    // Método auxiliar para convertir el Date a int representando el año
    private int obtenerAnioInt(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha);
        return calendar.get(Calendar.YEAR);
    }
     @Override
    public String toString() {
        return super.toString() + ", Vel. Máxima: " + velocidadMaxima + " Km/h, Peso: " + peso +
                " kg, Consumo: " + consumoCombustible + " L/Km";
    }
}
