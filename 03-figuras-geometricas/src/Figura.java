// Clase abstracta: no se puede instanciar directamente
// Solo existe para ser heredada
public abstract class Figura {

    // Metodo abstracto: no tiene cuerpo aquí
    // Cada clase hija DEBE implementarlo o no compilará
    public abstract double calcularArea();

    public abstract double calcularPerimetro();

    // Este metodo SÍ tiene implementación porque es igual para todas las figuras
    // Muestra los resultados sin importar qué figura sea
    public void mostrarInfo() {
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
