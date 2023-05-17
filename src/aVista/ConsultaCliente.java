package aVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

public class ConsultaCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JButton cancelButton;
	private JButton okButton;
	private JScrollPane scrollPane;
	private JList list;
	
	public JList getList() {
		return list;
	}

	public JLabel getLblDNI() {
		return lblDNI;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public JLabel getLblTelefono() {
		return lblTelefono;
	}

	public JTextField gettDNI() {
		return tDNI;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public JTextField gettTelefono() {
		return tTelefono;
	}

	private JScrollBar scrollBar;
	private JLabel lblDNI;
	private JLabel lblNombre;
	private JLabel lblTelefono;
	private JTextField tDNI;
	private JTextField tNombre;
	private JTextField tTelefono;
	private DefaultListModel<String> modelo=new DefaultListModel<>();

	

	/**
	 * Create the dialog.
	 */
	public ConsultaCliente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		contentPanel.setLayout(null);
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(115, 24, 206, 115);
			contentPanel.add(scrollPane);
			{
				list = new JList(modelo);
				//Con esto hacemos que solo se pueda seleccionar uno
				list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				scrollPane.setViewportView(list);
				
			}
			{
				scrollBar = new JScrollBar();
				scrollPane.setRowHeaderView(scrollBar);
			}
		}
		{
			lblDNI = new JLabel("DNI");
			lblDNI.setBounds(111, 157, 49, 14);
			contentPanel.add(lblDNI);
		}
		{
			lblNombre = new JLabel("Nombre");
			lblNombre.setBounds(111, 184, 49, 14);
			contentPanel.add(lblNombre);
		}
		{
			lblTelefono = new JLabel("Telefono");
			lblTelefono.setBounds(111, 208, 49, 14);
			contentPanel.add(lblTelefono);
		}
		{
			tDNI = new JTextField();
			tDNI.setBounds(234, 154, 96, 20);
			contentPanel.add(tDNI);
			tDNI.setColumns(10);
		}
		{
			tNombre = new JTextField();
			tNombre.setColumns(10);
			tNombre.setBounds(234, 181, 96, 20);
			contentPanel.add(tNombre);
		}
		{
			tTelefono = new JTextField();
			tTelefono.setColumns(10);
			tTelefono.setBounds(234, 205, 96, 20);
			contentPanel.add(tTelefono);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				cancelButton = new JButton("Cancel");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public DefaultListModel<String> getModelo() {
		return modelo;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JButton getOkButton() {
		return okButton;
	}
}
