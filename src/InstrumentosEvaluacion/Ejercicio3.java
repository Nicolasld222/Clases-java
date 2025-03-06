package InstrumentosEvaluacion;

import javax.swing.*;

public class Ejercicio3 {
    public static void main (String[]arg){

//        double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
//        int seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar otro valor 1.Si/2.No"));
//
//        if (numero < -2){
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es menor que -2");
//        } else if (numero > -2 ) {
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es Mayor que -2");
//        }else if(numero == -2){
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es igual que -2");
//        }else if (numero < 2) {
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es menor que 2");
//        } else if (numero > 2) {
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es mayor que 2");
//        } else if (numero == 2) {
//            JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es igual que 2");
//        }else if (numero < 5) {
//            JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es menor que 5");
//        } else if (numero > 5) {
//            JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es mayor que 5");
//        }else if (numero == 5) {
//            JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es igual que 5");
//        }

        int seguir;

        do {
            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));

            if (numero < -2){
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es menor que -2");
            } else if (numero > -2 ) {
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es Mayor que -2");
            }else if(numero == -2){
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es igual que -2");
            }

            if (numero < 2) {
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es menor que 2");
            } else if (numero > 2) {
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es mayor que 2");
            } else if (numero == 2) {
                JOptionPane.showConfirmDialog(null,"Su numero: "+numero+" es igual que 2");
            }


            if (numero < 5) {
                JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es menor que 5");
            } else if (numero > 5) {
                JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es mayor que 5");
            }else if (numero == 5) {
                JOptionPane.showConfirmDialog(null, "Su numero: " + numero + " es igual que 5");
            }

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar otro valor 1.Si/2.No"));

        }while (seguir == 1);

        }
}
