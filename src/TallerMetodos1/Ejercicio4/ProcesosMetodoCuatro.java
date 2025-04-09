package TallerMetodos1.Ejercicio4;

import javax.swing.*;

public class ProcesosMetodoCuatro {
    int numero;

    public int  NumeroRamdon(){
        numero = (int) (Math.random() * 100) + 1;
        return numero;
    }
    public void VerificarNumero(){
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es PAR.");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + numero + " es IMPAR.");
        }
    }
}
