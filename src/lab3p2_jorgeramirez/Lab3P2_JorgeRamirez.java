/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_jorgeramirez;

/**
 *
 * @author Jorge Ramirez
 */
public class Lab3P2_JorgeRamirez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
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
    private static void agregarAutomovil(){
        System.out.println("---- Agregar Automóvil ----");
        System.out.print("Número de Placa: ");
        String numeroPlaca = scanner.nextLine();
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Tipo: ");
        String tipo = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Año: ");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Tipo de Combustible: ");
        String tipoCombustible = scanner.nextLine();
        System.out.print("Número de Puertas: ");
        int numeroPuertas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Tipo de Transmisión: ");
        String tipoTransmision = scanner.nextLine();
        System.out.print("Número de Asientos: ");
        int numeroAsientos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Automovil automovil = new Automovil(numeroPlaca, marca, modelo, tipo, color, anio,
                tipoCombustible, numeroPuertas, tipoTransmision, numeroAsientos);
        listaVehiculos.add(automovil);
        System.out.println("Automóvil agregado con éxito.");
    }
}
