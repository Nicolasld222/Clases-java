package OperacionesMatematicas;

import javax.swing.*;

public class Procesos {

    int respuestaOperacion;
    double num1, num2;
    double resulado = 0;

    public void datos(){
        String mjs = """
                1.sumar
                2.resta
                3.multiplicacion
                4.division
                5.calcular modulo
                """;
        respuestaOperacion =Integer.parseInt(JOptionPane.showInputDialog(null, mjs+"Ingrese la operacion que sea hacer"));
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el segundo numero"));
    }

    public void Operacion() {



        switch (respuestaOperacion) {
            case 1:
                resulado = num1 + num2;
                JOptionPane.showMessageDialog(null, "Su resultado es: " + resulado);
            break;
            case 2:
                resulado = num1 - num2;
                JOptionPane.showMessageDialog(null, "Su resultado es: " + resulado);
            break;
            case 3:
                resulado = num1 * num2;
                JOptionPane.showMessageDialog(null, "Su resultado es: " + resulado);
            break;
            case 4:
                    validar();
            break;
            case 5:
                validarModulo();
            break;
            default:
        }
    }
    public void validar(){
        if (num2 == 0){
            JOptionPane.showMessageDialog(null, "No se puede divir en 0");
        } else if (num1 < 0 || num2 < 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por numeros negativos");
        }else {
            resulado = num1 / num2;
            JOptionPane.showMessageDialog(null, "Su resultado es: " + resulado);
        }

    }
    public void validarModulo(){
        if (num2 == 0){
            JOptionPane.showMessageDialog(null, "No se puede divir en 0");
        } else if (num1 < 0 || num2 < 0) {
            JOptionPane.showMessageDialog(null, "No se puede dividir por numeros negativos");
        }else {
            resulado = num1 % num2;
            JOptionPane.showMessageDialog(null, "Su resultado es: " + resulado);
        }

    }

}
