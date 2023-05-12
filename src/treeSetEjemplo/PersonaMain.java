package treeSetEjemplo;

import java.util.Iterator;
import java.util.TreeSet;

public class PersonaMain {

	public static void main(String[] args) {

		// Declaramos el TreeSet personas

		TreeSet<Persona> arbolPersonas = new TreeSet<Persona>();

		// Añadimos personas al arbol
		arbolPersonas.add(new Persona("Maria", "Peponcia", 27));
		arbolPersonas.add(new Persona("Marta", "Aparicio", 30));
		arbolPersonas.add(new Persona("Sara", "Carbonero", 20));
		arbolPersonas.add(new Persona("Clara", "Lago", 21));
		arbolPersonas.add(new Persona("Lorena", "Boli", 22));

		Iterator<Persona> iterador = arbolPersonas.iterator();
		while (iterador.hasNext()) {
			Persona persona = (Persona) iterador.next();
			System.out.println(persona.getNombre() + persona.getEdad());

		}

		// Para utilizar la clase personaporapellido que acabamos de crear para comparar
		// por apellido
		
		TreeSet<Persona> arbolPersonas2 = new TreeSet<Persona>(new PersonaPorApellido());
		
		arbolPersonas2.add(new Persona("Maria", "Peponcia", 27));
		arbolPersonas2.add(new Persona("Marta", "Aparicio", 30));
		arbolPersonas2.add(new Persona("Sara", "Carbonero", 20));
		arbolPersonas2.add(new Persona("Clara", "Lago", 21));
		arbolPersonas2.add(new Persona("Lorena", "Boli", 22));
		
		System.out.println("---------");
		
		Iterator<Persona> iterador2 = arbolPersonas2.iterator();
		while (iterador2.hasNext()) {
			Persona persona = (Persona) iterador2.next();
			System.out.println(persona.getNombre() + persona.getApellido());

		}

	}

}
