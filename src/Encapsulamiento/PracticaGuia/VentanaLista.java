package Encapsulamiento.PracticaGuia;

import javax.swing.*;

public class VentanaLista extends JFrame {
    public VentanaLista(String lista) {
        setTitle("Lista de Estudiantes");
        setSize(400, 400);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea(lista);
        area.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(area);
        add(scrollPane);

        setVisible(true);
    }
}
