/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_jorgeramirez;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Jorge Ramirez
 */
public class Vehiculo {
     private String numeroPlaca;
    private String marca;
    private String modelo;
    private String tipo;
    private String color;
    private Date anio;
    private int anioInt; // Atributo para guardar el año como int

    public Vehiculo(String numeroPlaca, String marca, String modelo, String tipo, String color, Date anio) {
        this.numeroPlaca = numeroPlaca;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.color = color;
        this.anio = anio;
        this.anioInt = obtenerAnioComoInt(anio);
    }
    //getters y setters con insert code.
    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Date getAnio() {
        return anio;
    }

    public void setAnio(Date anio) {
        this.anio = anio;
    }

    public int getAnioInt() {
        return anioInt;
    }

    public void setAnioInt(int anioInt) {
        this.anioInt = anioInt;
    }
    // Método auxiliar para obtener el año como int a partir de un objeto Date
    private int obtenerAnioComoInt(Date fecha) {
        // Usamos SimpleDateFormat para obtener el año de la fecha
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String anioString = sdf.format(fecha);
        return Integer.parseInt(anioString);
    }
    // Método toString para mostrar información del vehículo
    @Override
    public String toString() {
        return "Placa: " + numeroPlaca + ", Marca: " + marca + ", Modelo: " + modelo +
                ", Tipo: " + tipo + ", Color: " + color + ", Año: " + anio;
    }
}
