package EjercicioModeloDatos.Logica;

public class Operador {
    private String documento, nombre;
    private Double sueldo, sueldoNuevo, aumento;
    private int antiguedad;

    public Operador(){
        nombre ="Default";
    }

    public Operador(String documento, String nombre, Double sueldo, Double sueldoNuevo, Double aumento, int antiguedad) {
        this.documento = documento;
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.sueldoNuevo = sueldoNuevo;
        this.aumento = aumento;
        this.antiguedad = antiguedad;
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

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    public Double getSueldoNuevo() {
        return sueldoNuevo;
    }

    public void setSueldoNuevo(Double sueldoNuevo) {
        this.sueldoNuevo = sueldoNuevo;
    }

    public Double getAumento() {
        return aumento;
    }

    public void setAumento(Double aumento) {
        this.aumento = aumento;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
