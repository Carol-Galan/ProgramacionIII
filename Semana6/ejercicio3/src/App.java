import static com.coti.tools.Esdia.*;
//import java.util.Iterator;

import modelo.Biblioteca;
import modelo.Libro;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 
 * Ejercicio CRUD Collections. (Con la colección HashMap)
 * 
 * Ejercicio para ejemplificar altas, bajas, modificaciones y listados
 * empleando un HashMap.
 * 
 * Se puede comprobar como es mucho más sencilla la gestión de nuevos elementos
 * en la colección de forma dinámica.
 * 
 * 
 * No se sigue ningún patrón arquitectónico en este ejercicio.
 * 
 * Se realiza todo en la misma clase para mayor claridad, sin embargo
 * esto se aplica a las colecciones que residan en cualquier otro objeto del programa.
 * 
 * 
 * @author Loza
 */
public class App {

    

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENU CRUD ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Modificar libro");
            System.out.println("4. Listar libros");
            System.out.println("5. Salir");
            opcion = readInt("Ingrese una opción: ");

            switch (opcion) {
                case 1:
                    Biblioteca.agregarLibro();
                    break;
                case 2:
                    Biblioteca.eliminarLibro();
                    break;
                case 3:
                    Biblioteca.modificarLibro();
                    break;
                case 4:
                    Biblioteca.listarLibros();
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
