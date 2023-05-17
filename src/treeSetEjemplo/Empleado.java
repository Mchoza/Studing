package treeSetEjemplo;

import java.util.Comparator;

public class Empleado implements Comparable<Empleado>{
	
	private String nombre;
	private double sueldo;
	/**
	 * 
	 */
	public Empleado() {
		super();
	}
	/**
	 * @param nombre
	 * @param sueldo
	 */
	public Empleado(String nombre, double sueldo) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		return nombre.compareTo(o.getNombre());
	}
	
	
	
	

}
