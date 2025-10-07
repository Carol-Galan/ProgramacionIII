public class Ejercicio2 {
    public static void main (String[] args){

        Usuario user1 = Usuario.crearUsuario(args);

        if(user1!=null){
            System.out.println(Usuario.obtenerCabeceraTablaUsuario());
            System.out.println(user1.obtenerUsuarioComoFila());
        }else{
            System.err.println("se ha producido un error al crear el usuario");
        }
    }
}
