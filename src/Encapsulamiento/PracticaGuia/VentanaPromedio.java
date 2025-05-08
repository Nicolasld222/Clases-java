package Encapsulamiento.PracticaGuia;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VentanaPromedio extends JFrame implements ActionListener {

    private JTextField txtMateria, txtNombre, txtNota1, txtNota2, txtNota3;
    private JButton btnCalcular, btnLimpiar;
    private JLabel lblResultado;

    private Procesos misProcesos = new Procesos();
    private ModeloDatos misDatos = new ModeloDatos();

    public VentanaPromedio() {
        setTitle("Promedio estudiantes");
        setSize(659, 366);
        setLayout(null);
        setLocationRelativeTo(null);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        JLabel lblTitulo = new JLabel("SISTEMA CONTROL DE NOTAS");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 25));
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(10, 26, 606, 59);

        JLabel lblMateria = new JLabel("Materia:");
        lblMateria.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblMateria.setBounds(348, 117, 72, 22);

        txtMateria = new JTextField();
        txtMateria.setBounds(430, 120, 180, 19);

        txtNombre = new JTextField();
        txtNombre.setBounds(106, 120, 201, 19);

        JLabel lblNombre = new JLabel("Nombre:");
        lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNombre.setBounds(24, 117, 72, 22);

        txtNota1 = new JTextField();
        txtNota1.setBounds(106, 162, 96, 19);

        JLabel lblNota1 = new JLabel("Nota1:");
        lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNota1.setBounds(24, 159, 72, 22);

        txtNota2 = new JTextField();
        txtNota2.setBounds(309, 165, 96, 19);

        JLabel lblNota2 = new JLabel("Nota2:");
        lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNota2.setBounds(227, 162, 72, 22);

        txtNota3 = new JTextField();
        txtNota3.setBounds(513, 165, 96, 19);

        JLabel lblNota3 = new JLabel("Nota3:");
        lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblNota3.setBounds(431, 162, 72, 22);

        lblResultado = new JLabel("Resultado:");
        lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblResultado.setBounds(24, 215, 586, 22);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(106, 276, 201, 21);
        btnCalcular.addActionListener(this);

        btnLimpiar = new JButton("Limpiar");
        btnLimpiar.setBounds(409, 276, 201, 21);
        btnLimpiar.addActionListener(this);

        add(lblTitulo);
        add(lblMateria); add(txtMateria);
        add(lblNombre); add(txtNombre);
        add(lblNota1); add(txtNota1);
        add(lblNota2); add(txtNota2);
        add(lblNota3); add(txtNota3);
        add(lblResultado);
        add(btnCalcular); add(btnLimpiar);
    }

    private void calcular() {
        String nombre = txtNombre.getText();
        String materia = txtMateria.getText();
        double nota1 = Double.parseDouble(txtNota1.getText());
        double nota2 = Double.parseDouble(txtNota2.getText());
        double nota3 = Double.parseDouble(txtNota3.getText());

        Estudiante miEstudiante = new Estudiante(nombre, materia, nota1, nota2, nota3, 0);

        double promedio = misProcesos.calcularPromedio(miEstudiante);
        miEstudiante.setPromedio(promedio);

        String resultado;
        if (promedio != -1) {
            misDatos.registrarEstudiante(miEstudiante);
            resultado = "Hola " + nombre + ", su promedio es: " + promedio;
            lblResultado.setForeground(promedio < 3.5 ? Color.red : Color.blue);
        } else {
            resultado = "Revise los datos, no pueden ser negativos ni mayores a 5.";
            lblResultado.setForeground(Color.red);
        }

        lblResultado.setText("Resultado: " + resultado);
    }

    private void limpiar() {
        txtNombre.setText("");
        txtMateria.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtNota3.setText("");
        lblResultado.setText("Resultado:");
        lblResultado.setForeground(Color.black);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            calcular();
        } else if (e.getSource() == btnLimpiar) {
            limpiar();
        }
    }
}
