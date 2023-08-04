/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jorgeramirez;

import java.util.Date;

/**
 *
 * @author Jorge Ramirez
 */
public class Automovil extends Vehiculo{
    private String tipoCombustible;
    private int numeroPuertas;
    private String tipoTransmision;
    private int numeroAsientos;

    public Automovil(String numeroPlaca, String marca, String modelo, String tipo, String color, Date anio,
                     String tipoCombustible, int numeroPuertas, String tipoTransmision, int numeroAsientos) {
        super(numeroPlaca, marca, modelo, tipo, color, anio);
        this.tipoCombustible = tipoCombustible;
        this.numeroPuertas = numeroPuertas;
        this.tipoTransmision = tipoTransmision;
        this.numeroAsientos = numeroAsientos;
    }

    // Getters y Setters para los atributos específicos de Automovil
    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tipo de Combustible: " + tipoCombustible +
                ", Número de Puertas: " + numeroPuertas +
                ", Tipo de Transmisión: " + tipoTransmision +
                ", Número de Asientos: " + numeroAsientos;
    }
}
