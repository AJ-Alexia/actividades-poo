import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Que tipo de ser vivo quieres registrar? ");
        String tipo_ser_vivo = teclado.nextLine();

        if (tipo_ser_vivo.equals("Planta")) {
            String opcion = " ";

            while (!opcion.equals("no")) {

                System.out.println("Cuantas plantas quiere registrar? ");
                int n = teclado.nextInt();

                Planta[] plantas = new Planta[n];
                teclado.nextLine();

                for (int i=0; i < n; i++) {
                    System.out.println("Ingrese el tipo de planta: ");
                    String tipo = teclado.nextLine();

                    System.out.println("Ingrese el tamano de la planta: ");
                    double tamano = teclado.nextDouble();

                    System.out.println("Ingrese el tamano de la planta: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    Planta planta1 = new Planta(tipo, tamano, edad);
                    plantas[i] = new Planta(tipo, tamano, edad);
                }

                for (int i=0; i < n; i++) {
                    System.out.println(" Planta " + (i + 1) + " ");
                    plantas[i].MostrarDatos();
                }

                System.out.println("Desea seguir registrando plantas? ");
                opcion = teclado.nextLine();
            }
        } else if (tipo_ser_vivo.equals("Animal")) {
            String opcion = " ";

            while (!opcion.equals("no")) {

                System.out.println("Cuantos animales desea registrar? ");
                int n = teclado.nextInt();

                Animal[] animales = new Animal[n];

                teclado.nextLine();

                for (int i=0; i < n; i++) {
                    System.out.println("Ingrese el tipo de animal: ");
                    String tipo = teclado.nextLine();

                    System.out.println("Ingrese el tamano del animal: ");
                    double tamano = teclado.nextDouble();

                    System.out.println("Ingrese la edad del animal: ");
                    int edad = teclado.nextInt();
                    teclado.nextLine();

                    Animal animal1 = new Animal(tipo, tamano, edad);
                    animales[i] = new Animal(tipo, tamano, edad);
                }

                for (int i=0; i < n; i++) {
                    System.out.println(" Animal " + (i + 1) + "  ");
                    animales[i].MostrarDatos();
                }
            }
        }

        else System.out.println("Entrada no aceptada");
    }
}
