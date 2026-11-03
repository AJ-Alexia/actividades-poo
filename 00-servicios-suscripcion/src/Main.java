public class Main {
    public static void main(String[] args) {
        ServicioSuscripcion streaming = new Streaming("Apple", 20, 2,2,false);
        ServicioSuscripcion musica = new Musica("Spotify", 120, 2, "media");
        ServicioEmpresarial cloud = new Cloud("AWS", 200, 2, 100, "Corporativo");

        System.out.println("Streaming: ");
        System.out.println("Costo: " + streaming.calcularCosto());

        System.out.println("Musica: ");
        System.out.println("Costo: " + musica.calcularCosto());

        System.out.println("Cloud: ");
        System.out.println("Costo: " + cloud.calcularCosto());
    }
}
