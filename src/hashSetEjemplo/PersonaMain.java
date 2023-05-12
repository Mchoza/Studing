package hashSetEjemplo;

import java.util.HashSet;
import java.util.Iterator;

public class PersonaMain {
	
	static HashSet<Persona> actores = new HashSet<Persona>();
	static HashSet<Persona> cantantes = new HashSet<Persona>();
	static HashSet<Persona> temp = new HashSet<Persona>();
	static HashSet<Persona> artistas = new HashSet<Persona>();
	static HashSet<Persona> personas = new HashSet<Persona>();
	static HashSet<Persona> personas2 = new HashSet<Persona>();
	static HashSet<Persona> personas3 = new HashSet<Persona>();





	public static void main(String[] args) {

		Persona p1 = new Persona("Maria", "Peponcia", "10/05/1991");
		Persona p2 = new Persona("Sara", "Lagunza", "10/05/1989");
		Persona p3 = new Persona("Clara", "Lago", "10/03/1980");
		Persona p4 = new Persona("Soraya", "Arnelas", "10/06/1991");
		Persona p5 = new Persona("Montse", "Mesa", "08/05/1991");
		
		
		//Asignamos

		actores.add(p1);
		actores.add(p2);
		actores.add(p4);
		actores.add(p5);
		
		cantantes.add(p1);
		cantantes.add(p3);
		

	//Metemos todos los cantantes en otro hashSet para no cargárnoslo
		temp.addAll(cantantes);
		temp.retainAll(actores);
		
		System.out.println("-------CANTANTES Y ACTORES--------");

		for (Persona p : temp) {
			System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getFechaNac());
		}
		
		//Creamos un hashset de artistas en el que estaran los cantantes y los actores
		artistas.addAll(actores);
		artistas.addAll(cantantes);
		
		System.out.println("-------ARTISTAS--------");
		
		Iterator<Persona> iterador = artistas.iterator();
		while (iterador.hasNext()) {
			Persona p = (Persona)iterador.next();
			System.out.println(p.getNombre() + " " + p.getApellido() + " " + p.getFechaNac());
			
		}
		
		temp.addAll(cantantes);
		temp.retainAll(actores);
		
		personas.addAll(temp);
		
		System.out.println("-------PERSONAS CANT Y ACT--------");
		
		Iterator<Persona> iterador1 = personas.iterator();
		while (iterador1.hasNext()) {
			Persona persona = (Persona) iterador1.next();
			System.out.println(persona.getApellido());
		}
		
		personas2.addAll(cantantes);
		personas2.removeAll(actores);
		System.out.println("-------PERSONAS CANTANTES--------");

		
		for (Persona p : personas2) {
			System.out.println(p.getApellido());
		}
		
		personas3.addAll(actores);
		personas3.removeAll(cantantes);
		
		System.out.println("-------PERSONAS ACTORES--------");

		for (Persona p : personas3) {
			System.out.println(p.getApellido());
		}
	
		
		
	
	}

}
