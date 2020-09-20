package model;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
	private String nombre;
	private int nit;
	private String nombreAdministrador;

	public Restaurante(String nombre, int nit, String nombreAdministrador) {
		super();
		this.nombre = nombre;
		this.nit = nit;
		this.nombreAdministrador = nombreAdministrador;
	}

	Cliente cl = new Cliente(nombre, nombre, 0, nit, nit, "");
	Producto pr= new Producto(nombre, nombre, nombre, nit, nit);

	private List<Cliente> clientes;
	private List<Producto> productos;
	private List<Pedido>pedidos;

	public Restaurante() {

		clientes = new ArrayList<>();
		productos=new ArrayList<>();
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

	public void addClientes(String nombre, String apellido, int tipoDocumento, int numeroIdentificacion, int telefono,
			String direccion) {
		Cliente cli = new Cliente(nombre, apellido, tipoDocumento, numeroIdentificacion, telefono, direccion);
		clientes.add(cli);
	}
	
	
	public void addProducto(String nombre, String codigo, String descripcion, double costo, int nitRestaurante) {
		Producto prod = new Producto(nombre,codigo,descripcion,costo,nitRestaurante);
		Producto.add(prod);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNit() {
		return nit;
	}

	public void setNit() {
		this.nit = nit;
	}

	public String getNombreAdministrador() {
		return nombreAdministrador;
	}

	public void setNombreAdministrador(String nombreAdministrador) {
		this.nombreAdministrador = nombreAdministrador;
	}

}
