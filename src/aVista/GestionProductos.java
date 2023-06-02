package aVista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTable;

public class GestionProductos extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField tId;
	private JTextField tNombre;
	private JTextField tCategoria;
	private JTextField tPrecio;
	private JTextField tCantidad;
	private JTextField tIdBaja;
	private JTextField tNombreBaja;
	// private JTable table;
	private JButton btnAlta;
	private JButton btnBaja;
	private JPanel panelCard;
	private JButton btnGuardar;
	private JButton cancelButton;
	private JButton btnSalir;
	private JComboBox<?> cbNombreProd;
	private JButton btnBorrar;
	private JButton btnSalir_2;
	private JComboBox cbCategoria;
	
	

	public void setCbNombreProd(String nombres) {
		this.cbNombreProd = cbNombreProd;
	}

	public JButton getBtnSalir_2() {
		return btnSalir_2;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public JPanel getPanelCard() {
		return panelCard;
	}

	public JButton getBtnAlta() {
		return btnAlta;
	}

	public JButton getBtnBaja() {
		return btnBaja;
	}

	/**
	 * Create the dialog.
	 */
	public GestionProductos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 157, 260);
		contentPanel.add(panel);
		panel.setLayout(null);

		btnAlta = new JButton("Alta");
		btnAlta.setBounds(34, 40, 89, 23);
		panel.add(btnAlta);

		btnBaja = new JButton("Baja");
		btnBaja.setBounds(34, 103, 89, 23);
		panel.add(btnBaja);

		// Creamos el grupo y sumamos los RadioButton
		ButtonGroup rdGroup = new ButtonGroup();

		JPanel panelOpciones = new JPanel();
		panelOpciones.setBounds(25, 137, 111, 82);
		panel.add(panelOpciones);

		JRadioButton rdBtnCategoria = new JRadioButton("Por categoría");
		panelOpciones.add(rdBtnCategoria);
		rdGroup.add(rdBtnCategoria);

		JRadioButton rdBtnStock = new JRadioButton("Por stock bajo");
		panelOpciones.add(rdBtnStock);
		rdGroup.add(rdBtnStock);

		panelOpciones.setBorder(BorderFactory.createTitledBorder("CONSULTA"));

		panelCard = new JPanel();
		panelCard.setBounds(159, 0, 277, 260);
		contentPanel.add(panelCard);
		panelCard.setLayout(new CardLayout(0, 0));

		JPanel panelBasico = new JPanel();
		panelCard.add(panelBasico, "basico");
		panelBasico.setLayout(null);

		JPanel panelAlta = new JPanel();
		panelCard.add(panelAlta, "alta");
		panelAlta.setLayout(null);

		JLabel lbId = new JLabel("ID");
		lbId.setBounds(27, 28, 49, 14);
		panelAlta.add(lbId);

		JLabel lbCategoria = new JLabel("CATEGORIA");
		lbCategoria.setBounds(27, 108, 68, 14);
		panelAlta.add(lbCategoria);

		JLabel lbNombre = new JLabel("NOMBRE");
		lbNombre.setBounds(27, 68, 49, 14);
		panelAlta.add(lbNombre);

		JLabel lbPrecio = new JLabel("PRECIO");
		lbPrecio.setBounds(27, 148, 49, 14);
		panelAlta.add(lbPrecio);

		JLabel lbCantidad = new JLabel("CANTIDAD");
		lbCantidad.setBounds(27, 188, 68, 14);
		panelAlta.add(lbCantidad);

		tId = new JTextField();
		tId.setBounds(119, 25, 96, 20);
		panelAlta.add(tId);
		tId.setColumns(10);

		tNombre = new JTextField();
		tNombre.setColumns(10);
		tNombre.setBounds(119, 65, 96, 20);
		panelAlta.add(tNombre);

		tCategoria = new JTextField();
		tCategoria.setColumns(10);
		tCategoria.setBounds(119, 105, 96, 20);
		panelAlta.add(tCategoria);

		tPrecio = new JTextField();
		tPrecio.setColumns(10);
		tPrecio.setBounds(119, 145, 96, 20);
		panelAlta.add(tPrecio);

		tCantidad = new JTextField();
		tCantidad.setColumns(10);
		tCantidad.setBounds(119, 185, 96, 20);
		panelAlta.add(tCantidad);

		btnGuardar = new JButton("GUARDAR");
		// btnGuardar.setActionCommand("OK");
		btnGuardar.setBounds(10, 226, 85, 23);
		panelAlta.add(btnGuardar);

		cancelButton = new JButton("CANCELAR");
		// cancelButton.setActionCommand("Cancel");
		cancelButton.setBounds(105, 226, 87, 23);
		panelAlta.add(cancelButton);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(204, 226, 63, 23);
		panelAlta.add(btnSalir);

		JPanel panelBaja = new JPanel();
		panelCard.add(panelBaja, "baja");
		panelBaja.setLayout(null);

		cbNombreProd = new JComboBox();
		cbNombreProd.setBounds(73, 29, 149, 22);
		panelBaja.add(cbNombreProd);

		JLabel lblIdBaja = new JLabel("ID");
		lblIdBaja.setBounds(60, 88, 49, 14);
		panelBaja.add(lblIdBaja);

		JLabel lblNombreBaja = new JLabel("NOMBRE");
		lblNombreBaja.setBounds(60, 125, 49, 14);
		panelBaja.add(lblNombreBaja);

		JLabel lblCategoriaBaja = new JLabel("CATEGORIA");
		lblCategoriaBaja.setBounds(60, 166, 70, 14);
		panelBaja.add(lblCategoriaBaja);

		cbCategoria = new JComboBox();
		cbCategoria.setBounds(145, 162, 109, 22);
		panelBaja.add(cbCategoria);

		tIdBaja = new JTextField();
		tIdBaja.setBounds(145, 85, 96, 20);
		panelBaja.add(tIdBaja);
		tIdBaja.setColumns(10);

		tNombreBaja = new JTextField();
		tNombreBaja.setColumns(10);
		tNombreBaja.setBounds(145, 122, 96, 20);
		panelBaja.add(tNombreBaja);

		btnSalir_2 = new JButton("SALIR");
		btnSalir_2.setBounds(204, 212, 63, 23);
		panelBaja.add(btnSalir_2);

		JButton btnModificar = new JButton("MODIFICAR");
		btnModificar.setBounds(96, 212, 98, 23);
		panelBaja.add(btnModificar);

		btnBorrar = new JButton("BORRAR");
		btnBorrar.setBounds(10, 212, 76, 23);
		panelBaja.add(btnBorrar);

		JPanel panelConsultaCategoria = new JPanel();
		panelCard.add(panelConsultaCategoria, "consultaCategoria");
		panelConsultaCategoria.setLayout(null);

		JLabel lblNewLabel = new JLabel("CATEGORIA");
		lblNewLabel.setBounds(92, 21, 77, 14);
		panelConsultaCategoria.add(lblNewLabel);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(63, 46, 126, 22);
		panelConsultaCategoria.add(comboBox);

		JButton btnSalir_1 = new JButton("SALIR");
		btnSalir_1.setBounds(106, 211, 63, 23);
		panelConsultaCategoria.add(btnSalir_1);

		/*
		 * String[] encabezados = {"ID", "NOMBRE", "CANTIDAD", "PRECIO"}; String[][]
		 * relleno = null;
		 * 
		 * table = new JTable(relleno,encabezados); table.setBounds(36, 89, 208, 111);
		 * panelConsulta.add(table);
		 */

		JPanel panelConsultaStock = new JPanel();
		panelCard.add(panelConsultaStock, "consultaStock");
		panelConsultaStock.setLayout(null);

		JLabel lblNewLabel1 = new JLabel("STOCK");
		lblNewLabel1.setBounds(92, 21, 77, 14);
		panelConsultaStock.add(lblNewLabel1);

		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(63, 46, 126, 22);
		panelConsultaStock.add(comboBox1);

		JButton btnSalir_11 = new JButton("SALIR");
		btnSalir_11.setBounds(106, 211, 63, 23);
		panelConsultaStock.add(btnSalir_11);

		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

	public JComboBox getCbCategoria() {
		return cbCategoria;
	}

	public JTextField gettIdBaja() {
		return tIdBaja;
	}

	public JTextField gettNombreBaja() {
		return tNombreBaja;
	}

	public JComboBox getCbNombreProd() {
		return cbNombreProd;
	}

	public JTextField gettId() {
		return tId;
	}

	public JTextField gettNombre() {
		return tNombre;
	}

	public JTextField gettCategoria() {
		return tCategoria;
	}

	public JTextField gettPrecio() {
		return tPrecio;
	}

	public JTextField gettCantidad() {
		return tCantidad;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public JButton getCancelButton() {
		return cancelButton;
	}

	public JButton getBtnSalir() {
		return btnSalir;
	}
}
