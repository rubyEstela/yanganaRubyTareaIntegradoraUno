package model;

import java.util.Comparator;

public class OrdenarRestauranteAsComparator implements Comparator<Restaurante>{

	@Override
	public int compare(Restaurante r1, Restaurante r2) {
		
		return r1.getNombre().compareTo(r2.getNombre());
	}

}
