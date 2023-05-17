package aControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import aModelo.Cliente;
import aModelo.ModeloCliente;
import aVista.ConsultaCliente;

public class ControladorConsultaCliente implements ActionListener, ListSelectionListener {

	// 1ºLlamamos a la clase de la vista que queremos controlar con un atributo
	// private
	private ConsultaCliente consCli;

	// 2ºEnlazamos el controlador con el modelo Cliente de la misma forma
	private ModeloCliente modCliente;

	// 3ºRealizamos el constructor con todo lo que necesite
	public ControladorConsultaCliente(ModeloCliente modCliente) {
		// 4ºllamamos al parámetro de la clase interfaz del controlador que hemos creado
		// arriba
		consCli = new ConsultaCliente();
		// Hacemos lo típico del constructor con el atributo que nos falta
		// (modeloCliente)
		this.modCliente = modCliente;
		// Ahora instanciaremos los botones para establecer su action listener
		// En este caso tendremos 2, el ok y el cancel
		// Les llamaremos mediante el getter creado
		consCli.getOkButton().addActionListener(this);
		consCli.getCancelButton().addActionListener(this);
		consCli.getModelo().addAll(extraerNombreCli());
		consCli.getList().addListSelectionListener(this);

		// Añadimos el arraylist al list

		// Establecemos el modal
		consCli.setModal(true);

		// Lo hacemos visible
		consCli.setVisible(true);

	}

	public List<String> extraerNombreCli() {
		ArrayList<String> nomCli = new ArrayList<>();

		for (Cliente string : modCliente.getListaClientes()) {
			nomCli.add(string.getNombre());
		}
		return nomCli;
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {

		// Primero hacemos el if y comparamos
		if (e.getSource().equals(consCli.getOkButton()) || e.getSource().equals(consCli.getCancelButton())) {

		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {

		if(e.getSource().equals(consCli.getList())) {
			int temp = consCli.getList().getSelectedIndex();
			consCli.gettDNI().setText(modCliente.getListaClientes().get(temp).getDni());
			consCli.gettNombre().setText(modCliente.getListaClientes().get(temp).getNombre());
			consCli.gettTelefono().setText(modCliente.getListaClientes().get(temp).getTelefono());

		}
	}

}
