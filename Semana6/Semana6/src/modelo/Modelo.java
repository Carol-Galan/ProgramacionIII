package modelo;
import static com.coti.tools.Esdia.readFloat;
import static com.coti.tools.Esdia.readString_ne;

import java.util.ArrayList;

public class Modelo {
    public static void agregarCoche(ArrayList<Coche> coches) {
        String matricula = readString_ne("Ingrese la matrícula del coche: ");
        String marca = readString_ne("Ingrese la marca del coche: ");
        float precio = readFloat("Ingrese el precio del coche: ");
        coches.add(new Coche(matricula, marca, precio));
    }

    /* 
    public static void eliminarCocheConIterator() {
        String nombre = readString_ne("Ingrese el nombre de la persona a eliminar: ");
        boolean eliminado = false;
        Iterator<Coche> iterator = coches.iterator();
        while (iterator.hasNext()) {
            Coche coche = iterator.next();
            if (coche.getMatrícula().equals(matricula)) {
                iterator.remove();
                eliminado = true;
                break;
            }
        }

        if (eliminado) {
            System.out.println("Persona eliminada.");
        } else {
            System.out.println("Persona no encontrada.");
        }
    }
    */
    
    public static void eliminarCoche(ArrayList<Coche> coches) {

        String matricula = readString_ne("Ingrese la matrícula del coche a eliminar: ");
        Coche cocheAEliminar = null;

        // Atención se debe tener especial cuidado cuando se recorre una
        // colección y se elimina uno de sus elementos. No deberíamos
        // eliminar un elemento empleando el bucle for each
        // Como alternativa se podría eliminar utilizando un iterator.
        for (Coche coche : coches) {
            if (coche.getMatrícula().equals(matricula)) {
                cocheAEliminar = coche;
                break;
            }
        }
        if (cocheAEliminar != null) {
            coches.remove(cocheAEliminar);
            System.out.println("Coche eliminado.");
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void modificarCoche(ArrayList<Coche> coches) {

        String matricula = readString_ne("Ingrese la matrícula del coche a modificar: ");
        Coche cocheAModificar = null;
        for (Coche coche : coches) {
            if (coche.getMatrícula().equals(matricula)) {
                cocheAModificar = coche;
                break;
            }
        }
        if (cocheAModificar != null) {
            String nuevaMatricula = readString_ne("Ingrese la nueva matrícula: ");
            String nuevaMarca = readString_ne("Ingrese la nueva marca: ");
            float nuevoPrecio = readFloat("Ingrese el nuevo precio: ");

            cocheAModificar.setMatrícula(nuevaMatricula);
            cocheAModificar.setMarca(nuevaMarca);
            cocheAModificar.setPrecio(nuevoPrecio);
        } else {
            System.out.println("Coche no encontrado.");
        }
    }

    public static void listarCoches(ArrayList<Coche> coches) {

        if (coches.isEmpty()) {
            System.out.println("No hay coches en la lista.");
            return;
        }

        for (Coche coche : coches) {
            System.out.println(coche.getEstadoComoString());
        }
    }
}
