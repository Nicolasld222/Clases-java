package EjemploMVCPersona.modelo.conexion;

import EjemploMVCPersona.controlador.Coordinador;
import EjemploMVCPersona.modelo.dto.PersonaDTO;

import java.util.HashMap;

public class ConexionBD {

    public static HashMap<String, PersonaDTO> personasMap;
    private Coordinador miCoordinador;

    public ConexionBD() {
        personasMap=new HashMap<String, PersonaDTO>();
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador=miCoordinador;
    }
}
