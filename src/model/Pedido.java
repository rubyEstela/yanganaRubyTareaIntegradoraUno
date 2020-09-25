package model;

import java.io.Serializable;
import java.util.Date;

public class Pedido  implements Serializable, Comparable<Pedido>{
	public final static long serialVersionUID = 1;
	
	private int codigoPedido;
	private int codigoCliente;
	private int nitRestaurante;
	private int cantidad;
	private int hora;
	private Date fecha;
	
	
	public Pedido(int codigoPedido, int codigoCliente) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
	}

	public Pedido(int codigoPedido, int codigoCliente, int nitRestaurante, int cantidad, int hora,Date fecha) {
		super();
		this.codigoPedido = codigoPedido;
		this.codigoCliente = codigoCliente;
		this.nitRestaurante = nitRestaurante;
		this.cantidad = cantidad;
		this.hora = hora;
		this.fecha=fecha;
		
	}
	
	Date fechas= new Date();
	
	 private Date dateTime;

      public void setDateTime(Date datetime) {
       this.dateTime = datetime;
     }
      
      public Date getDateTime() {
          return dateTime;
        }
      public Date getFecha() {
          return fecha;
        }
      
	
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
	

	@Override
	public int compareTo(Pedido fec) {
		   if (getDateTime() == null || fec.getDateTime() == null)
		         return 0;
		       return getDateTime().compareTo(fec.getDateTime());
		     }

	public static void add() {
		// TODO Auto-generated method stub
		
	}
	}
	
	


