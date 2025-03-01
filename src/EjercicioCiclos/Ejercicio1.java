package EjercicioCiclos;

import javax.swing.*;

public class Ejercicio1 {
    public static void main(String[] args){

        int categoria = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su categoria"));
        int salarioActual = Integer.parseInt((JOptionPane.showInputDialog("Ingrese el salario")));

        double bonificacion = 0;
        double descuento = 0;

        switch (categoria){
            case 1: bonificacion = 0.15;
                    descuento= 0.02;
            break;
            case 2: bonificacion = 0.10;
                    descuento= 0.015;
            break;
            case 3: bonificacion = 0.08;
                    descuento = 0.01;
            break;
            case 4: bonificacion = 0;
                    descuento = 0;
            break;
            default:JOptionPane.showMessageDialog(null, "Categoria no válida");
                return;
        }

        double pago = salarioActual + salarioActual *  bonificacion - salarioActual * descuento;

        JOptionPane.showMessageDialog(null, "Su pago seria: $"+ pago);

    }
}
