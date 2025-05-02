package cibertec;

import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ListarRefrigeradoras extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextArea textArea;

	public ListarRefrigeradoras() {
		setTitle("Listado de refrigeradoras");
		setBounds(100, 100, 400, 300);
		setModal(true);
		getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 364, 200);
		getContentPane().add(scrollPane);

		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listarRefrigeradoras();
			}
		});
		btnListar.setBounds(200, 220, 85, 23);
		getContentPane().add(btnListar);

		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCerrar.setBounds(80, 220, 85, 23);
		getContentPane().add(btnCerrar);
	}

	// metodo para listar refrigeradoras
	protected void listarRefrigeradoras() {
		textArea.setText("");
		textArea.append("--> LISTADO DE REFRIGERADORAS <--\n\n");

		agregarRefrigeradora(Tienda.modelo0, Tienda.precio0, Tienda.fondo0, Tienda.ancho0, Tienda.alto0, 1);
		agregarRefrigeradora(Tienda.modelo1, Tienda.precio1, Tienda.fondo1, Tienda.ancho1, Tienda.alto1, 2);
		agregarRefrigeradora(Tienda.modelo2, Tienda.precio2, Tienda.fondo2, Tienda.ancho2, Tienda.alto2, 3);
		agregarRefrigeradora(Tienda.modelo3, Tienda.precio3, Tienda.fondo3, Tienda.ancho3, Tienda.alto3, 4);
		agregarRefrigeradora(Tienda.modelo4, Tienda.precio4, Tienda.fondo4, Tienda.ancho4, Tienda.alto4, 5);

		textArea.setCaretPosition(0);
	}
	
	// metodo para agregar refrigeradoras
	private void agregarRefrigeradora(String modelo, double precio, double fondo, double ancho, double alto, int numero) {
		textArea.append("Refrigeradora " + numero + ":\n");
		textArea.append("Modelo: " + modelo + "\n");
		textArea.append(String.format("Precio: $%.2f\n", precio));
		textArea.append("Fondo: " + fondo + " cm\n");
		textArea.append("Ancho: " + ancho + " cm\n");
		textArea.append("Alto: " + alto + " cm\n\n");
	}
}