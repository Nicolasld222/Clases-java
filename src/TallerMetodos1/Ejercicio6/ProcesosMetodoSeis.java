package TallerMetodos1.Ejercicio6;

import javax.swing.*;

public class ProcesosMetodoSeis {
    int peaje;
    public void ValidacionEjes(){
        int NumEjes, peaje;

        do {
            NumEjes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejes del vehículo (2 a 5):"));

            switch (NumEjes) {
                case 2:
                    peaje = 4000;
                    break;
                case 3:
                    peaje = 5000;
                    break;
                case 4:
                    peaje = 7000;
                    break;
                case 5:
                    peaje = 11000;
                    break;
                default:
                    peaje = 0;
                    JOptionPane.showMessageDialog(null, "Número de ejes no válido. Inténtelo nuevamente.");
            }
        } while (peaje == 0);

        JOptionPane.showMessageDialog(null, "El peaje a pagar es: $" + peaje);
    }

}
