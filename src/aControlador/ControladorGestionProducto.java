package aControlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import aModelo.Cliente;
import aModelo.ModeloProducto;
import aModelo.Producto;
import aVista.GestionProductos;

public class ControladorGestionProducto implements ActionListener {

	// Llamamos a la clase de la vista que queremos controlar
	private GestionProductos gestProd;

	// Enlazamos el controlador con el modelo producyos de la misma forma
	private ModeloProducto modProd;

	private ArrayList<String> lista = new ArrayList<String>();

	public ControladorGestionProducto(ModeloProducto modProd) {

		gestProd = new GestionProductos();
		gestProd.getBtnAlta().addActionListener(this);
		gestProd.getBtnGuardar().addActionListener(this);
		gestProd.getBtnSalir().addActionListener(this);
		gestProd.getCancelButton().addActionListener(this);
		gestProd.getBtnBaja().addActionListener(this);
		gestProd.getBtnBorrar().addActionListener(this);
		gestProd.getCbNombreProd().addActionListener(this);
		gestProd.getBtnSalir_2().addActionListener(this);

		this.modProd = modProd;

		gestProd.setModal(true);

		gestProd.setVisible(true);

	}

	public List<String> extraerNombreProd() {
		ArrayList<String> nomProd = new ArrayList<>();

		for (Producto prod : modProd.getListaProductos()) {
			nomProd.add(prod.getNombre());
		}
		return nomProd;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource().equals(gestProd.getBtnBaja())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "baja");

			DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

			for (String nombre : extraerNombreProd()) {
				comboBoxModel.addElement(nombre);
			}

			gestProd.getCbNombreProd().setModel(comboBoxModel);

		}

		if (e.getSource().equals(gestProd.getCbNombreProd())) {


			for (Producto prod : modProd.getListaProductos()) {
				if (prod.getNombre().equals(gestProd.getCbNombreProd().getSelectedItem())) {
					gestProd.gettIdBaja().setText(prod.getId());
					gestProd.gettNombreBaja().setText(prod.getNombre());
					DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<String>();
					comboBoxModel.addElement(prod.getCategoria());

					gestProd.getCbCategoria().setModel(comboBoxModel);
				}
			}

		}
		if (e.getSource().equals(gestProd.getBtnBorrar())) {
			Producto prodBorrar = new Producto();
			for (Producto producto : modProd.getListaProductos()) {
				if (gestProd.gettId().getText().equalsIgnoreCase(producto.getId())) {
					prodBorrar = producto;
				}

			}
			String[] nombres = new String[modProd.getListaProductos().size()];
			int i = 0;
			for (Producto elemento : modProd.getListaProductos()) {
				nombres[i] = elemento.getNombre();
				i++;
			}
			modProd.eliminarProducto(prodBorrar);
			DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

			for (String nombre : extraerNombreProd()) {
				comboBoxModel.addElement(nombre);
			}
			DefaultComboBoxModel<String> comboBoxModel1 = new DefaultComboBoxModel<>();
			comboBoxModel1.addElement("");

			gestProd.gettIdBaja().setText("");
			gestProd.gettNombreBaja().setText("");
			gestProd.getCbCategoria().removeAll();
			gestProd.getCbCategoria().setModel(comboBoxModel1);
			
			gestProd.getCbNombreProd().removeAll();
			gestProd.getCbNombreProd().setModel(comboBoxModel);

			
			
			// gestProd.setCbNombreProd(nombres);

		}
		if (e.getSource().equals(gestProd.getBtnAlta())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "alta");
		}
		if (e.getSource().equals(gestProd.getBtnSalir())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "basico");

		}

		if (e.getSource().equals(gestProd.getBtnSalir_2())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "basico");

		}
		if (e.getSource().equals(gestProd.getCancelButton())) {
			gestProd.gettId().setText("");
			gestProd.gettNombre().setText("");
			gestProd.gettCategoria().setText("");
			gestProd.gettPrecio().setText("");
			gestProd.gettCantidad().setText("");
		}
		if (e.getSource().equals(gestProd.getBtnGuardar())) {
			double precio = Double.parseDouble(gestProd.gettPrecio().getText());
			int cantidad = Integer.parseInt(gestProd.gettCantidad().getText());

			Producto producto = new Producto(gestProd.gettId().getText(), gestProd.gettNombre().getText(),
					gestProd.gettCategoria().getText(), precio, cantidad);

			modProd.añadirProducto(producto);

		}
		//consulta
		if (e.getSource().equals(gestProd.getBtnSalir_2())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "basico");

		}

	}

}
