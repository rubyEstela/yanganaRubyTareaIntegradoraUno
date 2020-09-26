package model;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AsociacionRestaurante {
	
//private final Static String GUARDAR_RESTAURANTES;
private final static String SEPARATOR = ",";
	
	Restaurante rl = new Restaurante();

	private List<Restaurante> restaurant = new ArrayList<>();;

	
	//Permite leer el archivo restaurante:
	public void importarRestaurante(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String line = br.readLine();
		while (line != null) {
			String[] arreglo = line.split(SEPARATOR);
			String nit = arreglo[0];
			String nombre=arreglo[1];
			String nombreAdministrador=arreglo[2];
			addRestaurante(nit,nombre,nombreAdministrador);
			line = br.readLine();
		}
		br.close();		
		
	}
	
	//Permite adiccionar a la lista los restaurantes
	public void addRestaurante( String nit, String nombre,String nombreAdministrador) throws IOException {
		Restaurante restaurante = new Restaurante(nit, nombre,nombreAdministrador);
		restaurant.add(restaurante);		
		
	}
	
	//Muestra en pantalla los restaurantes de forma ascendente usando comparatorTo
	public void listarRestauranteAscendente() {
		Collections.sort(restaurant,new OrdenarRestauranteAsComparator());
		for(int i=0;i<restaurant.size();i++) {
			System.out.println(restaurant.get(i).getNit()+"  "+restaurant.get(i).getNombre()+" "+restaurant.get(i).getNombreAdministrador());
		}
		
	}
	
	

	


	

	/**
	 * metodo que por medio de la serializacion guarda restaurantes
	 * 
	 * @throws IOException
	 */
/*
	public void guardarRestaurantes() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_RESTAURANTES));
		oos.writeObject(restaurant);
		oos.close();
	}*/

	/**
	 * metodo que por medio de la serializacion guarda clientes
	 * 
	 * @throws IOException
	 */
/*
	public void guardarClientes() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_CLIENTES));
		oos.writeObject(rl.getClients());
		oos.close();
	}
*/

	

	/**
	 * metodo que por medio de la serializacion guarda pedidos
	 * 
	 * @throws IOException
	 */
/*
	public void guardarpedido() throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(GUARDAR_PEDIDOS));
		oos.writeObject(rl.getPedido());
		oos.close();
	}
*/
	/**
	 * metodo que permite importar datos de un archivo csv que contine restaurantes
	 * 
	 * @param f
	 * @throws IOException
	 */
    /**
     * permte traer información de restaurante desde un archivo plano
     * @param archivo
     * @throws IOException
     */
	
	/**
	 * 
	 * @param metodo              que agrega restaurantes a la lista de restaurantes
	 * @param nit
	 * @param nombreAdministrador
	 * @throws IOException
	 */
	
	
	
	
	/*//Permite mostrar en pantalla la lista de restaurantes:
	public void listarRestaurante() {
		for(int i=0;i<restaurant.size();i++) {
			System.out.println(restaurant.get(i).getNit()+"  "+restaurant.get(i).getNombre()+" "+restaurant.get(i).getNombreAdministrador());
		}
	}*/
	
	
	

	/**
	 * metodo que permite exportar los datos del restaurante dado su nit
	 * 
	 * @param fileName
	 * @throws FileNotFoundException
	 */

	public void exportDatosRestaurante(String fileName) throws FileNotFoundException {
		PrintWriter pw = new PrintWriter(fileName);
		for (Restaurante elem : restaurant) {
			pw.println(elem.getNit() + SEPARATOR);
		}
		pw.close();
	}

	/**
	 * Este metodo actualiza los datos de un restaurante dado el nit
	 */

	public void actualizarDatosRest(String nit, String nombre, String nit2, String nombreAdministrador) {

		boolean encontro = false;
		int inicio = 0;
		int fin = restaurant.size() - 1;
		Restaurante rt = restaurant.get(0);
		while (inicio <= fin && !encontro) {
			int medio = (inicio + fin) / 2;
			rt = restaurant.get(medio);
			if (rt.getNit().equals(nit)) {
				encontro = true;
			} else if (rt.getNit().compareTo(nit) > 0) {
				fin = medio - 1;

			} else {
				inicio = medio + 1;
			}

		}

		rt.setNombre(nombre);
		rt.setNombreAdministrador(nombreAdministrador);
		rt.setNit(nit2);

	}
	

	
}
