package EjerciciosClase;

import javax.swing.*;

public class Ejercicio9 {
    public static void main (String[]arg){
        int tabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una tabla"));


        for (int i = 1; i <= 10; i++){

            int resultado = i * tabla;

            System.out.println(i + "x" + tabla + "="+ resultado);
        }

    }
}
