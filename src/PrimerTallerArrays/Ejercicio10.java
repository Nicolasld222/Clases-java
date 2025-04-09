package PrimerTallerArrays;

import javax.swing.*;

public class Ejercicio10 {
    public static void main (String[]arg){
        int numeros[];
        numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }

        boolean contiene10 = false;

        for (int i = 0; i < 4; i++) {
            if (numeros[i] == 10) {
                contiene10 = true;
            }
        }

        if (contiene10) {
            JOptionPane.showMessageDialog(null, "El número 10 está en el arreglo.");
        }

    }
}
