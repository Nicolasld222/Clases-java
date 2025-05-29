package EjemploIMC.Modelo.Logica;

import EjemploIMC.Controlador.Coordinador;
import EjemploIMC.Modelo.dto.PersonaDTO;

public class LogicaIMC {
    private Coordinador miCoordinador;

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    public double calcularIMC(PersonaDTO persona) {
        if (persona.getAltura() <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor a 0");
        }
        return persona.getPeso() / (persona.getAltura() * persona.getAltura());
    }

    public String clasificarIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 && imc < 35) {
            return "Obesidad grado I";
        } else if (imc >= 35 && imc < 40) {
            return "Obesidad grado II";
        } else {
            return "Obesidad grado III (mórbida)";
        }
    }

    public String obtenerRecomendacion(double imc) {
        if (imc < 18.5) {
            return "Se recomienda aumentar de peso de manera saludable consultando a un nutricionista.";
        } else if (imc >= 18.5 && imc < 25) {
            return "Su peso es normal. Mantenga una dieta equilibrada y ejercicio regular.";
        } else if (imc >= 25 && imc < 30) {
            return "Se recomienda reducir peso mediante dieta balanceada y ejercicio.";
        } else if (imc >= 30) {
            return "Se recomienda consultar con un médico para un plan de reducción de peso.";
        }
        return "";
    }
}
