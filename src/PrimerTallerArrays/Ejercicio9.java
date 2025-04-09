package PrimerTallerArrays;

import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[]arg){
        int numeros[];
        numeros = new int[4];

        for (int i = 0; i < 4; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número " + (i + 1) + ":"));
        }
        JOptionPane.showMessageDialog(null, "Su primer numero fue   : "+numeros[0]+ "\nSu ultimo numero fue: "+numeros[3]);
    }
}
