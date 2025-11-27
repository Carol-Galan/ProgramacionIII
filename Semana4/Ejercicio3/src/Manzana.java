public class Manzana {
    private final float IVA = 0.04f;
    private static float precioSinIVA;
    private float cantidadKg;
    
    public float getIVA() {
        return IVA;
    }

    public static float getPrecioSinIVA() {
        return precioSinIVA;
    }

    public static void setPrecioSinIVA(float precioSinIVA) {
        Manzana.precioSinIVA = precioSinIVA;
    }

    public float getCantidadKg() {
        return cantidadKg;
    }

    public void setCantidadKg(float cantidadKg) {
        this.cantidadKg = cantidadKg;
    }


    public Manzana(float cantidadKg) {
        this.cantidadKg = cantidadKg;
    }
    public float getPrecioConIVA(){
        return (IVA*precioSinIVA)+precioSinIVA;
    }

    public float calcularPrecioTotal(){
        return cantidadKg*((IVA*precioSinIVA)+precioSinIVA);
    }
}
