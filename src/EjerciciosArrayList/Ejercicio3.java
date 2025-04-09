package EjerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main (String[]arg){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);

        int suma = 0;
        for (int numero : numbers) {
            suma += numero;
        }

        // promedio
        double promedio = (double) suma / numbers.size();
        System.out.println("El promedio es: " + promedio);
    }
}
