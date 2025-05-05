package cibertec;

import javax.swing.JDialog;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class ConsultarRefrigeradora extends JDialog {
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

	// traer los modelos para funcionalidad
	private String[] modelos = {
		Tienda.modelo0,
		Tienda.modelo1,
		Tienda.modelo2,
		Tienda.modelo3,
		Tienda.modelo4
	};

	public ConsultarRefrigeradora() {
		setResizable(false);
		setTitle("Consultar Refrigeradora");
		setIconImage(new ImageIcon("images/favicon.jpg").getImage());
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

		// traer modelos de tienda para el combobox
		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(modelos));
		comboBox.setBounds(98, 11, 200, 22);
		getContentPane().add(comboBox);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(98, 37, 200, 20);
		getContentPane().add(txtPrecio);

		txtAncho = new JTextField();
		txtAncho.setEditable(false);
		txtAncho.setBounds(98, 62, 200, 20);
		getContentPane().add(txtAncho);

		txtAlto = new JTextField();
		txtAlto.setEditable(false);
		txtAlto.setBounds(98, 87, 200, 20);
		getContentPane().add(txtAlto);

		txtFondo = new JTextField();
		txtFondo.setEditable(false);
		txtFondo.setBounds(98, 112, 200, 20);
		getContentPane().add(txtFondo);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(335, 11, 89, 23);
		getContentPane().add(btnCerrar);

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
	}

	// renderizacion de datos
	private void mostrarDatos(int index) {
		switch (index) {
			case 0:
				llenarCampos(Tienda.precio0, Tienda.ancho0, Tienda.alto0, Tienda.fondo0);
				break;
			case 1:
				llenarCampos(Tienda.precio1, Tienda.ancho1, Tienda.alto1, Tienda.fondo1);
				break;
			case 2:
				llenarCampos(Tienda.precio2, Tienda.ancho2, Tienda.alto2, Tienda.fondo2);
				break;
			case 3:
				llenarCampos(Tienda.precio3, Tienda.ancho3, Tienda.alto3, Tienda.fondo3);
				break;
			case 4:
				llenarCampos(Tienda.precio4, Tienda.ancho4, Tienda.alto4, Tienda.fondo4);
				break;
		}
	}
	
	// rellenado de campos con datos
	private void llenarCampos(double precio, double ancho, double alto, double fondo) {
		txtPrecio.setText(String.valueOf(precio));
		txtAncho.setText(String.valueOf(ancho));
		txtAlto.setText(String.valueOf(alto));
		txtFondo.setText(String.valueOf(fondo));
	}
}