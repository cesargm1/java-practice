public class compiladorA {
    public static void main(String[] args)  {

        int x = 1;

        while (x < 10) {
            if (x < 3) {
                System.out.println("big x");
                 x++;
            }

        }
    }
}

// anterior x > 3 actual x < 3

// añadir incremento x++; si no bucle infinito