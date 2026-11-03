public class Animal {
    String tipo;
    double tamano;
    int edad;

    public  Animal(String tipo, double tamano, int edad) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.edad = edad;
    }

    public void MostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamano: " + tamano);
        System.out.println("Edad: " + edad + " meses");
    }
}
