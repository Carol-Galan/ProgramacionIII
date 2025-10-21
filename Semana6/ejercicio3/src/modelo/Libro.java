package modelo;
public class Libro {
    //Atributos
    private String nombre;
    private String autor;
    private String ISBN;

    

    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getAutor() {
        return autor;
    }



    public void setAutor(String autor) {
        this.autor = autor;
    }



    public String getISBN() {
        return ISBN;
    }



    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }



    public Libro(String nombre, String autor, String iSBN) {
        this.nombre = nombre;
        this.autor = autor;
        ISBN = iSBN;
    }



    public String getEstadoComoString() {
        return "Libro [nombre=" + nombre + ", autor=" + autor + ", ISBN=" + ISBN + "]";
    }

}
