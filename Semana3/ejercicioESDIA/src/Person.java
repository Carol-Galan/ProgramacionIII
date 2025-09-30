public class Person {
    //atributos
    private String name = "noname";
    private float weightInKg;
    private float heightInMeters;
    
    //constructor explicito sin parámetros (ctor+tab)
    public Person() {
        name ="NombrePorDefecto"
        weightInKg = 80.0f;
        heightInMeters = 1.8f;
    }

    public Person(String name, float weightInKg, float heightInMeters) {
        this.name = name;
        this.weightInKg = weightInKg;
        this.heightInMeters = heightInMeters;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeightInKg() {
        return weightInKg;
    }

    public void setWeightInKg(float weightInKg) {
        this.weightInKg = weightInKg;
    }

    public float getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(float heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    //metodos (logica/comportamientos)



    //getters y setters
    




}
