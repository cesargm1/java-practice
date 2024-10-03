package package;

import javax.swing.*;
import Alumno;
class App {

    public static void main(String[] args) {
            String canticadString = JOptionPane.showInputDialog("itroduce el numero ");
           int cantidadInt = Integer.parseInt(canticadString);
            String edadString = JOptionPane.showInputDialog("introduce tu edad");

            Alumno[] alumnos = new Alumno[cantidadInt];

            for(int i=0; i < cantidadInt; i++ ) {
                String nombreString = JOptionPane.showInputDialog("Intruduce tu nombre");
                String notaString = JOptionPane.showInputDialog("Intruduce tu edad");
                int notaInt = Integer.parseInt(notaString);
     
                 int edad = Integer.parseInt(edadString);
                 Alumno alu1 = new Alumno();

                 alu1.nombre = nombreString;
                 alu1.nota = notaInt;
                 alumnos[i] = alu1;

                //  if (alu1.nota >= 5) {
                //     alu1.felicitar();
                //  }else{
                //     alu1.reprender();
                //  }
            }

            
           
          //  mensage( nombre);
            

        }

}
