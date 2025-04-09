package PrimerTallerArrays.EjercicioEnClase;

import javax.swing.*;

public class Procesos {

        String[] name;
        String[] materias;
        int[] edades;
        double[] notas;


        public void iniciar(){
            int cantidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes"));

            name = new String[cantidades];
            materias = new String[name.length];
            edades = new int [name.length];
            notas = new double[name.length];

            for (int i = 0; i < cantidades; i++) {
                ingresoDatos(i);
            }

            imprimirDatos();
            calcularSumaNotas();
            calcularPromedioNotas();
            validarRango();
            calcularPromedioEdades();

        }

        private void ingresoDatos(int pos) {
            name[pos] = JOptionPane.showInputDialog("Ingrese su nombre");
            materias[pos] = JOptionPane.showInputDialog("ingrese la materia para "+name[pos]);
            notas[pos] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota para la materia "+materias[pos]));
            edades[pos] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad para el estudiante "+name[pos]));
        }

        public  void imprimirDatos(){
            String datos="";
            for (int i = 0; i < name.length; i++) {
                datos+= "Nombre "+name[i]+" Materia "+materias[i]+ " Nota "+notas[i]+" edad "+edades[i];
                System.out.println(datos);
            }
        }

        public void calcularSumaNotas(){
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            System.out.println("\nSuma total de notas: " + suma);
        }

        public void calcularPromedioNotas() {
            double suma = 0;
            for (double nota : notas) {
                suma += nota;
            }
            double promedio = suma / notas.length;
            System.out.println("Promedio final de las notas: " + promedio);
        }

        public void validarRango(){
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < 0 || notas[i] > 5) {
                    System.out.println("Nota inválida detectada para " + name[i] + ". Debe estar entre 0 y 5.");
                }
            }
        }

        public void calcularPromedioEdades() {
            int suma = 0;
            for (int edad : edades) {
                suma += edad;
            }
            double promedio = (double) suma / edades.length;
            System.out.println("\nPromedio de edad de los estudiantes: " + promedio);
        }

}
