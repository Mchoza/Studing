package clientes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cliente {
	// Atributos
	private String dni;
	private String nombre;
	private String telefono;
	static HashMap<String, Integer> compras= new HashMap<>();
	static ArrayList<String> prod = new ArrayList<>();

	// Constructor por defecto
	public Cliente() {
		super();
	}

	// Constructor con parámetros
	public Cliente(String dni, String nombre, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	// Getters y setters

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public HashMap<String, Integer> getCompras() {
		return compras;
	}

	public void setCompras(HashMap<String, Integer> compras) {
		this.compras = compras;
	}

	public static void addCompras(String producto, int cantidad) {
		if(compras.containsKey(producto)) {
			compras.replace(producto, compras.get(producto) + cantidad);
		}else {
			compras.put(producto, cantidad);
		}

	}
	
	

	public static void eliminarProducto(String producto) {
		int cont = 0;
		for (Map.Entry<String, Integer> entry : compras.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (producto == key) {
				cont++;
			}

		}
		if (cont != 0) {
			compras.remove(producto);
		}

	}

	public static ArrayList<String> verProductos() {

		for (Map.Entry<String, Integer> entry : compras.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			prod.add(key);
		}

		return prod;

	}

	public static int totalUnidades() {
		int sum = 0;
		for (Map.Entry<String, Integer> entry : compras.entrySet()) {
			Integer val = entry.getValue();
			sum += val;

		}

		return sum;

	}

}
