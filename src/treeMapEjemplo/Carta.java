package treeMapEjemplo;

public class Carta {

	// Atributos
	private String palo;
	private String figura;
	private int valor;

	// Constructor por defecto
	public Carta() {
		super();
	}

	// Constructor con parámetros
	public Carta(String palo, String figura) {
		super();
		this.palo = palo;
		this.figura = figura;
		this.valor = asignaValor(palo, figura);
	}

	// Getters y setters

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getFigura() {
		return figura;
	}

	public void setFigura(String figura) {
		this.figura = figura;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	// Método asignaValor

	public int asignaValor(String palo, String figura) {
		int resultado = 0;

		switch (figura) {

		case "As":

			resultado += 1;
			break;
		case "Sota":

			resultado += 10;
			break;
		case "Caballo":

			resultado += 11;
			break;
		case "Rey":

			resultado += 12;
			break;
		default:

			resultado += Integer.parseInt(figura);
		}

		switch (palo) {

		case "Oros":

			resultado += 10;
			break;
		case "Bastos":

			resultado += 20;
			break;
		case "Copas":

			resultado += 30;
			break;
		case "Espadas":

			resultado += 40;
			break;
		default:
			resultado += Integer.parseInt(figura);
		}

		return resultado;
	}

	

}
