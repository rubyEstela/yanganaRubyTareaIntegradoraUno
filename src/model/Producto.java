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
	private double costo;
	private int nitRestaurante2;
	
	public Producto(String nombre, String codigo, String descripcion, double costo,int nitRestaurante2) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.costo = costo;
		this.nitRestaurante2 = nitRestaurante2;
	}
	public Producto(String nombre2, String nombre3, String nombre4, String nit, String nit2) {
		// TODO Auto-generated constructor stub
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
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public int getNitRestaurante() {
		return nitRestaurante2;
	}
	public void setNitRestaurante(int nitRestaurante) {
		this.nitRestaurante2 = nitRestaurante;
	}
	public static void add(Producto prod) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
