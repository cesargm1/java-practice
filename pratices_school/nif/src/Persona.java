import javax.swing.JOptionPane;

public class Persona {
    String nombre;
    char[] nif = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
            'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
            'C', 'K', 'E' };

    String dni;

    String nifCompleto;

    public void obtenerDatos() {

        this.nombre = JOptionPane.showInputDialog("Introduce tu nombre");
        JOptionPane.showMessageDialog(null, "Hello " + nombre);

        this.dni = JOptionPane.showInputDialog("Introduce tu dni");
        JOptionPane.showMessageDialog(null, "tu dni es " + dni);

        dni.trim();

        int dniInt = Integer.parseInt(dni);

        int calcularLetra = dniInt % 23;

        char letraNif = nif[calcularLetra]; // saca el indice de el array de nif haciendo la operacion de la variable
                                            // calcular letra
        this.nifCompleto = dni + "" + letraNif; // Persona nifCompleto

    }

    public void mostrarDatos() {
        System.out.println("El nombre de la persona es " + this.nombre);
        System.out.println("El DNI de la persona es " + this.dni);
        System.out.println("El NIF de la pesona es " + this.nifCompleto);
    }

}