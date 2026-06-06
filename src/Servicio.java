public abstract class Servicio {
    private String nombre;
    final private double costoBase;

    public Servicio(String nombre, double costoBase) {
        this.nombre = nombre;
        this.costoBase = costoBase;
    }

    public double getCostoBase(){
        return costoBase;
    }
}
