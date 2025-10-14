package modelo;

public class Videoteca {
    //Atributos
    private Pelicula[] peliculas;
    private int cantPeliculas;

    public Pelicula[] getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(Pelicula[] peliculas) {
        this.peliculas = peliculas;
    }

    public int getCantPeliculas() {
        return cantPeliculas;
    }

    public void setCantPeliculas(int cantPeliculas) {
        this.cantPeliculas = cantPeliculas;
    }

    public Videoteca(Pelicula[] peliculas) {
        this.peliculas = peliculas;
        this.cantPeliculas = 0;
    }

    public Videoteca crearNuevaVideoteca (int tam_video){
        peliculas = new Pelicula [tam_video];
        for (int i = 0; i<tam_video; i++){
            peliculas[i]=null;
        }
        return new Videoteca (peliculas);
    }

    //Metodos logica de negocio
    /**
     * Método que añade una película al array
     * @param p Película a añadir
     * @return true si ha podido añadirla, false en caso contrario
     */
    public boolean anadirPelicula (Pelicula p){
        if (cantPeliculas<peliculas.length){
            //hay hueco: continuar
            peliculas[cantPeliculas]=p;
            cantPeliculas++;
            return true;
        }else{
            //no hay hueco
            return false;
        }
    }
}
