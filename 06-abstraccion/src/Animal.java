abstract class Animal {
    String nombre;

    Animal(String nombre) {
        this.nombre = nombre;
    }

    abstract void hacerSonido();

    void dormir() {
        System.out.println(nombre + " está durmiendo");
    }
}