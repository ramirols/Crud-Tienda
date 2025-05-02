package cibertec;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

public class ModificarRefrigeradora extends JDialog {
	private JLabel lblNewLabel;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblAlto;
	private JLabel lblFondo;
	private JComboBox<String> comboBox;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtAlto;
	private JTextField txtFondo;
	private JButton btnCerrar;
	private JButton btnGuardar;

	public ModificarRefrigeradora() {
		setResizable(false);
		setTitle("Modificar Refrigeradora");
		setBounds(100, 100, 451, 206);
		getContentPane().setLayout(null);

		lblNewLabel = new JLabel("Modelo");
		lblNewLabel.setBounds(10, 15, 60, 14);
		getContentPane().add(lblNewLabel);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 40, 63, 14);
		getContentPane().add(lblPrecio);

		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 65, 78, 14);
		getContentPane().add(lblAncho);

		lblAlto = new JLabel("Alto (cm)");
		lblAlto.setBounds(10, 90, 46, 14);
		getContentPane().add(lblAlto);

		lblFondo = new JLabel("Fondo (cm)");
		lblFondo.setBounds(10, 115, 63, 14);
		getContentPane().add(lblFondo);

		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(new String[] {
			Tienda.modelo0,
			Tienda.modelo1,
			Tienda.modelo2,
			Tienda.modelo3,
			Tienda.modelo4
		}));
		comboBox.setBounds(98, 11, 200, 22);
		getContentPane().add(comboBox);

		txtPrecio = new JTextField();
		txtPrecio.setBounds(98, 37, 200, 20);
		getContentPane().add(txtPrecio);

		txtAncho = new JTextField();
		txtAncho.setBounds(98, 62, 200, 20);
		getContentPane().add(txtAncho);

		txtAlto = new JTextField();
		txtAlto.setBounds(98, 87, 200, 20);
		getContentPane().add(txtAlto);

		txtFondo = new JTextField();
		txtFondo.setBounds(98, 112, 200, 20);
		getContentPane().add(txtFondo);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(335, 40, 89, 23);
		getContentPane().add(btnGuardar);

		mostrarDatos(0);

		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				mostrarDatos(index);
			}
		});

		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = comboBox.getSelectedIndex();
				guardarDatos(index);
			}
		});
	}

	private void mostrarDatos(int index) {
		switch (index) {
			case 0:
				txtPrecio.setText(String.valueOf(Tienda.precio0));
				txtAncho.setText(String.valueOf(Tienda.ancho0));
				txtAlto.setText(String.valueOf(Tienda.alto0));
				txtFondo.setText(String.valueOf(Tienda.fondo0));
				break;
			case 1:
				txtPrecio.setText(String.valueOf(Tienda.precio1));
				txtAncho.setText(String.valueOf(Tienda.ancho1));
				txtAlto.setText(String.valueOf(Tienda.alto1));
				txtFondo.setText(String.valueOf(Tienda.fondo1));
				break;
			case 2:
				txtPrecio.setText(String.valueOf(Tienda.precio2));
				txtAncho.setText(String.valueOf(Tienda.ancho2));
				txtAlto.setText(String.valueOf(Tienda.alto2));
				txtFondo.setText(String.valueOf(Tienda.fondo2));
				break;
			case 3:
				txtPrecio.setText(String.valueOf(Tienda.precio3));
				txtAncho.setText(String.valueOf(Tienda.ancho3));
				txtAlto.setText(String.valueOf(Tienda.alto3));
				txtFondo.setText(String.valueOf(Tienda.fondo3));
				break;
			case 4:
				txtPrecio.setText(String.valueOf(Tienda.precio4));
				txtAncho.setText(String.valueOf(Tienda.ancho4));
				txtAlto.setText(String.valueOf(Tienda.alto4));
				txtFondo.setText(String.valueOf(Tienda.fondo4));
				break;
		}
	}
	
	private void guardarDatos(int index) {
		try {
			double nuevoPrecio = Double.parseDouble(txtPrecio.getText());
			int nuevoAncho = (int) Double.parseDouble(txtAncho.getText());
			int nuevoAlto = (int) Double.parseDouble(txtAlto.getText());
			int nuevoFondo = (int) Double.parseDouble(txtFondo.getText());

			switch (index) {
				case 0:
					Tienda.precio0 = nuevoPrecio;
					Tienda.ancho0 = nuevoAncho;
					Tienda.alto0 = nuevoAlto;
					Tienda.fondo0 = nuevoFondo;
					break;
				case 1:
					Tienda.precio1 = nuevoPrecio;
					Tienda.ancho1 = nuevoAncho;
					Tienda.alto1 = nuevoAlto;
					Tienda.fondo1 = nuevoFondo;
					break;
				case 2:
					Tienda.precio2 = nuevoPrecio;
					Tienda.ancho2 = nuevoAncho;
					Tienda.alto2 = nuevoAlto;
					Tienda.fondo2 = nuevoFondo;
					break;
				case 3:
					Tienda.precio3 = nuevoPrecio;
					Tienda.ancho3 = nuevoAncho;
					Tienda.alto3 = nuevoAlto;
					Tienda.fondo3 = nuevoFondo;
					break;
				case 4:
					Tienda.precio4 = nuevoPrecio;
					Tienda.ancho4 = nuevoAncho;
					Tienda.alto4 = nuevoAlto;
					Tienda.fondo4 = nuevoFondo;
					break;
			}
			dispose();
		} catch (NumberFormatException ex) {
			System.out.println("Error en formato numérico: " + ex.getMessage());
		}
	}
}

