package TallerIMC;

import javax.swing.*;

public class Procesos {

    public void Proceos(){
        crearPersonas();
    }
    public void imprimirPersonas(Persona persona){
        persona.imprimirDatos();
    }
    public void crearPersonas(){
         Persona miPersona;

         String resp ="";
         do {
             miPersona = new Persona();
             miPersona.ingresarDatos();
             calcularIMC(miPersona);
             imprimirPersonas(miPersona);
             resp= JOptionPane.showInputDialog("Ingrese si, si desea registrar otra persona");

         }while (resp.equalsIgnoreCase("Si"));
    }

    private void calcularIMC(Persona miPersona) {
        double peso = miPersona.peso;
        double talla=miPersona.talla;

        double imc=peso/(talla*talla);
        System.out.println(imc);

        if (imc<18){
                miPersona.estado="Tiene Anorexia";
                miPersona.msj="Visite a su medico para mejorar ssu alimentacion";
        }else if (imc>=18 && imc<20){
                miPersona.estado="Tiene Delgadez";
                miPersona.msj="Puede comer otro poquito";
        }else if (imc>=20 && imc<20){
                miPersona.estado="Tiene Normalidad";
                miPersona.msj="Esta melo";
        }else if (imc>=27 && imc<30) {
                miPersona.estado="Tiene Obsidad (Grado 1)";
                miPersona.msj="Deberia ir al gym";
        }else if (imc>=30 && imc<35) {
                miPersona.estado="Tiene Obsidad (Grado 2)";
                miPersona.msj="Debe ir al gym y mejorar alimentacion";
        }else if (imc>=35 && imc<40) {
                miPersona.estado="Tiene Obsidad (Grado 3)";
                miPersona.msj="Consulte a un medico";
        } else if (imc>=40) {
                miPersona.estado="Tiene Obsidad Morbida";
                miPersona.msj="Cuide su peso consulte a un medico";
        }

        miPersona.imc = imc;

    }
}
