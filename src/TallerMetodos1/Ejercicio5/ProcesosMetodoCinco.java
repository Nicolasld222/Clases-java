package TallerMetodos1.Ejercicio5;

import javax.swing.*;

public class ProcesosMetodoCinco {

    public void SolicitarNumero(){
    for (int i = 1; i <= 10; i++) {
        int numero = ValidacioNumero(i);
        JOptionPane.showMessageDialog(null, "Número " + i + " ingresado correctamente: " + numero);
    }
    JOptionPane.showMessageDialog(null, "Todos los números fueron ingresados correctamente.");
    }
    public static int ValidacioNumero(int intento) {
        int numero;
        do {
            String input = JOptionPane.showInputDialog("Ingrese el número " + intento + " (entre 0 y 10):");
            numero = Integer.parseInt(input);
            if (numero < 0 || numero > 10) {
                JOptionPane.showMessageDialog(null, "Número fuera de rango. Inténtelo nuevamente.");
            }
        } while (numero < 0 || numero > 10);
        return numero;
    }

}

