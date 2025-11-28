import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String nombre;
        float notaPar1;
        float notaPar2;
        float notaFinal;
        float notaMediaPar1=0f;
        float notaMediaPar2=0f;
        float notaMediaFinal=0f;
        int i;
        System.out.println("Inserte el número de alumos:");
        int num = sc.nextInt();
        Alumno [] alumnos = new Alumno[num];
        for (i=0; i<num; i++){
            System.out.println("Introduzca el nombre:");
            nombre = sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Introduzca la nota del primer parcial:");
            notaPar1 = sc.nextFloat();
            System.out.println("Introduzca la nota del segundo parcial:");
            notaPar2 = sc.nextFloat();
            System.out.println("Introduzca la nota del final:");
            notaFinal = sc.nextFloat();
            alumnos[i] = new Alumno(nombre, notaPar1, notaPar2, notaFinal);
            notaMediaPar1 = notaMediaPar1+notaPar1;
            notaMediaPar2 = notaMediaPar2+notaPar2;
            notaMediaFinal = notaMediaFinal+notaFinal;
        }
        
        notaMediaPar1 = notaMediaPar1/num;
        notaMediaPar2 = notaMediaPar2/num;
        notaMediaFinal = notaMediaFinal/num;


        
        System.out.println("|--------------------------------------------|");
        System.out.println("|Lista de clase                              |");
        System.out.println("|--------------------------------------------|");
        for (Alumno a: alumnos){
            System.out.println(a.mostrarAlumnoFila());
        }
        System.out.println("|--------------------------------------------|");
        System.out.printf("|Media Parcial 1: %2.2f | Media Parcial 2: %2.2f | Media Final: %2.2f | Media Clase: %2.2f |\n", notaMediaPar1, notaMediaPar2, notaMediaFinal, ((notaMediaPar1*0.1f)+(notaMediaPar2*0.1f)+(notaMediaFinal*0.8f)));
        
    }
}
