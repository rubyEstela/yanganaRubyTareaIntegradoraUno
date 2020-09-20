package model;

public class Producto {
	private String nombre;
	private String codigo;
	private String descripcion;
	private double costo;
	private int nitRestaurante;
	public Producto(String nombre, String codigo, String descripcion, double costo, int nitRestaurante) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.costo = costo;
		this.nitRestaurante = nitRestaurante;
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
		return nitRestaurante;
	}
	public void setNitRestaurante(int nitRestaurante) {
		this.nitRestaurante = nitRestaurante;
	}
	public static void add(Producto prod) {
		// TODO Auto-generated method stub
		
	}
	
	

}
