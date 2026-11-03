public abstract class ServicioSuscripcion extends Servicio {
    private int meses;

    public ServicioSuscripcion(String nombre, double costoBase, int meses) {
        super(nombre, costoBase);
        this.meses = meses;
    }

    public int getMeses() {
        return meses;
    }

    public double calcularCosto() {
        return getCostoBase() * meses;
    }
}