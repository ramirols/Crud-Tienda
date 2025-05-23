package cibertec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;

public class ConfigurarDescuentos extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel, lblNewLabel_1, lblNewLabel_2, lblNewLabel_3;
    private JTextField textField, textField_1, textField_2, textField_3;
    private JButton btnAceptar, btnCancelar;

    public ConfigurarDescuentos() {
        setTitle("Configurar porcentajes de descuento");
        setIconImage(new ImageIcon("images/favicon.jpg").getImage());
        setBounds(100, 100, 450, 168);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        initializeLabelsAndFields();

        initializeButtons();

        cargarValoresDescuento();

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (actualizarDescuentos()) {
                    dispose();
                }
            }
        });

        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    private void initializeLabelsAndFields() {
        lblNewLabel = new JLabel("1 a 5 unidades");
        lblNewLabel.setBounds(10, 11, 106, 14);
        contentPane.add(lblNewLabel);

        lblNewLabel_1 = new JLabel("6 a 10 unidades");
        lblNewLabel_1.setBounds(10, 39, 106, 14);
        contentPane.add(lblNewLabel_1);

        lblNewLabel_2 = new JLabel("11 a 15 unidades");
        lblNewLabel_2.setBounds(10, 70, 106, 14);
        contentPane.add(lblNewLabel_2);

        lblNewLabel_3 = new JLabel("M�s de 15 unidades");
        lblNewLabel_3.setBounds(10, 102, 106, 14);
        contentPane.add(lblNewLabel_3);

        textField = new JTextField();
        textField.setBounds(140, 8, 120, 20);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField();
        textField_1.setBounds(140, 36, 120, 20);
        contentPane.add(textField_1);
        textField_1.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setBounds(140, 67, 120, 20);
        contentPane.add(textField_2);
        textField_2.setColumns(10);

        textField_3 = new JTextField();
        textField_3.setBounds(140, 99, 120, 20);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
    }

    private void initializeButtons() {

        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(304, 11, 106, 29);
        contentPane.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(304, 51, 106, 29);
        contentPane.add(btnCancelar);
    }

    private void cargarValoresDescuento() {
        textField.setText(String.valueOf(Tienda.porcentaje1));
        textField_1.setText(String.valueOf(Tienda.porcentaje2));
        textField_2.setText(String.valueOf(Tienda.porcentaje3));
        textField_3.setText(String.valueOf(Tienda.porcentaje4));
    }

    private boolean actualizarDescuentos() {
        try {
            String descuento1 = textField.getText();
            String descuento2 = textField_1.getText();
            String descuento3 = textField_2.getText();
            String descuento4 = textField_3.getText();

            if (descuento1.contains("-") || descuento2.contains("-") || descuento3.contains("-") || descuento4.contains("-")) {
                JOptionPane.showMessageDialog(null, "Los descuentos no pueden contener un signo negativo.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

            Tienda.porcentaje1 = Double.parseDouble(descuento1);
            Tienda.porcentaje2 = Double.parseDouble(descuento2);
            Tienda.porcentaje3 = Double.parseDouble(descuento3);
            Tienda.porcentaje4 = Double.parseDouble(descuento4);

            if (Tienda.porcentaje1 < 0 || Tienda.porcentaje1 > 100 ||
                Tienda.porcentaje2 < 0 || Tienda.porcentaje2 > 100 ||
                Tienda.porcentaje3 < 0 || Tienda.porcentaje3 > 100 ||
                Tienda.porcentaje4 < 0 || Tienda.porcentaje4 > 100) {
                JOptionPane.showMessageDialog(null, "Los descuentos deben estar entre 0 y 100.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese valores num�ricos v�lidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
