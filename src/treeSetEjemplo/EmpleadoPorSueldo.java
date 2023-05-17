package treeSetEjemplo;

import java.util.Comparator;

public class EmpleadoPorSueldo implements Comparator<Empleado>{

	@Override
	public int compare(Empleado e1, Empleado e2) {
		// TODO Auto-generated method stub
		return (int)(e1.getSueldo()-e2.getSueldo());
	}

}
