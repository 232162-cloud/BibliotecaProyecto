import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("==== SISTEMA DE BIBLIOTECA v2.0.0 ====");
            System.out.println("1. Registrar Libro");
            System.out.println("2. Registrar Socio");
            System.out.println("3. Registrar Préstamo");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

        } while (opcion != 0);

        System.out.println("Sistema finalizado.");
    }
}
