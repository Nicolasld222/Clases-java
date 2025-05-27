package EjemploMVCPersona.controlador;


import EjemploMVCPersona.modelo.Procesos;
import EjemploMVCPersona.modelo.conexion.ConexionBD;
import EjemploMVCPersona.modelo.dao.PersonaDAO;
import EjemploMVCPersona.vista.*;

public class Relaciones {

	public Relaciones() {

		VentanaPrincipal ventanaPrincipal=new VentanaPrincipal();
		VentanaRegistro ventanaRegistro = new VentanaRegistro(ventanaPrincipal,true);
		VentanaOperaciones ventanaOperaciones = new VentanaOperaciones(ventanaRegistro,true);
		VentanaConsultaIndividual ventanaConsultaIndividual=new VentanaConsultaIndividual(ventanaPrincipal, true);
		VentanaConsultarLista ventanaConsultarLista=new VentanaConsultarLista(ventanaPrincipal,true);
		Procesos misProcesos = new Procesos();
		PersonaDAO miPersonaDAO=new PersonaDAO();
		ConexionBD miConexionBD=new ConexionBD();
		Coordinador miCoordinador = new Coordinador();

		miCoordinador.setVentanaPrincipal(ventanaPrincipal);
		miCoordinador.setVentanaRegistro(ventanaRegistro);
		miCoordinador.setVentanaOperaciones(ventanaOperaciones);
		miCoordinador.setVentanaConsultaIndividual(ventanaConsultaIndividual);
		miCoordinador.setVentanaConsultarLista(ventanaConsultarLista);
		miCoordinador.setProcesos(misProcesos);
		miCoordinador.setMiPersonaDAO(miPersonaDAO);
		miCoordinador.setMiConexionBD(miConexionBD);

		miCoordinador.mostrarVentanaPrincipal();
	}

}
