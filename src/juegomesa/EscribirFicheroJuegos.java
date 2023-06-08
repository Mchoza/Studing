package juegomesa;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscribirFicheroJuegos {
	static ArrayList<JuegoMesa> listaJuegos = new ArrayList<>();
	static ObjectOutputStream datosOS;
	static FileOutputStream fileOS;

	public static void main(String[] args) throws IOException {

		// Creamos un método de añadir juegos
		añadirJuegos();

		// Declarar fichero
		File fichero = new File("FicheroJuegos.dat");

		// Declarar flujo de salida hacia el fichero
		
		if (!fichero.exists()) {
			fileOS = new FileOutputStream(fichero);// el true es para que si ya existe me lo cree a continuacion
// Para poder escribir en el stream
			datosOS = new ObjectOutputStream(fileOS);
		} else {

			fileOS = new FileOutputStream(fichero, true);// el true es para que si ya existe me lo cree a continuacion
			datosOS = new MiObjectOutputStream(fileOS);

		}

		for (JuegoMesa juego : listaJuegos) {
			datosOS.writeObject(juego);
		}

		datosOS.close();

	}

	private static void añadirJuegos() {
		JuegoMesa juego1, juego2, juego3, juego4;

		juego1 = new JuegoMesa("Monopoly", "Hasbro", 2, 10, null, null);
		juego2 = new JuegoMesa("Pictionary", "Hasbro", 2, 10, null, null);
		juego3 = new JuegoMesa("Parchis", "Hasbro", 2, 10, null, null);
		juego4 = new JuegoMesa("Oca", "Hasbro", 2, 10, null, null);

		listaJuegos.add(juego1);
		listaJuegos.add(juego2);
		listaJuegos.add(juego3);
		listaJuegos.add(juego4);

	}

}
