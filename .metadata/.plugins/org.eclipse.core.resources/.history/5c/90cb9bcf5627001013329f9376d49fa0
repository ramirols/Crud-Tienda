package cibertec;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;


public class Vender extends JDialog implements ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String> comboBox;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnVender;
	private JButton btnCerrar;

	private String[] modelos = {
		Tienda.modelo0,
		Tienda.modelo1,
		Tienda.modelo2,
		Tienda.modelo3,
		Tienda.modelo4
	};

	private double[] precios = {
		Tienda.precio0,
		Tienda.precio1,
		Tienda.precio2,
		Tienda.precio3,
		Tienda.precio4
	};

	private int contadorVentas = 0;
	private double importeTotalAcumulado = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Vender frame = new Vender();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Vender() {
		setTitle("Vender");
		setBounds(100, 100, 546, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 11, 59, 14);
		contentPane.add(lblModelo);

		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 47, 59, 14);
		contentPane.add(lblPrecio);

		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 90, 59, 14);
		contentPane.add(lblCantidad);

		comboBox = new JComboBox<>();
		comboBox.setModel(new DefaultComboBoxModel<>(modelos));
		comboBox.setBounds(96, 7, 191, 22);
		contentPane.add(comboBox);

		txtPrecio = new JTextField();
		txtPrecio.setEditable(false);
		txtPrecio.setBounds(96, 44, 191, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);

		txtCantidad = new JTextField();
		txtCantidad.setBounds(96, 87, 191, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 138, 514, 200);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		btnVender = new JButton("Vender");
		btnVender.setBounds(407, 24, 117, 30);
		contentPane.add(btnVender);

		btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(407, 65, 117, 30);
		contentPane.add(btnCerrar);

		comboBox.addActionListener(this);
		btnVender.addActionListener(this);
		btnCerrar.addActionListener(this);

		// iniciar con precio inicial
		mostrarPrecio(0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == comboBox) {
			mostrarPrecio(comboBox.getSelectedIndex());
		} else if (e.getSource() == btnVender) {
			vender();
		} else if (e.getSource() == btnCerrar) {
			dispose();
		}
	}

	private void mostrarPrecio(int index) {
		txtPrecio.setText(String.format("%.2f", precios[index]));
	}

	private void vender() {
		int modeloIndex = comboBox.getSelectedIndex();
		String modelo = modelos[modeloIndex];
		double precio = precios[modeloIndex];
		int cantidad;

		try {
			cantidad = Integer.parseInt(txtCantidad.getText());
			if (cantidad <= 0) throw new NumberFormatException();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida.", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}

		// calculos
		double importeCompra = precio * cantidad;
		double porcentajeDescuento = obtenerPorcentajeDescuento(cantidad);
		double importeDescuento = importeCompra * porcentajeDescuento / 100;
		double importePagar = importeCompra - importeDescuento;
		String obsequio = obtenerObsequio(cantidad);

		// mostrar la boleta acorde a los datos solicitados
		textArea.setText("");
		textArea.append("== BOLETA DE VENTA ==\n\n");
		textArea.append("Modelo: " + modelo + "\n");
		textArea.append(String.format("Precio unitario: S/ %.2f\n", precio));
		textArea.append("Cantidad: " + cantidad + "\n");
		textArea.append(String.format("Importe compra: S/ %.2f\n", importeCompra));
		textArea.append(String.format("Importe descuento: S/ %.2f\n", importeDescuento));
		textArea.append(String.format("Importe a pagar: S/ %.2f\n", importePagar));
		textArea.append("Obsequio: " + obsequio + "\n");

		contadorVentas++;
		importeTotalAcumulado += importePagar;

		// cada 5 ventas mostrar alerta
		if (contadorVentas % 5 == 0) {
			double porcentajeCuota = importeTotalAcumulado / Tienda.cuotaDiaria * 100;
			JOptionPane.showMessageDialog(this,
				"Venta número: " + contadorVentas +
				"\nImporte total acumulado: S/ " + String.format("%.2f", importeTotalAcumulado) +
				"\nPorcentaje de cuota diaria alcanzado: " + String.format("%.2f", porcentajeCuota) + "%",
				"Alerta de Ventas",
				JOptionPane.INFORMATION_MESSAGE
			);
		}
	}

	private double obtenerPorcentajeDescuento(int cantidad) {
		if (cantidad >= 1 && cantidad <= 5)
			return Tienda.porcentaje1;
		else if (cantidad >= 6 && cantidad <= 10)
			return Tienda.porcentaje2;
		else if (cantidad >= 11 && cantidad <= 15)
			return Tienda.porcentaje3;
		else
			return Tienda.porcentaje4;
	}

	private String obtenerObsequio(int cantidad) {
		if (cantidad == 1)
			return Tienda.obsequio1;
		else if (cantidad >= 2 && cantidad <= 5)
			return Tienda.obsequio2;
		else
			return Tienda.obsequio3;
	}
}
