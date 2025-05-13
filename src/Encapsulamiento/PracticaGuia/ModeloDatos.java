package Encapsulamiento.PracticaGuia;

import java.util.HashMap;

public class ModeloDatos {
    HashMap<String, Estudiante> estudiantesMap;

    public ModeloDatos() {
        estudiantesMap = new HashMap<String, Estudiante>();
    }

    public String registrarEstudiante(Estudiante est) {
        if (!estudiantesMap.containsKey(est.getId())) {
            estudiantesMap.put(est.getId(), est);
            return "ok";
        } else {
            return "Estudiante existente";
        }
    }

    public Estudiante consultaEstudiante(String id) {
        return estudiantesMap.get(id);
    }

    public boolean eliminarEstudiante(String id) {
        return estudiantesMap.remove(id) != null;
    }

    public boolean actualizarEstudiante(Estudiante est) {
        if (estudiantesMap.containsKey(est.getId())) {
            estudiantesMap.put(est.getId(), est);
            return true;
        }
        return false;
    }

    public String imprimirListaEstudiantes() {
        StringBuilder msj = new StringBuilder("DATOS ESTUDIANTES\n");
        for (Estudiante estudiante : estudiantesMap.values()) {
            msj.append("ID: ").append(estudiante.getId())
                    .append(", Nombre: ").append(estudiante.getNombre())
                    .append(", Materia: ").append(estudiante.getMateria()).append("\n");
            msj.append("Nota1: ").append(estudiante.getNota1())
                    .append(", Nota2: ").append(estudiante.getNota2())
                    .append(", Nota3: ").append(estudiante.getNota3())
                    .append(", Promedio: ").append(estudiante.getPromedio()).append("\n\n");
        }
        System.out.println(msj);
        return msj.toString();
    }
}
