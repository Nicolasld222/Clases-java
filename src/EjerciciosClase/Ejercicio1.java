package EjerciciosClase;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[]arg){

        int x =0;
        do {
            JOptionPane.showConfirmDialog(null, x,"El valor de X: ", JOptionPane.YES_NO_OPTION);
            x++;
        }while (x <= 10);

//        int x=0;
//        while (x<=10){
//            JOptionPane.showConfirmDialog(null, x);
//            x++;
//        }


//        for(int i= 0; i <=10; i++){
//            JOptionPane.showConfirmDialog(null, i);
//        };

    }
}
