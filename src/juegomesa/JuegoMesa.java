package juegomesa;

import java.io.Serializable;

public class JuegoMesa implements Serializable{
	
	private String nombreJuego;
	private String editoraJuego;
	private int minJugadores, maxJugadores;
	private String[] incidencias;
	private String imagen;
	public JuegoMesa() {
		super();
	}
	public JuegoMesa(String nombreJuego, String editoraJuego, int minJugadores, int maxJugadores, String[] incidencias,
			String imagen) {
		super();
		this.nombreJuego = nombreJuego;
		this.editoraJuego = editoraJuego;
		this.minJugadores = minJugadores;
		this.maxJugadores = maxJugadores;
		this.incidencias = incidencias;
		this.imagen = imagen;
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getEditoraJuego() {
		return editoraJuego;
	}
	public void setEditoraJuego(String editoraJuego) {
		this.editoraJuego = editoraJuego;
	}
	public int getMinJugadores() {
		return minJugadores;
	}
	public void setMinJugadores(int minJugadores) {
		this.minJugadores = minJugadores;
	}
	public int getMaxJugadores() {
		return maxJugadores;
	}
	public void setMaxJugadores(int maxJugadores) {
		this.maxJugadores = maxJugadores;
	}
	public String[] getIncidencias() {
		return incidencias;
	}
	public void setIncidencias(String[] incidencias) {
		this.incidencias = incidencias;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	
	

}
