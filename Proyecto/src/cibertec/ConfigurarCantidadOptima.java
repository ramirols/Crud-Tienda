package cibertec;

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

    // Constructor
    public ConfigurarCantidadOptima() {
        // Configuraci�n b�sica del JDialog
        setTitle("Configurar cantidad �ptima");
        setBounds(100, 100, 485, 114);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Inicializar etiquetas y campos de texto
        initializeLabelsAndFields();

        // Inicializar botones
        initializeButtons();

        // Cargar el valor actual de cantidad �ptima en el campo de texto
        cargarValorCantidadOptima();

        // Acci�n para el bot�n Aceptar
        btnAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Actualizar cantidad �ptima
                if (actualizarCantidadOptima()) {
                    dispose(); // Cerrar el JDialog
                }
            }
        });

        // Acci�n para el bot�n Cancelar
        btnCancelar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Cerrar el JDialog sin hacer cambios
            }
        });
    }

    // Inicializar las etiquetas y los campos de texto
    private void initializeLabelsAndFields() {
        lblNewLabel = new JLabel("Cantidad �ptima de unidades vendidas");
        lblNewLabel.setBounds(10, 11, 201, 20);
        contentPane.add(lblNewLabel);

        textField = new JTextField();
        textField.setBounds(216, 11, 110, 25);
        contentPane.add(textField);
        textField.setColumns(10);
    }

    // Inicializar los botones
    private void initializeButtons() {
        // Bot�n Aceptar
        btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(351, 10, 108, 26);
        contentPane.add(btnAceptar);

        // Bot�n Cancelar
        btnCancelar = new JButton("Cancelar");
        btnCancelar.setBounds(351, 38, 108, 26);
        contentPane.add(btnCancelar);
    }

    // Cargar el valor actual de cantidad �ptima en el campo de texto
    private void cargarValorCantidadOptima() {
        textField.setText(String.valueOf(Tienda.cantidadOptima));
    }

    // Validar y actualizar la cantidad �ptima si el valor es v�lido
    private boolean actualizarCantidadOptima() {
        try {
            Tienda.cantidadOptima = Integer.parseInt(textField.getText());
        } catch (NumberFormatException ex) {
            // Mostrar un mensaje de error si el valor no es v�lido
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un valor num�rico v�lido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false; // No actualizar el valor
        }
        return true; // El valor fue actualizado correctamente
    }

    // M�todo para mostrar el JDialog
    public static void showDialog() {
        ConfigurarCantidadOptima dialog = new ConfigurarCantidadOptima();
        dialog.setModal(true);  // Hace que el JDialog sea modal
        dialog.setVisible(true); // Muestra el JDialog
    }
}
