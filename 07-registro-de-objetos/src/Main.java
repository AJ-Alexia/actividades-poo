import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cuántas personas desea registrar? ");
        int cantidad = scanner.nextInt();

        Persona[] personas = new Persona[cantidad];

        int totalHombres = 0;
        int totalMujeres = 0;
        int totalMenores = 0;
        int totalAdultos = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Persona " + (i + 1) + "");

            System.out.print("Nombre: ");
            String nombre = scanner.next();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();

            System.out.print("Genero (Hombre/Mujer): ");
            String genero = scanner.next();

            personas[i] = new Persona(nombre, edad, genero);

            if (genero.equalsIgnoreCase("Hombre")) {
                totalHombres++;
            } else if (genero.equalsIgnoreCase("Mujer")) {
                totalMujeres++;
            }

            if (edad <= 18) {
                totalMenores++;
            } else {
                totalAdultos++;
            }
        }

        System.out.println("Personas registradas:");
        for (int i = 0; i < personas.length; i++) {
            Persona p = personas[i];
            System.out.println(p.getNombre() + " - " + p.getEdad() + " años - " + p.getGenero());
        }

        System.out.println("Total de hombres: " + totalHombres);
        System.out.println("Total de mujeres: " + totalMujeres);
        System.out.println("Total de menores: " + totalMenores);
        System.out.println("Total de adultos: " + totalAdultos);
    }
}
