import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        factorial(5);
    }

    public static int factorial(int num) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter username");

        String userName = myObj.nextLine(); /* netLine() */
        System.out.println("Username is: " + userName);
        System.out.println("el numro de factorial sera \n" + num);

        /* 1 */ int result = 1;
        for (int counter = 1; num >= counter; counter++) {
            /* no entiendo */ result *= counter;
        }

        System.out.println("El factorial de " + num + " es: " + result);

        myObj.close();
        return result;
    }
}
