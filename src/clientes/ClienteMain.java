package clientes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ClienteMain {

	static HashMap<String, Cliente> clientes = new HashMap<>();

	public static void main(String[] args) {
		boolean salir = false;

		do {
			switch (menu()) {
			case "Añadir cliente":
				añadirCliente();
				break;
			case "Eliminar cliente":
				eliminarCliente();
				break;
			case "Añadir compras":
				añadirCompras();
				break;
			case "Eliminar producto":
				eliminarProducto();
				break;
			case "Ver productos":
				verProductos();
				break;
			case "Total Productos":
				break;
			case "Salir":
				salir = true;
				break;
			default:
				salir = true;
				break;

			}
		} while (!salir);

	}

	private static void verProductos() {

		int cont = 0;
		for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
			String key = entry.getKey();
			Cliente val = entry.getValue();
			cont++;

		}
		String[] valores = new String[cont];
		int i = 0;

		// Mostrar los clientes en un desplegable. Para eso los sacamos con un bucle
		for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
			String key = entry.getKey();
			Cliente val = entry.getValue();
			valores[i] = key;
			i++;

		}

		String opc = (String) JOptionPane.showInputDialog(null, "Elegir cliente para ver productos", "Productos",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);
		
		for (String string : clientes.get(opc).verProductos()) {
			
		}
		
	}

	private static void eliminarProducto() {

		
		
	}

	private static void añadirCompras() {
		int cont = 0;
		for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
			String key = entry.getKey();
			Cliente val = entry.getValue();
			cont++;

		}
		String[] valores = new String[cont];
		int i = 0;

		// Mostrar los clientes en un desplegable. Para eso los sacamos con un bucle
		for (Map.Entry<String, Cliente> entry : clientes.entrySet()) {
			String key = entry.getKey();
			Cliente val = entry.getValue();
			valores[i] = key;
			i++;

		}

		String opc = (String) JOptionPane.showInputDialog(null, "Alta de compras", "Compras",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

		String producto = JOptionPane.showInputDialog(null, "Escribe el producto que deseas comprar", "Alta compras",
				JOptionPane.QUESTION_MESSAGE);
		
		String cant = JOptionPane.showInputDialog(null, "Escribe la cantidad del producto que deseas comprar", "Alta compras",
				JOptionPane.QUESTION_MESSAGE);
		int cantidad = Integer.parseInt(cant);
		
		clientes.get(opc).addCompras(producto, cantidad);

	}

	private static void eliminarCliente() {

		String dni = JOptionPane.showInputDialog(null, "Escribe el dni del cliente que quieres eliminar",
				"Baja de clientes", JOptionPane.QUESTION_MESSAGE);

		if (clientes.containsKey(dni)) {
			clientes.remove(dni);
			JOptionPane.showMessageDialog(null, "Se ha eliminado el cliente con dni " + dni, "Baja de clientes",
					JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static void añadirCliente() {
		String dni, nombre, telefono;

		dni = JOptionPane.showInputDialog(null, "Introduce el dni", "Alta cliente", JOptionPane.QUESTION_MESSAGE);

		nombre = JOptionPane.showInputDialog(null, "Introduce el nombre", "Alta cliente", JOptionPane.QUESTION_MESSAGE);

		telefono = JOptionPane.showInputDialog(null, "Introduce el telefono", "Alta cliente",
				JOptionPane.QUESTION_MESSAGE);

		clientes.put(dni, new Cliente(dni, nombre, telefono));
	}

	private static String menu() {
		String[] valores = { "Añadir cliente", "Eliminar cliente", "Añadir compras", "Eliminar producto",
				"Ver productos", "Total Productos", "Salir" };

		String opc = (String) JOptionPane.showInputDialog(null, "Elige la opción que deseas realizar", "Compras",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

		return opc;
	}

}
