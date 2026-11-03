public class Triangulo extends Figura {

    private double base;
    private double altura;
    private double lado1;
    private double lado2;
    private double lado3;

    // Necesita 5 datos: base y altura para el área,
    // los tres lados para el perímetro
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }
}
