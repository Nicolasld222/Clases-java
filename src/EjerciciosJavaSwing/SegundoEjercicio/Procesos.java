package SegundoEjercicio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


    /*Algoritmo que solciite el nombre, direccion, telefono, salario y
    edad de una persona e imprima cuantos años va a tener esa persona en n
    cantidad de años*/

public class Procesos extends JFrame implements ActionListener {

    JTextField name;
    JTextField direccion;
    JFormattedTextField salario, edad, telefono, anio;
    JButton btnEnviarInfo;

    public Procesos() {
        setTitle("Ingrese los Datos");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        iniciarComponentes();
    }

    private void iniciarComponentes() {

        JLabel lblTitulo = new JLabel("Bienvenido Usuario");
        lblTitulo.setBounds(180, 50, 190, 50);

        btnEnviarInfo = new JButton("Enviar Informacion");
        btnEnviarInfo.setBounds(160, 480, 150, 50);
        btnEnviarInfo.addActionListener(this);

        JLabel txtname = new JLabel("Ingresa tu Nombre");
        txtname.setBounds(130, 135, 230, 30);
        name = new JTextField();
        name.setBounds(130, 170, 230, 30);

        JLabel txtdirec = new JLabel("Ingresa tu Direccion");
        txtdirec.setBounds(130, 205, 230, 30);
        direccion = new JTextField();
        direccion.setBounds(130, 240, 230, 30);

        JLabel txtsalario = new JLabel("Ingresa tu Salario");
        txtsalario.setBounds(130, 275, 230, 30);
        salario = new JFormattedTextField();
        salario.setBounds(130, 310, 230, 30);

        JLabel txtedad = new JLabel("Ingresa tu Edad");
        txtedad.setBounds(400, 140, 230, 30);
        edad = new JFormattedTextField();
        edad.setBounds(400, 170, 70, 30);

        JLabel txtanio = new JLabel("Ingresa años futuros");
        txtanio.setBounds(400, 205, 230, 30);
        anio = new JFormattedTextField();
        anio.setBounds(400, 240, 70, 30);

        JLabel txttel = new JLabel("Ingresa tu Telefono");
        txttel.setBounds(130, 345, 230, 30);
        telefono = new JFormattedTextField();
        telefono.setBounds(130, 380, 230, 30);

        add(name);
        add(lblTitulo);
        add(btnEnviarInfo);
        add(direccion);
        add(salario);
        add(edad);
        add(anio);
        add(telefono);
        add(txtname);
        add(txtdirec);
        add(txtsalario);
        add(txtedad);
        add(txtanio);
        add(txttel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnEnviarInfo) {
            try {
                String nombre = name.getText();
                String dir = direccion.getText();
                int edadNum = Integer.parseInt(edad.getText());
                int salarioNum = Integer.parseInt(salario.getText());
                int telefonoNum = Integer.parseInt(telefono.getText());
                int anioFuturo = Integer.parseInt(anio.getText());

                int resultado = anioFuturo + edadNum;

                String msj = "La edad de " + nombre + " es " + edadNum +
                        ", pero dentro de " + anioFuturo + " años tendrá " + resultado;

                System.out.println(msj);
                JOptionPane.showMessageDialog(null, msj);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Por favor, ingresa solo números válidos en los campos numéricos.");
            }
        }
    }
}