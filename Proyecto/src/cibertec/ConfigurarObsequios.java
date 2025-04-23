package cibertec;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ConfigurarObsequios extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblA;
	private JLabel lblAMs;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JButton btnAceptar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfigurarObsequios frame = new ConfigurarObsequios();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConfigurarObsequios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("1 unidad");
		lblNewLabel.setBounds(10, 11, 109, 22);
		contentPane.add(lblNewLabel);
		
		lblA = new JLabel("2 a 5 unidad");
		lblA.setBounds(10, 44, 109, 22);
		contentPane.add(lblA);
		
		lblAMs = new JLabel("6 a m\u00E1s unidades");
		lblAMs.setBounds(10, 77, 109, 22);
		contentPane.add(lblAMs);
		
		textField = new JTextField();
		textField.setBounds(111, 12, 135, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(111, 45, 135, 21);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(111, 78, 135, 21);
		contentPane.add(textField_2);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(309, 11, 101, 28);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(309, 44, 101, 28);
		contentPane.add(btnCancelar);
	}

}
