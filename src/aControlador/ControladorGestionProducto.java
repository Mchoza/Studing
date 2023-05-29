package aControlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aModelo.ModeloProducto;
import aModelo.Producto;
import aVista.GestionProductos;

public class ControladorGestionProducto implements ActionListener{

	//Llamamos a la clase de la vista que queremos controlar
	private GestionProductos gestProd;

	//Enlazamos el controlador con el modelo producyos de la misma forma
	private ModeloProducto modProd;


	public ControladorGestionProducto(ModeloProducto modProd) {

		gestProd = new GestionProductos();
		gestProd.getBtnAlta().addActionListener(this);
		gestProd.getBtnGuardar().addActionListener(this);
		gestProd.getBtnSalir().addActionListener(this);
		gestProd.getCancelButton().addActionListener(this);
		
		this.modProd=modProd;

		

		gestProd.setModal(true);

		gestProd.setVisible(true);

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource().equals(gestProd.getBtnAlta())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "alta");
		}
		if(e.getSource().equals(gestProd.getBtnSalir())) {
			((CardLayout) gestProd.getPanelCard().getLayout()).show(gestProd.getPanelCard(), "basico");

		}
		if(e.getSource().equals(gestProd.getCancelButton())) {
			gestProd.gettId().setText("");
			gestProd.gettNombre().setText("");
			gestProd.gettCategoria().setText("");
			gestProd.gettPrecio().setText("");
			gestProd.gettCantidad().setText("");
		}
		if(e.getSource().equals(gestProd.getBtnGuardar())) {
			double precio = Double.parseDouble(gestProd.gettPrecio().getText());
			int cantidad = Integer.parseInt(gestProd.gettCantidad().getText());

			Producto producto = new Producto(gestProd.gettId().getText(), gestProd.gettNombre().getText(), gestProd.gettCategoria().getText(), precio, cantidad);

			modProd.añadirProducto(producto);



		}
	}

}
