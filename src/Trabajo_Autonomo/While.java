package Trabajo_Autonomo;

import javax.swing.*;

public class While {
    public static void main(String[] args){

//       int contador = 1;
//
//       while (contador <= 10) {
//           System.out.println("Número: " + contador);
//           contador++; // Incremento para evitar un bucle infinito
//       }


        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo: "));

        while (numero <= 0) {
            JOptionPane.showMessageDialog(null,"Error: El número debe ser mayor que 0.");
            numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese un número positivo: "));
        }

        JOptionPane.showMessageDialog(null,"Número aceptado: " + numero);


    }
}
