package TallerMetodos1.Ejercicio3;

import javax.swing.*;

public class ProcesosMetodoTres {
    int numero;

    public int  NumeroRamdon(){
        numero = (int) (Math.random() * 100) + 1;
        return numero;
    }
    public void ImprimirNumero(){
        JOptionPane.showMessageDialog(null,"Su numero ramdon es: "+numero);
    }
}
