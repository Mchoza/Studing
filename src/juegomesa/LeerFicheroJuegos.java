package juegomesa;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LeerFicheroJuegos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		JuegoMesa juego;
		
		//declaramos el objeto file
		File fichero = new File("FicheroJuegos.dat");
		
		//Creamos el flujo de entrada
		FileInputStream fileIn = new FileInputStream(fichero);
		
		//Creamos para poder leer objetos
		ObjectInputStream dataIn = new ObjectInputStream(fileIn);
		
		//Recorremos el fichero para leerlo
		//Trataremos la excepción de fin de fichero para saber que hemos llegado al final
		try {
			while(true) {
				juego = (JuegoMesa) dataIn.readObject();
				System.out.println(juego.getNombreJuego());
			}
		} catch (EOFException eof) {
			
			System.out.println("Fin de fichero");
		}
		
		
		
	}

}
