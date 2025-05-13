package Encapsulamiento.PagoEmpleado;

import java.util.ArrayList;
import java.util.HashMap;

public class Procesos {
    double valorTotalPago = 0;
    ArrayList<Persona> personasList;
    HashMap<String, Persona> personasMap;

    public Procesos() {
        personasList = new ArrayList<Persona>();
        personasMap = new HashMap<String, Persona>();
    }

    public void registrarPersona(Persona persona) {
        calcularBonificacionDescuento(persona);
        calcularPago(persona);
        personasList.add(persona);
        personasMap.put(persona.getDocumento(), persona);
    }

    public void calcularPago(Persona persona) {
        double pago = persona.getSalarioActual()
                + (persona.getSalarioActual() * persona.getBonificacion())
                - (persona.getSalarioActual() * persona.getDescuento());
        persona.setValorpago(pago);
        valorTotalPago += persona.getValorPago();
    }

    public void calcularBonificacionDescuento(Persona persona) {
        switch (persona.getCategoria()) {
            case 1:
                persona.setBonificacion(0.15);
                persona.setDescuento(0.02);
                break;
            case 2:
                persona.setBonificacion(0.10);
                persona.setDescuento(0.015);
                break;
            case 3:
                persona.setBonificacion(0.08);
                persona.setDescuento(0.01);
                break;
            case 4:
                persona.setBonificacion(0.0);
                persona.setDescuento(0.0);
                break;
            default:
                System.out.println("La categoría no existe");
                break;
        }
    }

    public double getValorTotalPago() {
        return valorTotalPago;
    }

    public ArrayList<Persona> getPersonasList() {
        return personasList;
    }

    public HashMap<String, Persona> getPersonasMap() {
        return personasMap;
    }
}