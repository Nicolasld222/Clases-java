package PrimerTallerArrays.Ejercicio14;

import javax.swing.*;

public class Procesos {

    int estrato;
    String nombre;
    double sueldo, descuento,porDescuento;
    double listDescuento[];
    String nombres[];

    public void iniciar(){
        String mensaje="Estracto Social\n";
        mensaje+="1. Estracto 1\n";
        mensaje+="2. Estracto 2\n";
        mensaje+="3. Estracto 3\n";
        mensaje+="4. Estracto 4\n";
        mensaje+="5. Estracto 5\n";
        mensaje+="6. Estracto 6\n";
        mensaje+="Ingrese su estracto\n";

        int n= Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados desea ingresar"));
        nombres = new String[n];
        listDescuento = new double[n];

        for (int i=0; i < n; i++) {
            pedirDatos(mensaje);
            nombres[i]= nombre;
            listDescuento[i]= descuento;
        }
        imprimirArreglo();
    }

    private void imprimirArreglo() {
        for (int i = 0; i < listDescuento.length; i++){
            System.out.println(nombres[i]+" Tiene un descuento de: "+listDescuento[i]);
        }
    }

    private void pedirDatos(String mensaje) {
        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su sueldo"));;
        estrato = Integer.parseInt(JOptionPane.showInputDialog(mensaje));;

        imprimirDatos();
        calculaDescuento();
    }

    private void calculaDescuento() {
        switch (estrato){
            case 1:
            case 2://2
                System.out.println("2%");
                porDescuento =0.02;
                break;
            case 3:
            case 4: //4
                System.out.println("4%");
                porDescuento = 0.04;
                break;
            case 5://8
                System.out.println("8%");
                porDescuento=0.08;
                break;
            case 6://10
                System.out.println("10%");
                porDescuento=0.10;
                break;
            default:
                System.out.println("El estracto no corresponde");
                porDescuento = 0;
                break;
        }
        descuento=sueldo*porDescuento;
        System.out.println("El descuento es: "+ descuento);
    }

    private void imprimirDatos() {
        System.out.println("Nombre: "+nombre);
        System.out.println("Sueldo: "+sueldo);
        System.out.println("Estrato: "+estrato);
    }
}
