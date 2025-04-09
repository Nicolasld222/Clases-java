package TallerMetodos1.Ejercicio7;

import javax.swing.*;
import java.awt.*;

public class ProcesosMetodoSeven {
    int categoria;
    double bonificacion, descuento, pagoEmpleado, PagoTotal;

    public void DatosEmpleado(){
        categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la gategoria del empleado (1 al 4)"));
        pagoEmpleado = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el pago total del empleado"));
    }

    public void Operacion(){
        switch (categoria){
            case 1: bonificacion = 0.15;
            break;
            case 2: bonificacion = 0.10;
            break;
            case 3: bonificacion = 0.08;
            break;
            case 4: bonificacion = 0;
            break;
        }
        switch (categoria){
            case 1: descuento = 0.02;
                break;
            case 2: descuento = 0.015;
                break;
            case 3: descuento = 0.001;
                break;
            case 4: descuento = 0;
                break;
        }
        PagoTotal = pagoEmpleado + pagoEmpleado * bonificacion - pagoEmpleado * descuento;

        JOptionPane.showMessageDialog(null, "El pago total del empleado es: "+ PagoTotal);
    }
}
