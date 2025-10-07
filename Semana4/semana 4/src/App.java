public class App {
    public static void main(String[] args) throws Exception {

        if(args.length==2){
            String param1 = args[0];
            String param2 = args[1];
            try {
                float valor1 = Float.parseFloat(param1);
                float valor2 = Float.parseFloat(param2); 
                System.out.printf("el resultado de sumar %.2f y %.2f es %.2f", valor1, valor2, valor1+valor2);

            } catch (Exception e) {
                //error
                System.err.println("Error en el parse");
            }
            
        }else{
            System.err.println("Error, debes introducir dos palabras");
        }

        
    }
}
