package linkedListEjemplo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class ejercicio1 {
	
	static LinkedList<Persona> personas1 = new LinkedList<Persona>();
	static ArrayList<Persona> personas2 = new ArrayList<Persona>();

	public static void main(String[] args) {

		//LInkedList tiene la misma funcionalidad que Arrau
		
		Persona p1 = new Persona("Pepe", 25);
		Persona p2 = new Persona("Pablo", 22);
		Persona p3 = new Persona("Sara", 19);
		Persona p4 = new Persona("Marta", 31);
		Persona p5 = new Persona("Soledad", 54);
		Persona p6 = new Persona("Marcos", 43);
		Persona p7 = new Persona("Nose", 11);
		Persona p8 = new Persona("Babe", 87);
		
		personas1.add(p1);
		personas1.add(p2);
		personas1.add(p3);
		personas1.add(p4);
		personas2.add(p5);
		personas2.add(p6);
		personas2.add(p7);
		personas2.add(p8);
		personas2.add(p2);
		
		personas1.addAll(personas2);
		
		System.out.println("-----Personas1------");

		for (Persona p : personas1) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
		
		System.out.println("-----Personas2------");
		for (Persona p : personas2) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
		
		//Borra de la primera todas las personas que NO estén en la segunda

		personas1.retainAll(personas2);

		System.out.println("-----RETAINS personas1------");

		for (Persona p : personas1) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
		
		//Borra de la segunda todas las personas que NO estén en la primera
		
		personas2.retainAll(personas1);

		System.out.println("-----RETAINS personas2------");

		for (Persona p : personas2) {
			System.out.println(p.getNombre() + " " + p.getEdad());
		}
		
		//Borramos TODAS las personas de la primera
		
		personas1.clear();
		if(personas1.size()!=0) {
			for (Persona p : personas1) {
				System.out.println(p.getNombre() + " " + p.getEdad());
			}
		}else {
			System.out.println("No hay personas en personas1");
		}
		
	}

}
