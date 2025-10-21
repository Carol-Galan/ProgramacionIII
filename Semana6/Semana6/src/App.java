import static com.coti.tools.Esdia.*;
import java.util.ArrayList;
//import java.util.Iterator;

import modelo.Coche;
import modelo.Modelo;


public class App {

    // Ahora lo haremos con colecciones, en concreto ArrayList
    // Empleamos <Persona> para indicar el tipo de la colección.
    // Fijaos que la colección podrá crecer siempre y cuando haya memoria
    // disponible dinámicamente.
    private static ArrayList<Coche> coches = new ArrayList<>();

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar coche");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Modificar coche");
            System.out.println("4. Listar coches");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    Modelo.agregarCoche(coches);
                    break;
                case 2:
                    Modelo.eliminarCoche(coches);
                    //eliminarPersonaConIterator();
                    break;
                case 3:
                    Modelo.modificarCoche(coches);
                    break;
                case 4:
                    Modelo.listarCoches(coches);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }

    

}
