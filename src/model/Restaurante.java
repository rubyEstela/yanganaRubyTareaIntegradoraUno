package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Restaurante implements Serializable{
	public final static long serialVersionUID = 1;
	
	private String nit;
	private String nombre;	
	private String nombreAdministrador;
	private final static String SEPARATOR = ",";
	private final static String PATH_PEDIDO = " data/pedidos.csv";
	private final static String PATH_PRODUCTO = "data/productos.csv ";
	private final static String PATH_CLIENTE = "data/clientes.csv ";

	public Restaurante(String nit, String nombre,String nombreAdministrador)  {	
		
		this.nit=nit;	
		this.nombre = nombre;
		this.nombreAdministrador = nombreAdministrador;
		
		/*importarPedido(PATH_PEDIDO);
		importarProducto(PATH_PRODUCTO);
		importarCLiente(PATH_CLIENTE);*/
	}

	Cliente cl = new Cliente();
	Producto pr = new Producto(nombre, nombre, nombre, nit, nit);

	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Pedido> pedidos;

	public Restaurante() {

		clientes = new ArrayList<>();
		productos = new ArrayList<>();
		pedidos = new ArrayList<>();

	}

	public List<Cliente> getClients() {
		return clientes;

	}

	public List<Producto> getProducto() {
		return productos;

	}

	public List<Pedido> getPedido() {
		return pedidos;

	}

	public void ordenarIdentificacionCliente() {
		Collections.sort(clientes);
	}

	public void ordenarPorCodigoProducto() {
		OrdenarCodigoProductoComparator nc = new OrdenarCodigoProductoComparator();
		Collections.sort(productos, nc);

	}

	/**
	 * En este metodo se permite insertar o registrar de forma ordenada clientes
	 * ,alfabeticamente descendente por apellido y nombre
	 * 
	 * @param nombre
	 * @param apellido
	 * @param tipoDocumento
	 * @param numeroIdentificacion
	 * @param telefono
	 * @param direccion
	 */

/**	public void addClientes(String nombre, String apellido, int tipoDocumento, int numeroIdentificacion, int telefono,
			String direccion) {
		Cliente cli = new Cliente(nombre, apellido, tipoDocumento, numeroIdentificacion, telefono, direccion);

		if (clientes.isEmpty()) {
			clientes.add(cli);

		} else {
			int i = 0;
                 
        while (i < clientes.size() && <(clientes.get(i).getNombre()) > 0) {
				i++;
			}
			clientes.add(i, cli);

		}
	}**/

	/**
	 * metodo que agrega producto a la lista de productos
	 * 
	 * @return
	 */

	public void addProducto(String nombre, String codigo, String descripcion, double costo) {
		Producto prod = new Producto(nombre, codigo, descripcion, costo, 0);
		Producto.add(prod);
	}

	/**
	 * metodo que agrega pedido a la lista de pedidos
	 * 
	 * @return
	 */
	public void addPedido(int codigoPedido, int codigoCliente) {
		Pedido pd = new Pedido(codigoPedido, codigoCliente);
		pedidos.add(pd);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public String getNombreAdministrador() {
		return nombreAdministrador;
	}

	public void setNombreAdministrador(String nombreAdministrador) {
		this.nombreAdministrador = nombreAdministrador;
	}

	/**
	 * metodo que importa clientes de un archivo desde una archivo csv
	 * 
	 * @param pd
	 * @throws IOException
	 */

	public void importarProducto(String p) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(p));
		String line = br.readLine();
		while (line != null) {
			String[] parts = line.split(SEPARATOR);
			String name = parts[0];
			double amount = Double.parseDouble(parts[1]);
			addProducto(name, name, name, amount);

			line = br.readLine();
		}
		br.close();
	}
	
	
	public void mostrarPedido() {
		for(int i=0;i<pedidos.size();i++) {
			System.out.println(pedidos.get(i).getCodigoPedido()+"  "+pedidos.get(i).getCodigoCliente());
		}
	}

	/**
	 * metodo que importa productos desde un archivo csv
	 * 
	 * @param p
	 * @throws IOException
	 */

	public void importarCLiente(String p) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(p));
		String line = br.readLine();
		while (line != null) {
			String[] parts = line.split(SEPARATOR);
			String name = parts[0];
			double amount = Double.parseDouble(parts[1]);
			addProducto(name, name, name, amount);

			line = br.readLine();
		}
		br.close();
	}

	/**
	 * metodo que importa pedidos de un archivo desde una archivo csv
	 * 
	 * @param pd
	 * @throws IOException
	 */

	public void importarPedido(String pd) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(pd));
		String line = br.readLine();
		while (line != null) {
			String[] parts = line.split(SEPARATOR);
			int codigoPedido = Integer.parseInt(parts[0]);
			int codigoCliente = Integer.parseInt(parts[1]);
			
			addPedido(codigoPedido,codigoCliente);

			line = br.readLine();
		}
		br.close();

	}

	
	
	/**
	 * Este metodo actualiza los datos de un PRODUCTO dado el CODIGO
	 */

	public void actualizarDatosProducto(String nombre, String codigo, String descripcion, double costo,
			int nitRestaurante2) {

		boolean encontro = false;
		int inicio = 0;
		int fin = productos.size() - 1;
		Producto prod = productos.get(0);
		while (inicio <= fin && !encontro) {
			int medio = (inicio + fin) / 2;
			prod = productos.get(medio);
			if (prod.getCodigo().equals(codigo)) {
				encontro = true;
			} else if (prod.getCodigo().compareTo(codigo) > 0) {
				fin = medio - 1;

			} else {
				inicio = medio + 1;
			}

		}

		prod.setNombre(nombre);
		prod.setCodigo(codigo);
		prod.setDescripcion(descripcion);
		prod.setCosto(costo);
		prod.setNitRestaurante(nitRestaurante2);

	}

	/**
	 * Este metodo actualiza los datos de un CLIENTE dado el NUMERO DE
	 * IDENTIFICACION
	 */

	public void actualizarDatosCliente(String nombre, String apellido, int tipoIdentificacion, int numeroIdentificacion,
			int telefono, String direccion) {

		boolean encontro = false;
		int inicio = 0;
		int fin = clientes.size() - 1;
		Cliente cl = clientes.get(0);
		while (inicio <= fin && !encontro) {
			int medio = (inicio + fin) / 2;
			cl = clientes.get(medio);
			if (cl.getNumeroIdentificacion() < (numeroIdentificacion)) {
				encontro = true;
			} else if (cl.getNumeroIdentificacion() > (numeroIdentificacion)) {
				fin = medio - 1;

			} else {
				inicio = medio + 1;
			}

		}

		cl.setNombre(nombre);
		cl.setApellido(apellido);
		cl.setNumeroIdentificacion(numeroIdentificacion);
		cl.setTipoDocumento(tipoIdentificacion);
		cl.setTelefono(telefono);
		cl.setDireccion(direccion);

	}

	/**
	 * Este metodo actualiza los datos de un PEDIDO dado el CODIGO
	 */
	public void actualizarDatosPedido(int codigoPedido, int codigoCliente, int nitRestaurante, int cantidad, int hora,
			Date fecha) {

		boolean encontro = false;
		int inicio = 0;
		int fin = pedidos.size() - 1;
		Pedido pd = pedidos.get(0);
		while (inicio <= fin && !encontro) {
			int medio = (inicio + fin) / 2;
			pd = pedidos.get(medio);
			if (pd.getCodigoPedido() > pd.getCodigoPedido()) {
				encontro = true;
			} else if (pd.getCodigoPedido() < pd.getCodigoPedido()) {
				fin = medio - 1;

			} else {
				inicio = medio + 1;
			}

		}

		pd.setCantidad(cantidad);
		pd.setCodigoCliente(codigoCliente);
		pd.setCodigoPedido(codigoPedido);
		pd.setDateTime(fecha);
		pd.setHora(hora);
		pd.setNitRestaurante(nitRestaurante);

	}

	@Override
	public String toString() {
		return "Restaurante [nit=" + nit + ", nombre=" + nombre + ", nombreAdministrador=" + nombreAdministrador + "]";
	}

	/**
	 * Metodo que permite cambiar el estado de un pedido, entre
	 * 
	 * @throws IOException
	 */

	/**public void updateOrderStatus() throws IOException {
		System.out.println("please enter the code order's");
		String orderCode = br.readLine();
		System.out.println("please enter the status order's");
		String orderStatus = br.readLine();

		for (int i = 0; i < Restaurante.getTheClients().get(i).getTheOrders().size(); i++) {

			if (orderCode.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getTheOrders().get(i).getOrderCode())) {
				myRestaurant.getTheClients().get(i).getTheOrders().get(i).setOrderStatus(orderStatus);
				System.out.println("the order status has been changed successfully");
			}

		}

	}**/
	
	

}
