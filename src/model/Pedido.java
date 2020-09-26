package model;

import java.io.Serializable;
import java.util.Date;

public class Pedido  implements Serializable{
	public final static long serialVersionUID = 1;
	
	private String codigoPedido;
	private String codigoCliente;
	private String nitRestaurante;
	private String cantidad;
	private String hora;
	
	
	public Pedido(String codigoPedido, String codigoCliente, String nitRestaurante, String cantidad, String hora
			) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.nitRestaurante = nitRestaurante;
		this.cantidad = cantidad;
		this.hora = hora;
		
	}
	public String getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(String codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public String getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNitRestaurante() {
		return nitRestaurante;
	}
	public void setNitRestaurante(String nitRestaurante) {
		this.nitRestaurante = nitRestaurante;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}	
	
	
	
	}
	
	


