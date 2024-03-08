import java.util.*;

// Clase principal que contiene la lógica del programa
public class Main {
    private static Map<String, String> cardMap;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Seleccionar la implementación de Map en tiempo de ejecución
        System.out.println("Seleccione la implementación de Map que desea utilizar:");
        System.out.println("1. HashMap");
        System.out.println("2. TreeMap");
        System.out.println("3. LinkedHashMap");

        int choice = 0;
        try {
            choice = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Error: Por favor ingrese un número válido.");
            System.exit(1);
        }

        MapFactory mapFactory;
        switch (choice) {
            case 1:
                mapFactory = new HashMapFactory();
                break;
            case 2:
                mapFactory = new TreeMapFactory();
                break;
            case 3:
                mapFactory = new LinkedHashMapFactory();
                break;
            default:
                System.out.println("Opción no válida. Se utilizará HashMap por defecto.");
                mapFactory = new HashMapFactory();
        }

        // Crear el mapa utilizando el Factory Method
        cardMap = mapFactory.createMap();

        // Leer el archivo de cartas
        readCardFile("cards_desc.txt");