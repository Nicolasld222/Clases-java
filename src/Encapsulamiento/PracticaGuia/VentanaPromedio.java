package Encapsulamiento.PracticaGuia;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPromedio extends JFrame implements ActionListener {

    private JTextField txtID, txtMateria, txtNombre, txtNota1, txtNota2, txtNota3;
    private JButton btnCalcular, btnLimpiar, btnEliminar, btnActualizar, btnConsultaIndividual, btnLista, btnVerVentanaLista;
    private JLabel lblResultado;
    private JScrollPane scrollPane;
    private TextArea textArea;

    Procesos misProcesos;
    ModeloDatos misDatos;

    public VentanaPromedio() {
        misProcesos = new Procesos();
        misDatos = new ModeloDatos();
        setTitle("Promedio estudiantes");
        setSize(659, 620);
        setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JLabel lblTitulo = new JLabel("SISTEMA CONTROL DE NOTAS");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(10, 20, 606, 40);

        JLabel lblID = new JLabel("Documento ID:");
        lblID.setBounds(24, 80, 100, 20);
        txtID = new JTextField();
        txtID.setBounds(130, 80, 200, 20);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(24, 110, 100, 20);
        txtNombre = new JTextField();
        txtNombre.setBounds(130, 110, 200, 20);

        JLabel lblMateria = new JLabel("Materia:");
        lblMateria.setBounds(350, 110, 80, 20);
        txtMateria = new JTextField();
        txtMateria.setBounds(430, 110, 180, 20);

        JLabel lblNota1 = new JLabel("Nota1:");
        lblNota1.setBounds(24, 150, 80, 20);
        txtNota1 = new JTextField();
        txtNota1.setBounds(80, 150, 80, 20);

        JLabel lblNota2 = new JLabel("Nota2:");
        lblNota2.setBounds(200, 150, 80, 20);
        txtNota2 = new JTextField();
        txtNota2.setBounds(260, 150, 80, 20);

        JLabel lblNota3 = new JLabel("Nota3:");
        lblNota3.setBounds(380, 150, 80, 20);
        txtNota3 = new JTextField();
        txtNota3.setBounds(440, 150, 80, 20);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(24, 190, 600, 20);

        btnCalcular = new JButton("Registrar");
        btnCalcular.setBounds(24, 230, 120, 25);
        btnCalcular.addActionListener(this);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(160, 230, 120, 25);
        btnActualizar.addActionListener(this);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setBounds(296, 230, 120, 25);
        btnEliminar.addActionListener(this);

        btnConsultaIndividual = new JButton("Consultar");
        btnConsultaIndividual.setBounds(432, 230, 120, 25);
        btnConsultaIndividual.addActionListener(this);

        btnLista = new JButton("Lista");
        btnLista.setBounds(24, 270, 120, 25);
        btnLista.addActionListener(this);

        btnVerVentanaLista = new JButton("Ver Lista Ventana");
        btnVerVentanaLista.setBounds(160, 270, 200, 25);
        btnVerVentanaLista.addActionListener(this);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(380, 270, 120, 25);
        btnLimpiar.addActionListener(this);

        scrollPane = new JScrollPane();
        scrollPane.setBounds(24, 310, 600, 250);
        textArea = new TextArea();
        scrollPane.setViewportView(textArea);

        add(lblTitulo);
        add(lblID); add(txtID);
        add(lblNombre); add(txtNombre);
        add(lblMateria); add(txtMateria);
        add(lblNota1); add(txtNota1);
        add(lblNota2); add(txtNota2);
        add(lblNota3); add(txtNota3);
        add(lblResultado);
        add(btnCalcular); add(btnActualizar); add(btnEliminar);
        add(btnConsultaIndividual); add(btnLista); add(btnVerVentanaLista); add(btnLimpiar);
        add(scrollPane);
    }

    private void calcular() {
        String id = txtID.getText();
        String nombre = txtNombre.getText();
        String materia = txtMateria.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());

        Estudiante miEstudiante = new Estudiante(id, nombre, materia, nota1, nota2, nota3, 0);
        double promedio = misProcesos.calcularPromedio(miEstudiante);
        miEstudiante.setPromedio(promedio);

        if (promedio >= 0) {
            lblResultado.setText("Hola " + nombre + ", su promedio es: " + promedio);
            lblResultado.setForeground(promedio < 3.5 ? Color.red : Color.blue);

            String resultado = misDatos.registrarEstudiante(miEstudiante);
            if (!resultado.equals("ok")) {
                JOptionPane.showMessageDialog(this, resultado, "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            lblResultado.setText("Notas inválidas (deben estar entre 0 y 5)");
            lblResultado.setForeground(Color.red);
        }
    }

    private void actualizar() {
        String id = txtID.getText();
        String nombre = txtNombre.getText();
        String materia = txtMateria.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());

        Estudiante est = new Estudiante(id, nombre, materia, nota1, nota2, nota3, 0);
        double promedio = misProcesos.calcularPromedio(est);
        est.setPromedio(promedio);

        boolean actualizado = misDatos.actualizarEstudiante(est);
        if (actualizado) {
            lblResultado.setText("Estudiante actualizado con promedio: " + promedio);
            lblResultado.setForeground(promedio < 3.5 ? Color.red : Color.blue);
        } else {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado para actualizar", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminar() {
        String id = JOptionPane.showInputDialog(this, "Ingrese el ID del estudiante a eliminar:");
        boolean eliminado = misDatos.eliminarEstudiante(id);
        if (eliminado) {
            JOptionPane.showMessageDialog(this, "Estudiante eliminado correctamente.");
            limpiar();
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el estudiante.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void consultaIndividual() {
        String id = JOptionPane.showInputDialog("Ingrese el ID del estudiante a consultar");
        Estudiante estudiante = misDatos.consultaEstudiante(id);

        if (estudiante != null) {
            txtID.setText(estudiante.getId());
            txtNombre.setText(estudiante.getNombre());
            txtMateria.setText(estudiante.getMateria());
            txtNota1.setText(estudiante.getNota1() + "");
            txtNota2.setText(estudiante.getNota2() + "");
            txtNota3.setText(estudiante.getNota3() + "");
            lblResultado.setText("El promedio es: " + estudiante.getPromedio());
            lblResultado.setForeground(estudiante.getPromedio() < 3.5 ? Color.red : Color.blue);
        } else {
            JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
        }
    }

    private void consultaLista() {
        String lista = misDatos.imprimirListaEstudiantes();
        textArea.setText(lista);
    }

    private void abrirVentanaLista() {
        String lista = misDatos.imprimirListaEstudiantes();
        new VentanaLista(lista);
    }

    private void limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        txtMateria.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        lblResultado.setText("Resultado:");
        lblResultado.setForeground(Color.black);
        textArea.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            calcular();
        } else if (e.getSource() == btnActualizar) {
            actualizar();
        } else if (e.getSource() == btnEliminar) {
            eliminar();
        } else if (e.getSource() == btnConsultaIndividual) {
            consultaIndividual();
        } else if (e.getSource() == btnLista) {
            consultaLista();
        } else if (e.getSource() == btnVerVentanaLista) {
            abrirVentanaLista();
        } else if (e.getSource() == btnLimpiar) {
            limpiar();
        }
    }
}
