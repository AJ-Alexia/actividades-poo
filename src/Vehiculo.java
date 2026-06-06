public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double costoBase;

    public Vehiculo(String marca, String modelo, double costoBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.costoBase = costoBase;
    }

    public abstract double calcularCosto();

    public double getCostoBase() {
        return costoBase;
    }

    public void mostrarInfo() {
        System.out.println("Costo Base: " + calcularCosto());
    }
}
