package EjerciciosClase;

import javax.swing.*;

public class Ejercicio2 {
    public static void main (String[]arg){
        int n = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de veces a repetir"));

//        for(int i = 0;i <= n; i++){
//            JOptionPane.showConfirmDialog(null,"El valor de i es: "+ i);
//        };

//        int x = 0;
//        do {
//            JOptionPane.showConfirmDialog(null,"Valor de x es: " + x);
//        }while(x <= n);


        int x = 0;
        while (x <= n){
            JOptionPane.showConfirmDialog(null,"Valor de x es: " + x);
            x++;
        }




    }
}
