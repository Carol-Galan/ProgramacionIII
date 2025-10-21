import static com.coti.tools.Esdia.*;
//import java.util.Iterator;

import modelo.Concesionario;


public class App {

    // Ahora lo haremos con colecciones, en concreto ArrayList
    // Empleamos <Persona> para indicar el tipo de la colección.
    // Fijaos que la colección podrá crecer siempre y cuando haya memoria
    // disponible dinámicamente.
    

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
                    Concesionario.agregarCoche();
                    break;
                case 2:
                    Concesionario.eliminarCoche();
                    //eliminarPersonaConIterator();
                    break;
                case 3:
                    Concesionario.modificarCoche();
                    break;
                case 4:
                    Concesionario.listarCoches();
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
