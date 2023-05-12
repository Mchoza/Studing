package treeSetEjemplo;

public class Persona implements Comparable<Persona>{
	
	// Atributos
	private String nombre;
	private String apellido;
	private int edad;

	// Constructor por defecto
	public Persona() {
		super();
	}

	// Constructor con parámetros
	public Persona(String nombre, String apellido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}

	// Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Métodos de la clase Comparable
	
	@Override
	public int compareTo(Persona p) {
		
		//Añadimos edad - p.edad para que lo ordene por edad
		return edad-p.edad;
	}

}
