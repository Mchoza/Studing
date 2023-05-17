package awrrayListEjemplo;

import java.util.ArrayList;
import java.util.Iterator;

public class EjemploArrayList {

	// Creamos el arrayList estático
	static ArrayList<Persona> personas = new ArrayList<Persona>();
	static ArrayList<Persona> personas2 = new ArrayList <Persona>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Podemos añadir elementos de varias formas:
		// Añadiendo un elemento directamente
		personas.add(new Persona("Pablo", "Motos"));

		// Creando el o los objetos previamente y añadiéndolos despues
		Persona p1 = new Persona("Alisa", "Milano");
		Persona p2 = new Persona("Molly", "Quinn");
		Persona p3 = new Persona("Marta", "Serano");
		Persona p4 = new Persona("Paco", "León");

		personas.add(p1);
		personas.add(p2);
		personas.add(p3);
		personas.add(p4);

		// Podemos añadir también por posición
		personas.add(2, new Persona("Persona", "Infiltrada"));

		// Visualizamos el tamaño que tiene el ArrayList

		System.out.println("Este arraylist tiene " + personas.size() + " elementos");

		// Para poder ver el contenido del array podemos recorrerlo de varias formas
		// COn un for tradicional

		for (int i = 0; i < personas.size(); i++) {
			System.out.print("Nombre: " + personas.get(i).getNombre());
			System.out.println(" Apellido: " + personas.get(i).getApellidos());
		}

		// Con un foreach
		for (Persona p : personas) {

			System.out.print("Nombre: " + p.getNombre());
			System.out.println(" Apellido: " + p.getApellidos());
		}
		// Con un iterator
		Iterator<Persona> iterador = personas.iterator();

		while (iterador.hasNext()) {
			System.out.println(iterador.next().getNombre() + " " + iterador.next().getApellidos());
		}

		// Para borrar se puede hacer de varias maneras
		// Pasandole la posición que queremos eliminar

		personas.remove(1);

		// Pasandole el elemento en concreto que queremos eliminar

		personas.remove(p4);

		// Recorremos para ver que me haya borrado los dos elementos
		for (Persona p : personas) {

			System.out.print("Nombre: " + p.getNombre());
			System.out.println(" Apellido: " + p.getApellidos());
		}

		// Vamos a ver si el arrayList contiene un elemento en particular

		System.out.println("EL arraylist contiene a Molly Quinn? " + personas.contains(p2));

		// Vamos a pedirle que busque un objeto y en caso de que exista que lo elimine y
		// después vamos a recorrer el arraylist con un foreach para ver si lo ha
		// borrado
		
		if(personas.contains(p2)) {
			personas.remove(p2);
		}else {
			System.out.println("No existe ningún objeto como el pedido");
		}
		
		for (Persona p : personas) {
			System.out.print(p.getNombre() + " ");
			System.out.println(p.getApellidos());
		}
		
		//Vamos a meter todos los elementos que nos quedan en personas2
		
		personas2.addAll(personas);
		
		//Vamos a borrar todo lo que contiene personas
		
		personas.clear();
		
		//Vamos a recorrer personas para comprobar que ha quedado vacío
		
		if(personas.size()!=0) {
			for(int i = 0; i< personas.size();i++) {
				System.out.print(personas.get(i).getNombre() + " ");
				System.out.println(personas.get(i).getApellidos());
			}
		}else {
			System.out.println("No hay ningún elemento que mostrar en personas");
		}
		
		//Recorremos el nuevo arraylist personas2
		
		Iterator<Persona> iterador2 = personas2.iterator();
		while(iterador2.hasNext()) {
			System.out.println(iterador2.next().getNombre());
		}
		
		//Cambiamos a persona infiltrada
		personas2.set(1, new Persona("Maria", "Choza"));
		
		//Recorremos el arrayList para ver que se haya hecho correctamente
		
		for(int i = 0; i< personas2.size();i++) {
			System.out.print(personas2.get(i).getNombre() + " ");
			System.out.println(personas2.get(i).getApellidos());
		}
		

	}

}
