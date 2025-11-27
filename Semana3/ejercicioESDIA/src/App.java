import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {

        String nombre;
        float peso;
        float altura;
        float maxPeso;
        float maxAltura;
        Person personita1 = new Person();
        Person personita2 = new Person();
        Person personita3 = new Person();

        nombre = Esdia.readString("Introduzca el nombre de la primera persona:");
        peso = Esdia.readFloat("Introduzca el peso de la primera persona en kg:");
        altura = Esdia.readFloat("Introduzca la altura de la primera persona en metros:");
        personita1.setName(nombre);
        personita1.setHeightInMeters(altura);
        personita1.setWeightInKg(peso);
        showPersonInfo(personita1);

        nombre = Esdia.readString("Introduzca el nombre de la segunda persona:");
        peso = Esdia.readFloat("Introduzca el peso de la segunda persona en kg:");
        altura = Esdia.readFloat("Introduzca la altura de la segunda persona en metros:");
        personita2.setName(nombre);
        personita2.setHeightInMeters(altura);
        personita2.setWeightInKg(peso);
        showPersonInfo(personita2);

        nombre = Esdia.readString("Introduzca el nombre de la tercera persona:");
        peso = Esdia.readFloat("Introduzca el peso de la tercera persona en kg:");
        altura = Esdia.readFloat("Introduzca la altura de la tercera persona en metros:");
        personita3.setName(nombre);
        personita3.setHeightInMeters(altura);
        personita3.setWeightInKg(peso);
        showPersonInfo(personita3);

        maxPeso = personita1.getWeightInKg();
        if (maxPeso < personita2.getWeightInKg()){
            maxPeso = personita2.getWeightInKg();
            if (maxPeso < personita3.getWeightInKg()){
                System.out.println("La persona que más pesa es " + personita3.getName());
            }else{
                System.out.println("La persona que más pesa es " + personita2.getName());
            }
        }else{
            System.out.println("La persona que más pesa es " + personita1.getName());
        }

        maxAltura = personita1.getHeightInMeters();
        if (maxAltura < personita2.getHeightInMeters()){
            maxAltura = personita2.getHeightInMeters();
            if (maxAltura < personita3.getHeightInMeters()){
                System.out.println("La persona más alta es %s" + personita3.getName());
            }else{
                System.out.println("La persona más alta es %s" + personita2.getName());
            }
        }else{
            System.out.println("La persona más alta es %s" + personita1.getName());
        }



        

       

        /* 
       double a = Esdia.readDouble("dame un double\n");
       double b = Esdia.readDouble("dame otro double\n");
       System.out.printf("La suma de %.3f y de %.3f es de %.3f", a, b, a+b);
       */
    }

    private static void showPersonInfo(Person personita1) {
        System.out.println("INFORMACION DE LA PERSONA:");
        System.out.printf("Nombre: %s, Altura: %f, Peso: %f \n", personita1.getName(), personita1.getHeightInMeters(), personita1.getWeightInKg());
    }
}
