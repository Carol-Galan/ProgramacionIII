import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
        Console con = System.console();


        if (con!=null){
            System.out.println("Introduzca su año de nac:");
            String anioNac = con.readLine();
            int anioNacInt = Ingeger.parseInt(anioNac);

            System.out.println("Introduzca año actual:");
        }



    }
}