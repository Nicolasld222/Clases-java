package EjercicioNumeros;

public class Aplicacion {
    OperacionesMatematicas misOperaciones;

    public Aplicacion(){
        misOperaciones = new OperacionesMatematicas();

        presentarVentana();
    }

    private void presentarVentana() {
        VentanaOperaciones miVentana = new VentanaOperaciones();
        miVentana.asignarOperaciones(misOperaciones);
        miVentana.setVisible(true);

    }
}
