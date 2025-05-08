package Encapsulamiento.EjercicioEncap;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de empleados usando ArrayList
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        // Agregar empleados a la lista
        listaEmpleados.add(new Empleado("Juan Pérez", 3000.0));
        listaEmpleados.add(new Empleado("Carlos Ruiz", 3500.0));
        listaEmpleados.add(new Empleado("Ana Gómez", 4000.0));

        // Mostrar información de todos los empleados en la lista
        for (Empleado emp : listaEmpleados) {
            emp.mostrarInfo();
            System.out.println("----------");
        }

        // Modificar el salario del segundo empleado
        listaEmpleados.get(1).setSalario(3700.0);

        // Mostrar la información actualizada
        System.out.println("Información actualizada del segundo empleado:");
        listaEmpleados.get(1).mostrarInfo();

        // Eliminar al primer empleado de la lista
        listaEmpleados.remove(0);

        // Mostrar la lista después de eliminar
        System.out.println("\nLista de empleados después de eliminar al primero:");
        for (Empleado emp : listaEmpleados) {
            emp.mostrarInfo();
            System.out.println("----------");
        }
    }
}
