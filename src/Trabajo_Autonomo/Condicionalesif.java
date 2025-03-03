package Trabajo_Autonomo;

import javax.swing.*;

public class Condicionalesif {
    public static void main(String[] args){

        int age = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));

        if (age > 18){
            JOptionPane.showMessageDialog(null,"Usted es mayor de edad");
        }else{
            JOptionPane.showMessageDialog(null, "Usted es menor de edad");
        }

        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su documento"));

        if (number > 0) {
            JOptionPane.showMessageDialog(null,"Número aceptado: " + number);
        } else {
            JOptionPane.showMessageDialog(null,"Error: El número debe ser mayor que 0.");
        }

        int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero para saber si es par o impar"));

        if (numberOne % 2 == 0) {
            JOptionPane.showMessageDialog(null,"El número " + numberOne + " es par.");
        } else {
            JOptionPane.showMessageDialog(null,"El número " + numberOne + " es impar.");
        }


    }
}
