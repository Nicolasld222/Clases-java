package Encapsulamiento.PagoEmpleado;

public class Persona {
    private String documento;
    private String nombre;
    private double salarioActual;
    private int categoria;
    private double bonificacion;
    private double descuento;
    private double valorPago;

    public Persona() {
    }

    // Constructor con parámetros
    public Persona(String documento, String nombre, double salarioActual, int categoria) {
        this.documento = documento;
        this.nombre = nombre;
        this.salarioActual = salarioActual;
        this.categoria = categoria;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioActual() {
        return salarioActual;
    }

    public void setSalarioActual(double salarioActual) {
        this.salarioActual = salarioActual;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorpago(double valorPago) {
        this.valorPago = valorPago;
    }

    @Override
    public String toString() {
        return "DATOS PERSONA -> [documento=" + documento +
                ", nombre=" + nombre +
                ", salarioActual=" + salarioActual +
                ", categoria=" + categoria +
                ", bonificacion=" + bonificacion +
                ", descuento=" + descuento +
                ", valorPago=" + valorPago + "]";
    }
}