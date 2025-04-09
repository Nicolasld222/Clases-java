package EjerciciosArrayList;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main (String[]arg){
        ArrayList<String> animals= new ArrayList<String>();
        animals.add("perro");
        animals.add("gato");
        animals.add("parajo");
        animals.add("pez");
        animals.add("raton");

        System.out.println(animals);

        animals.set(2, "hamster");
        System.out.println(animals);

    }
}
