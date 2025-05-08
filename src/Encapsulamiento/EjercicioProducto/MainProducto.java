package Encapsulamiento.EjercicioProducto;

import java.util.ArrayList;
import java.util.Scanner;

public class MainProducto {
    public static void main(String[] args) {
        // Crear una lista de productos
        ArrayList<Producto> listaProductos = new ArrayList<>();

        // Agregar productos a la lista
        listaProductos.add(new Producto("Laptop", 2500.0, 5));
        listaProductos.add(new Producto("Smartphone", 1200.0, 10));
        listaProductos.add(new Producto("Monitor", 800.0, 7));

        // Mostrar todos los productos
        System.out.println("Listado de productos:");
        for (Producto p : listaProductos) {
            p.mostrarProducto();
            System.out.println("----------");
        }

        // Modificar el precio del segundo producto
        listaProductos.get(1).setPrecio(1300.0);

        // Eliminar el primer producto
        listaProductos.remove(0);

        // Mostrar lista actualizada
        System.out.println("\nLista actualizada:");
        for (Producto p : listaProductos) {
            p.mostrarProducto();
            System.out.println("----------");
        }

        // Desafío adicional: búsqueda por nombre
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nIngrese el nombre del producto a buscar: ");
        String nombreBuscado = scanner.nextLine();

        boolean encontrado = false;
        for (Producto p : listaProductos) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("Producto encontrado:");
                p.mostrarProducto();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Producto no encontrado.");
        }

        scanner.close();
    }
}
