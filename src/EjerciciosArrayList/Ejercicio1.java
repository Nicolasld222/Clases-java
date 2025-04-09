package EjerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main (String[]arg){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Rojo");
        colors.add("Azul");
        colors.add("Verde");
        colors.add("Amarillo");
        colors.add("Negro");

        System.out.println(colors);
        System.out.println(colors.size());
    }
}
