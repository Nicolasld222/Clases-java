package InstrumentosEvaluacion;

import javax.swing.*;

public class Ejercicio2 {
    public static void main (String[]arg){


        int seguir = 0;
        do {
            double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base del altura"));

            if (base  < 0){
                JOptionPane.showConfirmDialog(null, "Ingrese un dato positivo");
            } else if (altura < 0) {
                JOptionPane.showConfirmDialog(null, "Ingrese un dato positivo");
            }

            double area = base * altura/2;

            if (area > 200){
                JOptionPane.showConfirmDialog(null,"Es un gran area");
            }


            JOptionPane.showConfirmDialog(null,"el area de su triangulo es: "+ area);

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar los datos de otro triangulo 1.Si/2.NO"));

        }while (seguir == 1);

    }
}
