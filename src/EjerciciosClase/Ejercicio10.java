package EjerciciosClase;

import javax.swing.*;

public class Ejercicio10 {
    public static void main (String[]arg){
        int tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una tabla"));
        int fin = Integer.parseInt(JOptionPane.showInputDialog("fin de la tabla"));


//        for (int i = 1; i <= 10; i++){
//
//            int resultado = i * tabla;
//
//            System.out.println(i + "x" + tabla + "="+ resultado);
//        }

//        int i = 1;
//        do {
//            int resultado = i * tabla;
//            System.out.println(i + "x" + tabla + "="+ resultado);
//            i++;
//
//        }while (i <= fin);

        int i = 1;

        while (i <= fin){
            int resultado = i * tabla;
            System.out.println(i + "x" + tabla + "="+ resultado);
            i++;
        }
    }
}
