package modelo;

public class Director {
    //Atributos
    private String nombre;
    private String apellidos;
    private Boolean tieneOscar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Boolean getTieneOscar() {
        return tieneOscar;
    }

    public void setTieneOscar(Boolean tieneOscar) {
        this.tieneOscar = tieneOscar;
    }

    public Director(String nombre, String apellidos, Boolean tieneOscar) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tieneOscar = tieneOscar;
    }


    
}
