package model;

import java.util.ArrayList;
import java.util.List;

public class AsociacionRestaurante {

	Restaurante rl = new Restaurante();

	private List<Restaurante> restaurant;

	public AsociacionRestaurante() {
		restaurant = new ArrayList<>();
	}

	public List<Restaurante> getRestaurante() {
		return restaurant;

	}

	public void addRestaurante(String nombre, int nit, String nombreAdministrador) {
		Restaurante r = new Restaurante(nombre, nit, nombreAdministrador);
		restaurant.add(r);

	}
	
}
