class EmpleadoRepartidor extends Empleado {

    private int zonasRepartidas;

    public EmpleadoRepartidor(String nombre, double salarioBase, int zonasRepartidas) {
        super(nombre, salarioBase);
        this.zonasRepartidas = zonasRepartidas;
    }
}