public class Main {
    public static void main(String[] args) {

        // Polimorfismo: la variable es de tipo Figura (clase base)
        // pero el objeto real es Rectangulo, Triangulo o Circulo
        // Java sabe en tiempo de ejecución cuál metodo llamar
        Figura f1 = new Rectangulo(5, 3);
        Figura f2 = new Triangulo(4, 6, 3, 4, 5);
        Figura f3 = new Circulo(7);

        System.out.println("=== Rectángulo ===");
        f1.mostrarInfo();

        System.out.println("=== Triángulo ===");
        f2.mostrarInfo();

        System.out.println("=== Círculo ===");
        f3.mostrarInfo();
    }
}
