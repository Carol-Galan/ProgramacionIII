package modelo;
public class Coche {
    //Atributos
    private String matrícula;
    private String marca;
    private float precio;

    public String getMatrícula() {
        return matrícula;
    }

    public void setMatrícula(String matrícula) {
        this.matrícula = matrícula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Coche(String matrícula, String marca, float precio) {
        this.matrícula = matrícula;
        this.marca = marca;
        this.precio = precio;
    }

    public String getEstadoComoString() {
        return "Coche [matricula=" + matrícula + ", marca=" + marca + ", precio=" + precio + "]";
    }

}
