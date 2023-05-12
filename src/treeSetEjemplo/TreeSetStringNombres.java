package treeSetEjemplo;

import java.util.TreeSet;

public class TreeSetStringNombres {

	public static void main(String[] args) {

		TreeSet<String> arbol = new TreeSet<String>();
		
		arbol.add("María");
		arbol.add("Sara");
		arbol.add("Clara");
		arbol.add("Marcos");
		arbol.add("Victoria");
		
		for (String string : arbol) {
			System.out.println(string);
		}

	}

}
