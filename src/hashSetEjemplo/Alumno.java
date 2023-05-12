package hashSetEjemplo;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Alumno {

	// Atributos
	private String nombre;
	private String matricula;

	// Constructor por defecto
	public Alumno() {
		super();
	}

	// Constructor con parámetros
	public Alumno(String nombre, String matricula) {
		super();
		this.nombre = nombre;
		this.matricula = matricula;
	}

	// Getters y setters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public int hashCode() {
		// return Objects.hash(matricula, nombre); esto es lo que aparece, pero solo
		// queremos que compruebe la matrícula

		return Objects.hash(matricula);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			
		return true;
		}
			
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		JOptionPane.showMessageDialog(null, "La matrícula que desea crear ya existe", "Alta alumno",
				JOptionPane.INFORMATION_MESSAGE);
		// Como solo queremos comparar la matrícula quitamos el nombre que se ha creado
		// por defecto
		// Podríamos incluir también un mensaje en el que dijésemos que la matrícula es
		// igual y que no lo podemos crear
		return Objects.equals(matricula, other.matricula);
	}

}
