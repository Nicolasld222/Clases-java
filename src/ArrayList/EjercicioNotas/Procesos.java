package ArrayList.EjercicioNotas;

import javax.swing.*;
import java.util.HashMap;

public class Procesos {

        HashMap <String, String> listaEst = new HashMap<>();

    public void iniciar(){

        registarEst();
        //consultaEst();
        //modificarEst();
    }

    private void registarEst() {
        String cedula = JOptionPane.showInputDialog("Ingrese su cedula");
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");


        listaEst.put(cedula,nombre);

        System.out.println(listaEst);
    }

    private void consultaEst() {

        String cedConsultar = JOptionPane.showInputDialog("Ingrese la ");

        listaEst.get(1);

    }

    private void modificarEst() {
    }
}
