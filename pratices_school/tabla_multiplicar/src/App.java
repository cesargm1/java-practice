public class App {
    public static void main(String[] args) {
        System.out.println("primeros 25 numeros");

        for (int i = 0; i <= 25; i++) {
            System.out.print(i);
        }

        System.err.println(" ");

        for (int i = 0; i <= 50; i += 2) {
            System.out.print(i);
        }

        System.err.println(" ");

        for (int i = 1; i <= 49; i += 2) {
            System.out.print(i);
        }

        // metodo 1

        System.err.println(" ");
        // // tabla de multiplicar del 1

        // System.out.println("Tabla del 1");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("1*" + i + "=" + i);
        // }

        // // Tabla del 2
        // System.out.println("Tabla del 2");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("2*" + i + "=" + i * 2);
        // }

        // // tabla del 3
        // System.out.println("Tabla del 3");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("3*" + i + "=" + i * 3);
        // }

        // // Tabla del 4

        // System.out.println("Tabla del 4");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("4*" + i + "=" + i * 4);
        // }

        // System.out.println("Tabla del 5");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("5*" + i + "=" + i * 5);
        // }

        // System.out.println("Tabla del 6");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("6*" + i + "=" + i * 6);
        // }

        // System.out.println("Tabla del 7");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("7*" + i + "=" + i * 7);
        // }

        // System.out.println("Tabla del 8");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("8*" + i + "=" + i * 8);
        // }

        // System.out.println("Tabla del 9");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("9*" + i + "=" + i * 9);
        // }

        // System.out.println("Tabla del 10");
        // System.out.println("");

        // for (int i = 0; i <= 10; i++) {
        // System.out.println("10*" + i + "=" + i * 10);
        // }

        // metodo 2

        for (int i = 1; i <= 10; i++) {
            System.out.println("tabla de multiplicar de " + i);

            for (int j = 0; j <= 10; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("---------------");
        }
    }

}
