public class Usuario {
    private String name;
    private float peso;
    private float altura;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public Usuario(String name, float peso, float altura) {
        this.name = name;
        this.peso = peso;
        this.altura = altura;
    }

//metodo estatico: no depende del objeto, sino de la clase
//no se necesita una instancia para usarlo
    public float obtenerIMC(){
        return peso/(altura*altura);
    }

//factory method para crear un usuario
/**
 * Método estático para la creación de instancias de Usuario
 * @param datos array de string con nombre, altura y peso
 * @return una instancia de usuario o null
 */
    public static Usuario crearUsuario(String[] datos){
        if (datos.length!=3){
            return null;
        }
        try {
            String nombre = datos[0];
            float peso = Float.parseFloat(datos[1]);
            float altura = Float.parseFloat(datos[2]);  


            return new Usuario(nombre, peso, altura); 
        } catch (Exception e) {
            return null;
        }
        
    }

    // si pones barra asterisco asterisco se crea un comentario de javadoc para documentar
}
