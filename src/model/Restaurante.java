package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Restaurante implements Serializable {
	public final static long serialVersionUID = 1;

	private String nit;
	private String nombre;
	private String nombreAdministrador;
	private final static String SEPARATOR = ",";

	public Restaurante(String nit, String nombre, String nombreAdministrador) {

		this.nit = nit;
		this.nombre = nombre;
		this.nombreAdministrador = nombreAdministrador;

	}

	public Restaurante() {

	}

	Cliente cl = new Cliente();
	// Producto pr = new Producto(nombre, nombre, nombre, nit, nit);

	private List<Cliente> clientes = new ArrayList<>();;
	private List<Producto> productos = new ArrayList<>();
	private List<Pedido> pedidos = new ArrayList<>();

	// Permite leer archivo cliente.cvs
	public void importarCliente(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String line = br.readLine();
		while (line != null) {
			String[] arreglo = line.split(SEPARATOR);
			String numeroIdentificacion = arreglo[0];
			String nombre = arreglo[1];
			String apellido = arreglo[2];
			String direccion = arreglo[3];
			String tipoDocumento = arreglo[4];
			String telefono = arreglo[5];

			registrarCliente(numeroIdentificacion, nombre, apellido, direccion, tipoDocumento, telefono);
			line = br.readLine();
		}
		br.close();
	}

	// Permite leer archivo pedido.cvs
	public void importarPedido(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String line = br.readLine();
		while (line != null) {
			String[] arreglo = line.split(SEPARATOR);
			String codigoPedido = arreglo[0];
			String codigoCliente = arreglo[1];
			String nitRestaurante = arreglo[2];
			String cantidad = arreglo[3];
			String hora = arreglo[4];

			addPedido(codigoPedido, codigoCliente, nitRestaurante, cantidad, hora);
			line = br.readLine();
		}
		br.close();
	}

	// Permite leer archivo producto.cvs
	public void importarProducto(String archivo) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(archivo));
		String line = br.readLine();
		while (line != null) {
			String[] arreglo = line.split(SEPARATOR);
			String nombre = arreglo[0];
			String codigo = arreglo[1];
			String descripcion = arreglo[2];
			String costo = arreglo[3];
			String nitRestaurante2 = arreglo[4];

			addProducto(nombre, codigo, descripcion, costo, nitRestaurante2);
			line = br.readLine();
		}
		br.close();
	}

	// Permite adiccionar a la lista los productos
	public void addProducto(String nombre, String codigo, String descripcion, String costo, String nitRestaurante2) {
		Producto producto = new Producto(nombre, codigo, descripcion, costo, nitRestaurante2);
		productos.add(producto);
	}
	
	// permite listar los productos en consola
		public void listarProducto() {
			for (int i = 0; i < productos.size(); i++) {
				System.out.println(productos.get(i).getNombre() + "  " + productos.get(i).getCodigo() + "  "
						+ productos.get(i).getDescripcion() + "  " + productos.get(i).getCosto() + "  "
						+ productos.get(i).getNitRestaurante2());
			}
		}

	// Permite adiccionar a la lista los pedido
	public void addPedido(String codigoPedido, String codigoCliente, String nitRestaurante, String cantidad,
			String hora) {
		Pedido pedido = new Pedido(codigoPedido, codigoCliente, nitRestaurante, cantidad, hora);
		pedidos.add(pedido);
	}

	// permite listar los pedido en consola
	public void listarPedido() {
		for (int i = 0; i < pedidos.size(); i++) {
			System.out.println(pedidos.get(i).getCodigoPedido() + "  " + pedidos.get(i).getCodigoCliente() + "  "
					+ pedidos.get(i).getNitRestaurante() + "  " + pedidos.get(i).getCantidad() + "  "
					+ pedidos.get(i).getHora());
		}
	}

	// registra los clientes en la lista ordenadamente en orden ascendente
	public void registrarCliente(String numeroIdentificacion, String nombre, String apellido, String direccion,
			String tipoIdentificacion, String telefono) {
		Cliente cli = new Cliente(numeroIdentificacion, nombre, apellido, direccion, tipoIdentificacion, telefono);

		if (clientes.isEmpty()) {
			clientes.add(cli);

		} else {
			int i = 0;

			while (cli.getApellido().compareTo(clientes.get(i).getApellido()) > 0) {
				i++;
			}
			clientes.add(i, cli);
		}
	}

	/**
	 * metodo de burbuja orden descendente por telefono para clientes
	 */

	public List<Cliente> orderDescendienteCliente() {
		List<Cliente> lista = getClients();

		for (int i = lista.size(); i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				Cliente c1 = (Cliente) lista.get(j);
				Cliente c2 = (Cliente) lista.get(j + 1);
				if (c1.getTelefono().compareTo(c2.getTelefono()) < 0) {
					lista.set(j, c2);
					lista.set(j + 1, c1);
				}
			}
		}
		return lista;
	}

	/**
	 * metodo que permite mostrar la lista ordenada por telefono descendientemente
	 * 
	 * @return
	 */

	public void mostrarListaCliente() {
		List<Cliente> lista = orderDescendienteCliente();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i).getNumeroidentificacion() + "  " + lista.get(i).getNombre() + "  "
					+ lista.get(i).getApellido() + "  " + lista.get(i).getDireccion() + "  "
					+ lista.get(i).getTipoIdentificacion() + "  " + lista.get(i).getTelefono());
		}

	}

	public List<Cliente> getClients() {
		return clientes;

	}

	// *****************************************************************************************************************************+

	public List<Pedido> getPedido() {
		return pedidos;

	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
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

	/**
	 * metodo que agrega pedido a la lista de pedidos
	 * 
	 * @return
	 */

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

	/*
	 * public void actualizarDatosProducto(String nombre, String codigo, String
	 * descripcion, double costo, int nitRestaurante2) {
	 * 
	 * boolean encontro = false; int inicio = 0; int fin = productos.size() - 1;
	 * Producto prod = productos.get(0); while (inicio <= fin && !encontro) { int
	 * medio = (inicio + fin) / 2; prod = productos.get(medio); if
	 * (prod.getCodigo().equals(codigo)) { encontro = true; } else if
	 * (prod.getCodigo().compareTo(codigo) > 0) { fin = medio - 1;
	 * 
	 * } else { inicio = medio + 1; }
	 * 
	 * }
	 * 
	 * prod.setNombre(nombre); prod.setCodigo(codigo);
	 * prod.setDescripcion(descripcion); prod.setCosto(costo);
	 * prod.setNitRestaurante(nitRestaurante2);
	 * 
	 * }
	 */

	/**
	 * Este metodo actualiza los datos de un CLIENTE dado el NUMERO DE
	 * IDENTIFICACION
	 */

	/**
	 * Este metodo actualiza los datos de un PEDIDO dado el CODIGO
	 */
	/*
	 * public void actualizarDatosPedido(int codigoPedido, int codigoCliente, int
	 * nitRestaurante, int cantidad, int hora, Date fecha) {
	 * 
	 * boolean encontro = false; int inicio = 0; int fin = pedidos.size() - 1;
	 * Pedido pd = pedidos.get(0); while (inicio <= fin && !encontro) { int medio =
	 * (inicio + fin) / 2; pd = pedidos.get(medio); if (pd.getCodigoPedido() >
	 * pd.getCodigoPedido()) { encontro = true; } else if (pd.getCodigoPedido() <
	 * pd.getCodigoPedido()) { fin = medio - 1;
	 * 
	 * } else { inicio = medio + 1; }
	 * 
	 * }
	 * 
	 * pd.setCantidad(cantidad); pd.setCodigoCliente(codigoCliente);
	 * pd.setCodigoPedido(codigoPedido); pd.setDateTime(fecha); pd.setHora(hora);
	 * pd.setNitRestaurante(nitRestaurante);
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "Restaurante [nit=" + nit + ", nombre=" + nombre + ", nombreAdministrador=" + nombreAdministrador + "]";
	}

	/**
	 * Metodo que permite cambiar el estado de un pedido, entre
	 * 
	 * @throws IOException
	 */

	/**
	 * public void updateOrderStatus() throws IOException {
	 * System.out.println("please enter the code order's"); String orderCode =
	 * br.readLine(); System.out.println("please enter the status order's"); String
	 * orderStatus = br.readLine();
	 * 
	 * for (int i = 0; i < Restaurante.getTheClients().get(i).getTheOrders().size();
	 * i++) {
	 * 
	 * if
	 * (orderCode.equalsIgnoreCase(myRestaurant.getTheClients().get(i).getTheOrders().get(i).getOrderCode()))
	 * {
	 * myRestaurant.getTheClients().get(i).getTheOrders().get(i).setOrderStatus(orderStatus);
	 * System.out.println("the order status has been changed successfully"); }
	 * 
	 * }
	 * 
	 * }
	 **/

}
