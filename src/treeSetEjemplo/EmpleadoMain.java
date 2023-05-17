package treeSetEjemplo;

import java.util.Iterator;
import java.util.TreeSet;

import javax.swing.JOptionPane;

public class EmpleadoMain {

	public static void main(String[] args) {

		TreeSet<Empleado> empleados = new TreeSet<Empleado>(new EmpleadoPorSueldo());
		TreeSet<Empleado> empleados2 = new TreeSet<Empleado>();

		boolean salir = false;

		do {
			switch (menu()) {
			case "Añadir empleados":
				añadir(empleados, empleados2);
				break;
			case "Mostrar empleados ordenados por nombre":
				porNombre(empleados2);
				break;
			case "Mostrar empleados ordenados por sueldo":
				porSueldo(empleados);
				break;
			case "Borrar empleados":
				borrar(empleados, empleados2);
				break;
			case "Salir":
				salir = true;
				break;

			}
		} while (!salir);

	}

	private static void borrar(TreeSet<Empleado> empleados, TreeSet<Empleado> empleados2) {
		String sueldo;
		double sueldoLimite;
		sueldo = JOptionPane.showInputDialog(null, "Escribe el nombre", "Alta de empleado",
				JOptionPane.QUESTION_MESSAGE);
		sueldoLimite = Double.parseDouble(sueldo);

		Iterator<Empleado> iterador = empleados.iterator();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			if (empleado.getSueldo() < sueldoLimite) {
				// para poder borrar tenemos que llamar al iterador, no a empleados, y no hay
				// que pasarle objeto
				iterador.remove();
			}

		}

		Iterator<Empleado> iterador2 = empleados2.iterator();
		while (iterador2.hasNext()) {
			Empleado empleado = (Empleado) iterador2.next();
			if (empleado.getSueldo() < sueldoLimite) {
				iterador2.remove();
			}

		}

	}

	private static void porSueldo(TreeSet<Empleado> empleados) {
		String cadena = "Empleados ordenados por sueldo: ";

		Iterator<Empleado> iterador = empleados.iterator();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();
			cadena += "\nNombre: " + empleado.getNombre() + " Sueldo: " + empleado.getSueldo();

		}
		JOptionPane.showMessageDialog(null, cadena, "Empleados", JOptionPane.INFORMATION_MESSAGE);

	}

	private static void porNombre(TreeSet<Empleado> empleados2) {
		String cadena = "Empleados ordenados por nombre: ";
		Iterator<Empleado> iterador = empleados2.iterator();
		while (iterador.hasNext()) {
			Empleado empleado = (Empleado) iterador.next();

			cadena += "\nNombre: " + empleado.getNombre() + " Sueldo: " + empleado.getSueldo();
		}

		JOptionPane.showMessageDialog(null, cadena, "Empleados", JOptionPane.INFORMATION_MESSAGE);

	}

	private static void añadir(TreeSet<Empleado> empleados, TreeSet<Empleado> empleados2) {
		String nombre = "";
		String sueldo;
		double salario = 0;
		boolean corrNom = false;
		boolean corrSue = false;
		int cont = 0;
		do {
			try {
				nombre = JOptionPane.showInputDialog(null, "Escribe el nombre", "Alta de empleado",
						JOptionPane.QUESTION_MESSAGE);
				if (nombre.isBlank()) {
					JOptionPane.showMessageDialog(null, "Nombre incorrecto", "Alta de empleado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					corrNom = true;
					cont++;

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Has salido de la creación de empleado", "Alta de empleado",
						JOptionPane.INFORMATION_MESSAGE);
				corrNom = true;
			}
		} while (corrNom == false);

		do {
			try {
				sueldo = JOptionPane.showInputDialog(null, "Escribe el sueldo", "Alta de empleado",
						JOptionPane.QUESTION_MESSAGE);
				salario = Double.parseDouble(sueldo);
				if (sueldo.isBlank()) {
					JOptionPane.showMessageDialog(null, "Sueldo incorrecto", "Alta de empleado",
							JOptionPane.INFORMATION_MESSAGE);
				} else {
					corrSue = true;
					cont++;

				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Has salido de la creación de empleado", "Alta de empleado",
						JOptionPane.INFORMATION_MESSAGE);
				corrSue = true;
			}
		} while (corrNom == false && cont == 1);

		empleados.add(new Empleado(nombre, salario));
		empleados2.add(new Empleado(nombre, salario));

		if (cont == 2) {
			JOptionPane.showMessageDialog(null, "Empleado creado:\n" + "Nombre: " + nombre + "\nSueldo: " + salario,
					"Alta de empleado", JOptionPane.INFORMATION_MESSAGE);
		}

	}

	private static String menu() {

		String[] valores = { "Añadir empleados", "Mostrar empleados ordenados por nombre",
				"Mostrar empleados ordenados por sueldo", "Borrar empleados", "Salir" };
		String opc = (String) JOptionPane.showInputDialog(null, "Elige la opción", "Empleados",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

		return opc;
	}

}
