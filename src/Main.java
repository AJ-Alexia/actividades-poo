public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Auto("Lexus", "LC500", 100.0, 4);
        Vehiculo moto = new Moto("Honda", "Storm", 100.0, 600);

        System.out.println("Auto:");
        auto.mostrarInfo();

        System.out.println("Moto:");
        moto.mostrarInfo();
    }
}
