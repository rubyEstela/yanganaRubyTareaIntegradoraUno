package model;

import java.util.Date;

public class Pedido {
	
	private int codigoPedido;
	private int codigoCliente;
	private int nitRestaurante;
	private int cantidad;
	private int hora;
	public Pedido(int codigoPedido, int codigoCliente, int nitRestaurante, int cantidad, int hora) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.nitRestaurante = nitRestaurante;
		this.cantidad = cantidad;
		this.hora = hora;
	}
	
	Date fechas= new Date();
	
	public int getCodigoPedido() {
		return codigoPedido;
	}
	public void setCodigoPedido(int codigoPedido) {
		this.codigoPedido = codigoPedido;
	}
	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public int getNitRestaurante() {
		return nitRestaurante;
	}
	public void setNitRestaurante(int nitRestaurante) {
		this.nitRestaurante = nitRestaurante;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public static void add(Pedido ped) {
		// TODO Auto-generated method stub
		
	}
	
	

}
