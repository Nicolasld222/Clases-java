package PrimerTallerArrays;

import javax.swing.*;

public class Ejercicio11 {
    public static void main (String[]arg){

        int numeros[] = new int[8];
        int pares = 0, impares = 0;

        for (int i = 0; i < 8; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }

        for (int i = 0; i < 8; i++) {
            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        JOptionPane.showMessageDialog(null, "Cantidad de números pares: " + pares + "\nCantidad de números impares: " + impares);

    }
}
