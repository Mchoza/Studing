package linkedListEjemplo;

import java.util.Iterator;
import java.util.LinkedList;

public class ColaMain {
	


	public static void main(String[] args) {

		//Vamos a ir rellenando la cola
		Cola cola = new Cola();
		
		for(int i = 0; i<10; i++) {
			
			cola.encolar(i+1);
		}
		
		cola.frente();
		
		for(int i = 0; i<5; i++) {
			
			cola.encolar(i+1);
		}
		
		cola.frente();
		
		cola.desencolar();
		
		cola.frente();
		
		

		

		
	}

}
