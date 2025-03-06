package InstrumentosEvaluacion;

import javax.swing.*;
import java.util.jar.JarEntry;

public class Ejercicio4 {
    public static void main (String[]arg){

//        int categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la categoria del cliente"));
//        double totalProd = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrse el total a pagar por el cliente"));
//
//
//        double descuento = 0;
//
//        switch (categoria){
//            case 1: descuento = 0.2;
//                break;
//            case 2: descuento = 0.5;
//                break;
//            case 3: descuento = 1;
//                break;
//        };
//
//        double total = totalProd / descuento;


        int seguir;

        do {

            int categoria = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la categoria del cliente"));
            double totalProd = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrse el total a pagar por el cliente"));


            double descuento = 0;

            switch (categoria){
                case 1: descuento = 0.2;
                    break;
                case 2: descuento = 0.5;
                    break;
                case 3: descuento = 1;
                    break;
            };

            double total = totalProd / descuento;

            JOptionPane.showConfirmDialog(null, "El total a pagar es de: $"+total);

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar los datos de otro cliente 1.Si/2.NO"));


        }while (seguir == 1);



    }
}
