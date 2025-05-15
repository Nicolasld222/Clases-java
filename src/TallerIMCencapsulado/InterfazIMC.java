package TallerIMCencapsulado;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;

public class InterfazIMC extends JFrame {

    private JTextField txtNombre, txtEdad, txtPeso, txtTalla;
    private JButton btnCalcular, btnLimpiar, btnBuscar, btnEliminar;
    private JTextArea txtResultado;
    private JTable tablaPersonas;
    private DefaultTableModel modeloTabla;
    private Procesos procesos;

    public InterfazIMC() {
        procesos = new Procesos();
        configurarVentana();
        iniciarComponentes();
    }

    private void configurarVentana() {
        setTitle("Calculadora IMC");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));
    }

    private void iniciarComponentes() {
        // Panel para entrada de datos
        JPanel panelEntrada = new JPanel(new GridLayout(5, 2, 10, 10));
        panelEntrada.setBorder(BorderFactory.createTitledBorder("Datos Personales"));

        panelEntrada.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelEntrada.add(txtNombre);

        panelEntrada.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelEntrada.add(txtEdad);

        panelEntrada.add(new JLabel("Peso (kg):"));
        txtPeso = new JTextField();
        panelEntrada.add(txtPeso);

        panelEntrada.add(new JLabel("Talla (m):"));
        txtTalla = new JTextField();
        panelEntrada.add(txtTalla);

        // Panel para botones
        JPanel panelBotones = new JPanel(new FlowLayout());

        btnCalcular = new JButton("Calcular IMC");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIMC();
            }
        });
        panelBotones.add(btnCalcular);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limpiarCampos();
            }
        });
        panelBotones.add(btnLimpiar);

        btnBuscar = new JButton("Buscar");
        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarPersona();
            }
        });
        panelBotones.add(btnBuscar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarPersona();
            }
        });
        panelBotones.add(btnEliminar);

        // Panel para resultados
        JPanel panelResultado = new JPanel(new BorderLayout());
        panelResultado.setBorder(BorderFactory.createTitledBorder("Resultado"));

        txtResultado = new JTextArea(8, 30);
        txtResultado.setEditable(false);
        JScrollPane scrollResultado = new JScrollPane(txtResultado);
        panelResultado.add(scrollResultado, BorderLayout.CENTER);

        // Panel para tabla de personas
        JPanel panelTabla = new JPanel(new BorderLayout());
        panelTabla.setBorder(BorderFactory.createTitledBorder("Lista de Personas"));

        // Crear modelo de tabla
        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Edad");
        modeloTabla.addColumn("Peso");
        modeloTabla.addColumn("Talla");
        modeloTabla.addColumn("IMC");
        modeloTabla.addColumn("Estado");

        tablaPersonas = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaPersonas);
        panelTabla.add(scrollTabla, BorderLayout.CENTER);

        // Añadir todos los paneles a la ventana principal
        JPanel panelIzquierdo = new JPanel(new BorderLayout());
        panelIzquierdo.add(panelEntrada, BorderLayout.NORTH);
        panelIzquierdo.add(panelResultado, BorderLayout.CENTER);

        add(panelIzquierdo, BorderLayout.WEST);
        add(panelTabla, BorderLayout.CENTER);
        add(panelBotones, BorderLayout.SOUTH);
    }

    private void calcularIMC() {
        try {
            // Validar datos
            if (txtNombre.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Obtener datos de los campos
            String nombre = txtNombre.getText();
            int edad = Integer.parseInt(txtEdad.getText());
            double peso = Double.parseDouble(txtPeso.getText());
            double talla = Double.parseDouble(txtTalla.getText());

            // Validar valores positivos
            if (edad <= 0 || peso <= 0 || talla <= 0) {
                JOptionPane.showMessageDialog(this, "Los valores de edad, peso y talla deben ser positivos",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Crear persona y calcular IMC
            Persona persona = new Persona(nombre, edad, peso, talla);
            procesos.calcularIMC(persona);

            // Guardar persona en el HashMap
            procesos.agregarPersona(persona);

            // Mostrar resultado
            txtResultado.setText(persona.toString());

            // Actualizar tabla
            actualizarTabla();

            JOptionPane.showMessageDialog(this, "IMC calculado y persona registrada correctamente",
                    "Información", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtTalla.setText("");
        txtResultado.setText("");
    }

    private void buscarPersona() {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre de la persona a buscar:");
        if (nombre != null && !nombre.trim().isEmpty()) {
            Persona persona = procesos.buscarPersona(nombre);
            if (persona != null) {
                txtResultado.setText(persona.toString());

                // Llenar los campos con los datos de la persona
                txtNombre.setText(persona.getNombre());
                txtEdad.setText(String.valueOf(persona.getEdad()));
                txtPeso.setText(String.valueOf(persona.getPeso()));
                txtTalla.setText(String.valueOf(persona.getTalla()));
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna persona con ese nombre",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void eliminarPersona() {
        String nombre = JOptionPane.showInputDialog(this, "Ingrese el nombre de la persona a eliminar:");
        if (nombre != null && !nombre.trim().isEmpty()) {
            Persona persona = procesos.buscarPersona(nombre);
            if (persona != null) {
                procesos.eliminarPersona(nombre);
                actualizarTabla();
                limpiarCampos();
                JOptionPane.showMessageDialog(this, "Persona eliminada correctamente",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ninguna persona con ese nombre",
                        "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private void actualizarTabla() {
        // Limpiar tabla
        modeloTabla.setRowCount(0);

        // Añadir todas las personas del HashMap a la tabla
        Map<String, Persona> listaPersonas = procesos.getListaPersonas();
        for (Persona persona : listaPersonas.values()) {
            Object[] fila = {
                    persona.getNombre(),
                    persona.getEdad(),
                    persona.getPeso(),
                    persona.getTalla(),
                    String.format("%.2f", persona.getImc()),
                    persona.getEstado()
            };
            modeloTabla.addRow(fila);
        }
    }
}
