package model;

public class Cliente {
	
	public static int TI = 1;
	public static int CC = 2;
	public static int PP = 3;
	public static int CE = 4;
	
	private String nombre;
	private String apellido;
	private int tipoDocumento;
	private int numeroIdentificacion;
	private int telefono;
	private String direccion;
	
	public Cliente(String nombre, String apellido, int tipoDocumento,int numeroIdentificacion, int telefono, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento=tipoDocumento;
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
		return tipoDocumento;
	}
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
		if (tipoDocumento == TI) {
			tipo= 1;
		}
		if (tipoDocumento == CC) {
			tipo= 2;

		}
		if (tipoDocumento == PP) {
			tipo = 3;

		} else {
			tipo= 4;
		}

		return tipo;
		

	}
	
	
	
	
	

}
