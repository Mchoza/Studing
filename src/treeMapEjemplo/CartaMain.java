package treeMapEjemplo;

import java.util.Map;
import java.util.TreeMap;

public class CartaMain {

	static TreeMap<Integer, Carta> baraja = new TreeMap<>();

	public static void main(String[] args) {

		Carta c1 = new Carta("Bastos", "2");
		Carta c2 = new Carta("Oros", "Rey");
		Carta c3 = new Carta("Espadas", "5");
		Carta c4 = new Carta("Copas", "Caballo");
		Carta c5 = new Carta("Bastos", "6");
		Carta c6 = new Carta("Oros", "1");
		Carta c7 = new Carta("Espadas", "Rey");
		Carta c8 = new Carta("Oros", "3");

		baraja.put(c2.getValor(), c2);
		baraja.put(c3.getValor(), c3);
		baraja.put(c4.getValor(), c4);
		baraja.put(c5.getValor(), c5);
		baraja.put(c6.getValor(), c6);
		baraja.put(c7.getValor(), c7);
		baraja.put(c8.getValor(), c8);
		baraja.put(c1.getValor(), c1);


		for (Map.Entry<Integer, Carta> entry : baraja.entrySet()) {
			Integer key = entry.getKey();
			Carta val = entry.getValue();
			System.out.println("--CLAVE: " + key);
			System.out.println(val.getFigura() + " de " + val.getPalo() + ". Valor: " + key);

		}

	}

}
