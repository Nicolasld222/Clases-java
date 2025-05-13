package EjercicioModeloDatos.Logica;

public class Procesos {

    double por=0;


    public String calcularSueldo(Operador operador){

        double aumento=0;

        if(operador.getSueldo() < 500 && operador.getAntiguedad()>10){
            por=0.2;

        } else if (operador.getSueldo() < 500 && operador.getAntiguedad()<10) {
            por=0.05;

        }else if (operador.getSueldo() >= 500){
            por=0.0;

        }

        operador.setAumento(por*100);

        aumento =operador.getSueldo() +(operador.getSueldo()*por);
        operador.setSueldo(aumento);

        return "Calculo Exitoso";
    }
}
