package EjerciciosClase;

import javax.swing.*;

public class Ejercicio4 {
    public static void main (String [] arg){


        int variable = 0;
        int fin = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el el fin de la cuenta"));
        int resultado = 0;
        int finDeCiclo = 1;

        do {
            resultado++;
            variable+=resultado;
            finDeCiclo++;
            System.out.println(variable);
        }while (finDeCiclo <= fin);

//        while (finDeCiclo <= fin){
//            resultado++;
//            variable+=resultado;
//            finDeCiclo++;
//            System.out.println(variable);
//        };
//
//        for(resultado=0, finDeCiclo=0; finDeCiclo<=fin; resultado++){
//            finDeCiclo++;
//            variable+=resultado;
//            System.out.println(variable);
//        }
    }
}
