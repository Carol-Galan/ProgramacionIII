import java.lang.classfile.attribute.EnclosingMethodAttribute;
import java.util.Scanner;
import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        int anioAct = Esdia.readInt("Introduzca año actual:");
        int anioNac = Esdia.readInt("Introduzca año de nacimiento:");
        System.out.printf("Su edad es %d", anioAct-anioNac);
    }
}
