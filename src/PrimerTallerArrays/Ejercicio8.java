package PrimerTallerArrays;

import javax.swing.*;
import java.util.Arrays;

public class Ejercicio8 {
    public static void main (String[]arg){

        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos nombres desea ingresar?"));

        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            names[i] = JOptionPane.showInputDialog("Ingrese el nombre " + (i + 1) + ":");
        }

        JOptionPane.showMessageDialog(null, "Los nombres ingresados son:\n" + Arrays.toString(names));

    }
}
