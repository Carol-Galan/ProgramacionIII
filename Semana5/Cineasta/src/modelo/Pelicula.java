package modelo;

public class Pelicula {
    // Atributos
    private Director director;
    private String titulo;
    private int ano_estreno;
    private int duracion_min;
    private float valoracion;

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno_estreno() {
        return ano_estreno;
    }

    public void setAno_estreno(int ano_estreno) {
        this.ano_estreno = ano_estreno;
    }

    public int getDuracion_min() {
        return duracion_min;
    }

    public void setDuracion_min(int duracion_min) {
        this.duracion_min = duracion_min;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public Pelicula(Director director, String titulo, int ano_estreno, int duracion_min, float valoracion) {
        this.director = director;
        this.titulo = titulo;
        this.ano_estreno = ano_estreno;
        this.duracion_min = duracion_min;
        this.valoracion = valoracion;
    }
    //puedo crear un nuevo constructor en el que se cree el director y se introduzcan los datos del director


    
}
