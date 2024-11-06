
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Menu de camioneros");
        System.out.println("---------------------------");
        System.out.println("1. Ingrese el nombre del camionero");
        System.out.println("2 Ingrese el telefono del camionero");
        System.out.println("3. Ingrese la direccion del camionero");
        System.out.println("3 - Ingrese el salario del camionero ");
        System.out.println("4 - Ingrese la poblacion del camionero");

        int opcion = scanner.nextInt(); // se almacena el valor que introduce el usuario nextInt pide un numero

        switch (opcion) { // tenemos que comparar con numeros ya que la variable opcion es un int
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            default:
                System.out.println("Error al insertar");

                break;
        }
        scanner.close(); // cierra la escucha del usuario

    }
}
