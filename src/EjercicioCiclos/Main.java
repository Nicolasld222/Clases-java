package EjercicioCiclos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int extracto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su extracto"));
        int sueldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sueldo del empleado"));

        double descuento = 0;
        int porcentaje = 0;

        switch (extracto) {
            case 1:
            case 2:
                descuento = 0.02;
                porcentaje = 2;
                break;
            case 3:
            case 4:
                descuento = 0.04;
                porcentaje = 4;
                break;
            case 5:
                descuento = 0.08;
                porcentaje = 8;
                break;
            case 6:
                descuento = 0.1;
                porcentaje = 10;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Extracto no válido");
                return;
        }

        double sueldoDescuento = (sueldo - (sueldo * descuento));

        JOptionPane.showMessageDialog(null, "El sueldo con descuento es: " + "$"+sueldoDescuento +"\nEl porcentaje de descuento es: "+ porcentaje+"%");

    }
}