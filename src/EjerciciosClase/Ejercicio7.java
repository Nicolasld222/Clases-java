package EjerciciosClase;

import javax.swing.*;

public class Ejercicio7 {
    public static void main (String[]arg){
        double nota1, nota2, nota3;
        int seguir = 0;


//        do {
//            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
//            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
//            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));
//
//            double promedio = (nota1 + nota2 + nota3) / 3;
//            JOptionPane.showMessageDialog(null,"El promedio de las notas es: " + promedio);
//            seguir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea calcular otro promedio? (1.Si/2.No):"));
//        }while (seguir == 2);



//        while (seguir == 1) {
//
//            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
//            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
//            nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"))
//
//            double promedio = (nota1 + nota2 + nota3) / 3;
//            JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio);
//            seguir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea calcular otro promedio? (1.Si/2.No):"));
//        }
//
//        JOptionPane.showMessageDialog(null, "Programa terminado.");

        for (; seguir == 1; ) {
             nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
             nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2"));
             nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3"));


            double promedio = (nota1 + nota2 + nota3) / 3;

            JOptionPane.showMessageDialog(null, "El promedio de las notas es: " + promedio);

            seguir = Integer.parseInt(JOptionPane.showInputDialog("¿Desea calcular otro promedio? (1.Sí / 2.No):"));
        }

        JOptionPane.showMessageDialog(null, "Programa terminado.");


    }
}
