import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca el año de nacimiento:");
        int anioNac = scan.nextInt();
        System.out.println("Introduzca el año actual:");
        int anioAct = scan.nextInt();

        System.out.printf("Su edad es: %d", anioAct-anioNac);

        scan.close();




    }
}
