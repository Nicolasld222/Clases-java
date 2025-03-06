package InstrumentosEvaluacion;

import javax.swing.*;

public class Ejercicio1 {
    public static void main (String[]arg){

//     int hospitalizada = 100000;
//     int numeroPacientes = 0;
//
//     double medicamentos = Double.parseDouble(JOptionPane.showInputDialog("ingrese el total de medicamentos"));
//
//     int numeroDias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de dias que el pasiente quedo hospittalizado"));
//
//
//     double totalPagarDias= hospitalizada * numeroDias;
//
//     numeroPacientes++;
//
//     double totalPagar = totalPagarDias + medicamentos;
//
//     JOptionPane.showConfirmDialog(null, "El toal a pagar por el paciente es: $"+totalPagar +"\nEL total de medicamentos es: $"+ medicamentos+"\n El total de la Hospitalizada es: $"+totalPagarDias);
//

        int hospitalizada = 100000;
        int seguir;
        int numeroPacientes = 0;

     do {

         double medicamentos = Double.parseDouble(JOptionPane.showInputDialog("ingrese el total de medicamentos"));

         int numeroDias = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de dias que el pasiente quedo hospitalizado"));


         double totalPagarDias= hospitalizada * numeroDias;

         numeroPacientes++;

         double totalPagar = totalPagarDias + medicamentos;

         JOptionPane.showConfirmDialog(null, "EL total de medicamentos es: $"+ medicamentos+"\nEl total de la Hospitalizada es: $"+totalPagarDias+"\nEl total a pagar por el paciente es: $"+totalPagar );

         seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar los datos de otro paciente 1.Si/2.NO"));

     }while (seguir == 1);

     JOptionPane.showConfirmDialog(null, "El total de pacientes ingresados fueron: "+numeroPacientes);






    }
}
