package model;

import java.io.Serializable;

public class Cliente implements Serializable{
	
	public static int TI = 1;
	public static int CC = 2;
	public static int PP = 3;
	public static int CE = 4;
	
	private String nombre;
	private String apellido;
	private int tipoIdentificacion;
	private int numeroIdentificacion;
	private int telefono;
	private String direccion;
	
	public Cliente(String nombre, String apellido, int tipoIdentificacion,int numeroIdentificacion, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoIdentificacion=tipoIdentificacion;
		this.numeroIdentificacion = numeroIdentificacion;
		this.telefono = telefono;
		this.direccion = direccion;
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
	
	public int getTipoDocumento() {
		return tipoIdentificacion;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoIdentificacion = tipoDocumento;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public static int getCedulaDeCiudadania() {
		return CC;
	}
	public static int getTargetaDeIdentidad() {
		return TI;
	}
	public static int getCedulaExtrangera() {
		return CE;
	}
	public static int getPasaporte() {
		return PP;
	}
	
	public int typeDocuments() {
		int tipo = 0;
		if (tipoIdentificacion == TI) {
			tipo= 1;
		}
		if (tipoIdentificacion == CC) {
			tipo= 2;

		}
		if (tipoIdentificacion == PP) {
			tipo = 3;

		} else {
			tipo= 4;
		}

		return tipo;
		

	}
	
	
	
	
	

}
