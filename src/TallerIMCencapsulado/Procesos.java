package TallerIMCencapsulado;

import java.util.HashMap;
import java.util.Map;

public class Procesos {
    // HashMap para almacenar personas usando el nombre como clave
    private Map<String, Persona> listaPersonas;

    public Procesos() {
        // Inicializar el HashMap
        listaPersonas = new HashMap<>();
    }

    // Método para obtener la lista de personas
    public Map<String, Persona> getListaPersonas() {
        return listaPersonas;
    }

    // Método para añadir una persona a la lista
    public void agregarPersona(Persona persona) {
        // Si ya existe una persona con ese nombre, se sobreescribe
        listaPersonas.put(persona.getNombre(), persona);
    }

    // Método para buscar una persona por nombre
    public Persona buscarPersona(String nombre) {
        return listaPersonas.get(nombre);
    }

    // Método para eliminar una persona por nombre
    public void eliminarPersona(String nombre) {
        listaPersonas.remove(nombre);
    }

    // Método para calcular el IMC de una persona
    public void calcularIMC(Persona persona) {
        double peso = persona.getPeso();
        double talla = persona.getTalla();

        double imc = peso / (talla * talla);

        // Asignar el IMC calculado
        persona.setImc(imc);

        // Determinar el estado y mensaje según el IMC
        if (imc < 18) {
            persona.setEstado("Anorexia");
            persona.setMsj("Visite a su médico para mejorar su alimentación");
        } else if (imc >= 18 && imc < 20) {
            persona.setEstado("Delgadez");
            persona.setMsj("Puede comer otro poquito");
        } else if (imc >= 20 && imc < 27) { // Corregido el rango, estaba mal en el código original
            persona.setEstado("Normalidad");
            persona.setMsj("Está bien");
        } else if (imc >= 27 && imc < 30) {
            persona.setEstado("Obesidad (Grado 1)");
            persona.setMsj("Debería ir al gym");
        } else if (imc >= 30 && imc < 35) {
            persona.setEstado("Obesidad (Grado 2)");
            persona.setMsj("Debe ir al gym y mejorar alimentación");
        } else if (imc >= 35 && imc < 40) {
            persona.setEstado("Obesidad (Grado 3)");
            persona.setMsj("Consulte a un médico");
        } else {
            persona.setEstado("Obesidad Mórbida");
            persona.setMsj("Cuide su peso, consulte a un médico");
        }
    }
}