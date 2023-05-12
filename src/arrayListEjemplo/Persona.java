package arrayListEjemplo;

public class Persona {
	
	//Atributos clase persona
	String nombre;
	String apellidos;
	/**
	 * Constructor por defectos
	 */
	public Persona() {
		super();
	}
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param apellidos
	 */
	public Persona(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	

}
