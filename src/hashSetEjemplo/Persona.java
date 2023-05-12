package hashSetEjemplo;

import java.util.Objects;

public class Persona {
	//Atributos
	private String nombre;
	private String apellido;
	private String fechaNac;
	
	//Constructor por defecto
	public Persona() {
		super();
	}

	//Constructor con parámetros
	public Persona(String nombre, String apellido, String fechaNac) {
		super();
		this.nombre = apellido;
		this.apellido = nombre;
		this.fechaNac = fechaNac;
	}
	
	//Getters y setters

	public String getApellido() {
		return nombre;
	}

	public void setApellido(String apellido) {
		this.nombre = apellido;
	}

	public String getNombre() {
		return apellido;
	}

	public void setNombre(String nombre) {
		this.apellido = nombre;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(nombre, other.nombre) && Objects.equals(apellido, other.apellido);
	}
	
	
	
	
	
	

}
