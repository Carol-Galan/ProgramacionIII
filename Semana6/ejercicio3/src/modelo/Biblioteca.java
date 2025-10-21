package modelo;
import static com.coti.tools.Esdia.readString_ne;

import java.util.HashMap;
import java.util.Map;


public class Biblioteca {
    private static HashMap<String, Libro> libros = new HashMap<>();
    public static void agregarLibro() {
        String nombre = readString_ne("Ingrese el nombre del libro: ");
        String autor = readString_ne("Ingrese el autor del libro: ");
        String ISBN = readString_ne("Ingrese el ISBN del libro: ");
        libros.put(ISBN, new Libro(nombre, autor, ISBN));
    }

    public static void eliminarLibro() {
        String ISBN = readString_ne("Ingrese el ISBN del libro a eliminar: ");
        if (libros.containsKey(ISBN)) {
            libros.remove(ISBN);
            System.out.println("Libro eliminado.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void modificarLibro() {
        String ISBN = readString_ne("Ingrese el ISBN del libro a modificar: ");

        if (libros.containsKey(ISBN)) {

            String nuevoNombre = readString_ne("Ingrese el nuevo nombre: ");
            String nuevoAutor = readString_ne("Ingrese el nuevo autor: ");
            String nuevoISBN = readString_ne("Ingrese el nuevo ISBN: ");

            Libro libroModificado = new Libro(nuevoNombre, nuevoAutor, nuevoISBN);
            libros.put(ISBN, libroModificado);

        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    public static void listarLibros() {

        // Si está vacío, no se puede recorrer
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la lista.");
            return;
        }

        for (Map.Entry<String, Libro> entry : libros.entrySet()) {
            String ISBN = entry.getKey();
            Libro value = entry.getValue();
            System.out.println(String.format("ISBN:%9s - %s",ISBN,value.getEstadoComoString()));
        }
    }

}
