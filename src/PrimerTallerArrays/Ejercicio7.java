package PrimerTallerArrays;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio7 {
    public static void main (String[]arg){

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números desea ingresar?"));

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }

        JOptionPane.showMessageDialog(null, "Los números ingresados son:\n" + Arrays.toString(numeros));

    }
}
