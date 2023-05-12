package linkedListEjemplo;

public class PilaMain {

	public static void main(String[] args) {

		Pila pila = new Pila();
		
		for(int i = 0; i<10; i++) {
			pila.apilar(i+1);
	
		}
		
		pila.cima();
		
		for(int i = 0; i<5; i++) {
			pila.apilar(i+1);
	
		}
		
		pila.cima();
		
		pila.desapilar();
		
		pila.cima();
		
		
	}

}
