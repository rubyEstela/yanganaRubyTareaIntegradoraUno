package model;

import java.util.Comparator;

public class ApellidoComparator  implements Comparator<Cliente>{

	@Override
	public int compare(Cliente ap1, Cliente ap2) {
		int comp;
		String apellido1=ap1.getApellido();
		String apellido2=ap2.getApellido();
		comp = apellido1.compareTo(apellido2);
		return comp;
	}

}
