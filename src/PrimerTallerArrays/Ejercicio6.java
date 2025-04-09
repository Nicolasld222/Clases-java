package PrimerTallerArrays;

import javax.swing.*;

public class Ejercicio6  {
    public static void main (String[]arg) {
        int numeros[];
        numeros = new int[4];

        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;

        for (int i = 0; i < numeros.length; i++) {
            JOptionPane.showMessageDialog(null, numeros[i]);
        }

    }
 }
