// "extends Figura" significa: Rectangulo ES una Figura
// Hereda el metodo mostrarInfo() automáticamente
public class Rectangulo extends Figura {

    // Atributos privados: encapsulamiento
    private double base;
    private double altura;

    // Constructor: recibe los datos necesarios para calcular
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // @Override indica que estamos sobreescribiendo el metodo de Figura
    // Si escribes mal el nombre, Java te avisa — sin @Override no lo haría
    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}