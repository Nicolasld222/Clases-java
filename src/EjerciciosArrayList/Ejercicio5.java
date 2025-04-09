package EjerciciosArrayList;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    public static void main (String[]arg){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        List<Integer> sublista = numbers.subList(3, 7);

        System.out.println("Sublista (del 4 al 7): " + sublista);
    }
}
