package hashMapEjemplo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Jugadores {
	static Scanner sc = new Scanner(System.in);
	static Map<Integer, String> jugadores = new HashMap<Integer, String>();

	public static void main(String[] args) {
		boolean salir = false;
		// Creamos el bucle con el switch y el menú

		do {
			switch (menu()) {
			case "Añadir jugador":
				añadirJugador();
				break;
			case "Eliminar jugador":
				eliminarJugador();
				break;
			case "Consultar por dorsal":
				consPorDorsal();
				break;
			case "Modificar jugador":
				modificarJugador();
				break;
			case "Mostrar jugadores":
				mostrarJugadores();
				break;
			case "Salir":
				salir = true;
				break;

			}

		} while (!salir);

	}

	private static void mostrarJugadores() {
		String cadena = "Jugadores: ";
		for (Map.Entry<Integer, String> entry : jugadores.entrySet()) {
			System.out.println("Hola");
			Integer key = entry.getKey();
			String val = entry.getValue();
			cadena += "\nDorsal: " + key + "Nombre: " + val;
		}

		JOptionPane.showMessageDialog(null, cadena, "Consulta jugadores", JOptionPane.INFORMATION_MESSAGE);
	}

	private static void modificarJugador() {
		String key;
		String nombre;
		int dorsal;
		int cont=0;

		key = JOptionPane.showInputDialog(null, "Introduce el dorsal que quieres eliminar", "Baja de jugadores",
				JOptionPane.QUESTION_MESSAGE);
		dorsal = Integer.parseInt(key);
		
		for (Map.Entry<Integer, String> entry : jugadores.entrySet()) {
			Integer clave = entry.getKey();
			if(clave==dorsal) {
				nombre = JOptionPane.showInputDialog(null, "Introduce el nombre nuevo que quieres asignar al dorsal " + dorsal, "Baja de jugadores",
						JOptionPane.QUESTION_MESSAGE);
				jugadores.put(dorsal, nombre);
				cont++;
				}
			
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "No hay ningún jugador con el dorsal " + dorsal, "Consulta jugador por dorsal", JOptionPane.INFORMATION_MESSAGE);
		}
		
		

	}

	private static void consPorDorsal() {
		String key;
		int dorsal;

		key = JOptionPane.showInputDialog(null, "Introduce el dorsal que quieres eliminar", "Baja de jugadores",
				JOptionPane.QUESTION_MESSAGE);
		
		dorsal = Integer.parseInt(key);

		for (int clave : jugadores.keySet()) {
			JOptionPane.showMessageDialog(null, "El jugador con dorsal " + dorsal + " se llama " + jugadores.get(clave),
					"Consulta jugador por dorsal", JOptionPane.INFORMATION_MESSAGE);
		}
	}

	private static void eliminarJugador() {
		String key;
		int dorsal;

		key = JOptionPane.showInputDialog(null, "Introduce el dorsal que quieres eliminar", "Baja de jugadores",
				JOptionPane.QUESTION_MESSAGE);
		dorsal = Integer.parseInt(key);

		for (int clave : jugadores.keySet()) {
			if (jugadores.containsKey(dorsal)) {
				JOptionPane.showMessageDialog(null,
						"El jugador " + jugadores.get(clave) + "con dorsal " + dorsal + "se va a eliminar",
						"Alta jugador", JOptionPane.INFORMATION_MESSAGE);
				jugadores.remove(dorsal);
			}
		}
	}

	private static String menu() {
		String[] valores = { "Añadir jugador", "Eliminar jugador", "Consultar por dorsal", "Modificar jugador",
				"Mostrar jugadores", "Salir" };

		String opc = (String) JOptionPane.showInputDialog(null, "Elige la opción que quieres realizar", "Jugadores",
				JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

		return opc;
	}

	/**
	 * 
	 */
	private static void añadirJugador() {
		int cont;
		boolean existe = false;
		String key;
		int dorsal;
		String nombre = "";

		// Primero miraremos si la coleccion de jugadores está vacía porque sino no hay
		// que comprobar nada

		key = JOptionPane.showInputDialog(null, "Introduce el dorsal que quieres añadir", "Alta de jugadores",
				JOptionPane.QUESTION_MESSAGE);

		dorsal = Integer.parseInt(key);

		if (jugadores.size() == 0) {

			nombre = JOptionPane.showInputDialog(null, "Dime el nombre del jugador con el dorsal " + dorsal,
					"Alta de jugadores", JOptionPane.QUESTION_MESSAGE);

			jugadores.put(dorsal, nombre);

		} else {
			cont = 0;
			// Si no está vacía comprobamos que el dorsal no coincida con el de nigún
			// jugador antes de introducirlo
			do {
				existe = false;
				for (int clave : jugadores.keySet()) {

					if (jugadores.containsKey(dorsal)) {

						JOptionPane.showMessageDialog(null, "El jugador con dorsal " + dorsal + " ya existe",
								"Alta jugador", JOptionPane.INFORMATION_MESSAGE);
						existe = true;
					}
				}
				if (existe) {
					key = JOptionPane.showInputDialog(null, "Introduce otro dorsal", "Alta de jugadores",
							JOptionPane.QUESTION_MESSAGE);

					dorsal = Integer.parseInt(key);
				} else {
					nombre = JOptionPane.showInputDialog(null, "Dime el nombre del jugador con el dorsal " + dorsal,
							"Alta de jugadores", JOptionPane.QUESTION_MESSAGE);
					existe = false;
					if (!existe) {
						cont++;
					}
				}

			} while (existe);

			if (cont > 0) {
				System.out.println("Contador: " + cont);
				jugadores.put(dorsal, nombre);
			}
		}
	}

}
