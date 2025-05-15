package TallerIMCencapsulado;

public class Persona {
    private String nombre;
    private int edad;
    private double peso;
    private double talla;
    private double imc;
    private String estado;
    private String msj;

    // Constructor
    public Persona() {
        // Constructor vacío
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad, double peso, double talla) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.talla = talla;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
            this.peso = peso;
        }
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        if (talla > 0) {
            this.talla = talla;
        }
    }

    public double getImc() {
        return imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getMsj() {
        return msj;
    }

    public void setMsj(String msj) {
        this.msj = msj;
    }

    // Método para generar una cadena con todos los datos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DATOS DE LA PERSONA\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Edad: ").append(edad).append("\n");
        sb.append("Peso: ").append(peso).append("\n");
        sb.append("Talla: ").append(talla).append("\n");
        sb.append("IMC: ").append(imc).append("\n");
        sb.append("Mensaje: ").append(msj).append("\n");
        sb.append("Estado: ").append(estado).append("\n");
        return sb.toString();
    }
}