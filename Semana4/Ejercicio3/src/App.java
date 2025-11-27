import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        float precio;
        float cant;
        int cliente = 0;
        System.out.println("Inserte el precio de las manzanas:");
        precio = sc.nextFloat();
        Manzana.setPrecioSinIVA(precio);
        System.out.println("Inserte el precio de las peras:");
        precio = sc.nextFloat();
        Pera.setPrecioSinIVA(precio);

        System.out.println("Elija opción:");
        System.out.println("1. Nuevo pedido");
        System.out.println("2. Salir");
        int opción = sc.nextInt();
        while (opción != 2){
            cliente++;
            System.out.println("Introduzca la cantidad de manzanas:");
            cant = sc.nextFloat();
            Manzana m = new Manzana(cant);
            System.out.println("Introduzca la cantidad de peras:");
            cant = sc.nextFloat();
            Pera p = new Pera(cant);
            float total = m.calcularPrecioTotal()+p.calcularPrecioTotal();

            System.out.println("|----------------------------------------------------|");
            System.out.printf("|Cliente:                                        |%3d|\n", cliente);
            System.out.println("|----------------------------------------------------|");
            System.out.printf("|Manzanas  |%4.2f kg| precio Kg con IVA %5.2f | %5.2f |\n", m.getCantidadKg(), m.getPrecioConIVA(), m.calcularPrecioTotal());
            System.out.printf("|Peras     |%4.2f kg| precio Kg con IVA %5.2f | %5.2f |\n", p.getCantidadKg(), p.getPrecioConIVA(), p.calcularPrecioTotal());
            System.out.println("|----------------------------------------------------|");
            System.out.printf("|Total con IVA %5.2f                                 |\n", total);
            System.out.println("|----------------------------------------------------|");
            System.out.println("");

            System.out.println("Elija opción:");
            System.out.println("1. Nuevo pedido");
            System.out.println("2. Salir");
            opción = sc.nextInt();
        }
        
    }
}
