package marioKart;

import java.util.HashSet;
import java.util.TreeSet;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PilotoKartMain {

	static HashSet<PilotoKart> pilotos = new HashSet<>();
	static HashSet<PilotoKart> pilotosTemp = new HashSet<>();
	static TreeSet<PilotoKart> pilot = new TreeSet<>();
	static TreeSet<PilotoKart> pTemp = (TreeSet<PilotoKart>) new TreeSet<>(new PorVelocidad());
	static TreeSet<PilotoKart> pTemp2 = (TreeSet<PilotoKart>) new TreeSet<>(new PorAceleracion());

	public static void main(String[] args) {
		boolean salir = false;

		do {
			switch (menu()) {
			case 0:
				crearPiloto();
				break;
			case 1:
				eliminarPiloto();
				break;
			case 2:
				añadirPorDefecto();
				break;
			case 3:
				mostrarPilotos();
				break;
			case -1:
				salir = true;

			}
		} while (!salir);

	}

	private static void mostrarPilotos() {
		String cadCarac = "";
		String nombre = "";

		String[] valores = { "Uno a Uno", "+ Velocidad", "+ Aceleración", "Mejores características", "Por nombre" };
		String opc = (String) JOptionPane.showInputDialog(null,
				"Seleccione el orden en que desea visualizar los pilotos", "Ver pilotos", JOptionPane.QUESTION_MESSAGE,
				null, valores, valores[0]);

		switch (opc) {
		case "Uno a Uno":
			for (PilotoKart pilotoKart : pilotos) {
				nombre = pilotoKart.getPiloto();
				ImageIcon personaje = new ImageIcon(pilotoKart.getImagen());
				cadCarac = "";

				for (int i = 0; i < pilotoKart.getCaracteristicas().length; i++) {

					switch (i) {
					case 0:
						cadCarac += "\nVelocidad: " + pilotoKart.getCaracteristicas()[i];
						break;
					case 1:
						cadCarac += "\nAceleración: " + pilotoKart.getCaracteristicas()[i];
						break;
					case 2:
						cadCarac += "\nPeso: " + pilotoKart.getCaracteristicas()[i];
						break;
					case 3:
						cadCarac += "\nManejo: " + pilotoKart.getCaracteristicas()[i];
						break;
					case 4:
						cadCarac += "\nAgarre: " + pilotoKart.getCaracteristicas()[i];
						break;
					}

				}
				JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + cadCarac, "Alta jugador",
						JOptionPane.INFORMATION_MESSAGE, personaje);
			}

			break;
		case "+ Velocidad":
			String cadena = "";
			int i = 1;

			for (PilotoKart pilotoKart : pTemp) {
				cadena += "\n" + i + " " + pilotoKart.getPiloto() + "("
						+ pilotoKart.getCaracteristicas()[PilotoKart.VELOCIDAD] + ")";
				i++;

			}

			JOptionPane.showMessageDialog(null, cadena, "Pilotos +Velocidad ", JOptionPane.INFORMATION_MESSAGE);

			break;
		case "+ Aceleración":
			int j = 1;
			String cadena2 = "";
			pTemp2.addAll(pTemp);

			for (PilotoKart pilotoKart : pTemp2) {
				cadena2 += "\n" + j + " " + pilotoKart.getPiloto() + " ("
						+ pilotoKart.getCaracteristicas()[PilotoKart.ACELERACION] + ")";
				j++;
			}
			JOptionPane.showMessageDialog(null, cadena2, "Pilotos +Aceleracion ", JOptionPane.INFORMATION_MESSAGE);

			break;
		case "Mejores características":

			int l = 1;
			String cadena4 = "";
			pTemp2.addAll(pTemp);

			for (PilotoKart pilotoKart : pTemp2) {
				int sum = 0;

				for (int m = 0; m < pilotoKart.getCaracteristicas().length; m++) {
					sum += pilotoKart.getCaracteristicas()[m];
				}
				cadena4 += "\n" + l + " " + pilotoKart.getPiloto()+ " (" + sum + ")";
				
				l++;
			}
			JOptionPane.showMessageDialog(null, cadena4 , "Pilotos +Aceleracion ",
					JOptionPane.INFORMATION_MESSAGE);
			break;
		case "Por nombre":
			String cadena3 = "";
			int k = 1;

			for (PilotoKart pilotoKart : pilot) {

				cadena3 += "\n" + k + " " + pilotoKart.getPiloto();
				k++;
			}
			JOptionPane.showMessageDialog(null, cadena3, "Pilotos porNombre ", JOptionPane.INFORMATION_MESSAGE);

			break;
		}

	}

	private static void añadirPorDefecto() {
		int[] caracteristicasMario = { 3, 5, 4, 3, 2 };
		PilotoKart mario = new PilotoKart("Mario", "img/mario.png", caracteristicasMario);

		int[] caracteristicasLuigi = { 4, 5, 5, 3, 5 };
		PilotoKart luigi = new PilotoKart("Luigi", "img/luigi.png", caracteristicasLuigi);

		int[] caracteristicasYoshi = { 5, 3, 4, 1, 4 };
		PilotoKart yoshi = new PilotoKart("Yoshi", "img/yoshi.png", caracteristicasYoshi);

		int[] caracteristicasDaisy = { 4, 5, 2, 4, 1 };
		PilotoKart daisy = new PilotoKart("Daisy", "img/daisy.png", caracteristicasDaisy);

		int[] caracteristicasBowser = { 3, 4, 4, 2, 1 };
		PilotoKart bowser = new PilotoKart("Bowser", "img/bowser.png", caracteristicasBowser);

		int[] caracteristicasDonkeyKong = { 1, 2, 2, 4, 5 };
		PilotoKart donkeyKong = new PilotoKart("Donkey Kong", "img/donkeykong.png", caracteristicasDonkeyKong);

		int[] caracteristicasKoopa = { 4, 3, 2, 3, 5 };
		PilotoKart koopa = new PilotoKart("Koopa", "img/koopa.png", caracteristicasKoopa);

		int[] caracteristicasWario = { 4, 5, 2, 3, 5 };
		PilotoKart wario = new PilotoKart("Wario", "img/wario.png", caracteristicasWario);

		int[] caracteristicasToad = { 2, 3, 2, 3, 5 };
		PilotoKart toad = new PilotoKart("Toad", "img/toad.png", caracteristicasToad);

		int[] caracteristicasShyGuy = { 5, 2, 2, 3, 5 };
		PilotoKart shyGuy = new PilotoKart("Shy Guy", "img/shyguy.png", caracteristicasShyGuy);

		int[] caracteristicasPeach = { 4, 5, 2, 3, 5 };
		PilotoKart peach = new PilotoKart("Peach", "img/peach.png", caracteristicasPeach);

		// Añadir PilotoKart objetos a HashSet
		pilotos.add(mario);
		pilotos.add(luigi);
		pilotos.add(yoshi);
		pilotos.add(koopa);
		pilotos.add(toad);
		pilotos.add(peach);
		pilotos.add(wario);
		pilotos.add(shyGuy);
		pilotos.add(donkeyKong);
		pilotos.add(bowser);
		pilotos.add(daisy);

		pTemp.add(mario);
		pTemp.add(luigi);
		pTemp.add(yoshi);
		pTemp.add(koopa);
		pTemp.add(toad);
		pTemp.add(peach);
		pTemp.add(wario);
		pTemp.add(shyGuy);
		pTemp.add(donkeyKong);
		pTemp.add(bowser);
		pTemp.add(daisy);

	}

	@Deprecated
	private static void verPilotos() {
		String cadCarac = "";
		String nombre = "";
		for (PilotoKart pilotoKart : pilotos) {
			nombre = pilotoKart.getPiloto();
			ImageIcon personaje = new ImageIcon(pilotoKart.getImagen());
			cadCarac = "";

			for (int i = 0; i < pilotoKart.getCaracteristicas().length; i++) {

				switch (i) {
				case 0:
					cadCarac += "\nVelocidad: " + pilotoKart.getCaracteristicas()[i];
					break;
				case 1:
					cadCarac += "\nAceleración: " + pilotoKart.getCaracteristicas()[i];
					break;
				case 2:
					cadCarac += "\nPeso: " + pilotoKart.getCaracteristicas()[i];
					break;
				case 3:
					cadCarac += "\nManejo: " + pilotoKart.getCaracteristicas()[i];
					break;
				case 4:
					cadCarac += "\nAgarre: " + pilotoKart.getCaracteristicas()[i];
					break;
				}

			}
			JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + cadCarac, "Alta jugador",
					JOptionPane.INFORMATION_MESSAGE, personaje);
		}
	}

	private static void eliminarPiloto() {
		int cont = 0;
		int i = 0;
		String[] nombres;
		for (PilotoKart pilotoKart : pilotos) {
			cont++;
		}
		nombres = new String[cont];
		for (PilotoKart pilotoKart : pilotos) {
			nombres[i] = pilotoKart.getPiloto();
			i++;
		}

		for (String nombre : nombres) {
			System.out.println(nombre);
		}

		// Una vez creado el array vamos a hacer un joptionpane desplegable para mostrar
		// estos nombres y eliminar por nombre
		String opc = (String) JOptionPane.showInputDialog(null, "Elige el jugador que quieres eliminar",
				"Baja de jugadores", JOptionPane.QUESTION_MESSAGE, null, nombres, nombres[0]);
		pilotosTemp.clear();
		for (PilotoKart pilotoKart : pilotos) {
			if (!opc.equalsIgnoreCase(pilotoKart.getPiloto())) {
				pilotosTemp.add(pilotoKart);

			}
		}
		pilotos.clear();
		pilotos.addAll(pilotosTemp);
	}

	private static void crearPiloto() {

		String nombre = "";
		String imagen = "";
		int[] caracteristicas = new int[5];
		String[] carac = new String[5];

		boolean salir = false;

		ImageIcon icono = new ImageIcon("img/menu.png");
		do {
			try {
				nombre = (String) JOptionPane.showInputDialog(null, "Nombre del piloto", "Alta piloto",
						JOptionPane.PLAIN_MESSAGE, icono, null, null);

				if (nombre.isBlank()) {
					JOptionPane.showMessageDialog(null, "Nombre incorrecto", "Alta jugador",
							JOptionPane.INFORMATION_MESSAGE, icono);
				} else {
					salir = true;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Se ha salido de la creación de jugador", "Alta jugador",
						JOptionPane.INFORMATION_MESSAGE, icono);
				salir = true;
			}
		} while (!salir);
		salir = false;
		int opcion;
		int i = 0;
		ImageIcon personaje;
		do {
			do {
				String[] imag = { "img/bowser.png", "img/daisy.png", "donkeykong.png", "img/koopa.png", "img/luigi.png",
						"img/mario-png", "img/peach.png", "img/shygui.png", "img/toad.png", "img/wario.png",
						"img/yoshi.png" };
				String[] valores = { "Anterior", "Seleccionar", "Siguiente" };
				personaje = new ImageIcon(imag[i]);
				opcion = JOptionPane.showOptionDialog(null, null, "Alta jugador", JOptionPane.YES_NO_CANCEL_OPTION,
						JOptionPane.QUESTION_MESSAGE, personaje, valores, valores[0]);
				if (opcion == 0) {
					if (i == 0) {
						i = imag.length - 1;
					}
					i--;
				} else if (opcion == 2) {
					if (i == (imag.length - 1)) {
						i = 0;
					}
					i++;
				} else {
					imagen = imag[i];
					salir = true;

				}

			} while (opcion != 1 && opcion != -1);

		} while (!salir);
		salir = false;
		String cadena = "";
		int temp;
		String cadCarac = "";
		do {

			String[] valores = { "1 Muy Baja", "2 Baja", "3 Media", "4 Alta", "5 Muy Alta" };
			for (int j = 0; j < 5; j++) {
				switch (j) {
				case 0:
					cadena = "velocidad";
					break;
				case 1:
					cadena = "aceleración";
					break;
				case 2:
					cadena = "peso";
					break;
				case 3:
					cadena = "manejo";
					break;
				case 4:
					cadena = "agarre";
					break;
				}

				String opc = (String) JOptionPane.showInputDialog(null,
						"Seleccione la " + cadena + " del piloto " + nombre + ": ", "Alta jugador",
						JOptionPane.QUESTION_MESSAGE, icono, valores, valores[0]);

				if (opc == null) {
					j = 5;
					salir = true;
					JOptionPane.showMessageDialog(null, "Se ha salido de la creación de jugador", "Alta jugador",
							JOptionPane.INFORMATION_MESSAGE, icono);
				} else {
					String temp2 = opc.substring(0, 1);
					temp = Integer.parseInt(temp2);
					caracteristicas[j] = temp;
					carac[j] = opc;
					salir = true;

					switch (j) {
					case 0:
						cadCarac += "\nVelocidad: " + temp2;
						break;
					case 1:
						cadCarac += "\nAceleración: " + temp2;
						break;
					case 2:
						cadCarac += "\nPeso: " + temp2;
						break;
					case 3:
						cadCarac += "\nManejo: " + temp2;
						break;
					case 4:
						cadCarac += "\nAgarre: " + temp2;
						break;
					}
				}

			}

		} while (!salir);
		int cont = 0;
		for (String string : carac) {
			if (string == null) {
				cont++;
				System.out.println(string);
			}
		}
		System.out.println(cont);
		if (cont == 0) {
			// Tendremos que instanciar al pilotoKart estoy boba.... lo quería meter
			// directamente...
			pilotos.add(new PilotoKart(nombre, imagen, caracteristicas));
			// Mostramos el piloto creado
			JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\n" + cadCarac, "Alta jugador",
					JOptionPane.INFORMATION_MESSAGE, personaje);
		}

	}

	private static int menu() {
		int opcion;
		ImageIcon icono = new ImageIcon("img/mariokart.jpg");
		String[] valores = { "Crear nuevo piloto", "Eliminar piloto", "Cargar pilotos por defecto", "Ver pilotos" };

		opcion = JOptionPane.showOptionDialog(null, "MARIO KART - Selecciona una opción: ", "Mario Kart HashSet",
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, icono, valores, valores[0]);

		return opcion;
	}

}
