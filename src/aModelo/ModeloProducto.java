package aModelo;

import java.util.ArrayList;

public class ModeloProducto {
	
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	
	public ModeloProducto() {
		productos = new ArrayList<Producto>();
	}
	
	public void añadirProducto(Producto producto) {
		productos.add(producto);
	}
	
	public void eliminarProducto(Producto producto) {
		productos.remove(producto);
	}
	
	public ArrayList<Producto> getListaProductos() {
		return productos;
	}
	
	

}
