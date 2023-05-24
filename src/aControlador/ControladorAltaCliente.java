package aControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aModelo.Cliente;
import aModelo.ModeloCliente;
import aVista.AltaCliente;

public class ControladorAltaCliente implements ActionListener {

	private AltaCliente altCli;
	// 2Ponemos el parámetro del modelo cliente
	private ModeloCliente modCliente;

	// Hacemos el constructor (1hay que pasarle por parametro el modelo cliente)
	public ControladorAltaCliente(ModeloCliente modCliente) {
		altCli = new AltaCliente();
		altCli.getOkButton().addActionListener(this);
		altCli.getCancelButton().addActionListener(this);

		// 3Hacemos lo tipico del constructor
		this.modCliente = modCliente;
		// 4º Antes de hacerlo visible hay que ponerlo que sea modal para que no pueda
		// hacer cosas en la ventana principal antes de terminar con la ventana de
		// altacliente
		altCli.setModal(true);

		altCli.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(altCli.getOkButton())) {
			// Creamos un objeto cliente que se abrira y se cerrara segun vaya haciendo las
			// acciones
			Cliente cliente = new Cliente(altCli.gettDni().getText(), altCli.gettNombre().getText(),
					altCli.gettTelefono().getText());

			// Vamos a acceder al modelo de cliente para añadir este cliente al arraylist.
			// Asi me deja acceder a los metodos de la clase de modelo cliente
			modCliente.añadirCliente(cliente);

		}
		if (e.getSource().equals(altCli.getCancelButton())) {
			altCli.setVisible(false);
		}
	}

}
