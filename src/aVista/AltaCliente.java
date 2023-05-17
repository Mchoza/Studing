package aVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class AltaCliente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tDni;
	private JTextField tNombre;
	private JTextField tTelefono;
	private JButton okButton;
	private JButton cancelButton;

	/**QUITAMOS ESTO
	 * Launch the application.
	 * ESTO SERIA EL MAIN PARA EJECUTAR LA VENTANA
	 *
	public static void main(String[] args) {
		try {
			AltaCliente dialog = new AltaCliente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	 *
	 */
	public AltaCliente() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		tDni = new JTextField();
		tDni.setBounds(231, 46, 96, 20);
		contentPanel.add(tDni);
		tDni.setColumns(10);
		
		tNombre = new JTextField();
		tNombre.setColumns(10);
		tNombre.setBounds(231, 108, 96, 20);
		contentPanel.add(tNombre);
		
		tTelefono = new JTextField();
		tTelefono.setColumns(10);
		tTelefono.setBounds(231, 170, 96, 20);
		contentPanel.add(tTelefono);
		
		JLabel lblDNI = new JLabel("DNI");
		lblDNI.setBounds(95, 46, 49, 14);
		contentPanel.add(lblDNI);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(95, 107, 49, 14);
		contentPanel.add(lblNombre);
		
		JLabel lblTelefono = new JLabel("Teléfono");
		lblTelefono.setBounds(95, 168, 49, 14);
		contentPanel.add(lblTelefono);
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

	public JButton getOkButton() {
		return okButton;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JTextField gettDni() {
		return tDni;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public JTextField gettTelefono() {
		return tTelefono;
	}
}
