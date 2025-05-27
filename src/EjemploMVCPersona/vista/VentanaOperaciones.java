package EjemploMVCPersona.vista;

import EjemploMVCPersona.controlador.Coordinador;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.Font;

public class VentanaOperaciones extends JDialog implements ActionListener {
    private JButton btnCalcular;
    private JTextArea datosArea;
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JRadioButton rbtnResta;
    private JRadioButton rbtnDivision;
    private JRadioButton rbtnSuma;
    private JRadioButton rbtnMultiplicacion;
    private JLabel lblNumero1;
    private JLabel lblNumero2;
    private JLabel lblTitulo;
    private Coordinador coordinador;

    public VentanaOperaciones(VentanaRegistro ventanaRegistro, boolean modal) {
        /**Al llamar al constructor super(), le enviamos el
         * JFrame Padre y la propiedad booleana que determina
         * que es hija*/
        super(ventanaRegistro, modal);

        setTitle("Ventana de Operaciones Matemáticas");
        setSize(400, 272);
        setLocationRelativeTo(null);
        getContentPane().setLayout(null);

        iniciarComponentes();
    }

    // Método para establecer el coordinador
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    private void iniciarComponentes() {
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(250, 79, 100, 30);
        btnCalcular.addActionListener(this); // Agregar ActionListener
        getContentPane().add(btnCalcular);

        datosArea = new JTextArea();
        datosArea.setBounds(50, 164, 300, 60);
        datosArea.setEditable(false);
        datosArea.setLineWrap(true);
        datosArea.setWrapStyleWord(true);
        getContentPane().add(datosArea);

        txtNum1 = new JTextField();
        txtNum1.setBounds(50, 80, 86, 26);
        getContentPane().add(txtNum1);
        txtNum1.setColumns(10);

        txtNum2 = new JTextField();
        txtNum2.setColumns(10);
        txtNum2.setBounds(152, 80, 86, 26);
        getContentPane().add(txtNum2);

        // Crear los botones de radio
        rbtnSuma = new JRadioButton("+");
        rbtnSuma.setBounds(47, 115, 56, 23);
        getContentPane().add(rbtnSuma);

        rbtnResta = new JRadioButton("-");
        rbtnResta.setBounds(133, 115, 56, 23);
        getContentPane().add(rbtnResta);

        rbtnMultiplicacion = new JRadioButton("*");
        rbtnMultiplicacion.setBounds(214, 115, 56, 23);
        getContentPane().add(rbtnMultiplicacion);

        rbtnDivision = new JRadioButton("/");
        rbtnDivision.setBounds(294, 115, 56, 23);
        getContentPane().add(rbtnDivision);

        // Agrupar los botones en un ButtonGroup
        ButtonGroup grupoOperaciones = new ButtonGroup();
        grupoOperaciones.add(rbtnSuma);
        grupoOperaciones.add(rbtnResta);
        grupoOperaciones.add(rbtnMultiplicacion);
        grupoOperaciones.add(rbtnDivision);

        lblNumero1 = new JLabel("Numero 1");
        lblNumero1.setBounds(50, 62, 86, 16);
        getContentPane().add(lblNumero1);

        lblNumero2 = new JLabel("Numero 2");
        lblNumero2.setBounds(152, 62, 86, 16);
        getContentPane().add(lblNumero2);

        lblTitulo = new JLabel("OPERACIONES MATEMATICAS");
        lblTitulo.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(6, 6, 388, 30);
        getContentPane().add(lblTitulo);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            calcularOperacion();
        }
    }

    private void calcularOperacion() {
        // Validar que los campos no estén vacíos
        if (txtNum1.getText().trim().isEmpty() || txtNum2.getText().trim().isEmpty()) {
            datosArea.setText("Por favor, ingrese ambos números");
            return;
        }

        // Validar que sean números válidos
        boolean validarNum1 = coordinador.validarNumero(txtNum1.getText());
        boolean validarNum2 = coordinador.validarNumero(txtNum2.getText());

        verificaCampo(validarNum1, txtNum1);
        verificaCampo(validarNum2, txtNum2);

        if (!validarNum1 || !validarNum2) {
            datosArea.setText("Por favor, ingrese números válidos (no negativos)");
            return;
        }

        // Obtener la operación seleccionada
        String operacion = validarSeleccion();

        if (operacion.isEmpty()) {
            datosArea.setText("Por favor, seleccione una operación");
            return;
        }

        // Realizar el cálculo
        String resultado = coordinador.calcularOperacion(operacion, txtNum1.getText(), txtNum2.getText());
        datosArea.setText(resultado);
    }

    private String validarSeleccion() {
        String operacion = "";
        if (rbtnSuma.isSelected()) {
            operacion = "suma";
        } else if (rbtnResta.isSelected()) {
            operacion = "resta";
        } else if (rbtnMultiplicacion.isSelected()) {
            operacion = "multiplicacion";
        } else if (rbtnDivision.isSelected()) {
            operacion = "division";
        } else {
            operacion = "";
        }

        return operacion;
    }

    private void verificaCampo(boolean validarNumero, JTextField campo) {
        if (validarNumero == true) {
            campo.setBackground(Color.WHITE);
        } else {
            campo.setBackground(Color.RED);
        }
    }

    /**
     * Método para limpiar el formulario
     */
    public void limpiarFormulario() {
        txtNum1.setText("");
        txtNum2.setText("");
        datosArea.setText("");

        // Limpiar selección de radio buttons
        rbtnSuma.setSelected(false);
        rbtnResta.setSelected(false);
        rbtnMultiplicacion.setSelected(false);
        rbtnDivision.setSelected(false);

        // Restaurar color de fondo
        txtNum1.setBackground(Color.WHITE);
        txtNum2.setBackground(Color.WHITE);
    }
}