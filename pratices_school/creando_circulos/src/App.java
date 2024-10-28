import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo();
    }

    public void obtenerDatos() {
        String mensaje = JOptionPane.showInputDialog("Por favor introduce el tamaño del circulo :)");
        JOptionPane.showMessageDialog(null, "el tamaño del circulo es " + mensaje);
    }

    public void mostrarDatos(double radio, double perimetro, double area) {
        System.out.println("El radio del circulo es " + radio);
        System.out.println("El perimetro del circulo es " + perimetro);
        System.out.println("El area del circulo es " + area);

    }
}
