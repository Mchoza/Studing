package treeSetEjemplo;

import java.util.Comparator;

public class PersonaPorApellido implements Comparator<Persona> {
	

	@Override
	public int compare(Persona p1, Persona p2) {
		//Para comparar las personas por apellido
		return p1.getApellido().compareTo(p2.getApellido());
	}

}
