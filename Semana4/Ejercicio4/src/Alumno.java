public class Alumno {
    private String nombre;
    private float notaPar1;
    private float notaPar2;
    private float notaFinal;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public float getNotaPar1() {
        return notaPar1;
    }
    public void setNotaPar1(float notaPar1) {
        this.notaPar1 = notaPar1;
    }
    public float getNotaPar2() {
        return notaPar2;
    }
    public void setNotaPar2(float notaPar2) {
        this.notaPar2 = notaPar2;
    }
    public float getNotaFinal() {
        return notaFinal;
    }
    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    public Alumno(String nombre, float notaPar1, float notaPar2, float notaFinal) {
        this.nombre = nombre;
        this.notaPar1 = notaPar1;
        this.notaPar2 = notaPar2;
        this.notaFinal = notaFinal;
    }

    public float getNotaTotalAlumno(){
        return (notaPar1*0.1f)+(notaPar2*0.1f)+(notaFinal*0.8f);
    }

    public String mostrarAlumnoFila(){
        return String.format("|%-20s|%-5.2f|%-5.2f|%-5.2f|%-5.2f|", nombre, notaPar1, notaPar2, notaFinal, getNotaTotalAlumno());
    }
}
