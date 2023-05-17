package aModelo;

public class Cliente {
	
	//Atributos
	private String dni;
	private String nombre;
	private String telefono;
	
	//Constructor por defecto
	public Cliente() {
		super();
	}
	
	//Constructor con parámetros
	public Cliente(String dni, String nombre, String telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	//getters y setters
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
	
	

}
