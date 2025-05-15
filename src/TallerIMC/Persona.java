package TallerIMC;

import javax.swing.*;

public class Persona {
     String nombre;
     int edad;
     double peso;
     double talla;
     double imc;
     String estado;
     String msj;

     public void ingresarDatos(){
         nombre= JOptionPane.showInputDialog("Ingreses su nombre");

         edad=(int) validarIngreso("Ingrese la edad");
         peso=validarIngreso("Ingrese el peso");
         talla=validarIngreso("Ingrese la talla");

         do {
             peso = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
             if (peso<=0){
                 System.out.println("Debe que igresar un dato mayor o igual a 0");
             }
         }while (peso<=0);

         do {
             talla= Double.parseDouble(JOptionPane.showInputDialog("Ingresar su talla"));

             if (talla<=0){
                 System.out.println("Debe que igresar un dato mayor o igual a 0");
             }
         }while (talla<=0);
    }

    private double validarIngreso(String msj) {
        double valor=0;
        do {
            valor= Double.parseDouble(JOptionPane.showInputDialog(msj));

            if (valor<=0){
                System.out.println("Debe que igresar un dato mayor o igual a 0");
            }
        }while (valor<=0);
        return valor;
    }

    public void imprimirDatos(){
         String msj = "DATOS DE LA PERSONA\n";
         msj+="Nombre: "+nombre+"\n";
         msj+="Edad: "+edad+"\n";
         msj+="Peso: "+peso+"\n";
         msj+="Talla: "+peso+"\n";
         msj+="IMC: "+imc+"\n";
         msj+="msj"+this.msj;
         msj+="Estado: "+estado+"\n";
         System.out.println(msj);
     }
}
