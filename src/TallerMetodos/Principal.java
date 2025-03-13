package TallerMetodos;

import javax.swing.JOptionPane;

public class Principal {

    int anoNacimiento, mesNacimiento, diaNacimiento;
    int anoAct, mesAct, diaAct;

    public static void main(String[] args) {
        Principal programa = new Principal();
        int seguir;

         do {
            programa.pedirDatosNac();
            programa.pedirDatosAct();
            programa.validarNegativos();
            programa.cacularEdad();

            seguir = Integer.parseInt(JOptionPane.showInputDialog("Quieres ingresar los datos de otra persona 1.Si/2.No"));
        } while (seguir == 1);

    }

    public void pedirDatosNac() {
        anoNacimiento = validarNegativos("Ingrese el año de nacimiento");
        mesNacimiento = validarMeses();
        diaNacimiento = validarDias();
    }

    public void pedirDatosAct() {
        anoAct = validarNegativos("Ingrese el año actual");
        mesAct = validarMeses();
        diaAct = validarDias();
    }

    public int validarNegativos(String mensaje) {
        int valor;
        do {
            valor = Integer.parseInt(JOptionPane.showInputDialog(mensaje));
            if (valor < 0) {
                JOptionPane.showMessageDialog(null, "El número no puede ser negativo. Intente nuevamente.");
            }
        } while (valor < 0);
        return valor;
    }

    public int validarMeses() {
        int mes;
        do {
            mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes (1-12):"));
            if (mes < 1 || mes > 12) {
                JOptionPane.showMessageDialog(null, "Mes inválido. Debe estar entre 1 y 12.");
            }
        } while (mes < 1 || mes > 12);
        return mes;
    }

    public int validarDias() {
        int dia;
        do {
            dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día (1-31):"));
            if (dia < 1 || dia > 31) {
                JOptionPane.showMessageDialog(null, "Día inválido. Debe estar entre 1 y 31.");
            }
        } while (dia < 1 || dia > 31);
        return dia;
    }

    public void validarNegativos() {
        if (anoNacimiento < 0 || anoAct < 0) {
            JOptionPane.showMessageDialog(null, "Error: Hay un año negativo.");
        }
    }
    public void cacularEdad(){
        int años = anoAct - anoNacimiento;
        int dia = diaAct - diaNacimiento;
        int mes = mesAct - mesNacimiento;


        if(años > 18){
            JOptionPane.showConfirmDialog(null, "Usted es mayor de edad");
        }else if (años==18 && mes > 0) {
            JOptionPane.showConfirmDialog(null, "Usted es mayor de edad");
        } else if (años == 18 && mes == 0 && dia >= 0) {
            JOptionPane.showConfirmDialog(null, "Usted es mayor de edad");
        }else {
            JOptionPane.showConfirmDialog(null, "Usted es menor de edad");
        }
    }
    public void validarAno(){
        if(anoNacimiento > anoAct){
            JOptionPane.showMessageDialog(null, "Ingrese el año de nacimiento no mayor a la actual");
        }
    }
}