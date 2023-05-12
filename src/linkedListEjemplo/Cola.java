package linkedListEjemplo;

import java.util.LinkedList;

public class Cola {

	// Atributos de la clase
	int numero;
	static LinkedList<Integer> cola = new LinkedList<Integer>();

	// Constructor por defecto
	public Cola() {
		super();
	}

	// Constructor con parámetros

	/**
	 * @param numero
	 * @param cola
	 */
	public Cola(int numero, LinkedList<Integer> cola) {
		super();
		this.numero = numero;
		this.cola = cola;
	}

	// Getters y setters

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Método encolar, entran por la parte de atrás (es una cola) FIFO primero que
	 * entra primero que sale
	 * 
	 */
	public static void encolar(int numero) {

		cola.add(numero);
		
	}
	
	public static void desencolar() {
		cola.removeFirst();
	}
	
	public static void frente() {
		
		System.out.println(cola.getFirst());
		
	}

}
