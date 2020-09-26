package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.Producto;

class ProductoTest {
	
	public void setUpScenary1() {
		 
	 }
	
		 public void setUpScenary2() {
			 
		 }
	

		 @Test
			void testaddProducto() {
				setUpScenary1();
				String nom= "hamburguesa";
				String  codigo=" hamburguesa 001";
				String descrip=" hamburguesa doble carne";
				
				
				Producto r= new Producto(nom,codigo,descrip, 0, 0);
				assertEquals(nom, r.getNombre());
				assertEquals(codigo, r.getCodigo());
				assertEquals(descrip, r.getDescripcion());
				
				
				
				
			}
			

}