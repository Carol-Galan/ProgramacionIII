package modelo;

public class Videoteca {
    //Atributos
    private Pelicula[] peliculas;

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public Videoteca(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public Videoteca crearNuevaVideoteca (int tam_video){
        peliculas = new Pelicula [tam_video];
        for (int i = 0; i<tam_video; i++){
            peliculas[i]=null;
        }
        return new Videoteca (peliculas);
    }
}
