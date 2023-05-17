package aControlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import aModelo.ModeloCliente;
import aVista.VentanaPrincipal;

//1ºImportamos la vista que queramos llamar
//4ª Implementamps el ActionListener o el listener que coño sea

public class ControladorVentanaPrincipal implements ActionListener {

	// Creamos un controlador por cada ventana
	// Este se va a encargar de acceder a la vista y pasarle los datos a la vista
	// También de controlar EVENTOS (de esta ventana) y ciertas cosas que ocurran en
	// el programa

	// 1º Declaro instancia COMPLETA porque vamos a desear acceder a esas cosas (la
	// creamos como atributo)
	private VentanaPrincipal vPrinc;
	//6ºEsto es para que pueda acceder a los datos, a la lógica del programa
	private ModeloCliente modCliente;

	// 2º Hacemos el constructor del controlador
	public ControladorVentanaPrincipal() {
		// 3ºTerminamos el objeto
		vPrinc = new VentanaPrincipal();
		// 4ªTendremos que llamar a los items con los vamos a interactuar y para ello
		// utilizaremos los getters
		// Le añadimos la accion dentro de esta llamada
		// Con el "this" se hace referencia al propio objeto actual (al
		// controladorVentanaPrincipal) (yo mismo)
		vPrinc.getmAltaCli().addActionListener(this);
		vPrinc.getBtnAltaCli().addActionListener(this);
		vPrinc.getmConsultaCli().addActionListener(this);
		vPrinc.getBtnConsultaCli().addActionListener(this);
		// Aqui añadiriamos TODOS
		//en este caso ponemos el setVisible lo ponemos al FINAL de todo lo que hayamos metido
		vPrinc.setVisible(true);
		
		//7º Instanciamos el modelocliente
		modCliente = new ModeloCliente();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//5ªAqui le dire lo que va a hacer el menu de alta cliente
		if(e.getSource().equals(vPrinc.getmAltaCli())||e.getSource().equals(vPrinc.getBtnAltaCli())) {
			//Aqui llamaríamos al controlador de la ventana de alta cliente
			// 8º le pasamos como parámetro el modelo cliente en el que se van a almacenar las COSAS
			new ControladorAltaCliente(modCliente);
			//hacemos un syso para ver si ha creado el arraylist
			System.out.println(modCliente.getListaClientes().toString());
		}
		if(e.getSource().equals(vPrinc.getmConsultaCli())||e.getSource().equals(vPrinc.getBtnConsultaCli())) {
			//Llamamos al controlador de la ventana COnsultaCliente
			new ControladorConsultaCliente(modCliente);
			System.out.println(modCliente.getListaClientes().toString());

		}

	}

}
