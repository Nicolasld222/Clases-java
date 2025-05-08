package Encapsulamiento.PracticaGuia;

import java.util.HashMap;

public class ModeloDatos {
    HashMap<String, Estudiante> estudiantesMap;

    public ModeloDatos() {
        estudiantesMap = new HashMap<>();
    }

    public String registrarEstudiante(Estudiante est) {
        if (!estudiantesMap.containsKey(est.getNombre())) {
            estudiantesMap.put(est.getNombre(), est);
            return "ok";
        } else {
            return "Estudiante existente";
        }
    }

    public Estudiante consultaEstudiante(String nombre) {
        return estudiantesMap.getOrDefault(nombre, null);
    }

    public String imprimirListaEstudiantes() {
        StringBuilder msj = new StringBuilder("DATOS ESTUDIANTES\n");
        for (Estudiante estudiante : estudiantesMap.values()) {
            msj.append("Nombre: ").append(estudiante.getNombre()).append(", Materia: ").append(estudiante.getMateria()).append("\n");
            msj.append("Nota1: ").append(estudiante.getNota1()).append(", Nota2: ").append(estudiante.getNota2()).append(", ");
            msj.append("Nota3: ").append(estudiante.getNota3()).append(", Promedio: ").append(estudiante.getPromedio()).append("\n\n");
        }
        System.out.println(msj);
        return msj.toString();
    }
}
