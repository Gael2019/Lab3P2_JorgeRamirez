/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jorgeramirez;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Jorge Ramirez
 */
public class Lab3P2_JorgeRamirez {
    
    private static ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            MostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    agregarAutomovil(scanner);
                    break;
                case 2:
                    agregarMotocicleta(scanner);
                    break;
                case 3:
                  
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:

                    break;
                case 7:
                    
                    break;
                case 8:
                    System.out.println("Gracias por usar el programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
            
            
        } while (opcion !=8 );
        
    }
    private static void MostrarMenu(){
        System.out.println("---- MENU ----");
        System.out.println("1. Agregar Automovil");
        System.out.println("2. Agregar Motocicleta");
        System.out.println("3. Agregar autobus");
        System.out.println("4. Modificar algun vehiculo");
        System.out.println("5. Eliminar vehiculo");
        System.out.println("6. Mostrar los vehiculos");
        System.out.println("7. Generar alguna boleta");
        System.out.println("8. Salir");
        System.out.println("Seleccione una opcion por favor.");
    }
    //agregar un automovil
    private static void agregarAutomovil(Scanner scanner) {
        System.out.println("---- Agregar Automovil ----");
        System.out.print("Numero de Placa: ");
        String numeroPlaca = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Ano (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        Date anio = leerFecha(scanner);

        System.out.print("Tipo de Combustible: ");
        String tipoCombustible = scanner.nextLine();
        System.out.print("Numero de Puertas: ");
        int numeroPuertas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo de Transmision: ");
        String tipoTransmision = scanner.nextLine();
        System.out.print("Numero de Asientos: ");
        int numeroAsientos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Automovil automovil = new Automovil(numeroPlaca, marca, modelo, tipo, color, anio,
                tipoCombustible, numeroPuertas, tipoTransmision, numeroAsientos);
        listaVehiculos.add(automovil);
        System.out.println("Automovil agregado con exito.");
    }
    // Metodo para agregar una motocicleta
    private static void agregarMotocicleta(Scanner scanner) {
        System.out.println("---- Agregar Motocicleta ----");
        System.out.print("Numero de Placa: ");
        String numeroPlaca = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Ano (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        Date anio = parseFecha(fechaString);

        System.out.print("Velocidad Maxima (Km/h): ");
        int velocidadMaxima = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Peso (kg): ");
        int peso = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Consumo de Combustible (L/Km): ");
        double consumoCombustible = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        Motocicleta motocicleta = new Motocicleta(numeroPlaca, marca, modelo, tipo, color, anio,
                velocidadMaxima, peso, consumoCombustible);
        listaVehiculos.add(motocicleta);
        System.out.println("Motocicleta agregada con exito.");
    }
    
        
    
     // Metodo auxiliar para parsear la fecha
    private static Date parseFecha(String fechaString) {
        try {
            return dateFormat.parse(fechaString);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error entonces Se usara la fecha actual.");
            return new Date();
        }
    }
    private static Date leerFecha(Scanner scanner) {
    System.out.print("Año (dd/MM/yyyy): ");
    String fechaString = scanner.nextLine();
    try {
        return dateFormat.parse(fechaString);
    } catch (Exception e) {
        System.out.println("Error al parsear la fecha. Se usará la fecha actual.");
        return new Date();
    }
    }
    
}
