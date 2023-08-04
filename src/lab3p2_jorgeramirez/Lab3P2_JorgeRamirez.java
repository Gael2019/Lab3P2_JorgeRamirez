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
                    agregarAutobus(scanner);
                    break;
                case 4:
                    modificarVehiculo(scanner);
                    break;
                case 5:
                    eliminarVehiculo(scanner);
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
        scanner.nextLine(); // Consumir el salto de linea
        System.out.print("Tipo de Transmision: ");
        String tipoTransmision = scanner.nextLine();
        System.out.print("Numero de Asientos: ");
        int numeroAsientos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea

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
        scanner.nextLine(); // Consumir el salto de linea
        System.out.print("Peso (kg): ");
        int peso = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea
        System.out.print("Consumo de Combustible (L/Km): ");
        double consumoCombustible = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de linea

        Motocicleta motocicleta = new Motocicleta(numeroPlaca, marca, modelo, tipo, color, anio,
                velocidadMaxima, peso, consumoCombustible);
        listaVehiculos.add(motocicleta);
        System.out.println("Motocicleta agregada con exito.");
    }
    // Método para agregar un autobús
    private static void agregarAutobus(Scanner scanner) {
        System.out.println("---- Agregar Autobús ----");
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

        System.out.print("Capacidad de Pasajeros: ");
        int capacidadPasajeros = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Numero de Ejes: ");
        int numeroEjes = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Longitud (m): ");
        double longitud = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de linea

        Autobus autobus = new Autobus(numeroPlaca, marca, modelo, tipo, color, anio,
                capacidadPasajeros, numeroEjes, longitud);
        listaVehiculos.add(autobus);
        System.out.println("Autobus agregado con exito.");
    }
    // Método para modificar un vehículo
    private static void modificarVehiculo(Scanner scanner) {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados para modificar.");
            return;
        }

        System.out.println("---- Modificar Vehículo ----");
        mostrarVehiculos();

        System.out.print("Seleccione el indice del vehiculo a modificar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de linea

        if (indice >= 0 && indice < listaVehiculos.size()) {
            Vehiculo vehiculo = listaVehiculos.get(indice);

            if (vehiculo instanceof Automovil) {
                modificarAutomovil(scanner, (Automovil) vehiculo);
            } else if (vehiculo instanceof Motocicleta) {
                modificarMotocicleta(scanner, (Motocicleta) vehiculo);
            } else if (vehiculo instanceof Autobus) {
                modificarAutobus(scanner, (Autobus) vehiculo);
            }
        } else {
            System.out.println("Indice invalido.");
        }
    }
    private static void modificarAutomovil(Scanner scanner, Automovil automovil) {
        System.out.println("---- Modificar Automovil ----");
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

        automovil.setNumeroPlaca(numeroPlaca);
        automovil.setMarca(marca);
        automovil.setModelo(modelo);
        automovil.setTipo(tipo);
        automovil.setColor(color);
        automovil.setAnio(anio);
        automovil.setTipoCombustible(tipoCombustible);
        automovil.setNumeroPuertas(numeroPuertas);
        automovil.setTipoTransmision(tipoTransmision);
        automovil.setNumeroAsientos(numeroAsientos);

        System.out.println("Automovil modificado con exito.");
    }
    private static void modificarMotocicleta(Scanner scanner, Motocicleta motocicleta) {
        System.out.println("---- Modificar Motocicleta ----");
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
        System.out.print("Año (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        Date anio = parseFecha(fechaString);

        System.out.print("Velocidad Máxima (Km/h): ");
        int velocidadMaxima = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Peso (kg): ");
        int peso = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Consumo de Combustible (L/Km): ");
        double consumoCombustible = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        motocicleta.setNumeroPlaca(numeroPlaca);
        motocicleta.setMarca(marca);
        motocicleta.setModelo(modelo);
        motocicleta.setTipo(tipo);
        motocicleta.setColor(color);
        motocicleta.setAnio(anio);
        motocicleta.setVelocidadMaxima(velocidadMaxima);
        motocicleta.setPeso(peso);
        motocicleta.setConsumoCombustible(consumoCombustible);

        System.out.println("Motocicleta modificada con exito.");
    }
    // Método auxiliar para modificar un autobús
    private static void modificarAutobus(Scanner scanner, Autobus autobus) {
        System.out.println("---- Modificar Autobus ----");
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
        System.out.print("Ano en formato (dd/MM/yyyy): ");
        String fechaString = scanner.nextLine();
        Date anio = parseFecha(fechaString);

        System.out.print("Capacidad de Pasajeros: ");
        int capacidadPasajeros = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Numero de Ejes: ");
        int numeroEjes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        System.out.print("Longitud (m): ");
        double longitud = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        autobus.setNumeroPlaca(numeroPlaca);
        autobus.setMarca(marca);
        autobus.setModelo(modelo);
        autobus.setTipo(tipo);
        autobus.setColor(color);
        autobus.setAnio(anio);
        autobus.setCapacidadPasajeros(capacidadPasajeros);
        autobus.setNumeroEjes(numeroEjes);
        autobus.setLongitud(longitud);

        System.out.println("Autobus modificado con exito.");
    }
    // Método auxiliar para contar el total de vehículos por tipo
    private static int countVehiculosTipo(Class<?> tipo) {
        int count = 0;
        for (Vehiculo vehiculo : listaVehiculos) {
            if (tipo.isInstance(vehiculo)) {
                count++;
            }
        }
        return count;
    }
    
    // Método para mostrar todos los vehículos
    private static void mostrarVehiculos() {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados.");
            return;
        }

        System.out.println("---- Lista de Vehiculos ----");
        int index = 0;
        for (Vehiculo vehiculo : listaVehiculos) {
            System.out.println("Indice " + index + ": " + vehiculo);
            index++;
        }
        System.out.println("Total de Vehiculos: " + listaVehiculos.size());
        System.out.println("Total de Automoviles: " + countVehiculosTipo(Automovil.class));
        System.out.println("Total de Motocicletas: " + countVehiculosTipo(Motocicleta.class));
        System.out.println("Total de Autobuses: " + countVehiculosTipo(Autobus.class));
    }
    // Método para eliminar un vehículo
    private static void eliminarVehiculo(Scanner scanner) {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados para eliminar.");
            return;
        }

        System.out.println("---- Eliminar Vehiculo ----");
        mostrarVehiculos();

        System.out.print("Seleccione el indice del vehiculo a eliminar: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (indice >= 0 && indice < listaVehiculos.size()) {
            Vehiculo vehiculo = listaVehiculos.remove(indice);
            System.out.println("Vehiculo eliminado:");
            System.out.println(vehiculo);
        } else {
            System.out.println("El indice invalido.");
        }
    }
     // Método para generar la boleta de revisión vehicular
    private static void generarBoleta(Scanner scanner) {
        if (listaVehiculos.isEmpty()) {
            System.out.println("No hay vehiculos registrados para generar boleta.");
            return;
        }

        System.out.println("---- Generar Boleta de Revision Vehicular ----");
        mostrarVehiculos();

        System.out.print("Seleccione el indice del vehiculo para generar la boleta: ");
        int indice = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        if (indice >= 0 && indice < listaVehiculos.size()) {
            Vehiculo vehiculo = listaVehiculos.get(indice);
            double totalAPagar = calcularTotalAPagar(vehiculo);
            System.out.println("Boleta de Revisión Vehicular");
            System.out.println("Datos del Vehiculo:");
            System.out.println(vehiculo);
            System.out.println("Total a Pagar: Lps. " + totalAPagar);
        } else {
            System.out.println("Indice invalido.");
        }
    }
    private static double calcularTotalAPagar(Vehiculo vehiculo){
        
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
    /*metodo auxiliar tambien para leer la fecha, lo cree porque al leer las fechas como parseFecha no funcionaba entonces
    al crear este metodo la lee la fecha*/
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
