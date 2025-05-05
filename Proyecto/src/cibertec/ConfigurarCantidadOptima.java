package cibertec;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JDialog;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfigurarCantidadOptima extends JDialog {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblNewLabel;
    private JTextField textField;
    private JButton btnAceptar;
    private JButton btnCancelar;

    public ConfigurarCantidadOptima() {
        setTitle("Configurar cantidad �ptima");
        setIconImage(new ImageIcon("images/favicon.jpg").getImage());
        setBounds(100, 100, 485, 114);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        initializeLabelsAndFields();

        initializeButtons();

        cargarValorCantidadOptima();

        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (actualizarCantidadOptima()) {
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
        lblNewLabel = new JLabel("Cantidad �ptima de unidades vendidas");
        lblNewLabel.setBounds(10, 11, 201, 20);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(216, 11, 110, 25);
        contentPane.add(textField);
        textField.setColumns(10);
    }

    private void initializeButtons() {
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(351, 10, 108, 26);
        contentPane.add(btnAceptar);

        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(351, 38, 108, 26);
        contentPane.add(btnCancelar);
    }

    // cargar el valor actual de cantidad �ptima en el campo de texto
    private void cargarValorCantidadOptima() {
        textField.setText(String.valueOf(Tienda.cantidadOptima));
    }

    // validar y actualizar la cantidad �ptima si el valor es v�lido
    private boolean actualizarCantidadOptima() {
        try {
            int cantidad = Integer.parseInt(textField.getText());
            if (cantidad < 0) {
                JOptionPane.showMessageDialog(null, "La cantidad no puede ser negativa.", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
            Tienda.cantidadOptima = cantidad;
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor num�rico v�lido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
