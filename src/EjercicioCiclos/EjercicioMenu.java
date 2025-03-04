package EjercicioCiclos;

import javax.swing.*;

public class EjercicioMenu {
    public static void main (String[]arg){
        int codMenuPpal=0, codMenuTipico=0, codMenuCarta=0;
        String Usuario= JOptionPane.showInputDialog("Ingrese el nombre del comensal");

        do{
            String menu="MENU RESTAURANTE\n\n";
            menu+="1. Plato Tipico\n";
            menu+="2. Plato a la carta\n";
            menu+="3. Plato internacional\n";
            menu+="4. Salir\n\n";
            menu+="Por favor seleccione una opcion\n";
            codMenuPpal=Integer.parseInt(JOptionPane.showInputDialog(menu));


            switch (codMenuPpal){
                case 1:
                    do{

                        String menuTipico="MENU TIPICO\n\n";
                        menuTipico+="1. Frijoles\n";
                        menuTipico+="2. Sopa de verduras\n";
                        menuTipico+="3. Ajiaco";
                        menuTipico+="4. Regresar\n\n";
                        menuTipico+="Por favor seleccione una opcion\n";
                        codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog(menuTipico));

                        switch (codMenuTipico) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de frijoles, el costo es de $" + 12000);
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado una Sopa de Verduras, el costo es de $" + 8000);
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, "Se ha solciitado Ajiaco, el costo es de $" + 8000);
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "No corresponde a " + "un codigo valido", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                                break;
                        }
                        codMenuTipico=Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 si desea repetir "+
                                "el menu tipico, de lo contrario regresara al menu principal"));
                        if(codMenuTipico!=1){
                            codMenuTipico=3;
                        }
                    }while(codMenuTipico!=3);
                    break;
                case 2:
                    do {
                        String menuCarta="MENU PLATO A LA CARTA\n\n";
                        menuCarta+="1. Bandeja paisa\n";
                        menuCarta+="2. Almuerzo Ejecutivo\n";
                        menuCarta+="3. Chuzo de gato";
                        codMenuCarta=Integer.parseInt(JOptionPane.showInputDialog(menuCarta));


                    }while(codMenuCarta!=3);
                    switch (codMenuCarta){
                        case 1:JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de la carta Bandeja paisa, el costo es de $" + 10000);
                            break;
                        case 2:JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de la carta Almuerzo Ejecutivo, el costo es de $" + 10000);
                            break;
                        case 3:JOptionPane.showMessageDialog(null, "Se ha solicitado un plato de la carta Chuzo de gato, el costo es de $" + 80000);
                            break;
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Menu 3");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Menu 4");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No corresponde a un "+"codigo valido","ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
                    break;
            }
        }while(codMenuPpal!=4);
    }
}
