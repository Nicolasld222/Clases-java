package EjercicioModeloDatos.Data;

import EjercicioModeloDatos.Logica.Operador;

import java.util.HashMap;

public class ModeloDatos {

    HashMap<String, Operador> mapaOperadores;

    public ModeloDatos(){
        mapaOperadores=new HashMap<String, Operador>();
    }
    public void registrarOpedor(Operador op){
        mapaOperadores.put(op.getDocumento(), op);
        System.out.println("Operador registrado : "+op.getNombre());
    }
    public void consultarOperador(String documento){
        if (mapaOperadores.containsKey(documento)){

        }
    }
}
