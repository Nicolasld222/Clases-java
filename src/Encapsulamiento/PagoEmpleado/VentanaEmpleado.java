package Encapsulamiento.PagoEmpleado;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaEmpleado extends JFrame implements ActionListener {
    private JTextField txtDocumento, txtNombre, txtSalario, txtCategoria;
    private JButton btnCalcular, btnLimpiar, btnMostrarTodos;
    private JLabel lblResultado, lblTotalPagos;
    private JTextArea areaEmpleados;
    private JScrollPane scrollPane;
    private Procesos procesos;

    public VentanaEmpleado() {
        procesos = new Procesos();
        setTitle("Pago de Empleados");
        setSize(500, 500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        inicializarComponentes();
        setVisible(true);
    }

    private void inicializarComponentes() {
        JLabel lblDoc = new JLabel("Documento:");
        lblDoc.setBounds(20, 20, 100, 20);
        add(lblDoc);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(120, 20, 200, 20);
        add(txtDocumento);

        JLabel lblNom = new JLabel("Nombre:");
        lblNom.setBounds(20, 50, 100, 20);
        add(lblNom);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 50, 200, 20);
        add(txtNombre);

        JLabel lblSalario = new JLabel("Salario:");
        lblSalario.setBounds(20, 80, 100, 20);
        add(lblSalario);

        txtSalario = new JTextField();
        txtSalario.setBounds(120, 80, 200, 20);
        add(txtSalario);

        JLabel lblCategoria = new JLabel("Categoría:");
        lblCategoria.setBounds(20, 110, 100, 20);
        add(lblCategoria);

        txtCategoria = new JTextField();
        txtCategoria.setBounds(120, 110, 200, 20);
        add(txtCategoria);

        btnCalcular = new JButton("Calcular y Registrar");
        btnCalcular.setBounds(50, 150, 150, 25);
        btnCalcular.addActionListener(this);
        add(btnCalcular);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(220, 150, 100, 25);
        btnLimpiar.addActionListener(this);
        add(btnLimpiar);

        btnMostrarTodos = new JButton("Mostrar Todos");
        btnMostrarTodos.setBounds(340, 150, 120, 25);
        btnMostrarTodos.addActionListener(this);
        add(btnMostrarTodos);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setBounds(20, 190, 450, 25);
        add(lblResultado);

        lblTotalPagos = new JLabel("Total de Pagos: $0.0");
        lblTotalPagos.setBounds(20, 220, 450, 25);
        add(lblTotalPagos);

        areaEmpleados = new JTextArea();
        areaEmpleados.setEditable(false);
        scrollPane = new JScrollPane(areaEmpleados);
        scrollPane.setBounds(20, 250, 450, 200);
        add(scrollPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            try {
                Persona p = new Persona();
                p.setDocumento(txtDocumento.getText());
                p.setNombre(txtNombre.getText());
                p.setSalarioActual(Double.parseDouble(txtSalario.getText()));
                p.setCategoria(Integer.parseInt(txtCategoria.getText()));

                procesos.registrarPersona(p);

                lblResultado.setText("Pago final para " + p.getNombre() + ": $" + p.getValorPago());
                lblTotalPagos.setText("Total de Pagos: $" + procesos.getValorTotalPago());

                limpiarCampos();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error en el formato de los datos. Por favor revise los campos numéricos.",
                        "Error de formato", JOptionPane.ERROR_MESSAGE);
            }
        }

        if (e.getSource() == btnLimpiar) {
            limpiarCampos();
        }

        if (e.getSource() == btnMostrarTodos) {
            mostrarTodosLosEmpleados();
        }
    }

    private void limpiarCampos() {
        txtDocumento.setText("");
        txtNombre.setText("");
        txtSalario.setText("");
        txtCategoria.setText("");
    }

    private void mostrarTodosLosEmpleados() {
        ArrayList<Persona> lista = procesos.getPersonasList();
        if (lista.isEmpty()) {
            areaEmpleados.setText("No hay empleados registrados.");
            return;
        }

        StringBuilder sb = new StringBuilder();
        sb.append("LISTA DE EMPLEADOS:\n");
        sb.append("----------------------------------------\n");

        for (Persona p : lista) {
            sb.append("Documento: ").append(p.getDocumento()).append("\n");
            sb.append("Nombre: ").append(p.getNombre()).append("\n");
            sb.append("Salario base: $").append(p.getSalarioActual()).append("\n");
            sb.append("Categoría: ").append(p.getCategoria()).append("\n");
            sb.append("Bonificación: ").append(p.getBonificacion() * 100).append("%\n");
            sb.append("Descuento: ").append(p.getDescuento() * 100).append("%\n");
            sb.append("Pago final: $").append(p.getValorPago()).append("\n");
            sb.append("----------------------------------------\n");
        }

        areaEmpleados.setText(sb.toString());
    }
}