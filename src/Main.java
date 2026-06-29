public class Main {
    public static void main(String[] args) {
        Animal perro = new Perro("Rex");
        Animal gato = new Gato("Mishi");

        perro.hacerSonido();
        gato.hacerSonido();
        perro.dormir();
        gato.dormir();
    }
}