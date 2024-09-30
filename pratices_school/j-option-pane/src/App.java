
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nombre = JOptionPane.showInputDialog("introduce tu nombre");
        String mensage = "bienvenido " + nombre;
        String edadString = JOptionPane.showInputDialog("introduce tu edad");
        int edad = Integer.parseInt(edadString);

        jubilacion(mensage, nombre, edad);

        // System.out.println(mensage);
        // System.out.println(mensage2);

        // JOptionPane.showMessageDialog(null, mensage);

        // ImageIcon icono = new
        // ImageIcon("java-practice/pratices_school/img/navegador-de-experiencia.png");

        // JOptionPane.showMessageDialog(null, "Personalizando cuadro de diálogo",
        // "Blog masqueprogramar",
        // JOptionPane.INFORMATION_MESSAGE,
        // icono);
    }

    public static void jubilacion(String mensage, String nombre, int edad) {
        if (edad >= 65) {
            System.out.println("eres mayor de edad");
            System.out.println(nombre + "te faltan " + (65 - edad) + " para ser mayor de edad");
        } else {
            System.out.println("no eres un jubilado");
        }
    }

}
