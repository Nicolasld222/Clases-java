package EjerciciosClase;

import javax.swing.*;

public class Ejercicio6 {
    public static void main (String[]arg) {

        int numero;
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            if (numero != 0) { // Si no es 0, se imprime
                JOptionPane.showMessageDialog(null,"Número ingresado: " + numero);
            }
        } while (numero != 0);
        JOptionPane.showMessageDialog(null,"Programa terminado.");

//        while (true) {
//            int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//            if (numero == 0) {
//                break;
//            }
//            JOptionPane.showMessageDialog(null,"Número ingresado: " + numero);
//        }


//        for (;;) { // Bucle infinito, se rompe con break
//            int numero= Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
//
//            if (numero == 0) {
//                break; // Si el número es 0, termina el ciclo
//            }
//            JOptionPane.showMessageDialog(null,"Número ingresado: " + numero);
//        }
//
//        JOptionPane.showMessageDialog(null,"Programa terminado.");


    }
}
