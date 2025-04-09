package TallerMetodos1.Ejercicio2;

import javax.swing.*;

public class EjercicioDos {
    public static void main (String [] Arg){

        ProcesosMetodoDos ProcesoTwo;
        ProcesoTwo = new ProcesosMetodoDos();

        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
        ProcesoTwo.imprimirSiMayorQueDiez(num);
    }
}
