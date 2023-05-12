package linkedListEjemplo;

public class Persona {
	
	//Atributos clase persona
	String nombre;
	int edad;
	/**
	 * Constructor por defectos
	 */
	public Persona() {
		super();
	}
	/**
	 * Constructor con parámetros
	 * @param nombre
	 * @param edad
	 */
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
