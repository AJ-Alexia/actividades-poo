 public abstract class ServicioEmpresarial extends Servicio {
        private int empleados;

        public ServicioEmpresarial(String nombre, double costoBase, int empleados) {
            super(nombre, costoBase);
            this.empleados = empleados;
        }

        public int getEmpleados() {
            return empleados;
        }

        public double calcularCosto() {
            return getCostoBase() + (empleados * 20);
        }
    }
