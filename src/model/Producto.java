package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;

public class Producto implements Serializable {
	public final static long serialVersionUID = 1;
	
	private String nombre;
	private String codigo;
	private String descripcion;
	private String costo;
	private String nitRestaurante2;
	
	public Producto(String nombre, String codigo, String descripcion, String costo, String nitRestaurante2) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.costo = costo;
		this.nitRestaurante2 = nitRestaurante2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCosto() {
		return costo;
	}

	public void setCosto(String costo) {
		this.costo = costo;
	}

	public String getNitRestaurante2() {
		return nitRestaurante2;
	}

	public void setNitRestaurante2(String nitRestaurante2) {
		this.nitRestaurante2 = nitRestaurante2;
	}
	
	
	

}
