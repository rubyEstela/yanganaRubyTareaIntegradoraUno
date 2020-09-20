package model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AsociacionRestaurante {

	public final static String GUARDAR_RESTAURANTES = "data/restaurantes.rt";
	public final static String GUARDAR_CLIENTES = "data/clientes.c";
	public final static String GUARDAR_PRODUCTOS = "data/productos.p";
	public final static String GUARDAR_PEDIDOS = "data/pedidos.pd";

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

	public void guardarRestaurantes() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_RESTAURANTES));
		oos.writeObject(restaurant);
		oos.close();
	}
	public void guardarClientes() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_CLIENTES));
		oos.writeObject(rl.getClients());
		oos.close();
	}
	public void guardarProductos() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_PRODUCTOS));
		oos.writeObject(rl.getProducto());
		oos.close();
	}
	
	
	public void guardarpedido() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_PEDIDOS));
		oos.writeObject(rl.getPedido());
		oos.close();
	}

}
