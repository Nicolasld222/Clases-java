package Trabajo_Autonomo;

import javax.swing.*;

public class EjercicioSwitch {
    public static void main(String[] args){

        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de un mes"));
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null, "Su mes es enero");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Su mes es Febrero");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Su mes es Marzo");
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Su mes es Abril");
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Su mes es Mayo");
                break;
            case 6:
                JOptionPane.showMessageDialog(null, "Su mes es Junio");
                break;
            case 7:
                JOptionPane.showMessageDialog(null, "Su mes es Julio");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Su mes es Agosto");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Su mes es Septiembre");
                break;
            case 10:
                JOptionPane.showMessageDialog(null, "Su mes es Octubre");
                break;
            case 11:
                JOptionPane.showMessageDialog(null, "Su mes es Noviembre");
                break;
            case 12:
                JOptionPane.showMessageDialog(null, "Su mes es Diciembre");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ingrese un mes valido");
        }

//            int dia = Integer.parseInt(JOptionPane.showInputDialog("El numero de un dia de la semana"));
//
//            switch (dia) {
//                case 1: JOptionPane.showMessageDialog(null,"Su dia es Lunes");
//                    break;
//                case 2: JOptionPane.showMessageDialog(null,"Su dia es Martes");
//                    break;
//                case 3: JOptionPane.showMessageDialog(null,"Su dia es Miercoles");
//                    break;
//                case 4: JOptionPane.showMessageDialog(null, "Su dia es Jueves");
//                    break;
//                case 5: JOptionPane.showMessageDialog(null, "Su dia es Viernes");
//                    break;
//                case 6: JOptionPane.showMessageDialog(null,"Su dia es Sabado");
//                    break;
//                case 7: JOptionPane.showMessageDialog(null,"Su dia es Domingo");
//                    break;
//                default:JOptionPane.showMessageDialog(null, "Ingrese Un dia de la semana valido");
//              }

                int calificacion = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su calificación (0-100): "));
                String resultado;

                switch (calificacion / 10) {
                    case 10:
                    case 9:
                        resultado = "A";
                        break;
                    case 8:
                        resultado = "B";
                        break;
                    case 7:
                        resultado = "C";
                        break;
                    case 6:
                        resultado = "D";
                        break;
                    default:
                        resultado = "F";
                }

                JOptionPane.showMessageDialog(null,"Tu calificación es: " + resultado);


    }
}
