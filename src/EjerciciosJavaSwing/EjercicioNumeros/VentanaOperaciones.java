package EjercicioNumeros;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaOperaciones extends JFrame implements ActionListener{

    private JPanel panelPrincipal;
    private JTextField txtCampoNum1;
    private JTextField txtCampoNum2;
    JButton btnSuma, btnResta, btnMult, btnDiv;
    private JLabel lblResultado;

    OperacionesMatematicas misOperaciones;

    public VentanaOperaciones(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();

        setTitle("VENTANA OPERACIONES");
        setResizable(false);
        setLocationRelativeTo(null);

    }

    private void iniciarComponentes() {
        setBounds(100, 100, 333, 317);
        panelPrincipal = new JPanel();
        setContentPane(panelPrincipal);
        panelPrincipal.setLayout(null);

        JLabel lblTitulo = new JLabel("OPERACIONES MATEMATICAS");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(10, 11, 209, 20);
        panelPrincipal.add(lblTitulo);

        txtCampoNum1 = new JTextField();
        txtCampoNum1.setBounds(87, 63, 209, 20);
        panelPrincipal.add(txtCampoNum1);
        txtCampoNum1.setColumns(10);

        txtCampoNum2 = new JTextField();
        txtCampoNum2.setColumns(10);
        txtCampoNum2.setBounds(87, 101, 209, 20);
        panelPrincipal.add(txtCampoNum2);

        JLabel lblNum1 = new JLabel("Numero 1: ");
        lblNum1.setBounds(10, 66, 82, 14);
        panelPrincipal.add(lblNum1);

        JLabel lblNum2 = new JLabel("Numero 2: ");
        lblNum2.setBounds(10, 104, 82, 14);
        panelPrincipal.add(lblNum2);

        btnSuma = new JButton("SUMA");
        btnSuma.setBounds(10, 153, 89, 23);
        btnSuma.addActionListener(this);
        panelPrincipal.add(btnSuma);

        btnResta = new JButton("RESTA");
        btnResta.setBounds(108, 153, 89, 23);
        btnResta.addActionListener(this);
        panelPrincipal.add(btnResta);

        btnMult = new JButton("MULTIPLICACION");
        btnMult.setBounds(207, 153, 89, 23);
        btnMult.addActionListener(this);
        panelPrincipal.add(btnMult);

        btnDiv = new JButton("DIVIDIR");
        btnDiv.setBounds(108, 183, 89, 23);
        btnResta.addActionListener(this);
        panelPrincipal.add(btnDiv);

        lblResultado = new  JLabel("");
        lblResultado.setBounds(10, 241, 307, 14);
        panelPrincipal.add(lblResultado);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (btnSuma ==e.getSource()){
            int num1 = Integer.parseInt(txtCampoNum1.getText());
            int num2 = Integer.parseInt(txtCampoNum2.getText());

            int resp = misOperaciones.sumar(num1, num2);

            lblResultado.setText("La suma es ="+resp);
        }
        if (btnResta == e.getSource()){
            int num1 = Integer.parseInt(txtCampoNum1.getText());
            int num2 = Integer.parseInt(txtCampoNum2.getText());

            int resp = misOperaciones.restar(num1, num2);

            lblResultado.setText("La Resta es ="+resp);
        }
        if (btnMult == e.getSource()){
            int num1 = Integer.parseInt(txtCampoNum1.getText());
            int num2 = Integer.parseInt(txtCampoNum2.getText());

            int resp = misOperaciones.multiplicar(num1, num2);

            lblResultado.setText("La Multiplicacion es ="+resp);
        }
        if (btnDiv == e.getSource()){
            int num1 = Integer.parseInt(txtCampoNum1.getText());
            int num2 = Integer.parseInt(txtCampoNum2.getText());

            String resp = misOperaciones.dividir(num1, num2);

            lblResultado.setText(resp);
        }
    }

    public void asignarOperaciones(OperacionesMatematicas misOperaciones) {
        this.misOperaciones= misOperaciones;
    }
}
