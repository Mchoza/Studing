package hashSetEjemplo;

import java.util.HashSet;

import javax.swing.JOptionPane;

public class AlumnoMain {

	// Lo creamos estático para poder acceder a él tranquilamente desde cualquier
	// lugar del main
	static HashSet<Alumno> alumnos = new HashSet<Alumno>();

	public static void main(String[] args) {

		// Creamos menú con tres opciones
		boolean resp = false;

		do {
			switch (menu()) {
			case "Alta alumno":
				altaAlumno();
				break;
			case "Mostrar alumnos":
				mostrarAlumnos();
				break;
			case "Salir":
				resp = true;
				break;
			}
		} while (!resp);

	}

	private static String menu() {

		// Declaramos un array con valores para el JOptionPane
		String[] valores = { "Alta alumno", "Mostrar alumnos", "Salir" };
		String opcion = "";

		// Hacemos el Joptionpane para elegir la opción que queramos

		opcion = (String) JOptionPane.showInputDialog(null, "Elige una opción", "Alumnos", JOptionPane.QUESTION_MESSAGE,
				null, valores, valores[0]);
		if (opcion == null) {
			JOptionPane.showMessageDialog(null, "Ha salido del programa", "Alta alumno",
					JOptionPane.INFORMATION_MESSAGE);
			opcion = "Salir";
		}

		return opcion;
	}

	private static void mostrarAlumnos() {
		String cadena = "";

		for (Alumno alumno : alumnos) {

			cadena += "Nombre: " + alumno.getNombre() + "| Matricula: " + alumno.getMatricula() + "\n";

		}
		JOptionPane.showMessageDialog(null, "Alumnos: \n" + cadena, "Alta alumno", JOptionPane.INFORMATION_MESSAGE);
	}

	private static void altaAlumno() {
		String nombre = "";
		String matricula = "";
		boolean creacionNombre = false;
		boolean creacionMatricula = false;

		// Pedimos el nombre
		do {
			try {
				nombre = JOptionPane.showInputDialog(null, "Nombre del alumno:", "Alta alumno",
						JOptionPane.QUESTION_MESSAGE);
				if (nombre.isBlank()) {
					JOptionPane.showMessageDialog(null, "El nombre que desea crear es incorrecto", "Alta alumno",
							JOptionPane.INFORMATION_MESSAGE);

				} else if (!nombre.isBlank()) {
					creacionNombre = true;
				}

			} catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Ha salido de la creación de un nuevo alumno", "Alta alumno",
						JOptionPane.INFORMATION_MESSAGE);
				matricula = null;

			}
		} while (!creacionNombre && matricula != null);

		// Creación de la matrícula
		while (!creacionMatricula && matricula != null) {
			try {
				matricula = JOptionPane.showInputDialog(null, "Matrícula del alumno:", "Alta alumno",
						JOptionPane.QUESTION_MESSAGE);
				if (matricula.isBlank()) {
					JOptionPane.showMessageDialog(null, "La matrícula que desea crear es incorrecta", "Alta alumno",
							JOptionPane.INFORMATION_MESSAGE);

				} else if (!matricula.isBlank()) {
					creacionMatricula = true;
				}

			} catch (Exception e) {

				JOptionPane.showMessageDialog(null, "Ha salido de la creación de alumno", "Alta alumno",
						JOptionPane.INFORMATION_MESSAGE);
				matricula = null;
			}
		}
		int cont = 0;

		if (creacionNombre && creacionMatricula) {
			// Bucle for para añadir al contador en caso de que si que exista la matricula,
			// si no existiese mostraría al nuevo alumno

			for (Alumno alumno : alumnos) {
				System.out.println("hola" + cont);
				if (alumno.getMatricula().equals(matricula)) {
					cont++;
					System.out.println(cont);
				}
			}

			alumnos.add(new Alumno(nombre, matricula));

		}

		if (cont == 0 && creacionNombre && creacionMatricula) {
			System.out.println("Sola");
			JOptionPane.showMessageDialog(null,
					"Ha creado al alumno: \n Nombre: " + nombre + "\n Matricula: " + matricula, "Alta alumno",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}

}
