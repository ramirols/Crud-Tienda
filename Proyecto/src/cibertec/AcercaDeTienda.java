package cibertec;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingConstants;

public class AcercaDeTienda extends JDialog implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel lblTitle;
    private JSeparator separator;
    private JLabel lblAuthors;
    private JLabel lblAuthor1;
    private JLabel lblAuthor2;
    private JLabel lblAuthor3;
    private JLabel lblAuthor4;
    private JButton btnCerrar;

    public AcercaDeTienda() {
        setTitle("Acerca de Tienda");
        setBounds(100, 100, 444, 353);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        initializeComponents();
    }

    // método para inicializar todos los componentes
    private void initializeComponents() {
        lblTitle = new JLabel("TIENDA 1.0");
        lblTitle.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblTitle.setBounds(123, 11, 195, 49);
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTitle);

        separator = new JSeparator();
        separator.setForeground(Color.DARK_GRAY);
        separator.setBounds(22, 58, 382, 2);
        contentPane.add(separator);

        lblAuthors = new JLabel("Autores");
        lblAuthors.setFont(new Font("Tahoma", Font.BOLD, 24));
        lblAuthors.setBounds(163, 71, 93, 42);
        lblAuthors.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAuthors);

        lblAuthor1 = new JLabel("Andy Monkey");
        lblAuthor1.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAuthor1.setBounds(136, 124, 155, 19);
        lblAuthor1.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAuthor1);

        lblAuthor2 = new JLabel("Jhon Rosales");
        lblAuthor2.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAuthor2.setBounds(146, 152, 128, 14);
        lblAuthor2.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAuthor2);

        lblAuthor3 = new JLabel("Diego Rojas");
        lblAuthor3.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAuthor3.setBounds(156, 177, 104, 19);
        lblAuthor3.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAuthor3);

        lblAuthor4 = new JLabel("Ramiro Sanchez");
        lblAuthor4.setFont(new Font("Tahoma", Font.BOLD, 17));
        lblAuthor4.setBounds(136, 207, 155, 14);
        lblAuthor4.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblAuthor4);

        btnCerrar = new JButton("Cerrar");
        btnCerrar.setBounds(146, 258, 118, 29);
        btnCerrar.addActionListener(this);
        contentPane.add(btnCerrar);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCerrar) {
            closeDialog();
        }
    }

    // Método para cerrar el JDialog
    private void closeDialog() {
        dispose();
    }
}
