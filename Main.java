import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Perro perro = new Perro();
        Gato gato = new Gato();
        String opcion;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("Elige una opcion:");
            System.out.println("1. Hacer sonido del perro");
            System.out.println("2. Jugar con el perro");
            System.out.println("3. Alimentar al perro");
            System.out.println("4. Hacer sonido del gato");
            System.out.println("5. Jugar con el gato");
            System.out.println("6. Alimentar al gato");
            System.out.println("0. Salir");
            System.out.println("-------------------");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    perro.hacerSonido();
                    break;
                case "2":
                    System.out.println(perro.jugar());
                    break;
                case "3":
                    System.out.println(perro.alimentar());
                    break;
                case "4":
                    gato.hacerSonido();
                    break;
                case "5":
                    System.out.println(gato.jugar());
                    break;
                case "6":
                    System.out.println(gato.alimentar());
                    break;
                case "0":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
        } while (!opcion.equals("0"));

        sc.close();
    }
}