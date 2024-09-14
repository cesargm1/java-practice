public class Great {
    
    public static void main (String[] args) {

        if (args.length == 0) {
            System.out.println("Introduce un nombre correcto");

            return;
        }
        
        String name = args[0];
        System.out.println("hola " + name);

    }

}
