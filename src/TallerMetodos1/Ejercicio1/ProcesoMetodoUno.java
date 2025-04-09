package TallerMetodos1.Ejercicio1;

import javax.swing.*;
import java.util.random.RandomGenerator;

public class ProcesoMetodoUno {

    int age, doc;
    String name;

    public void pedirDatos(){
        age = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su edad"));
        name = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        doc = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese du documento"));
    }
    public void imprimirDatos(){
        JOptionPane.showMessageDialog(null, "Su nombre es: "+name+"\nSu edad es: "+ age +"\nSu documento es: "+ doc);
    }
}
