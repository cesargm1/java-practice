import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Cajero cajero = new Cajero();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            try {
                System.out.println("Seleccione una operación:");
                System.out.println("1. Ingresar dinero");
                System.out.println("2. Consultar saldo");
                System.out.println("3. Salir");

                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        cajero.ingresar();
                        break;
                    case 2:
                        cajero.obtenerSaldo();
                        break;
                    case 3:
                        exit = true;
                        cajero.cerrarScanner();
                        System.out.println("Gracias por usar el cajero.");
                        break;
                    default:
                        System.out.println("Opción no válida, intente de nuevo.");
                }
            } catch (InputMismatchException e) {

                System.out.println("Error: Debes ingresar un número entero.");
                scanner.next();
            }
        }

        scanner.close();
    }
}