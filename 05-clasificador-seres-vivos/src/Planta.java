public class Planta {

    String tipo;
    double tamano;
    int edad;

    public Planta(String tipo, double tamano, int edad) {
        this.tipo = tipo;
        this.tamano = tamano;
        this.edad = edad;
    }

    //Metodo para mostrar los datos
    public void MostrarDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamano: " + tamano);
        System.out.println("Edad: " + edad + " meses");
    }
}
