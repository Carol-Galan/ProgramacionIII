import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

        Person personita1 = new Person();
        Person personita2 = new Person("paco", 86.3f, 1.70f);
        Person personita3 = personita1;

       double a = Esdia.readDouble("dame un double\n");
       double b = Esdia.readDouble("dame otro double\n");
       System.out.printf("La suma de %.3f y de %.3f es de %.3f", a, b, a+b);
    }
}
