import java.util.Scanner;

public class Cajero {

    private Cuenta cuenta;
    private Scanner scanner;

    public Cajero() {
        this.cuenta = new Cuenta();
        this.scanner = new Scanner(System.in);

    }

    private double SolicitarCantidad() {
        System.out.println("introduce la cantidad de dinero");
        return scanner.nextDouble(); // debuele lo que introducio el usuario
    }

    public void ingresar() {
        double cantidad = SolicitarCantidad(); // Solicita cantidad al usuario
        cuenta.setSaldo(cuenta.getSaldo() + cantidad); // Actualiza el saldo
        System.out.println("Has ingresado: " + cantidad + " euros.");
        System.out.println("Saldo actual: " + cuenta.getSaldo() + " euros.");
    }

    public void obtenerSaldo() {
        System.out.println("El saldo actual es: " + cuenta.getSaldo() + " euros.");
    }

    public void cerrarScanner() {
        scanner.close(); // Método para cerrar el Scanner
    }
}
