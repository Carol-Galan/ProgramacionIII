import java.util.Scanner;
import modelo.Videoteca;
import modelo.Pelicula;
import modelo.Director;
public class App {
    public static void main(String[] args) throws Exception {
        //Variables
        Scanner sc = new Scanner(System.in);
        Float velocidadReproduccion = 1.0;


        //Menú inicial
        System.out.println("|-----------------------------------------------|");
        System.out.println("| MI VIDEOTECA                                  |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("| 1) Nueva videoteca de películas               |");
        System.out.println("| 2) Configurar velocidad de reproducción       |");
        System.out.println("| 3) Anadir una nueva película a la videoteca   |");
        System.out.println("| 4) Mostrar información actual de películas    |");
        System.out.println("| 5) Salir (se borrará toda la información)     |");
        System.out.println("|-----------------------------------------------|");
        System.out.println("Seleccione una opción (1-5):");
        int opción = sc.nextInt(); //hay un metodo de esdia que te permite meter un max y un min
        switch (opción) {
            case 1:
                System.out.println("Especifique el tamaño de la videoteca:");
                int tam_video = sc.nextInt();
                Videoteca videoteca = crearNuevaVideoteca (tam_video); //probar con el constructor
                break;
            case 2:
                System.out.println("Introduzca la velocidad de reproducción:");
                velocidadReproduccion = sc.nextFloat();
                break;
            case 3:
                //solicitar datos al usuario, guardarlos, new pelicula y luego añadir a videoteca
                break;
            case 4:
            //pelicula [] pelis = videoteca.getPeliculas
            //for pelicula p : pelis
            //system printf mostrar cosas
                break;
            case 5:

                break;
            default:
                System.err.println("Introduzca una opción válida");
        }
//para sacar peliculas usar getPeliculas
//dame peliculas mientras no sea null



    }
}
