package PrimerTallerArrays;

import javax.swing.*;

public class Ejercicio12 {
    public static void main (String[]arg){
        int n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño"));
        int[] a=new int[n];
        int[] b=new int[a.length];
        int[] c=new int[n];

        for (int i= 0; i < a.length; i++){
            a[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de a en la pos: "+ i));
            System.out.println(a[i]+"|");
        }
        System.out.println();
        for (int i=0; i < b.length; i++){
            b[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de b en la pos: "+ i));
            System.out.println(b[i]+"|");
        }
        System.out.println();
        for (int i = 0;i < c.length; i++){
            c[i]= a[i]+b[i];
            System.out.println(c[i]+"|");
        }
    }
}
