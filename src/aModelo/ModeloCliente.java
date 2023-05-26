package aModelo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ModeloCliente {
	//En esta clase vamos a crear el almacen de objetos cliente (conn colecciones) Lo tenemos que poner PRIVATE
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	//Aqui tendremos los métodos que se van a relacionar con cliente. Definición de como se van a tratar los datos
	//Añadir, eliminar...etc
	
	public ModeloCliente() {
		clientes = new ArrayList<Cliente>();
	}
	public void añadirCliente(Cliente cliente) {
		clientes.add(cliente);
	}
	public void eliminarCliente(Cliente cliente) {
		clientes.remove(cliente);
	}
	public ArrayList<Cliente> getListaClientes(){
		return clientes;
	}
	
	public void vaciarCliente() {
		clientes.removeAll(clientes);
		
		for (Cliente cliente1 : clientes) {
			System.out.println(cliente1);
		}
	}
	
	

}
