package EjerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio2 {
    public static void main (String[]arg){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int numberBuscado = 30;

        if (numbers.contains(numberBuscado)) {
            System.out.println("Encontrado");
        } else {
            System.out.println("No encontrado");
        }
    }
}
