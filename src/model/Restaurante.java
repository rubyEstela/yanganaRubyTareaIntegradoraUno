package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Restaurante {
	private String nombre;
	private int nit;
	private String nombreAdministrador;
	private final static String SEPARATOR = ",";

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
	
	public void ordenarPorTelefono() {
		Collections.sort(clientes);
		
   
	}
	public void ordenarPorApellido() {
		ApellidoComparator nc = new ApellidoComparator();
		Collections.sort(clientes, nc);
		
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
	public void addPedido(int codigoPedido, int codigoCliente, int nitRestaurante, int cantidad, int hora) {
		Pedido pd = new Pedido(codigoPedido,codigoCliente,nitRestaurante,cantidad,hora);
		Pedido.add(pd);
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

	
	
				public void importarCliente(String c) throws IOException {
					BufferedReader br = new BufferedReader(new FileReader(c));
					String line = br.readLine();
					while(line!=null) {
						String[] parts = line.split(SEPARATOR);
						String name = parts[0];
						double amount = Double.parseDouble(parts[1]);
					addClientes(name, name, nit, nit, nit, name);
					line = br.readLine();
					}
					br.close();
				}
				public void importarProducto(String p) throws IOException {
					BufferedReader br = new BufferedReader(new FileReader(p));
					String line = br.readLine();
					while(line!=null) {
						String[] parts = line.split(SEPARATOR);
						String name = parts[0];
						double amount = Double.parseDouble(parts[1]);
					    addProducto(name, name, name, amount, nit);
						
						line = br.readLine();
					}
					br.close();
				}
			    
				public void importarPedido(String pd) throws IOException {
					BufferedReader br = new BufferedReader(new FileReader(pd));
					String line = br.readLine();
					while(line!=null) {
						String[] parts = line.split(SEPARATOR);
						String name = parts[0];
						double amount = Double.parseDouble(parts[1]);
					    addPedido(nit, nit, nit, nit, nit);
						
						line = br.readLine();
					}
					br.close();
				}
}
