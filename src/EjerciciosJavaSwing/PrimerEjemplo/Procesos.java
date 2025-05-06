package PrimerEjemplo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Procesos extends JFrame implements ActionListener {

    JButton btnPresioname;
    private JTextField txtCampo, txtEdad;
    private JLabel lblMensaje;

    public Procesos() {
        System.out.println("Ingresa a la ventana");

        setTitle("Hola mundo");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        System.out.println("Iniciar");

        JLabel lblTitulo = new JLabel("Bienvenidos");
        lblTitulo.setBounds(180, 50, 190, 50);

        lblMensaje = new JLabel();
        lblMensaje.setBounds(180, 240, 190, 50);

        btnPresioname = new JButton("Presioname");
        btnPresioname.setBounds(140, 180, 150, 50);
        btnPresioname.addActionListener(this);

        txtCampo = new JTextField();
        txtCampo.setBounds(110, 90, 230, 50);

        txtEdad = new JTextField();
        txtEdad.setBounds(350, 90, 60, 50);

        add(lblTitulo);
        add(btnPresioname);
        add(txtCampo);
        add(txtEdad); // Este campo no se estaba agregando
        add(lblMensaje);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnPresioname) {
            String name = txtCampo.getText();
            int edad = Integer.parseInt(txtEdad.getText());

            String msj = "Fui Presionado, el nombre es: " + name + " y su edad es: " + edad;

            System.out.println(msj);
            JOptionPane.showMessageDialog(null, msj);
        }
    }
}
