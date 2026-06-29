public class Gato extends Animal {
    Gato(String nombre) {
        super(nombre);
    }

    void hacerSonido() {
        System.out.println(nombre + ": Miau");
    }
}