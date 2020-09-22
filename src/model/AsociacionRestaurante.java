package model;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AsociacionRestaurante {

	public final static String GUARDAR_RESTAURANTES = "data/restaurantes.rt";
	public final static String GUARDAR_CLIENTES = "data/clientes.c";
	public final static String GUARDAR_PRODUCTOS = "data/productos.p";
	public final static String GUARDAR_PEDIDOS = "data/pedidos.pd";
	private final static String SEPARATOR = ",";

	Restaurante rl = new Restaurante();

	private List<Restaurante> restaurant;

	public AsociacionRestaurante() {
		restaurant = new ArrayList<>();
	}

	public List<Restaurante> getRestaurante() {
		return restaurant;

	}


	public void addRestaurante(String nombre, int nit ,String nombreAdministrador) {
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
	
	// importar datos restaurante , 
	
	/*public void importData(String f) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(f));
		String line = br.readLine();
		while(line!=null) {
			String[] parts = line.split(SEPARATOR);
			String name = parts[0];
			double amount = Double.parseDouble(parts[1]);
			guardarRestaurantes();
			guardarClientes();
			guardarProductos();
			guardarpedido();
			
			
			
			line = br.readLine();
		}
		br.close();
	}*/
	
	
	}
	
	
	
	

	
	
	
	
	


