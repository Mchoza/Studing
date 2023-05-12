package linkedListEjemplo;

import java.util.LinkedList;

public class Pila {
	
	//Atributos
	int numero;
	static LinkedList<Integer> pila = new LinkedList<Integer>();


	//Constructor por defecto
	public Pila() {
		super();
	}


	/**
	 * Constructor con parámetros
	 * @param numero
	 * @param pila
	 */
	public Pila(int numero, LinkedList<Integer> pila) {
		super();
		this.numero = numero;
		this.pila = pila;
	}

	
	//Getters y setters

	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public LinkedList<Integer> getPila() {
		return pila;
	}


	public void setPila(LinkedList<Integer> pila) {
		this.pila = pila;
	}
	
	
	public static void apilar(int numero) {
		
		pila.add(numero);
		
	}
	
	public static void desapilar() {
		
		pila.removeLast();
		
	}
	
	public static void cima() {
		
		System.out.println(pila.getLast());
		
		
	}
	
	
	

}
