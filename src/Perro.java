class Perro extends Animal {
    Perro(String nombre) {
        super(nombre);
    }

    void hacerSonido() {
        System.out.println(nombre + ": Guau guau");
    }
}