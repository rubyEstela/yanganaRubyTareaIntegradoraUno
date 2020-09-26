package model;

import java.util.Comparator;

public class OrdenarCodigoProductoComparator  implements Comparator<Producto>{

	@Override
	public int compare(Producto pr1, Producto pr2) {
		
		return pr1.getCodigo().compareTo(pr2.getCodigo());
	    
}
}
