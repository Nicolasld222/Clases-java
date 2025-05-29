package EjemploIMC.VIsta;

import EjemploIMC.Controlador.Coordinador;
import EjemploIMC.Modelo.Logica.LogicaIMC;
import EjemploIMC.Modelo.dto.PersonaDTO;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends JDialog implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Coordinador miCoordinador;
    private JTextField txtDocumento;
    private JTextField txtNombre;
    private JTextField txtEdad;
    private JTextField txtPeso;
    private JTextField txtAltura;
    private JButton btnRegistrar;
    private JButton btnCancelar;
    private JButton btnActualizar;
    private JButton btnBuscar;

    public VentanaRegistro(VentanaPrincipal parent, boolean modal) {
        super(parent, modal);
        setTitle("Registro de Persona");
        setBounds(100, 100, 450, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);

        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JLabel lblTitulo = new JLabel("REGISTRO DE PERSONA");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Lucida Grande", Font.BOLD, 18));
        lblTitulo.setBounds(50, 20, 350, 30);
        contentPane.add(lblTitulo);

        JLabel lblDocumento = new JLabel("Documento:");
        lblDocumento.setBounds(50, 70, 100, 25);
        contentPane.add(lblDocumento);

        txtDocumento = new JTextField();
        txtDocumento.setBounds(160, 70, 180, 25);
        contentPane.add(txtDocumento);

        btnBuscar = new JButton("Buscar");
        btnBuscar.setBounds(350, 70, 80, 25);
        btnBuscar.addActionListener(this);
        contentPane.add(btnBuscar);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setBounds(50, 110, 100, 25);
        contentPane.add(lblNombre);

        txtNombre = new JTextField();
        txtNombre.setBounds(160, 110, 200, 25);
        contentPane.add(txtNombre);

        JLabel lblEdad = new JLabel("Edad:");
        lblEdad.setBounds(50, 150, 100, 25);
        contentPane.add(lblEdad);

        txtEdad = new JTextField();
        txtEdad.setBounds(160, 150, 200, 25);
        contentPane.add(txtEdad);

        JLabel lblPeso = new JLabel("Peso (kg):");
        lblPeso.setBounds(50, 190, 100, 25);
        contentPane.add(lblPeso);

        txtPeso = new JTextField();
        txtPeso.setBounds(160, 190, 200, 25);
        contentPane.add(txtPeso);

        JLabel lblAltura = new JLabel("Altura (m):");
        lblAltura.setBounds(50, 230, 100, 25);
        contentPane.add(lblAltura);

        txtAltura = new JTextField();
        txtAltura.setBounds(160, 230, 200, 25);
        contentPane.add(txtAltura);

        btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(30, 290, 100, 30);
        btnRegistrar.addActionListener(this);
        contentPane.add(btnRegistrar);

        btnActualizar = new JButton("Actualizar");
        btnActualizar.setBounds(140, 290, 100, 30);
        btnActualizar.addActionListener(this);
        contentPane.add(btnActualizar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(250, 290, 100, 30);
        btnCancelar.addActionListener(this);
        contentPane.add(btnCancelar);
    }

    public void setCoordinador(Coordinador miCoordinador) {
        this.miCoordinador = miCoordinador;
    }

    private void limpiarCampos() {
        txtDocumento.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtPeso.setText("");
        txtAltura.setText("");
        btnActualizar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        txtDocumento.setEditable(true);
    }

    private void buscarPersona() {
        String documento = txtDocumento.getText().trim();

        PersonaDTO persona = miCoordinador.consultarPersona(documento);

        if (persona != null) {
            txtDocumento.setText(persona.getDocumento());
            txtNombre.setText(persona.getNombre());
            txtEdad.setText(String.valueOf(persona.getEdad()));
            txtPeso.setText(String.valueOf(persona.getPeso()));
            txtAltura.setText(String.valueOf(persona.getAltura()));


            JOptionPane.showMessageDialog(this, "Persona encontrada. Puede modificar los datos y presionar 'Actualizar'");
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró ninguna persona con el documento: " + documento);
            // Limpiar campos excepto el documento para permitir registro nuevo
            txtNombre.setText("");
            txtEdad.setText("");
            txtPeso.setText("");
            txtAltura.setText("");
            btnActualizar.setEnabled(true);
            btnRegistrar.setEnabled(true);
        }
    }

    private void actualizarPersona() {
        try {
            String documento = txtDocumento.getText().trim();
            String nombre = txtNombre.getText().trim();
            int edad = Integer.parseInt(txtEdad.getText().trim());
            double peso = Double.parseDouble(txtPeso.getText().trim());
            double altura = Double.parseDouble(txtAltura.getText().trim());

            // Validar datos
            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                return;
            }
            if (peso <= 0) {
                JOptionPane.showMessageDialog(this, "El peso debe ser mayor a 0");
                return;
            }
            if (altura <= 0) {
                JOptionPane.showMessageDialog(this, "La altura debe ser mayor a 0");
                return;
            }
            if (edad <= 0) {
                JOptionPane.showMessageDialog(this, "La edad debe ser mayor a 0");
                return;
            }

            // Crear persona con datos actualizados
            PersonaDTO persona = new PersonaDTO(documento, nombre, edad, peso, altura);

//             Usar el método actualizar del coordinador
            String resultado = miCoordinador.actualizarPersona(persona);

            JOptionPane.showMessageDialog(this, resultado);

            if (resultado.contains("exitosamente")) {
                limpiarCampos();
                this.setVisible(false);
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Error: Verifique que los datos numéricos estén correctos");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage());
        }
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRegistrar) {
            try {
                String documento = txtDocumento.getText().trim();
                String nombre = txtNombre.getText().trim();
                int edad = Integer.parseInt(txtEdad.getText().trim());
                double peso = Double.parseDouble(txtPeso.getText().trim());
                double altura = Double.parseDouble(txtAltura.getText().trim());

                // Validar datos
                if (documento.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El documento es obligatorio");
                    return;
                }
                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "El nombre es obligatorio");
                    return;
                }
                if (peso <= 0) {
                    JOptionPane.showMessageDialog(this, "El peso debe ser mayor a 0");
                    return;
                }
                if (altura <= 0) {
                    JOptionPane.showMessageDialog(this, "La altura debe ser mayor a 0");
                    return;
                }
                if (edad <= 0) {
                    JOptionPane.showMessageDialog(this, "La edad debe ser mayor a 0");
                    return;
                }

                // Crear persona
                PersonaDTO persona = new PersonaDTO(documento, nombre, edad, peso, altura);

                // Registrar usando el coordinador
                String resultado = miCoordinador.registrarPersona(persona);
                JOptionPane.showMessageDialog(this, resultado);

                if (resultado.contains("exitosamente")) {
                    limpiarCampos();
                    this.setVisible(false);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Error: Verifique que los datos numéricos estén correctos");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Error inesperado: " + ex.getMessage());
            }
        } else if (e.getSource() == btnBuscar) {
            buscarPersona();

        } else if (e.getSource() == btnActualizar) {
                actualizarPersona();
        }
    }
}