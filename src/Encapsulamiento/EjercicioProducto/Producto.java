package Encapsulamiento.EjercicioProducto;

public class Producto {
    // Atributos privados
    private String nombre;
    private double precio;
    private int cantidadEnStock;

    // Constructor
    public Producto(String nombre, double precio, int cantidadEnStock) {
        this.nombre = nombre;
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock(int cantidadEnStock) {
        if (cantidadEnStock >= 0) {
            this.cantidadEnStock = cantidadEnStock;
        } else {
            System.out.println("La cantidad en stock no puede ser negativa.");
        }
    }

    // Método para mostrar la información
    public void mostrarProducto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Cantidad en stock: " + cantidadEnStock);
    }
}
