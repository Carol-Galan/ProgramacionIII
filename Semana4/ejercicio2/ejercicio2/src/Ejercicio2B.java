public class Ejercicio2B {
    public static void main (String[] args){

        //Solucion del profe
        Usuario[] usuarios = new Usuario [4];
        usuarios[0] = new Usuario ("nombre", 70, 1.70);
        //lo recorremos con un for each

        if(user1!=null){
            System.out.println(Usuario.obtenerCabeceraTablaUsuario());
            System.out.println(user1.obtenerUsuarioComoFila());
            System.out.println(user2.obtenerUsuarioComoFila());
            System.out.println(user3.obtenerUsuarioComoFila());
            System.out.println(user4.obtenerUsuarioComoFila());
            System.out.println(user5.obtenerUsuarioComoFila());
        }else{
            System.err.println("se ha producido un error al crear el usuario");
        }
    }
}
