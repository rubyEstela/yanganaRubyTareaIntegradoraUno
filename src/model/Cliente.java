package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente implements Serializable {
	public final static long serialVersionUID = 1;
	
	public static int TI = 1;
	public static int CC = 2;
	public static int PP = 3;
	public static int CE = 4;
	
	private String numeroidentificacion;
	private String nombre;
	private String apellido;
	private String direccion;
	private String tipoIdentificacion;
	private String telefono;
	
	private final static String SEPARATOR = ",";
	
	private List<Pedido> pedidos;

	public Cliente() {
		pedidos = new ArrayList<>();
	}
	
	public List<Pedido> getPedido() {
		return pedidos;

	}
	
	

	public Cliente(String numeroidentificacion, String nombre, String apellido, String direccion,
			String tipoIdentificacion, String telefono) {
		
		this.numeroidentificacion = numeroidentificacion;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.tipoIdentificacion = tipoIdentificacion;
		this.telefono = telefono;
	}

	public String getNumeroidentificacion() {
		return numeroidentificacion;
	}

	public void setNumeroidentificacion(String numeroidentificacion) {
		this.numeroidentificacion = numeroidentificacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/*@Override
	public int compareTo(Cliente apell) {
		

	

	}*/
	
	}	


