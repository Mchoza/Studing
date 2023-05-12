package linkedHashSet;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable {
	
	 

	public static void main(String[] args) {
		LinkedHashSet<String> profesores = new LinkedHashSet<String>();
		profesores.add("Maria Jesús");
		profesores.add("Juan Carlos");
		profesores.add("Elena");
		profesores.add("Tamara");
		profesores.add("Salomé");
		
		Iterator<String> iterador = profesores.iterator();
		while (iterador.hasNext()) {
			String string = (String) iterador.next();
			System.out.println(string);
		}
		
		for (String string : profesores) {
			System.out.println(string);
		}

	}

}
