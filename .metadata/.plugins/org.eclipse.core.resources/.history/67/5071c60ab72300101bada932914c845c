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

	protected void listarRefrigeradoras() {
		textArea.setText("");

		textArea.append("--> LISTADO DE REFRIGERADORAS <--\n\n");

		textArea.append("Refrigeradora 1:\n");
		textArea.append("Modelo: " + Tienda.modelo0 + "\n");
		textArea.append(String.format("Precio: $%.2f\n", Tienda.precio0));
		textArea.append("Fondo: " + Tienda.fondo0 + " cm\n");
		textArea.append("Ancho: " + Tienda.ancho0 + " cm\n");
		textArea.append("Alto: " + Tienda.alto0 + " cm\n\n");

		textArea.append("Refrigeradora 2:\n");
		textArea.append("Modelo: " + Tienda.modelo1 + "\n");
		textArea.append(String.format("Precio: $%.2f\n", Tienda.precio1));
		textArea.append("Fondo: " + Tienda.fondo1 + " cm\n");
		textArea.append("Ancho: " + Tienda.ancho1 + " cm\n");
		textArea.append("Alto: " + Tienda.alto1 + " cm\n\n");

		textArea.append("Refrigeradora 3:\n");
		textArea.append("Modelo: " + Tienda.modelo2 + "\n");
		textArea.append(String.format("Precio: $%.2f\n", Tienda.precio2));
		textArea.append("Fondo: " + Tienda.fondo2 + " cm\n");
		textArea.append("Ancho: " + Tienda.ancho2 + " cm\n");
		textArea.append("Alto: " + Tienda.alto2 + " cm\n\n");

		textArea.append("Refrigeradora 4:\n");
		textArea.append("Modelo: " + Tienda.modelo3 + "\n");
		textArea.append(String.format("Precio: $%.2f\n", Tienda.precio3));
		textArea.append("Fondo: " + Tienda.fondo3 + " cm\n");
		textArea.append("Ancho: " + Tienda.ancho3 + " cm\n");
		textArea.append("Alto: " + Tienda.alto3 + " cm\n\n");

		textArea.append("Refrigeradora 5:\n");
		textArea.append("Modelo: " + Tienda.modelo4 + "\n");
		textArea.append(String.format("Precio: $%.2f\n", Tienda.precio4));
		textArea.append("Fondo: " + Tienda.fondo4 + " cm\n");
		textArea.append("Ancho: " + Tienda.ancho4 + " cm\n");
		textArea.append("Alto: " + Tienda.alto4 + " cm\n");

		textArea.setCaretPosition(0);
	}
}