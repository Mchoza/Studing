package aControlador;

public class ClienteMain {

	public static void main(String[] args) {

		// Desde el que vamos a ejecutar TODO el programa
		// El modelo y la vista se relaciona a traves del controlador, pero esto no es
		// un controlador puramente

		// 1º creamos una instancia del controlador de ventana principal (que es el
		// primero) (no hace falta crearlo entero, solo con el new
		// 2º lo metemos en un try catch
		try {
			new ControladorVentanaPrincipal();

		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
