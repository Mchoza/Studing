package hashMapEjemplo;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProvinciasHashMap {

	public static void main(String[] args) {

		//Declaramos el HashMap
		Map<Integer, String> provincias = new HashMap<Integer, String>();
		
		//Añadimos a la colección hashmap las provincias
		provincias.put(2, "Burgos");
		provincias.put(5, "Salamanca");
		provincias.put(4, "Ávila");
		provincias.put(8, "Zamora");
		provincias.put(9, "Valladolid");
		provincias.put(22, "Zaragoza");
		
		//Conseguir un valor dando su clave
		if(provincias.containsKey(9)) {
			System.out.println("La provincia es: " + provincias.get(9));
		}
		
		//Comprobar si un valor está en la coleccion
		if(provincias.containsValue("Burgos")) {
			System.out.println("Burgos pertenece a Castilla y León");
		}
		
		//Recorremos la colección sacando las claves
		for (int clave : provincias.keySet()) {
			System.out.println(clave);
		}
		//Dame todos los valores
		System.out.println(provincias.values());
		
		//Recorrer la coleccion sacando los valores
		for (String string : provincias.values()) {
			System.out.println(string);
		}
		for (int valor : provincias.keySet()) {
			System.out.println(provincias.get(valor));
		}
		
		//Listar las entradas clave/valor con entrySet
		for (Map.Entry<Integer, String> entry : provincias.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			System.out.println(key + " " + val);
			
		}
		
		//Recorremos con iterador ESTA MAL
		Iterator<?> iterador = provincias.keySet().iterator();
		while (iterador.hasNext()) {
			Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>) iterador.next();
			System.out.println(entry.getKey() + entry.getValue());
			
		}

	}

}
